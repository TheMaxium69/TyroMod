package fr.tyrolium.tyromod.security;

import fr.tyrolium.tyromod.Global;
import fr.tyrolium.tyromod.TyroMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.stream.Collectors;

@SideOnly(Side.CLIENT)
@Mod.EventBusSubscriber(modid = Global.MODID, value = Side.CLIENT)
public class EventClient {

    @SubscribeEvent
    public static void onEvent(EntityJoinWorldEvent event) {

        if (Global.USERITIUM_VERIF == 1) {

            /******************
             *
             *  CLIENT ACTION
             *
             * ****************/

            if (event.getEntity() instanceof EntityPlayerSP) {

//                System.out.println("HERE CLIENT");


                EntityPlayerSP playerEntity = (EntityPlayerSP) event.getEntity();
                String pseudoConnect = playerEntity.getName();

                EntityPlayer myPlayer = Minecraft.getMinecraft().player;

                if (myPlayer != null) {
                    String myPseudo = myPlayer.getName();


                    TyroLogger.logClientConnection("--------------------------------------------------------------");
                    TyroLogger.logClientConnection("ℹ️ Connexion avec le pseudo : " + myPseudo);
                    //                        System.out.println("Mon pseudo est : " + myPseudo);

                    if (pseudoConnect == myPseudo) {

                        String modlist = "[" + Loader.instance().getActiveModList().stream().map(mod -> "{\"modid\":\"" + mod.getModId() + "\",\"version\":\"" + mod.getVersion() + "\"}").collect(Collectors.joining(",")) + "]";

//                        System.out.println("[TYROMOD] ENVOIE DE PAQUET");
                        TyroLogger.logClientConnection("ℹ️ Envoie de paquet au serveur...");
                        TyroMod.networkWrapper.sendToServer(new PacketClass(LauncherToken.getTokenUser(), LauncherToken.getTokenUserOld(), modlist));

                    }
                }
            }

        }
    }

}
