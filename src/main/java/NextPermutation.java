import java.util.Arrays;
import java.util.Collections;

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int firstIndex = -1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i > 0 && nums[i - 1] < nums[i]) {
                firstIndex = i - 1;
                break;
            }
        }

        if (firstIndex == -1) {
            reverseIntArray(nums, 0, nums.length - 1);
        } else {
            // find the element on the right side of the array greater than element at firstIndex
            int nextGreaterNumIndex = -1, nextGreaterNum = Integer.MAX_VALUE;
            for (int i = firstIndex + 1; i < nums.length; i++) {
                if (nums[i] > nums[firstIndex] && nums[i] <= nextGreaterNum) {
                    nextGreaterNum = nums[i];
                    nextGreaterNumIndex = i;
                }
            }

            // swap the 2 numbers
            int temp = nums[firstIndex];
            nums[firstIndex] = nums[nextGreaterNumIndex];
            nums[nextGreaterNumIndex] = temp;

            // reverse array from firstIndex + 1 till end
            reverseIntArray(nums, firstIndex + 1, nums.length - 1);
        }
    }

    private void reverseIntArray(int[] nums, int start, int end) {
        for (int i = start, j = end; i < j; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }

    public static void main(String[] args) {
        NextPermutation nextPermutation = new NextPermutation();
        int[] nums = new int[] {2,3,1,3,3};
        nextPermutation.nextPermutation(nums);
        Arrays.stream(nums).forEach(num -> System.out.printf(num + " "));
    }
}
