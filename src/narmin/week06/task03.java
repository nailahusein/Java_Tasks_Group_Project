package narmin.week06;


public class task03 {

    //Write a method that can return the sum of the digits in a string
    public static class DigitSum {
        public static int sumOfDigits(String input) {
            int sum = 0;
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (Character.isDigit(c)) {
                    int digitValue = Character.getNumericValue(c);
                    sum += digitValue;
                }
            }
            return sum;
        }

        public static void main(String[] args) {
            String str = "abc123def456";
            int sum = sumOfDigits(str);
            System.out.println("Sum of digits in the string: " + sum);
        }
    }

}
