package fr.tyrolium.tyromod.generate;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;

public class ItemGenerateClass {
    private String name;
    private Boolean className;
    private String type;
    private ItemArmor.ArmorMaterial armorMaterial;
    private Item.ToolMaterial toolMaterial;
    private Boolean isArmor;
    private Boolean isOre;
    private String modVersion;
    private String oreTier;


    /*BASIC ITEM*/
    public ItemGenerateClass(String name, String type, Boolean className, String version) {
        this.name = name;
        this.type = type;
        this.className = className;
        this.isArmor = false;
        this.isOre = false;
        this.modVersion = version;
    }

    /*ORE ITEM*/
    public ItemGenerateClass(String name, String type, Boolean className, String version, String tier) {
        this.name = name;
        this.type = type;
        this.className = className;
        this.isArmor = false;
        this.isOre = true;
        this.modVersion = version;
        this.oreTier = tier;
    }

    /*TOOL ITEM*/
    public ItemGenerateClass(String name, String type, Boolean className, Item.ToolMaterial ToolMaterial, String version, String tier) {
        this.name = name;
        this.type = type;
        this.className = className;
        this.toolMaterial = ToolMaterial;
        this.isArmor = false;
        this.isOre = true;
        this.modVersion = version;
        this.oreTier = tier;
    }

    /*ARMOR ITEM*/
    public ItemGenerateClass(String name, String type, Boolean className, ItemArmor.ArmorMaterial ArmorMaterial, String version, String tier) {
        this.name = name;
        this.type = type;
        this.className = className;
        this.armorMaterial = ArmorMaterial;
        this.isArmor = true;
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

    public ItemArmor.ArmorMaterial getArmorMaterial() {
        return armorMaterial;
    }

    public Item.ToolMaterial getToolMaterial() {
        return toolMaterial;
    }

    public EntityEquipmentSlot getEntityEquipmentSlot() {

        if (this.type == "helmet") {
            return EntityEquipmentSlot.HEAD;
        } else if (this.type == "chestplate") {
            return EntityEquipmentSlot.CHEST;
        } else if (this.type == "leggings") {
            return EntityEquipmentSlot.LEGS;
        } else {
            return EntityEquipmentSlot.FEET;
        }

    }

    public String getModVersion() {

        return this.modVersion;

    }

    public String getOreTier() {

        return this.oreTier;

    }

    public String isArmor() {

        if (this.isArmor) {
            return "true";
        } else {
            return "false";
        }

    }

    public String isOre() {

        if (this.isOre) {
            return "true";
        } else {
            return "false";
        }

    }



}

