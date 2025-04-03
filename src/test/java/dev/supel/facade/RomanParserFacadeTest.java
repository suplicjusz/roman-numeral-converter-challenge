package dev.supel.facade;

import dev.supel.converter.MapBasedRomanConverter;
import dev.supel.validator.RegexRomanValidator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RomanParserFacadeTest {

    private final RomanParserFacade parser = new RomanParserFacade(
            new RegexRomanValidator(),
            new MapBasedRomanConverter()
    );

    @Test
    void shouldParseValidRomanNumber() {
        assertEquals(2024, parser.parse("MMXXIV"));
    }

    @Test
    void shouldThrowExceptionForInvalidRomanNumber() {
        assertThrows(IllegalArgumentException.class, () -> parser.parse("VV"));
        assertThrows(IllegalArgumentException.class, () -> parser.parse("IVI"));
    }
}
