import java.util.*;

public class Sentence {
    private String [] words;
    private Map<Integer, WordToken> tokens = new HashMap<>();
    public Sentence(String plainText) {
        words = plainText.split(" ");
    }

    public WordToken getWord(int index) {
        WordToken token = new WordToken();
        tokens.put(index, token);
        return token;
    }

    @Override
    public String toString() {
        tokens.forEach((integer, wordToken) -> {
            if (wordToken.capitalize) {
                words[integer] = words[integer].toUpperCase();
            }
         });
        String result = String.join(" ", words);
        return result;
    }

    class WordToken {
        public boolean capitalize;
    }
}

class Demo {
    public static void main(String[] args) {
        Sentence sentence = new Sentence("što je danas lijep i sunčan dan");
        sentence.getWord(3).capitalize = true;
        sentence.getWord(5).capitalize = true;
        System.out.println(sentence);
    }
}