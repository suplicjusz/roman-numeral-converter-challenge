package dev.supel.converter;

import java.util.Map;

public class MapBasedRomanConverter implements RomanConverter {
    private static final Map<String, Integer> romanMap = Map.ofEntries(
            Map.entry("M", 1000),
            Map.entry("CM", 900),
            Map.entry("D", 500),
            Map.entry("CD", 400),
            Map.entry("C", 100),
            Map.entry("XC", 90),
            Map.entry("L", 50),
            Map.entry("XL", 40),
            Map.entry("X", 10),
            Map.entry("IX", 9),
            Map.entry("V", 5),
            Map.entry("IV", 4),
            Map.entry("I", 1)
    );

    @Override
    public int toArabic(String roman) {
        int i = 0;
        int result = 0;

        while (i < roman.length()) {
            if (i + 1 < roman.length() && romanMap.containsKey(roman.substring(i, i + 2))) {
                result += romanMap.get(roman.substring(i, i + 2));
                i += 2;
            } else {
                result += romanMap.get(roman.substring(i, i + 1));
                i += 1;
            }
        }

        return result;
    }
}
