package fr.tyrolium.tyromod.generate;

public class ItemGenerateClass {
    private String name;
    private Boolean className;
    private String typeName;

    public ItemGenerateClass(String name, String typeName, Boolean className) {
        this.name = name;
        this.typeName = typeName;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public String getTypeName() {
        return typeName;
    }

    public Boolean getClassName() {
        return className;
    }

}

