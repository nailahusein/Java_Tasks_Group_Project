package narmin.week04;

import java.util.HashMap;
import java.util.Map;

public class task01 {
    public static void main(String[] args) {
        //String -- Frequency of Characters
        //Write a return method that can find the frequency of
        //characters
        //Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

        class CharacterFrequency {

            public static String frequencyOfChars(String str) {

                Map<Character, Integer> charFrequency = new HashMap<>();

                for (char c : str.toCharArray()) {

                    if (charFrequency.containsKey(c)) {
                        charFrequency.put(c, charFrequency.get(c) + 1);
                    } else {

                        charFrequency.put(c, 1);
                    }
                }

                // Build the result string
                StringBuilder result = new StringBuilder();
                for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
                    result.append(entry.getKey()).append(entry.getValue());
                }

                return result.toString();
            }

            public static void main(String[] args) {
                String input = "AAABBCDD";
                System.out.println(frequencyOfChars(input));
            }
        }

    }}