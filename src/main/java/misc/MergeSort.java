package misc;

import java.util.Arrays;

public class MergeSort {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void mergeSort(int[] nums, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            mergeSort(nums, p, q);
            mergeSort(nums, q + 1, r);
            merge(nums, p, q, r);
        }
    }

    private int[] copyArrayElems(int[] nums, int p, int q, int len) {
        int[] newArr = new int[len];
        int j = 0;
        for (int i = p; i <= q; i++) {
            newArr[j] = nums[i];
            j++;
        }
        return newArr;
    }

    private void merge(int[] nums, int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;

        int[] leftArr = copyArrayElems(nums, p, q, n1);
        int[] rightArr = copyArrayElems(nums, q + 1, r, n2);

        int i, j = 0, k = 0;
        for (i = p; j < n1 && k < n2; i++) {
            if (leftArr[j] <= rightArr[k]) {
                nums[i] = leftArr[j];
                j++;
            } else {
                nums[i] = rightArr[k];
                k++;
            }
        }
        while (j < n1) {
            nums[i] = leftArr[j];
            i++; j++;
        }
        while (k < n2) {
            nums[i] = rightArr[k];
            i++; k++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {5,2,3,1};
        MergeSort mergeSort = new MergeSort();
        nums = mergeSort.sortArray(nums);
        System.out.println(Arrays.toString(nums));
    }
}
