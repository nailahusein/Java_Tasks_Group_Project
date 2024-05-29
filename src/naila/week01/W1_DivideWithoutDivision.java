package naila.week01;

public class W1_DivideWithoutDivision {

    /*
    QUESTION 2- Write a method that can divide two numbers without using division operator
     */

    public static void divide(int num1, int num2) { // dividend  and divider(denominator)
        if (num2 == 0) {
            System.out.println("Invalid Number");
            return;
        }

        System.out.print(num1 +" divided by "+num2 +" is: ");
        int count = 0;
        while (num1 >= num2) {
            num1 -= num2;
            count++;
        }
        System.out.println(count + " and remainder is " + num1);
    }

    public static void main(String[] args) {
        divide(10, 4);
    }




}
/*

    public double divideWithoutDivision(int num, int num2) {
        int sing = 1;
        double result = 0;
        if(num == 0 || num2 == 0){
            throw new RuntimeException("Can't divide 0 or by 0");
        }
        if(num * num2 < 0){
            sing = -1;
        }
        num = Math.abs(num);
        num2 = Math.abs(num2);


        double temp = 1;
        for(int i= 0; i < 3; i++ ){
            while(num >= num2) {
                num -= num2;
                result +=temp;
            }
            if(num == 0)return result * sing;
            num *= 10;
            //if (i==1){
            temp = 0.1;
            if( i == 1){
                temp = 0.01;
            }
            //result += 0.0000000000000001;
        }

        return result * sing;
    }

     */