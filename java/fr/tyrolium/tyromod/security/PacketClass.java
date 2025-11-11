package fr.tyrolium.tyromod.security;

import fr.tyrolium.tyromod.Global;
import fr.tyrolium.tyromod.TyroMod;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class PacketClass implements IMessage {

    public PacketClass() {}

    private String token;
    private String tokenOld;
    private String modList;

    public PacketClass(String token, String tokenOld, String modList) {
        this.token = token;
        this.tokenOld = tokenOld;
        this.modList = modList;
    }

    @Override
    public void toBytes(ByteBuf buf) {
        ByteBufUtils.writeUTF8String(buf, token);
        ByteBufUtils.writeUTF8String(buf, tokenOld);
        ByteBufUtils.writeUTF8String(buf, modList);
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        token = ByteBufUtils.readUTF8String(buf);
        tokenOld = ByteBufUtils.readUTF8String(buf);
        modList = ByteBufUtils.readUTF8String(buf);
    }

    public static class Handler implements IMessageHandler<PacketClass, IMessage> {

        @Override
        public IMessage onMessage(PacketClass message, MessageContext ctx) {
            EntityPlayerMP playerEntity = ctx.getServerHandler().player;

            /* VERIFIE SI L'UTILISATEUR EST DEJA VERIFIER (EMPECHE LA REVERIF AVEC LES CHANGE DE WORLD)*/
            String pseudo = playerEntity.getName();
            int pseudoExisting = 1;
            for (EntityPlayer player : TyroMod.playersWaitingWithPaquet) {
                if (player.getName().equals(pseudo)) {
                    pseudoExisting = 2;
                }
            }

            if (pseudoExisting == 2) {
//                TyroLogger.logServerPlayer(playerEntity.getName(), "ℹ️ Envoie de paquet inutile.");
            } else {
                TyroMod.playersWaitingWithPaquet.add(playerEntity);

                TyroMod.logger.info(Global.PREFIX_LOGGER + "✅ " + playerEntity.getName() + " a envoyé un paquet au serveur.");
                TyroLogger.logServerPlayer(playerEntity.getName(), "✅ Réception d'un paquet.");

                PacketToken.postDataToApi(message.token, message.tokenOld, (EntityPlayerMP) playerEntity);
                PacketMod.verifModToApi(message.modList, (EntityPlayerMP) playerEntity);
            }
            return null;
        }
    }
}
