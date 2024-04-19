package fr.tyrolium.tyromod.generate;

import net.minecraft.block.material.Material;

public class BlockGenerateClass {
    private String name;
    private Boolean className;
    private String type;
    private Boolean isOre;
    private String modVersion;
    private String oreTier;

    public BlockGenerateClass(String name, String type,  Boolean className, String version) {
        this.name = name;
        this.type = type;
        this.className = className;
        this.isOre = false;
        this.modVersion = version;
    }
    public BlockGenerateClass(String name, String type,  Boolean className, String version, String tier) {
        this.name = name;
        this.type = type;
        this.className = className;
        this.isOre = true;
        this.modVersion = version;
        this.oreTier = tier;
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

    public String getModVersion() {

        return this.modVersion;

    }

    public String getOreTier() {

        return this.oreTier;

    }

    public String isOre() {

        if (this.isOre) {
            return "true";
        } else {
            return "false";
        }

    }
}
