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

import fr.tyrolium.tyromod.TyroMod;
import fr.tyrolium.tyromod.global.DefaultItem;
import fr.tyrolium.tyromod.init.ItemsMod;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
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
        System.out.println(input1);
        System.out.println(input2);

        if  (!compareItemStacks(input1, input2)) {

            String itemName = requestFusion(input1, input2);

            if (!itemName.equals("empty")) {

                System.out.println(itemName);

                String itemResult = ItemsMod.findItemByName(itemName);

                if (itemResult != null && !itemResult.equals("empty")) {
                    return new ItemStack(ItemsMod.items[Integer.parseInt(itemResult)]);
                }
            }
        }

        return ItemStack.EMPTY;
    }

    private boolean compareItemStacks(ItemStack stack1, ItemStack stack2) {
        return stack2.getItem() == stack1.getItem();
    }

    private static String requestFusion(ItemStack input1, ItemStack input2){
        String apiUrl = "http://localhost/Api-TyroModFusion/?item1="+ input1.getUnlocalizedName() +"&item2="+ input2.getUnlocalizedName(); // change this to be your actual API url
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

            String result = content.toString().substring(1, content.length() - 1);
            System.out.println("Reponse du serveur : " + result);

            if (!result.equals("err")) {
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
