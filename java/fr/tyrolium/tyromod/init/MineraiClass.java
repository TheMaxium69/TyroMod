package fr.tyrolium.tyromod.init;

public class MineraiClass {
    private String name;
    private Boolean className;

    public MineraiClass(String name, Boolean className) {
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
