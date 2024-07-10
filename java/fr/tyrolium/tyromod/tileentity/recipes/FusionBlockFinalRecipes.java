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


        if  (compareItemStacks(input) && !input[0].equals(ItemStack.EMPTY) && !input[1].equals(ItemStack.EMPTY) && !input[2].equals(ItemStack.EMPTY) && !input[3].equals(ItemStack.EMPTY) && !input[4].equals(ItemStack.EMPTY) && !input[5].equals(ItemStack.EMPTY) && !input[6].equals(ItemStack.EMPTY) && !input[7].equals(ItemStack.EMPTY) && !input[8].equals(ItemStack.EMPTY) &&
                !input[9].equals(ItemStack.EMPTY) && !input[10].equals(ItemStack.EMPTY) && !input[11].equals(ItemStack.EMPTY) && !input[12].equals(ItemStack.EMPTY) && !input[13].equals(ItemStack.EMPTY) && !input[14].equals(ItemStack.EMPTY) && !input[15].equals(ItemStack.EMPTY) && !input[16].equals(ItemStack.EMPTY) && !input[17].equals(ItemStack.EMPTY) && !input[18].equals(ItemStack.EMPTY) &&
                !input[19].equals(ItemStack.EMPTY) && !input[20].equals(ItemStack.EMPTY) && !input[21].equals(ItemStack.EMPTY) && !input[22].equals(ItemStack.EMPTY) && !input[23].equals(ItemStack.EMPTY) && !input[24].equals(ItemStack.EMPTY) && !input[25].equals(ItemStack.EMPTY) && !input[26].equals(ItemStack.EMPTY) && !input[27].equals(ItemStack.EMPTY) && !input[28].equals(ItemStack.EMPTY) &&
                !input[29].equals(ItemStack.EMPTY)) {

            String itemId = requestFusion(input);

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

    private static String requestFusion(ItemStack[] inputs){
        String apiUrl = Global.API_FUSION + "?tier=final&item0=" + inputs[0].getUnlocalizedName() + "&item1=" + inputs[1].getUnlocalizedName() + "&item2=" + inputs[2].getUnlocalizedName() + "&item3=" + inputs[3].getUnlocalizedName() + "&item4=" + inputs[4].getUnlocalizedName() + "&item5=" + inputs[5].getUnlocalizedName() + "&item6=" + inputs[6].getUnlocalizedName() + "&item7=" + inputs[7].getUnlocalizedName() + "&item8=" + inputs[8].getUnlocalizedName() + "&item9=" + inputs[9].getUnlocalizedName() + "&item10=" + inputs[10].getUnlocalizedName() + "&item11=" + inputs[11].getUnlocalizedName() + "&item12=" + inputs[12].getUnlocalizedName() + "&item13=" + inputs[13].getUnlocalizedName() + "&item14=" + inputs[14].getUnlocalizedName() + "&item15=" + inputs[15].getUnlocalizedName() + "&item16=" + inputs[16].getUnlocalizedName() + "&item17=" + inputs[17].getUnlocalizedName() + "&item18=" + inputs[18].getUnlocalizedName() + "&item19=" + inputs[19].getUnlocalizedName() + "&item20=" + inputs[20].getUnlocalizedName() + "&item21=" + inputs[21].getUnlocalizedName() + "&item22=" + inputs[22].getUnlocalizedName() + "&item23=" + inputs[23].getUnlocalizedName() + "&item24=" + inputs[24].getUnlocalizedName() + "&item25=" + inputs[25].getUnlocalizedName() + "&item26=" + inputs[26].getUnlocalizedName() + "&item27=" + inputs[27].getUnlocalizedName() + "&item28=" + inputs[28].getUnlocalizedName() + "&item29=" + inputs[29].getUnlocalizedName();

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
//            System.out.println(result);

            if (!result.equals("\"err\"")) {
                return result;
            }




        } catch (Exception e) {
            e.printStackTrace();
        }

        return "empty";
    }

}
