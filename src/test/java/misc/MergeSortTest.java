package misc;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class MergeSortTest {
    private final MergeSort mergeSort = new MergeSort();

    @Test
    public void test1() {
        int[] srcNums = {5,2,3,1};
        MergeSort mergeSort = new MergeSort();
        int[] dstNums = mergeSort.sortArray(srcNums);
        System.out.println(Arrays.toString(dstNums));
        assertThat(dstNums).containsExactly(1, 2, 3, 5);
    }

    @Test
    public void test2() {
        int[] srcNums = {5,1,1,2,0,0};
        MergeSort mergeSort = new MergeSort();
        int[] dstNums = mergeSort.sortArray(srcNums);
        System.out.println(Arrays.toString(dstNums));
        assertThat(dstNums).containsExactly(0, 0, 1, 1, 2, 5);
    }
}
