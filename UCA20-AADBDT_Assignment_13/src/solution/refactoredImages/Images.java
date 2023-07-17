package solution.refactoredImages;
import original.implementations.Image;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Images {
    private List cachedData = new ArrayList<>();

    public void loadFromDatabase() {
        System.out.println("---- loading originals from db");
        cachedData.addAll(Arrays.asList(
                "img1",
                "img2",
                "img3"
        ));
    }

    public List<Image> loadFromCache() {
        List listOf = new ArrayList<>();
        cachedData.forEach(data -> listOf.add(new Image(data.toString())));
        return listOf;
    }
}
