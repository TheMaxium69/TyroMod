package fr.tyrolium.tyromod.generate;

import net.minecraft.block.material.Material;

public class BlockGenerateClass {
    private String name;
    private Boolean className;
    private String type;

    public BlockGenerateClass(String name, String type,  Boolean className) {
        this.name = name;
        this.type = type;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getTypeName() {

        if (this.type == "classic") {
            return "null";
        } else {
            return "_" + type;
        }

    }

    public Boolean getClassName() {
        return className;
    }

    public Material getMaterial() {

        if (this.type == "classic") {
            return Material.IRON;
        } else if (this.type == "block"){
            return Material.IRON;
        } else if (this.type == "ore"){
            return Material.ROCK;
        } else {
            return Material.AIR;
        }

    }
}
