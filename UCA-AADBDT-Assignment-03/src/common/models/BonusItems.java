package common.models;

public enum BonusItems {
    KNIFE_AND_FORK ("Knife & Fork"),
    TOY ("Toy");

    private String name;

    BonusItems(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
