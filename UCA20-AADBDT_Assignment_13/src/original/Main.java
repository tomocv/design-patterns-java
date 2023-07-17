package original;

public class Main {
    public static void main(String[] args) {
        var images = new Images();

        System.out.println("---- load originals from db and apply blur");
        images.loadFromDatabase().forEach(image -> {
            System.out.println(image);
            image.blur();
            System.out.println(image);
        });

        System.out.println("---- load originals from db and apply sepia");
        images.loadFromDatabase().forEach(image -> {
            System.out.println(image);
            image.sepia();
            System.out.println(image);
        });
    }
}
