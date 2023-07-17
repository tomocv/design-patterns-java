package solution.refactoredImages;

public class Main {
    public static void main(String[] args) {

        var images = new Images();
        images.loadFromDatabase();

        System.out.println("---- cloning original images");
        var clonedImages = images.loadFromCache();

        System.out.println("---- applying blur to cloned images");
        clonedImages.forEach( image -> {
            System.out.println(image);
            image.blur();
            System.out.println(image);
        });

        System.out.println("---- cloning original images");
        clonedImages = images.loadFromCache();
        System.out.println("---- applying sepia to cloned images");
        clonedImages.forEach(image -> {
            System.out.println(image);
            image.sepia();
            System.out.println(image);
        });
    }
}
