package instructor.week06;

import java.util.Arrays;

public class W6_FindMaximum {
    //Write a method that can find the maximum number from an int Array
    public static void main(String[] args) {
        System.out.println(maxValue(new int[]{5, 6, 9, 15}));
        System.out.println(maxValue2(new int[]{5, 6, 9, 15}));
    }
    public static int maxValue( int[]  n ) {
        int max = Integer.MIN_VALUE;
        for(int each: n)
            if(each > max)
                max = each;
        return max;
    }
    public static int maxValue2( int[]  n ) {
        Arrays.sort( n );
        return  n [ n.length-1 ];
    }

/*
// Solution 2
        public static void main(String[] args) {
            int[]arr={10,30,50};
            System.out.println(maximum(arr));
        }
        public static int maximum(int[]arr){

            int max =  arr[0];
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]>max){
                    max=arr[i];
                }
            }
            return(max);
        }
    */




}
