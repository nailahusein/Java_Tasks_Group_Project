package instructor.week02;
/*
Numbers – Swap Numbers
Swap two variables' values without using a third variable.

*/
public class W2_SwapTwoVariables {
    public static void main(String[] args)
        {
            //Question 1
            int x = 10,
                y = 15;
            System.out.println("-----Before Swap-----");
            System.out.println("\t\tx = " + x);
            System.out.println("\t\ty = " + y);

// First Solution
            x = x * y; // x = 150
            y = x / y; // y = (150 / 15) = 10
            x /= y; // x = (150 / 10) = 15
            System.out.println("After swap");
            System.out.println("x  = " + x);
            System.out.println("y  = " + y);

// Second Solution
            int a = 10,
            b = 15;
            System.out.println("-----Before Swap-----");
            System.out.println("\t\ta = " + a);
            System.out.println("\t\tb = " + b);


            a = a + b; // 10 + 15 = 25, x = 25
            b = a - b; // 25 - 15 = 10,
            b = 10;
            a = a - b; // 25 - 10 = 15,
            a = 15;
            System.out.println("a = " + a + "\nb = " + b);



            System.out.println("------After swap------");

            System.out.println("\t\ta = " + a);
            System.out.println("\t\tb = " + b);

        // Third solution
            swap(7,5);

        }

    public static void swap (int a, int b) {
            a=a+b;
            b=a-b;
            a=a-b;
    System.out.println("After Swap");
            System.out.println("a   =" + a);
            System.out.println("b   =" + b);
}

}



/*
Numbers – Swap Numbers
Swap two variables' values without using a third variable.

*/