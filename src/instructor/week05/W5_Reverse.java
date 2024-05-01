package instructor.week05;

public class
//String -- Reverse
//Write a return method that can reverse String
//Ex: Reverse("ABCD"); ==> DCBA

W5_Reverse {
   /* Write a return method that can reverse  String
    Ex: Reverse("ABCD"); ==> DCBA*/
   public static void main(String[] args) {
       System.out.println(Reverse("abcd"));
       System.out.println(StrReverse("abcd"));
       System.out.println(revStr("abcd"));
   }

   public static String StrReverse(String str) {
       String reverse="";
       for(int i=str.length()-1; i >= 0; i--)
           reverse += str.charAt(i);
       return  reverse;
   }
    public static String revStr(String str){
       String reverse="";
        for (int i = 0; i < str.length(); i++) {
            reverse=str.charAt(i)+reverse;
        }
        return reverse;
    }
    public  static String  Reverse(String str) {


}
