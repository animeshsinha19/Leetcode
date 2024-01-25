import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaximumSubarrayTest {
    private final MaximumSubarray maximumSubarray = new MaximumSubarray();

    @Test
    public void test1() {
        int[] nums = new int[] {-2,1,-3,4,-1,2,1,-5,4};
        int required = 6;
        int actual = maximumSubarray.maxSubArray(nums);
        assertThat(actual).isEqualTo(required);
    }

    @Test
    public void test2() {
        int[] nums = new int[] {1};
        int required = 1;
        int actual = maximumSubarray.maxSubArray(nums);
        assertThat(actual).isEqualTo(required);
    }

    @Test
    public void test3() {
        int[] nums = new int[] {5,4,-1,7,8};
        int required = 23;
        int actual = maximumSubarray.maxSubArray(nums);
        assertThat(actual).isEqualTo(required);
    }
}
