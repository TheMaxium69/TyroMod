package fr.tyrolium.tyromod.blocks;

import fr.tyrolium.tyromod.TyroMod;
import fr.tyrolium.tyromod.global.DefaultBlock;
import net.minecraft.block.material.Material;

public class ServerBlock extends DefaultBlock {
    public ServerBlock(String name, Material materialIn, String version, String id) {
        super(name, materialIn, version, id);
        setCreativeTab(TyroMod.TyroModTabServ);
    }
}
