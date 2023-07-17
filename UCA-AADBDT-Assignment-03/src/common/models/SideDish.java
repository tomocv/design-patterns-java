package common.models;

public enum SideDish {
    SMALL_FRIES ("Small Fries"),
    MEDIUM_FRIES ("Medium Fries"),
    LARGE_FRIES ("Large Fries");

    private String name;

    SideDish(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
