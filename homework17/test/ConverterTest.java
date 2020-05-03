import org.junit.jupiter.api.Test;
import yarchuk.Converter;
import yarchuk.WorkWithFiles;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConverterTest {

    private final WorkWithFiles file = new WorkWithFiles();
    private String expectedJson = "{\"doe\":\"a deer, a female deer\",\"ray\":\"a drop of golden sun\",\"pi\":3.14159,\"xmas\":true,\"french-hens\":3,\"calling-birds\":[\"huey\",\"dewey\",\"louie\",\"fred\"],\"xmas-fifth-day\":{\"calling-birds\":\"four\",\"french-hens\":3,\"golden-rings\":5,\"partridges\":{\"count\":1,\"location\":\"a pear tree\"},\"turtle-doves\":\"two\"}}\n";
    private String expectedYaml = "---\n" +
            "doe: \"a deer, a female deer\"\n" +
            "ray: \"a drop of golden sun\"\n" +
            "pi: 3.14159\n" +
            "xmas: true\n" +
            "french-hens: 3\n" +
            "calling-birds:\n" +
            "- \"huey\"\n" +
            "- \"dewey\"\n" +
            "- \"louie\"\n" +
            "- \"fred\"\n" +
            "xmas-fifth-day:\n" +
            "  calling-birds: \"four\"\n" +
            "  french-hens: 3\n" +
            "  golden-rings: 5\n" +
            "  partridges:\n" +
            "    count: 1\n" +
            "    location: \"a pear tree\"\n" +
            "  turtle-doves: \"two\"\n";

    @Test
    public void testJsonToYamlConversion() {

        Converter converter = new Converter();
        try {
            converter.convert("src\\test\\test.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
        String actual = file.fileToString("src\\test\\test.yaml");

        assertEquals(expectedYaml, actual);
    }

    @Test
    public void testYamlToJsonConversion() {
        Converter converter = new Converter();
        try {
            converter.convert("src\\test\\secondTest.yaml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        String actual = file.fileToString("src\\test\\secondTest.json");

        assertEquals(expectedJson, actual);
    }

}
