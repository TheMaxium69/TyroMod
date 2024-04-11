package fr.tyrolium.tyromod.generate;

public class BlockGenerateClass {
    private String name;
    private Boolean className;

    public BlockGenerateClass(String name, Boolean className) {
        this.name = name;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public Boolean getClassName() {
        return className;
    }
}
