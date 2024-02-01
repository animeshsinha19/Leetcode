package arrays_1;

public class MaxProfit {
    public int maxProfit(int[] prices) {
        if (prices.length == 1) {
            return 0;
        }
        int[] diff = new int[prices.length - 1];
        for (int i = 1, j = 0; i < prices.length; i++, j++) {
            diff[j] = (prices[i] - prices[i - 1]);
        }
        return Math.max(maxSubArray(diff), 0);
    }

    public int maxSubArray(int[] nums) {
        return findMaximumSubarray(nums, 0, nums.length - 1)[2];
    }

    private int[] findMaxCrossingSubarray(int[] A, int low, int mid, int high) {
        int maxLeft = -1, maxRight = -1;

        int leftSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = mid; i >= low; i--) {
            sum = sum + A[i];
            if (sum > leftSum) {
                leftSum = sum;
                maxLeft = i;
            }
        }

        int rightSum = Integer.MIN_VALUE;
        sum = 0;
        for (int i = mid + 1; i <= high; i++) {
            sum = sum + A[i];
            if (sum > rightSum) {
                rightSum = sum;
                maxRight = i;
            }
        }

        return new int[] {maxLeft, maxRight, leftSum + rightSum};
    }

    private int[] findMaximumSubarray(int[] A, int low, int high) {
        if (high == low) { // base case
            return new int[] {low, high, A[low]};
        } else {
            int mid = (low + high) / 2;
            int[] leftTuple = findMaximumSubarray(A, low, mid);
            int[] rightTuple = findMaximumSubarray(A, mid + 1, high);
            int[] crossTuple = findMaxCrossingSubarray(A, low, mid, high);

            if (leftTuple[2] >= rightTuple[2] && leftTuple[2] >= crossTuple[2]) {
                return leftTuple;
            } else if (rightTuple[2] >= leftTuple[2] && rightTuple[2] >= crossTuple[2]) {
                return rightTuple;
            } else {
                return crossTuple;
            }
        }
    }

    public int maxProfitSimpleNSquared(int[] prices) {
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] - prices[i] > profit) {
                    profit = prices[j] - prices[i];
                }
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        MaxProfit maxProfit = new MaxProfit();
        int[] nums = new int[] {7,1,5,3,6,4};
        int profit = maxProfit.maxProfit(nums);
        System.out.println(profit);
    }
}
