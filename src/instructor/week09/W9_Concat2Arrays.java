package instructor.week09;

import java.util.Arrays;



public class W9_Concat2Arrays {
    public static void main(String[] args) {
//Write a return method that can concate two arrays
        int[] a1=new int[]{1,2,3,4,5};
        int[] a2=new int[]{6,7,8,9,10};
        System.out.println(Arrays.toString(concatTwoArrays(a1, a2)));
        System.out.println(Arrays.toString(concatTwoArrays(new int[]{1, 2, 3}, new int[]{4, 5, 6})));
    }

    public static int[] concatTwoArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int i = 0;
        for (int each : arr1) {
            result[i] = each;
            i++;
        }

        for (int each : arr2) {
            result[i] = each;
            i++;
        }
        return result;
    }
}
/*public static void main(String[] args) {

        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};

        int lengthArr1 = arr1.length;
        int lengthArr2 = arr2.length;

        int[] result = new int[lengthArr1+lengthArr2];

        // having arr1 as a source we are copying from index 0 till the end which is lengthArr1,
        // and storing it in result.
        System.arraycopy(arr1,0,result,0,lengthArr1);

        // here using arr2 as a source, we can copy from the lengthArr1 which is ending point off arr1
        // and concat it with lengthArr2 which is ending point of arr2. After that we have both
        // arr1 and arr2 concatenated
        System.arraycopy(arr2,0, result, lengthArr1,lengthArr2);

        System.out.println(Arrays.toString(result));

    } */