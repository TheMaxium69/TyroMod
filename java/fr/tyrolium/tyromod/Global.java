package fr.tyrolium.tyromod;

public class Global {

    public static final int USERITIUM_VERIF = 1; /* 1 = YES*/
    public static final int DB_LAUNCH_ITEM = 2; /* 1 = YES*/
    public static final int DB_LAUNCH_BLOCK = 2; /* 1 = YES*/

    public static final String MODID = "tyromod";
    public static final String NAME = "TyroMod";
    public static final String VERSION = "0.14";
    public static final String MINECRAFT_VERSION = "1.12.2";
    public static final String CLIENT_PROXY = "fr.tyrolium.tyromod.proxy.Client";
    public static final String SERVER_PROXY = "fr.tyrolium.tyromod.proxy.CommonProxy";
    public static final String PREFIX_LOGGER = "§a[§1Tyro§4Mod§a]§r ";

//    public static final String API_FUSION = "http://localhost/Api-TyroModFusion/";
    public static final String API_FUSION = "https://api-fusion.tyroserv.fr/";

    public static final String API_USERITIUM = "https://useritium.fr/api-externe/index.php?controller=TyroServ&task=servVerif";
    public static final String API_MODLIST = "https://tyrolium.fr/Download/TyroServS3/launcher/index.php?t=server";
//    public static final String API_MODLIST = "http://127.0.0.1/Api-TyroServGetMod/index.php?t=server";

    public static final int GUI_FUSION_BLOCK = 0;
    public static final int GUI_FUSION_BLOCK2 = 1;
    public static final int GUI_FUSION_BLOCK3 = 2;
    public static final int GUI_FUSION_BLOCK_FINAL = 3;

    /* DEBUG */
    public static final boolean DEBUG_TOKEN = true; /* DEFAULT : FALSE */
    public static final boolean NOTVERIF_MOD = false; /* DEFAULT : FALSE */


}
