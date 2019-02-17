package pl.sda.maps;

import java.util.HashMap;
import java.util.Map;

public class PlEngTranslator {

    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("dom", "house");
        dictionary.put("szkoła", "school");

        // iteracja po mapie z wykorzystaniem keySet()
        for (String key : dictionary.keySet()) {
            System.out.println(key + " : " + dictionary.get(key));
        }

        //iteracja po mapie z wykorzystaniem entrySetu
        for (Map.Entry<String, String> entry : dictionary.entrySet()) {

            System.out.println(entry);

            //alternatywny sposób dostania się do wartości
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

}
