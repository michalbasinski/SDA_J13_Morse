package pl.sda;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TextToMorseTranslatorTest {

    @Test
    public void translate() {
        final String textToTranslate = "sa";
        final String expectedResult = ".../.-";
        Translator translator = new TextToMorseTranslator();

        String result = translator.translate(textToTranslate);

        Assert.assertEquals(expectedResult, result);
    }
}