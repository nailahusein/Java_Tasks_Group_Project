package naila.week06;

import java.util.Arrays;

public class W6_SumOfDigits {
    //Write a method that can return the sum of the digits in a string
    public static void main(String[] args) {
        System.out.println(sumOfDigits("12 java 5 apple 3"));
        System.out.println(getSumOfNumbers("12 java 5 apple 3"));
    }
    public  static int  sumOfDigits(String s) {
        int total = 0;
        char[] ch =  s.toCharArray();
        for(char each: ch) {
            if(Character.isDigit(each)) {
                total += Integer.parseInt(""+each);


            }
        }
        return total;
    }
    public static int getSumOfNumbers(String s) {
        /*
            Please implement this method to
            return the sum of all integers found in the parameter String.
            You can assume that integers are separated from other parts with one or more spaces (' ' symbol).

            For example, s="12 some text 3 7", result: 22 (12+3+7=22)
        */

        int sum = 0;

        String[] numbers = s.replaceAll("[\\D]+"," ").split(" ");
        System.out.println(Arrays.toString(numbers));
        for(String each : numbers){
            sum+=Integer.parseInt(each);
                    }
        return sum;
    }

    /*

    public static void main(String[] args) {
        System.out.println(Sum("A3V2B7"));
    }

    public static int Sum(String str) {
        String temp = "0";
        int sum = 0; //sum of all numbers

        for (int i = 0; i < str.length(); i++) {//read each character in String
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
               sum += ch - 48;
              //  sum+=ch;
            }
        }
        return sum;

    }
}
/*
Write a method that can return the sum of the digits in a string

 */
/*
import java.util.Collections;


    public static void main(String[] args) {
        String s = "Hello this is 100 percent check 35";
        System.out.println(sumString(s));
    }

    public static int sumString(String s) {
        int sum=0;
        for (int i = 0; i <s.length(); i++) {
            if(Character.isDigit(s.charAt(i))){
               sum+=Integer.parseInt(String.valueOf(s.charAt(i)));
               //Integer.parseInt(s.substring(i,i+1));
            }

        }

        return sum;


    }

}
 */



}
