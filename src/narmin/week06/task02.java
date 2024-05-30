package narmin.week06;

public class task02 {
    //Write a method that can find the maximum number from an int Array
    public static class MaximumNumberFinder {
        public static int findMaximum(int[] arr) {

            if (arr == null || arr.length == 0) {
                throw new IllegalArgumentException("Array is empty");
            }
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }

            return max;
        }

        public static void main(String[] args) {
            int[] numbers = {5, 10, 3, 8, 15};
            int maxNumber = findMaximum(numbers);
            System.out.println("Maximum number in the array is: " + maxNumber);
        }
    }

}
