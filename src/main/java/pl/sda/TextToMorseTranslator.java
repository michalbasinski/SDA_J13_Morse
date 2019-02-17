package pl.sda;

import java.util.HashMap;
import java.util.Map;

public class TextToMorseTranslator implements Translator {

    @Override
    public String translate(String textToTranslate) {
        Map<String, String> mappings = createMappings();

        String[] words = textToTranslate.split(" ");

        StringBuilder stringBuilder = new StringBuilder();
        for (String word : words) {
            String translatedWord = translateWord(word, mappings);
            stringBuilder
                    .append(translatedWord)
                    .append(" ");
        }

        return stringBuilder.toString().trim();
    }

    private String translateWord(String textToTranslate, Map<String, String> mappings) {
        StringBuilder stringBuilder = new StringBuilder();
        //for (Character character : textToTranslate.toCharArray()) {
        //    char character = textToTranslate.getCharAt(i);
        // }
        for (int i = 0; i < textToTranslate.length(); i++) {
            Character character = textToTranslate.toCharArray()[i];
            String charToTranslate = character.toString();
            stringBuilder.append(mappings.get(charToTranslate));
            if (i < textToTranslate.length() - 1) {
                stringBuilder.append("/");
            }
        }

        return stringBuilder.toString();
    }

    private Map<String, String> createMappings() {
        Map<String, String> mappings = new HashMap<>();
        mappings.put("a", ".-");
        mappings.put("s", "...");
        return mappings;
    }
}
