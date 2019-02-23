package pl.sda;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MorseToTextTranslatorTest {

    @Test
    public void shoudTranslateMorseCorrectly() {
        //given
        final String morseText = ".../.- .../.- .../.-";
        final String expectedResult = "sa sa sa";
        final Translator translator = new MorseToTextTranslator();

        //when
        String result = translator.translate(morseText);

        //then
        Assert.assertEquals(expectedResult, result);
    }
}