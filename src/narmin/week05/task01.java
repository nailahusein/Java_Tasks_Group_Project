package narmin.week05;

import java.util.HashSet;
import java.util.Set;

public class task01 {


        //String -- Find the unique
        //Write a return method that can find the unique characters from the String
        //Ex: unique("AAABBBCCCDEF") ==> "DEF";



        static class UniqueCharacters {
            public static String unique(String str) {

                Set<Character> uniqueChars = new HashSet<>();
                Set<Character> nonUniqueChars = new HashSet<>();


                for (int i = 0; i < str.length(); i++) {
                    char currentChar = str.charAt(i);
                    if (!nonUniqueChars.contains(currentChar)) {
                        if (uniqueChars.contains(currentChar)) {
                            uniqueChars.remove(currentChar);
                            nonUniqueChars.add(currentChar);
                        } else {
                            uniqueChars.add(currentChar);
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
                String str = "AAABBBCCCDEF";
                System.out.println(unique(str));
            }
        }


    }

