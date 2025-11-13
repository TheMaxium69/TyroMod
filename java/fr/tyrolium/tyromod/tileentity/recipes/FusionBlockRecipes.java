package fr.tyrolium.tyromod.tileentity.recipes;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import fr.tyrolium.tyromod.Global;
import fr.tyrolium.tyromod.TyroMod;
import fr.tyrolium.tyromod.global.DefaultItem;
import fr.tyrolium.tyromod.init.ItemsMod;
import fr.tyrolium.tyromod.security.TyroLogger;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.TextComponentString;
import org.lwjgl.Sys;

public class FusionBlockRecipes {
    private static final FusionBlockRecipes INSTANCE = new FusionBlockRecipes();


    public static FusionBlockRecipes getInstance() {
        return INSTANCE;
    }

    private FusionBlockRecipes() {

    }
    public ItemStack getSinteringResult(ItemStack input1, ItemStack input2) {

        if  (!compareItemStacks(input1, input2) && !input1.equals(ItemStack.EMPTY) && !input2.equals(ItemStack.EMPTY) && !input1.equals(new ItemStack(Blocks.AIR)) && !input2.equals(new ItemStack(Blocks.AIR))) {

            String itemId = requestFusion(input1, input2);

            if (itemId != null && !itemId.equals("empty")) {

                try {
                    int id = Integer.parseInt(itemId);
                    return new ItemStack(ItemsMod.items[id]);
                } catch (NumberFormatException e) {

                    itemId = itemId.substring(1, itemId.length() - 1);

                    if (itemId.charAt(0) == 'c') {
                        return new ItemStack(ItemsMod.getItemCustomClass(itemId));
                    }

                    if (itemId.charAt(0) == 'v') {

                        /*GOLD_INGOT*/
                        if (itemId.equals("v999999999")) {
                            return new ItemStack(Items.GOLD_INGOT);
                        }
                        /*EMERALD*/
                        if (itemId.equals("v999999998")) {
                            return new ItemStack(Items.EMERALD);
                        }
                        /*IRON_INGOT*/
                        if (itemId.equals("v999999997")) {
                            return new ItemStack(Items.IRON_INGOT);
                        }
                        /*DIAMOND*/
                        if (itemId.equals("v999999996")) {
                            return new ItemStack(Items.DIAMOND);
                        }

                    }

//                    if (itemId != "err") {
//                        return new ItemStack(ItemsMod.items[Integer.parseInt(itemId)]);
//                    }

                }

            }
        }

        return ItemStack.EMPTY;
    }

    private boolean compareItemStacks(ItemStack stack1, ItemStack stack2) {
        return stack2.getItem() == stack1.getItem();
    }

    private static String requestFusion(ItemStack input1, ItemStack input2){

        if (Global.DEBUG_VIEW_REQUEST) {
            TyroMod.logger.debug(Global.PREFIX_LOGGER + "§e[DEBUG] ⚠️ REQUEST API FUSION (Tier1)");
        }
        TyroLogger.logServerApiRequest("⬆️ REQUEST API FUSION (Tier1)");

        String apiUrl = Global.API_FUSION + "?tier=1&item1="+ input1.getUnlocalizedName() +"&item2="+ input2.getUnlocalizedName(); // change this to be your actual API url
        try {
            URL url = new URL(apiUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setDoOutput(true);

            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuilder content = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }

            in.close();
            conn.disconnect();

            String result = content.toString();
//            System.out.println("Reponse du serveur : " + result);
//            System.out.println("REQUEST ENVOYER");

            if (!result.equals("\"err\"")) {
                return result;
            }




        } catch (Exception e) {
            e.printStackTrace();
        }

        return "empty";
    }

//    public float getSinteringExperience(ItemStack stack) {
//        for (Entry<ItemStack, Float> entry : experienceList.entrySet()) {
//            if (compareItemStacks(stack, entry.getKey())) {
//                return entry.getValue().floatValue();
//            }
//        }
//        return 0.0F;
//    }
}
