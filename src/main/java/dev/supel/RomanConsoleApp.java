package dev.supel;

import dev.supel.converter.MapBasedRomanConverter;
import dev.supel.converter.RomanConverter;
import dev.supel.facade.RomanParserFacade;
import dev.supel.validator.RegexRomanValidator;
import dev.supel.validator.RomanValidator;

import java.util.Scanner;

public class RomanConsoleApp {
    public static void main(String[] args) {
        RomanValidator validator = new RegexRomanValidator();
        RomanConverter converter = new MapBasedRomanConverter();
        RomanParserFacade parser = new RomanParserFacade(validator, converter);

        System.out.println("Welcome to Roman Numeral Converter!");
        System.out.println("Enter a Roman numeral (I–MMMCMXCIX), or type 'Q' to quit.");

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("> ");
                String input = scanner.nextLine().trim();

                if (input.equalsIgnoreCase("Q")) {
                    System.out.println("Goodbye!");
                    break;
                }

                try {
                    int result = parser.parse(input.toUpperCase());
                    System.out.println("Arabic value: " + result);
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        }
    }
}
