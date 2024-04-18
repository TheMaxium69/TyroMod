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



    /*BASIC ITEM*/
    public ItemGenerateClass(String name, String type, Boolean className) {
        this.name = name;
        this.type = type;
        this.className = className;
        this.isArmor = false;
    }

    /*TOOL ITEM*/
    public ItemGenerateClass(String name, String type, Boolean className, Item.ToolMaterial ToolMaterial) {
        this.name = name;
        this.type = type;
        this.className = className;
        this.toolMaterial = ToolMaterial;
        this.isArmor = false;
    }

    /*ARMOR ITEM*/
    public ItemGenerateClass(String name, String type, Boolean className, ItemArmor.ArmorMaterial ArmorMaterial) {
        this.name = name;
        this.type = type;
        this.className = className;
        this.armorMaterial = ArmorMaterial;
        this.isArmor = true;
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

    public String isArmor() {

        if (this.isArmor) {
            return "true";
        } else {
            return "false";
        }

    }



}

