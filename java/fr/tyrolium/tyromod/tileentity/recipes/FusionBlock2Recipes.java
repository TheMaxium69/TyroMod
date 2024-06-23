package fr.tyrolium.tyromod.tileentity.recipes;

import fr.tyrolium.tyromod.Global;
import fr.tyrolium.tyromod.init.ItemsMod;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class FusionBlock2Recipes {
    private static final FusionBlock2Recipes INSTANCE = new FusionBlock2Recipes();


    public static FusionBlock2Recipes getInstance() {
        return INSTANCE;
    }

    private FusionBlock2Recipes() {

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

                }

            }
        }

        return ItemStack.EMPTY;
    }

    private boolean compareItemStacks(ItemStack stack1, ItemStack stack2) {
        return stack2.getItem() == stack1.getItem();
    }

    private static String requestFusion(ItemStack input1, ItemStack input2){
        String apiUrl = Global.API_FUSION + "?tier=2&item1="+ input1.getUnlocalizedName() +"&item2="+ input2.getUnlocalizedName(); // change this to be your actual API url
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
