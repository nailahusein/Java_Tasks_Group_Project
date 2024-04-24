package narmin.week05;

import static java.util.Collections.reverse;

public class task02 {


        //String -- Reverse
        //Write a return method that can reverse String
        //Ex: Reverse("ABCD"); ==> DCBA

    public static String reverseString(String str){
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String original = "ABCD";
        String reversed = reverseString(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }





    }






