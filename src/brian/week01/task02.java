package brian.week01;public class task02 {

    public static String oddOrEven(int number){

        if(number % 2 == 0){
            return "Even";
        } else {
            return "Odd";
        }

    }

    public static void main(String[] args) {


        String result = oddOrEven(5);
        String result2 = oddOrEven(4);

    }


}

 /*
    QUESTION 2- Numbers without / operator
    Write a method that can divide two numbers without using division operator
     */
