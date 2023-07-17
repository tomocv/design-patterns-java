package original.implementations;

public class Image {
    private String name;
    private String imageData;

    public Image(String name) {
        this.name = name;
        imageData = "original-" + name;
    }

    public void blur() {
        imageData = "blurred-" + name;
    }

    public void sepia() {
        imageData = "sepia-" + name;
    }

    @Override
    public String toString() {
        return name + ": " + imageData;
    }
}
