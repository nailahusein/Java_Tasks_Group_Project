package narmin.week09;
//Array-concat two arrays. Write a return method that can concate two arrays.

public class ArrayConcat {

    public static int[] concatArrays(int[] array1, int[] array2) {

        int totalLength = array1.length + array2.length;


        int[] result = new int[totalLength];


        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i];
        }


        for (int i = 0; i < array2.length; i++) {
            result[array1.length + i] = array2[i];
        }

        return result;
    }

    public static void main(String[] args) {
        // Example usage
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        int[] concatenatedArray = concatArrays(array1, array2);


        for (int element : concatenatedArray) {
            System.out.print(element + " ");
        }
    }
}
