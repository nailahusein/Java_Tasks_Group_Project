package naila.week03;

public class W3_Reverse_Negative {
    

        public static int reverseNegativeNumber(int a){
            return a*(-1);
        }

        public static int reverseNum(int  num) {

        String str = new StringBuilder(""+num).reverse().toString();

        if(num < 0) {
            str = "-"+str.substring(0, str.length()-1);
        }

        return Integer.valueOf(str);
    }

    public static int revNum(int number){
        if(number < 10 && number >= 0){
            return number;
        }

        int result = 0;
        while (number !=0) {
            result = result * 10 + number % 10; // 1 , 14, 145
            number /= 10; //54, 5, 0
        }

        return result;//145
    }


        public static void main(String[] args) {
            System.out.println(reverseNegativeNumber(-10));
            System.out.println("revNum() = " + revNum(-541));
            System.out.println(reverseNum(-53));
        }




}
/*2. Numbers -- Reverse negative number
Write a return method that can reverse
negative number and return it as int */