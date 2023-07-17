package solution.refactoredImage;

public class Main {
    public static void main(String[] args) {
        System.out.println("---- load originals from db");
        var images = new Images().loadFromDatabase();

        System.out.println("---- cloning originals and applying blur");
        images.forEach(image -> {
            var imageClone = image.clone();
            System.out.println(imageClone);
            imageClone.blur();
            System.out.println(imageClone);
        });

        System.out.println("---- cloning originals and applying sepia");
        images.forEach(image -> {
            var imageClone = image.clone();
            System.out.println(imageClone);
            imageClone.sepia();
            System.out.println(imageClone);
        });
    }
}
