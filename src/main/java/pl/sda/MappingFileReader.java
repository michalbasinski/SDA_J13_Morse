package pl.sda;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class MappingFileReader {

    public Map<String, String> readMappingFile() {
        String resource = getClass()
                .getClassLoader()
                .getResource("morseMappings.txt")
                .getFile();

        File file = new File(resource);
        Map<String, String> mappings = new HashMap<>();

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] tokens = line.split(":");
                mappings.put(tokens[0].toLowerCase(), tokens[1]);
            }

        } catch (FileNotFoundException e) {
            throw new MappingFileNotFoundException();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return mappings;
    }

}
