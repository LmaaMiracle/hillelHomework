package yarchuk;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class WorkWithFiles {
    public String fileToString(String path) {
        StringBuilder builder = new StringBuilder();

        try (Stream<String> linesStream = Files.lines(Paths.get(path))) {
            linesStream.forEach(s -> builder.append(s).append("\n"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return builder.toString();
    }

    public String fileType(String path) {
        String fileName = new File(path).getName();
        int dot = fileName.indexOf(".");
        return (dot == -1) ? "" : fileName.substring(dot + 1);
    }

}
