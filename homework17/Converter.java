package yarchuk;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;

import java.io.FileWriter;
import java.io.IOException;

public class Converter {
    private final WorkWithFiles file = new WorkWithFiles();


    public void convert(String path) throws JsonProcessingException {
        if(file.fileType(path).equals("json")) {
            convertJsonToYaml(path);
        } else if(file.fileType(path).equals("yaml")) {
            convertJsonToYaml(path);
        }
    }

    private void convertJsonToYaml(String path) throws JsonProcessingException {
        JsonNode jsonNode = new ObjectMapper().readTree(file.fileToString(path));
        String yaml = new YAMLMapper().writeValueAsString(jsonNode);

        try (FileWriter fileWriter = new FileWriter(path.substring(0, path.length() - 4) + "yaml")) {
            fileWriter.write(yaml);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void convertYamlToJson(String path) throws JsonProcessingException {
        ObjectMapper yamlToRead = new ObjectMapper(new YAMLFactory());
        Object object = yamlToRead.readValue(file.fileToString(path), Object.class);
        ObjectMapper jsonWriter = new ObjectMapper();
        String json = jsonWriter.writeValueAsString(object);

        try (FileWriter fileWriter = new FileWriter(path.substring(0, path.length() - 4) + "json")) {
            fileWriter.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*public void convert(String path) throws IOException {
        if (file.fileType(path).equals("json")) {

            JsonNode jsonNode = new ObjectMapper().readTree(file.fileToString(path));
            String yaml = new YAMLMapper().writeValueAsString(jsonNode);

            try (FileWriter fileWriter = new FileWriter(path.substring(0, path.length() - 4) + "yaml")) {
                fileWriter.write(yaml);
            } catch (IOException e) {
                e.printStackTrace();
            }

        } else if (file.fileType(path).equals("yaml")) {
            ObjectMapper yamlToRead = new ObjectMapper(new YAMLFactory());
            Object object = yamlToRead.readValue(file.fileToString(path), Object.class);
            ObjectMapper jsonWriter = new ObjectMapper();
            String json = jsonWriter.writeValueAsString(object);

            try (FileWriter fileWriter = new FileWriter(path.substring(0, path.length() - 4) + "json")) {
                fileWriter.write(json);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }*/
}
