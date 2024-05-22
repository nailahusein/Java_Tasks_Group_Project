package Dina.week07;

public class ArrayFindMinimum {

    // Write a method that can find the maximum number from an int array

    public static void main(String[] args) {
        int[] numbers = {5, 3, 9, 2, 7};
        int maxNumber = findMax(numbers);
        System.out.println("The maximum number is: " + maxNumber);
    }
    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE; // Initialize max to the smallest possible integer

        // Iterate through the array to find the maximum
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }
}

