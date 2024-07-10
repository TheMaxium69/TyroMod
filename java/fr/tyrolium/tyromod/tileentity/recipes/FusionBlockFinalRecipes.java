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

public class FusionBlockFinalRecipes {
    private static final FusionBlockFinalRecipes INSTANCE = new FusionBlockFinalRecipes();


    public static FusionBlockFinalRecipes getInstance() {
        return INSTANCE;
    }

    private FusionBlockFinalRecipes() {

    }
    public ItemStack getSinteringResult(ItemStack[] input) {

        if  (!compareItemStacks(input) && !input[0].equals(ItemStack.EMPTY) && !input[1].equals(ItemStack.EMPTY) && !input[2].equals(ItemStack.EMPTY) && !input[3].equals(ItemStack.EMPTY) && !input[4].equals(ItemStack.EMPTY) && !input[5].equals(ItemStack.EMPTY) && !input[6].equals(ItemStack.EMPTY) && !input[7].equals(ItemStack.EMPTY) && !input[8].equals(ItemStack.EMPTY) &&
                !input[9].equals(ItemStack.EMPTY) && !input[10].equals(ItemStack.EMPTY) && !input[11].equals(ItemStack.EMPTY) && !input[12].equals(ItemStack.EMPTY) && !input[13].equals(ItemStack.EMPTY) && !input[14].equals(ItemStack.EMPTY) && !input[15].equals(ItemStack.EMPTY) && !input[16].equals(ItemStack.EMPTY) && !input[17].equals(ItemStack.EMPTY) && !input[18].equals(ItemStack.EMPTY) &&
                !input[19].equals(ItemStack.EMPTY) && !input[20].equals(ItemStack.EMPTY) && !input[21].equals(ItemStack.EMPTY) && !input[22].equals(ItemStack.EMPTY) && !input[23].equals(ItemStack.EMPTY) && !input[24].equals(ItemStack.EMPTY) && !input[25].equals(ItemStack.EMPTY) && !input[26].equals(ItemStack.EMPTY) && !input[27].equals(ItemStack.EMPTY) && !input[28].equals(ItemStack.EMPTY) &&
                !input[29].equals(ItemStack.EMPTY) && !input[30].equals(ItemStack.EMPTY)) {

            String itemId = requestFusion();
            System.out.println(itemId);

            if (itemId != null && !itemId.equals("empty")) {

                try {
                    int id = Integer.parseInt(itemId);
                    return new ItemStack(ItemsMod.items[id]);
                } catch (NumberFormatException e) {

                    itemId = itemId.substring(1, itemId.length() - 1);

                    if (itemId.charAt(0) == 'c') {
                        return new ItemStack(ItemsMod.getItemCustomClass(itemId));
                    }

                }

            }
        }

        return ItemStack.EMPTY;
    }

    private boolean compareItemStacks(ItemStack[] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (ItemStack.areItemsEqual(input[i], input[j])) {
                    return false;
                }
            }
        }
        return true;
    }

    private static String requestFusion(){
        String apiUrl = Global.API_FUSION + "?tier=final&pseudo=";
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
//            System.out.println("REQUEST ENVOYER");

            if (!result.equals("\"err\"")) {
                return result;
            }




        } catch (Exception e) {
            e.printStackTrace();
        }

        return "empty";
    }

}
