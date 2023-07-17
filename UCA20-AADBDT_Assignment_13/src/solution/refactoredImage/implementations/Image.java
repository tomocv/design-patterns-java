package solution.refactoredImage.implementations;

public class Image implements Prototype {
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

    @Override
    public Image clone() {
        return new Image(name);
    }
}
