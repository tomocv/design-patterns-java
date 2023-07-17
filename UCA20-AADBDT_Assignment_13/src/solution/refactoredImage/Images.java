package solution.refactoredImage;

import solution.refactoredImage.implementations.Image;

import java.util.Arrays;
import java.util.List;

class Images {
    public List<Image> loadFromDatabase() {
        return Arrays.asList(
                new Image("img1"),
                new Image("img2"),
                new Image("img3"));
    }

}
