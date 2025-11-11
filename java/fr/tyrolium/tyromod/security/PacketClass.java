package fr.tyrolium.tyromod.security;

import fr.tyrolium.tyromod.Global;
import fr.tyrolium.tyromod.TyroMod;
import io.netty.buffer.ByteBuf;
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

//            System.out.println("Received from client: " + message.modList);
//            System.out.println("Received from client: " + message.token + " " + message.tokenOld);
//            System.out.println("Message by " + playerEntity.getName());
            TyroMod.logger.info(Global.PREFIX_LOGGER + "✅ " + playerEntity.getName() + " a envoyé un paquet au serveur.");
            TyroLogger.logServerPlayer(playerEntity.getName(), "✅ Réception d'un paquet.");

            PacketToken.postDataToApi(message.token, message.tokenOld, (EntityPlayerMP) playerEntity);
            PacketMod.verifModToApi(message.modList, (EntityPlayerMP) playerEntity);
            return null;
        }
    }
}
