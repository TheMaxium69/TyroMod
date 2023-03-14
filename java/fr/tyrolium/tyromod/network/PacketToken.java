package fr.tyrolium.tyromod.network;

import fr.tyrolium.tyromod.security.LauncherToken;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.network.PacketBuffer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraftforge.fml.network.NetworkEvent;

import java.util.function.Supplier;

import static net.minecraft.util.text.TextComponentUtils.getDisplayName;

public class PacketToken {

    public String Token;

    public PacketToken(String token) {
        this.Token = token;
    }

    public static void encode(PacketToken packetToken, PacketBuffer packetBuffer) {
        packetBuffer.writeUtf(packetToken.Token);
    }

    public static PacketToken decode(PacketBuffer packetBuffer) {
        String Token = packetBuffer.readUtf();
        return new PacketToken(Token);
    }

    public static void handle(PacketToken packet, Supplier<NetworkEvent.Context> contextSupplier) {

        String Token = packet.Token;

        ServerPlayerEntity Entity = contextSupplier.get().getSender();
        MinecraftServer Server = Entity.getServer();
        ITextComponent PlayerName = Entity.getName();









/*RESULT

        //KICK PLAYER - MAUVAIS TOKEN
        Server.getCommands().performCommand(Server.createCommandSourceStack(), "kick " + PlayerName.getString() + " Token Invalide");


        //TP PLAYER IN LOBBY - GOOD TOKEN
        Server.getCommands().performCommand(Server.createCommandSourceStack(), "tp " + PlayerName.getString() + " ~ ~ ~ ");
        player.displayClientMessage(new StringTextComponent("Connected"), true);
*/
    }
}
