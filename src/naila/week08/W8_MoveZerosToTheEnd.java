package naila.week08;

import java.util.Arrays;

public class W8_MoveZerosToTheEnd {
    /*Write a method that can move all the zeros to  last indexes of the array
     (Do Not Use Sort Method)
Ex:
input:  {1,0,2,0,3,0,4,0};
output: [1, 2, 3, 4, 0, 0, 0, 0]*/


    public static void main(String[] args) {


        int[] arr = {1, 0, 2, 0, 3, 0, 4, 0};
        int[] result = new int[arr.length];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!= 0) {
                result[j++] = arr[i];
            }
        }


        System.out.println(Arrays.toString(result));
    }

}


