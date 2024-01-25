import java.util.Arrays;

public class SortColors {
    public void sortColors(int[] nums) {
        int index = 0;
        int[] elems = new int[] {0,1};
        for (int elem : elems) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == elem) {
                    int temp = nums[index];
                    nums[index] = nums[i];
                    nums[i] = temp;
                    index++;
                }
            }
        }
    }

    public static void main(String[] args) {
        SortColors sortColors = new SortColors();
        int[] nums = new int[] {2,0,2,1,1,0};
        sortColors.sortColors(nums);
        Arrays.stream(nums).forEach(num -> System.out.printf(num + " "));
    }
}
