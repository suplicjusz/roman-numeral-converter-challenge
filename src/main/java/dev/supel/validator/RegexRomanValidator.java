package dev.supel.validator;

import java.util.regex.Pattern;

public class RegexRomanValidator implements RomanValidator {
    private static final Pattern ROMAN_PATTERN =
            Pattern.compile("^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$");

    @Override
    public boolean isValid(String roman) {
        return ROMAN_PATTERN.matcher(roman).matches();
    }
}
