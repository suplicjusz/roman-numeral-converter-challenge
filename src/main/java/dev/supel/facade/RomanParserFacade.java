package dev.supel.facade;

import dev.supel.converter.RomanConverter;
import dev.supel.validator.RomanValidator;

public class RomanParserFacade {
    private final RomanValidator validator;
    private final RomanConverter converter;

    public RomanParserFacade(RomanValidator validator, RomanConverter converter) {
        this.validator = validator;
        this.converter = converter;
    }

    public int parse(String roman) {
        if (!validator.isValid(roman)) {
            throw new IllegalArgumentException("Invalid Roman numeral: " + roman);
        }
        return converter.toArabic(roman);
    }
}
