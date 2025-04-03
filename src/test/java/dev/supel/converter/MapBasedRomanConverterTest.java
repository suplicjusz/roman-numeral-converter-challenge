package dev.supel.converter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MapBasedRomanConverterTest {

    private final RomanConverter converter = new MapBasedRomanConverter();

    @Test
    void shouldConvertRomanToArabicCorrectly() {
        assertEquals(1, converter.toArabic("I"));
        assertEquals(4, converter.toArabic("IV"));
        assertEquals(9, converter.toArabic("IX"));
        assertEquals(58, converter.toArabic("LVIII"));
        assertEquals(1994, converter.toArabic("MCMXCIV"));
        assertEquals(3999, converter.toArabic("MMMCMXCIX"));
    }
}
