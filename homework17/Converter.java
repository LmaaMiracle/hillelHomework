package yarchuk;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Converter {

    public void convert(String path) throws IOException {
        if (fileType(path).equals("json")) {

            JsonNode jsonNode = new ObjectMapper().readTree(fileToString(path));
            String yaml = new YAMLMapper().writeValueAsString(jsonNode);

            try (FileWriter fileWriter = new FileWriter(path.substring(0, path.length() - 4) + "yaml")) {
                fileWriter.write(yaml);
            } catch (IOException e) {
                e.printStackTrace();
            }

        } else if (fileType(path).equals("yaml")) {
            ObjectMapper yamlToRead = new ObjectMapper(new YAMLFactory());
            Object object = yamlToRead.readValue(fileToString(path), Object.class);
            ObjectMapper jsonWriter = new ObjectMapper();
            String json = jsonWriter.writeValueAsString(object);

            try (FileWriter fileWriter = new FileWriter(path.substring(0, path.length() - 4) + "json")) {
                fileWriter.write(json);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public String fileToString(String path) {
        StringBuilder builder = new StringBuilder();

        try (Stream<String> linesStream = Files.lines(Paths.get(path))) {
            linesStream.forEach(s -> builder.append(s).append("\n"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return builder.toString();
    }

    private String fileType(String path) {
        String fileName = new File(path).getName();
        int dot = fileName.indexOf(".");
        return (dot == -1) ? "" : fileName.substring(dot + 1);
    }

}
