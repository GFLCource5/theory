package Singleton;

public enum EnumSingleton {

    INSTANCE("defaultType");
    private String type;

    EnumSingleton(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
