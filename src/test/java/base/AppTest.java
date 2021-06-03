package base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    public void output_string_includes_quote_and_speaker(){
        App myApp = new App();
        String speaker = "Obi-Wan Kenobi";
        String quote = "These aren't the droids you're looking for.";

        String expectedMessage = "Obi-Wan Kenobi says, \"These aren't the droids you're looking for.\"";
        String actualMessage = myApp.generateMessage(quote, speaker);

        assertEquals(expectedMessage, actualMessage);
    }

}