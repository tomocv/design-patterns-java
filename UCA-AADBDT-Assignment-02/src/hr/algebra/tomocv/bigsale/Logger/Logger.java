package hr.algebra.tomocv.bigsale.Logger;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Logger {
    private static final String FILE_PATH = "src/hr/algebra/tomocv/bigsale/Files/log.txt";

    public void log(String content) throws IOException {
        var file = new File(FILE_PATH);
        if (!file.exists()) {
            file.createNewFile();
        }
        try (PrintStream out = new PrintStream( new FileOutputStream(FILE_PATH, true))) {
            out.println(content);
        }
    }
}
