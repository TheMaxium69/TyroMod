package fr.tyrolium.tyromod.network;

import fr.tyrolium.tyromod.security.LauncherToken;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.text.StringTextComponent;
import net.minecraftforge.fml.network.NetworkEvent;

import java.util.function.Supplier;

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

        ServerPlayerEntity player = contextSupplier.get().getSender();

        String Token = packet.Token;

        player.displayClientMessage(new StringTextComponent(Token), true);

    }
}
