package instructor.week07;

import java.util.Arrays;

public class W7_FindMinumum {

    // Write a method that can find the minimum  number from an int Array
    public static void main(String[] args) {
        int[] arr = {99, 12, 23, 32, 44, 57, 6};

        System.out.println(minValue(new int[]{150, 5, 8, 9, 15}));
        System.out.println(minValue(arr));
        min(arr);
        System.out.println("minValue2() = " + minValue2(arr));
    }
//Solution 1
    public static int minValue(int[] n) {
        int min = Integer.MAX_VALUE;
        for (int each : n)
            if (each < min)
                min = each;
        return min;
    }

    //Solution 2
    public static void min(int[] n) {
        int min = n[0];
        for (int each : n) {
            if (each < min) {
                min = each;
            }
        }
        System.out.println(min);
    }

    //Solution 3
    public static int minValue2( int[]  n ) {
        Arrays.sort( n );
        return  n [ 0 ];
    }



}
