public class MaximumSubarray {
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

    public static void main(String[] args) {
        int[] nums = new int[] {-2,1,-3,4,-1,2,1,-5,4};
        MaximumSubarray maximumSubarray = new MaximumSubarray();
        int sum = maximumSubarray.maxSubArray(nums);
        System.out.println(sum);
    }
}
