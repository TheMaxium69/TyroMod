package fr.tyrolium.tyromod;

public class Global {

    /* GLOBAL */
    public static final String BUILD_TYPE = "SERVER"; /* SERVER or PUBLIC */
    public static final String ENV_TYPE = "DEV"; /* DEV or PROD */

    /* ENV */
    public static final String MODID = "tyromod";
    public static final String NAME = "TyroMod";
    public static final String VERSION = "0.18";
    public static final String MINECRAFT_VERSION = "1.12.2";
    public static final String CLIENT_PROXY = "fr.tyrolium.tyromod.proxy.Client";
    public static final String SERVER_PROXY = "fr.tyrolium.tyromod.proxy.CommonProxy";
    public static final String PREFIX_LOGGER = "§a[§1Tyro§4Mod§a]§r ";

    /* URL */
    public static final String API_USERITIUM = "https://useritium.fr/api-externe/index.php?controller=TyroServ&task=servVerif";

    public static final String API_FUSION = ENV_TYPE.equals("PROD") ? Global.API_FUSION_PROD : Global.API_FUSION_DEV;
    public static final String API_FUSION_PROD = "https://api-fusion.tyroserv.fr/";
    public static final String API_FUSION_DEV = "http://localhost/Api-TyroModFusion/";

    public static final String API_MODLIST = ENV_TYPE.equals("PROD") ? Global.API_MODLIST_PROD : Global.API_MODLIST_DEV;
    public static final String API_MODLIST_PROD = "https://tyrolium.fr/Download/TyroServS3/launcher/index.php?t=server";
    public static final String API_MODLIST_DEV = "http://127.0.0.1/Api-TyroServGetMod/index.php?t=server";

    /* GUI */
    public static final int GUI_FUSION_BLOCK = 0;
    public static final int GUI_FUSION_BLOCK2 = 1;
    public static final int GUI_FUSION_BLOCK3 = 2;
    public static final int GUI_FUSION_BLOCK_FINAL = 3;

    /* DEBUG */
    public static final boolean DEBUG_NOTVERIF = BUILD_TYPE.equals("PUBLIC") ? true : false; /*  DEFAULT : FALSE */
    public static final boolean DEBUG_NOTVERIF_USERITIUM = false; /*  DEFAULT : FALSE */
    public static final boolean DEBUG_NOTVERIF_MOD = false; /* DEFAULT : FALSE */
    public static final boolean DEBUG_NOTDELETE_TOKEN = true; /* DEFAULT : FALSE */

    public static final boolean DEBUG_INSERTITEM = false; /* DEFAULT : FALSE */
    public static final boolean DEBUG_INSERTBLOCK = false; /* DEFAULT : FALSE */

    public static final boolean DEBUG_VIEW_REQUEST = true; /* DEFAULT : FALSE */
    public static final boolean DEBUG_VIEW_VERIF_FUSION = true; /* DEFAULT : FALSE */


}
