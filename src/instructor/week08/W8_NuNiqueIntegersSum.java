package instructor.week08;

import java.util.Arrays;

public class W8_NuNiqueIntegersSum {
    /*Write a function:
<<<<<<< HEAD
   that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
=======
   that, given an integer N (1 < N < 100), returns an array containing N unique
   integers that sum up to 0.
>>>>>>> 0527c3f (Feb 22)
   The function can return any such array. For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
   The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice).
   For N = 3 one of the possible answers is [-1,0,1]  (but there are many more correct answers).*/
    public static void main(String[] args) {
        Solution2(4);

        int[] d = Solution(5);
        System.out.println(Arrays.toString(d));
    }

    public static int[] Solution(int N) {
        int[] result = new int[N];
        int sum = 0;
        for (int i = 0; i < N - 1; i++) {
            result[i] = i;
            sum += i;
        }
        result[N - 1] = -sum;
        return result;
    }

    public static void Solution2(int N) {
        int[] result = new int[N];
        int sum = 0;
        for (int i = 0; i < N - 1; i++) {
            result[i] = i;
            sum += i;
        }
        result[N - 1] = -sum;
        System.out.println(Arrays.toString(result));
    }
//<<<<<<< HEAD
//<<<<<<< HEAD

    //=======

//=======
        public static int[] SumToZero(int n){
//>>>>>>> 860a8a7 (Feb 22)
            int[] sum = new int[n];
            for (int i = 1; i < sum.length; i += 2) { //if its odd it will skip last number
                sum[i - 1] = i;  //assigning positive value to Negative i
                sum[i] = -i;   //assigning Negative value to positive i
                // for each positive value negative value will be generated which will cancel each other

                //By default intializing Arrays Elements in java is zero
            }
//>>>>>>> 0527c3f (Feb 22)

            return sum;
        }
    }
