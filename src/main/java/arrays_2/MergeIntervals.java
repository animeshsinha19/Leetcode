package arrays_2;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        sort(intervals);
        int[][] mergedIntervals = new int[intervals.length][2];
        return null;
    }

    private void sort(int[][] intervals) {
        mergeSort(intervals, 0, intervals.length - 1);
    }

    private void mergeSort(int[][] intervals, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            mergeSort(intervals, p, q);
            mergeSort(intervals, q + 1, r);
            merge(intervals, p, q, r);
        }
    }

    private void merge(int[][] intervals, int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;

        int[][] leftArr = copyArrayElems(intervals, p, q, n1);
        int[][] rightArr = copyArrayElems(intervals, q + 1, r, n2);

        int i, j = 0, k = 0;
        for (i = p; j < n1 && k < n2; i++) {
            if (leftArr[j][0] <= rightArr[k][0]) {
                intervals[i][0] = leftArr[j][0];
                intervals[i][1] = leftArr[j][1];
                j++;
            } else {
                intervals[i][0] = rightArr[k][0];
                intervals[i][1] = rightArr[k][1];
                k++;
            }
        }

        while (j < n1) {
            intervals[i][0] = leftArr[j][0];
            intervals[i][1] = leftArr[j][1];
            j++; i++;
        }
        while (k < n2) {
            intervals[i][0] = rightArr[k][0];
            intervals[i][1] = rightArr[k][1];
            k++; i++;
        }

    }

    private int[][] copyArrayElems(int[][] intervals, int p, int r, int len) {
        int[][] newArr = new int[len][2];
        int j = 0;
        for (int i = p; i <= r; i++) {
            newArr[j][0] = intervals[i][0];
            newArr[j][1] = intervals[i][1];
            j++;
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[][] intervals = {{15,18},{1,3},{8,10},{2,6}};
        MergeIntervals mergeIntervals = new MergeIntervals();
        mergeIntervals.merge(intervals);
        for (int[] interval : intervals) {
            for (int num : interval) {
                System.out.printf(num + " ");
            }
            System.out.println();
        }
    }
}
