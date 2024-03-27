package naila.week01;

public class task02 {

        /*
    QUESTION 2- Numbers without / operator
    Write a method that can divide two numbers without using division operator
     */
        public static int divideNumbers(int num1, int num2) {
            int result = 1;
            while (num2 > 0) {
                result = result * 10;
                num2 = num2 - 1;
            }
            return num1 * result;
        }




    }

