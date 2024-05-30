package narmin.week04;

public class task02 {
    public static void main(String[] args) {
        //String -- Same letters
        //Write a return method that check if a string is build out of the
        //same letters as another string.
        //Ex: same("abc", "cab"); -> true
        //same("abc", "abb"); -> false:
        //"abc" and "abb" are not the same letters.

        String s1 = "abc";
        String s2 = "cab";

        if (s1.equals(s2)) {
            System.out.println("same");
        } else {
            System.out.println("not same");
        }

    }
}
