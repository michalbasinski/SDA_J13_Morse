package pl.sda;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class MappingFileReader {

    public Map<String, String> readMappingFile() {
        String resource = getClass()
                .getClassLoader()
                .getResource("/morseMappings.txt")
                .getFile();

        File file = new File(resource);

        Map<String, String> mappings = new HashMap<>();

        try {
            FileReader fileReader = new FileReader(file);

        } catch (FileNotFoundException e) {
            throw new MappingFileNotFoundException();
        }

        return mappings;
    }

}
