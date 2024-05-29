package Dina.week6;

import static Dina.week6.ArrayListFindMAx.MaxNumberFinder.findMax;

public class ArrayListFindMAx {
    public static void main(String[] args) {

        int[] numbers = {5, 10, 3, 8, 15};
        int maxNumber = MaxNumberFinder.findMax(numbers);
        System.out.println("The maximum number is: " + maxNumber);
    }

    public class MaxNumberFinder {
        public static int findMax(int[] arr) {  // this method takes an int array as an input and return max value of array
            int max = arr[0]; // initializing variable max to the first element of the array
            for (int i = 1; i < arr.length; i++) { // iterating through the array using loop starting from the second element
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max; // after iterating through the entire array max , will hold the max value that is found and return
                              // this value as a result of max number
        }
    }
}



