package dev.supel.validator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RegexRomanValidatorTest {

    private final RomanValidator validator = new RegexRomanValidator();

    @Test
    void shouldAcceptValidRomanNumerals() {
        assertTrue(validator.isValid("I"));
        assertTrue(validator.isValid("IV"));
        assertTrue(validator.isValid("MCMXCIV"));
    }

    @Test
    void shouldRejectInvalidRomanNumerals() {
        assertFalse(validator.isValid("IIII"));
        assertFalse(validator.isValid("VV"));
        assertFalse(validator.isValid("IC"));
        assertFalse(validator.isValid("IVI"));
        assertFalse(validator.isValid(""));
    }
}

