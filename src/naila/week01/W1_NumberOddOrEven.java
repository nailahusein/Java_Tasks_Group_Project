package naila.week01;

public class W1_NumberOddOrEven {

    /*
      QUESTION 1 - Write a method which can identify if a given number odd or even
       Ex: identify(5) -->"Odd"
       identify (6) --> "Even"
      */


    public static String identify(int num) {
        if (num % 2 == 0) {
            return "Even";
        }
        return "Odd";

    }

    public static void main(String[] args) {

        System.out.println(identify(5));
    }


}
