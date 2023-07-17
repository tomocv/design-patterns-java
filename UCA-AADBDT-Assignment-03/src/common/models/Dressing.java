package common.models;

public enum Dressing {
    YOGURT ("Yogurt Dressing"),
    THOUSAND_ISLANDS ("1000 Islands Dressing"),
    CAESAR ("Caesar dressing");

    private String name;

    Dressing(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
