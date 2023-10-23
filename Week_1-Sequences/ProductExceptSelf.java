import java.util.Arrays;

public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(ProductExceptSelfSolution(nums)));
    }

    public static int[] ProductExceptSelfSolution(int[] nums) {
        int[] result = new int[nums.length];
        for(int i = 0, temp = 1; i < nums.length; i++) {
            result[i] = temp;
            temp *= nums[i];
        }
        for(int i = nums.length - 1, temp = 1; i >= 0; i--) {
            result[i] *= temp;
            temp *= nums[i];
        }
        return result;
    }
}
// nums = {1,2,3,4}
// first for loop: 
// output: result = {0, 0, 0 ,0}
//  result[0] = temp, temp being 1.
// temp * nums[0] = 1.
// result[1] = temp, temp being 1.
// temp * nums[1] = 2.
// result[2] = temp, temp being 2.
// temp * nums[2] = 6.
// result[3] = temp, temp being 6.
// temp = nums[3] = 24.

// second for loop:
// result[3] *= temp, temp being 1 and result[3] being 6, resulting in 6.
// temp *= nums[3], 1 * 4 = 4.
// result[2] *= temp, temp being 4 and result[2] being 2, resulting in 8.
// temp *= nums[2], 4 * 3 = 12.
// result[1] *= temp, temp being 12 and result[1] being 1, resulting in 12.
// temp *= nums[1], 12 * 2 = 24.
// result[0] *= temp, temp being 24 and result[0] being 1, resulting in 24.
// temp *= nums[0], 24 * 1 = 24. end loop.
