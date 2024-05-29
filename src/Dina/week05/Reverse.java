package Dina.week05;

public class Reverse {

    public static String reverse(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        String input = "ABCD";
        String reversedString = reverse(input);
        System.out.println("Reversed string: " + reversedString);
    }


}


//String -- Reverse
/* Write a return method that can reverse  String
   Ex: Reverse("ABCD"); ==> DCBA*/
