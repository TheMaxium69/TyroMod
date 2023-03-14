package fr.tyrolium.tyromod.init;

import fr.tyrolium.tyromod.TyroMod;
import fr.tyrolium.tyromod.network.PacketToken;
import fr.tyrolium.tyromod.security.LauncherToken;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import org.lwjgl.glfw.GLFW;

public class ModKeybindings {

    public static final KeyBinding TEST_KEY = new KeyBinding("key."+TyroMod.ModId+".test_key", GLFW.GLFW_KEY_H, "key.categories."+TyroMod.ModId);

    public static void register() {
        ClientRegistry.registerKeyBinding(TEST_KEY);
    }

    @OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public static void onKeyPress(InputEvent.KeyInputEvent e) {
        if(TEST_KEY.isDown()) {
            System.out.println("JE SUIS UN BOUTON");
            TyroMod.NETWORK.sendToServer(new PacketToken(LauncherToken.getTokenUser()));

        }

    }
}
