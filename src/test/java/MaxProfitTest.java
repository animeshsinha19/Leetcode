import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaxProfitTest {
    private final MaxProfit maxProfit = new MaxProfit();

    @Test
    public void test1() {
        int[] nums = new int[] {7,1,5,3,6,4};
        int profit = maxProfit.maxProfit(nums);
        assertThat(profit).isEqualTo(5);
    }

    @Test
    public void test2() {
        int[] nums = new int[] {7,6,4,3,1};
        int profit = maxProfit.maxProfit(nums);
        assertThat(profit).isEqualTo(0);
    }
}
