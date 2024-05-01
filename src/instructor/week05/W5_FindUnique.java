package instructor.week05;

import java.util.Arrays;
import java.util.Collections;
//String -- Find the unique
//Write a return method that can find the unique characters from the String
//Ex: unique("AAABBBCCCDEF") ==> "DEF";
public class W5_FindUnique {
    public static void main(String[] args) {
        /*Write a return  method that can find the unique characters from the String
        Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";*/
        System.out.println(Unique("AAABBBCCCDEF"));
        System.out.println(unique("AAABBBCCCDEF"));
    }
    public static String Unique(String str) {

        String result ="";

        for(String each : str.split(""))
            result +=(  (Collections.frequency(Arrays.asList(str.split("")), each)) ==1 ) ? each : "";
        return result;
    }
    public static String unique(String str) {

        String[] arr=str.split("");

        String unique1="";

        for(int j=0; j<arr.length; j++) {
            int num=0;
            for(int i=0; i<arr.length; i++ ) {
                if(arr[i].equals(arr[j]) )
                    num++;
            }
            if(num==1)
                unique1+=arr[j];
        }
        return unique1;
    }

//    String str = "AAABBBCCCDEF";
//
//    unique(str);
//
//}
//
//    private static void unique(String str) {
//        String result = "";
//        for (int i = 0; i < str.length(); i++) {
//
//            int count= 0;
//
//            for (int j = 0; j < str.length(); j++) {
//
//                if (str.charAt(i) == str.charAt(j)) {
//                    count++;
//                }
//            }
//            if (count == 1) {
//
//                result +=str.charAt(i);
//
//            }
//        }
//        System.out.println("result = " + result);
//    }



}
