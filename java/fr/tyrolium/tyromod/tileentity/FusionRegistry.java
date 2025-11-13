package fr.tyrolium.tyromod.tileentity;

import fr.tyrolium.tyromod.Global;
import fr.tyrolium.tyromod.TyroMod;
import fr.tyrolium.tyromod.init.ItemsMod;
import fr.tyrolium.tyromod.security.TyroLogger;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class FusionRegistry {

    public static boolean verifFusion(String tier, String item1, String item2) {


        /* VERIFICATION D'ERREUR */
        if (item1 == null || item1.trim().isEmpty() || item2 == null || item2.trim().isEmpty()) {
            return false;
        }

        if (item1.equals(item2) && item1.equals(Items.AIR.getUnlocalizedName()) && item2.equals(Items.AIR.getUnlocalizedName())) {
            return false;
        }

        /* ITEM 1*/
        String tierItem1 = "";
        if (item1.equals(Items.IRON_INGOT.getUnlocalizedName()) || item1.equals(Items.GOLD_INGOT.getUnlocalizedName()) || item1.equals(Items.DIAMOND.getUnlocalizedName()) ) {
            tierItem1 = "1";
        } else if (item1.equals(Items.EMERALD.getUnlocalizedName())) {
            tierItem1 = "2";
        } else {
            tierItem1 = ItemsMod.getTier(item1);
        }
        if (Global.DEBUG_VIEW_VERIF_FUSION) { TyroMod.logger.debug(Global.PREFIX_LOGGER + "§e[DEBUG] ⚠️ Le tier de " + item1 + " est : " + tierItem1); }

        /* ITEM 2*/
        String tierItem2 = "";
        if (item2.equals(Items.IRON_INGOT.getUnlocalizedName()) || item2.equals(Items.GOLD_INGOT.getUnlocalizedName()) || item2.equals(Items.DIAMOND.getUnlocalizedName()) ) {
            tierItem2 = "1";
        } else if (item2.equals(Items.EMERALD.getUnlocalizedName())) {
            tierItem2 = "2";
        } else {
            tierItem2 = ItemsMod.getTier(item2);
        }
        if (Global.DEBUG_VIEW_VERIF_FUSION) { TyroMod.logger.debug(Global.PREFIX_LOGGER + "§e[DEBUG] ⚠️ Le tier de " + item2 + " est : " + tierItem2); }


        /* RETOUR FINAL */
        if (tierItem1 == null || tierItem1.trim().isEmpty() || tierItem2 == null || tierItem2.trim().isEmpty()) {
            return false;
        }

        if (tierItem1.equals(tier) && tierItem2.equals(tier)) {
            return true;
        }

        return false;

    }

    public static boolean verifFusionFinal(ItemStack[] inputs){

        if (Global.DEBUG_VIEW_VERIF_FUSION) {
            for (int i = 0; i < inputs.length; i++) {
                TyroMod.logger.debug(Global.PREFIX_LOGGER + "§e[DEBUG] ⚠️ Item inputs[" + i + "] = " + inputs[i].getUnlocalizedName());
            }
        }

        int err = 0;
        if (!inputs[0].getUnlocalizedName().equals("item.adamantium_ingot")) err = 1;
        if (!inputs[1].getUnlocalizedName().equals("item.aventurium_ingot")) err = 1;
        if (!inputs[2].getUnlocalizedName().equals("item.chromitium_ingot")) err = 1;
        if (!inputs[3].getUnlocalizedName().equals("item.copperium_gem")) err = 1;
        if (!inputs[4].getUnlocalizedName().equals("item.coranium_ingot")) err = 1;
        if (!inputs[5].getUnlocalizedName().equals("item.draconium_ingot")) err = 1;
        if (!inputs[6].getUnlocalizedName().equals("item.enderium")) err = 1;
        if (!inputs[7].getUnlocalizedName().equals("item.goldonium")) err = 1;
        if (!inputs[8].getUnlocalizedName().equals("item.macronium_ingot")) err = 1;
        if (!inputs[9].getUnlocalizedName().equals("item.mercurium")) err = 1;
        if (!inputs[10].getUnlocalizedName().equals("item.netherium_ingot")) err = 1;
        if (!inputs[11].getUnlocalizedName().equals("item.obsidium_ingot")) err = 1;
        if (!inputs[12].getUnlocalizedName().equals("item.omeganium_ingot")) err = 1;
        if (!inputs[13].getUnlocalizedName().equals("item.platinium")) err = 1;
        if (!inputs[14].getUnlocalizedName().equals("item.plutonium_ingot")) err = 1;
        if (!inputs[15].getUnlocalizedName().equals("item.polonium_ingot")) err = 1;
        if (!inputs[16].getUnlocalizedName().equals("item.protonium_ingot")) err = 1;
        if (!inputs[17].getUnlocalizedName().equals("item.rhodonium_ingot")) err = 1;
        if (!inputs[18].getUnlocalizedName().equals("item.ritonium_ingot")) err = 1;
        if (!inputs[19].getUnlocalizedName().equals("item.sapphirium")) err = 1;
        if (!inputs[20].getUnlocalizedName().equals("item.silicium")) err = 1;
        if (!inputs[21].getUnlocalizedName().equals("item.silverium_ingot")) err = 1;
        if (!inputs[22].getUnlocalizedName().equals("item.steelium_ingot")) err = 1;
        if (!inputs[23].getUnlocalizedName().equals("item.thyrium")) err = 1;
        if (!inputs[24].getUnlocalizedName().equals("item.titanium_ingot")) err = 1;
        if (!inputs[25].getUnlocalizedName().equals("item.tyrolium")) err = 1;
        if (!inputs[26].getUnlocalizedName().equals("item.uranium_ingot")) err = 1;
        if (!inputs[27].getUnlocalizedName().equals("item.vaporium_ingot")) err = 1;
        if (!inputs[28].getUnlocalizedName().equals("item.volcanium_ingot")) err = 1;
        if (!inputs[29].getUnlocalizedName().equals("item.yellorium")) err = 1;

        if (err == 1) {
            if (Global.DEBUG_VIEW_VERIF_FUSION) { TyroMod.logger.error(Global.PREFIX_LOGGER + "§e[DEBUG] ❌ Fusion final invalide !"); }
            return false;
        }

        return true;
    }


}
