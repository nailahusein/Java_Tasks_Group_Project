package mert.day01;

public class IfStatement {

    public static void main(String[] args) {

        int num = 15;

        if (num % 3 == 0 && num % 5 == 0){
            System.out.println("FINRA");
        }else if(num % 3 == 0 ){
            System.out.println("FIN");
        }else if(num % 5 == 0) {
            System.out.println("RA");
        }else{
            System.out.println(num);
        }
    }


}

/*
 Create a class called FINRA. Write a function that prints out the number.
	For a number that is a multiple of 3, print "FIN" instead of the number.
	For a number that is a multiple of 5, print "RA" instead of the number.
	For a number that is a multiple of both 3 and 5, print "FINRA" instead of the number.

			Example:
				   number = 15

			Output:
				  FINRA
 */