package fr.tyrolium.tyromod.items;

import fr.tyrolium.tyromod.TyroMod;
import fr.tyrolium.tyromod.global.DefaultItem;

public class ServerItem extends DefaultItem {

    public ServerItem(String name, String version, String id)
    {
        super(name, version, id);
        setCreativeTab(TyroMod.TyroModTabServ);
    }

}
