package Dina.week05;

import java.util.HashSet;
import java.util.Set;

public class FindUnique {

    public class UniqueCharactersFinder {
        public static String findUnique(String str) {
            Set<Character> repeatedChars = new HashSet<>();
            Set<Character> uniqueChars = new HashSet<>();

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (!repeatedChars.contains(c)) {
                    if (uniqueChars.contains(c)) {
                        uniqueChars.remove(c);
                        repeatedChars.add(c);
                    } else {
                        uniqueChars.add(c);
                    }
                }
            }

            StringBuilder result = new StringBuilder();
            for (char c : uniqueChars) {
                result.append(c);
            }

            return result.toString();
        }

        public static void main(String[] args) {
            String input = "AAABBBCCCDEF";
            String uniqueChars = findUnique(input);
            System.out.println("Unique characters in the string: " + uniqueChars);
        }
    }



}

/*String -- Find the unique
Write a return method that can find the unique characters from the String
Ex: unique("AAABBBCCCDEF") ==> "DEF";*/
