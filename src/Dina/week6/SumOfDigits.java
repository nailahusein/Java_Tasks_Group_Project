package Dina.week6;

public class SumOfDigits {

    public class DigitSumCalculator {
        public static int sumOfDigits(String str) {
            int sum = 0;
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (Character.isDigit(c)) {
                    // Convert char to int and add to sum
                    sum += Character.getNumericValue(c);
                }
            }
            return sum;
        }

        public static void main(String[] args) {
            String input = "abc123def45";
            int digitSum = sumOfDigits(input);
            System.out.println("The sum of digits in the string is: " + digitSum);
        }
    }
}
