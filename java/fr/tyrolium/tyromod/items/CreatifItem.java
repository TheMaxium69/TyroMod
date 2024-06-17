package fr.tyrolium.tyromod.items;

import fr.tyrolium.tyromod.Global;
import fr.tyrolium.tyromod.TyroMod;
import fr.tyrolium.tyromod.global.DefaultItem;

public class CreatifItem extends DefaultItem {

    public CreatifItem(String name, String version, String id)
    {
        super(name, version, id);
        setCreativeTab(TyroMod.TyroModTabServ);
    }

}
