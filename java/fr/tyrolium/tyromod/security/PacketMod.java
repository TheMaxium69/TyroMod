package fr.tyrolium.tyromod.security;

import fr.tyrolium.tyromod.Global;
import net.minecraft.entity.player.EntityPlayerMP;

public class PacketMod {

    public static void verifModToApi(String modList, EntityPlayerMP playerEntity) {


        String pseudo = playerEntity.getName();

        String apiUrl = Global.API_MODLIST;

        System.out.println("is in server Mod Verif");


        System.out.println( pseudo + " = ModList : " + modList);


    }

}
