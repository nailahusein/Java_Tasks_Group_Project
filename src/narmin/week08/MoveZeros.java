package narmin.week08;

/*write a method that can move all zeros to last indexes of the array( Do not use sort method)
 Ex: input: {1,0,2,0,3,0,4,0}; output: [1,2,3,4,0,0,0]*/

public class MoveZeros {
    public static void moveZerosToEnd(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }

        int insertPos = 0;


        for (int num : nums) {
            if (num != 0) {
                nums[insertPos++] = num;
            }
        }


        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 0, 2, 0, 3, 0, 4, 0};
        moveZerosToEnd(array);
        for (int num : array) {
            System.out.print(num + " ");
        }

    }
}

