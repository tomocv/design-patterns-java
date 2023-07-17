package common.utility;

public class StringChecker {
    public static String appendIfTrue(String message, Object item) {
        String output = "";
        String newLine = System.lineSeparator();

        if (item != null)
            output = message + item.toString() + newLine;
        return output;
    }
}
