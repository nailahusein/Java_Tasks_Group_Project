 package naila.week08;

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


 import java.util.Arrays;

 public class W8_NuNiqueIntegersSum {

     public static int[] sumToZero(int N) {
         if (N < 2 || N >= 100) {
             throw new IllegalArgumentException("N should be between 2 and 99");
         }

         int[] result = new int[N];
         int sum = 0;

         // Generate N-1 unique integers between -N/2 and N/2
         for (int i = 0; i < N - 1; i++) {
             result[i] = i - N / 2;
             sum += result[i];
         }

         // Add the negation of the sum to make sure the sum of all elements equals 0
         result[N - 1] = -sum;

         return result;
     }

     public static void main(String[] args) {
         int N = 4;
         int[] result = sumToZero(N);
         System.out.println(Arrays.toString(result));
     }


    }

