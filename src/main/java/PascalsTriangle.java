import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        int[][] nums = new int[numRows][];
        for (int row = 0; row < numRows; row++) {
            nums[row] = new int[row + 1];
        }

        for (int row = 0; row < numRows; row++) {
            int[] intRow = new int[row + 1];
            intRow[0] = 1;
            intRow[row] = 1;
            nums[row] = intRow;
        }

        for (int row = 2; row < numRows; row++) {
            int[] currentRow = nums[row];
            int[] previousRow = nums[row - 1];
            for (int i = 0; i < previousRow.length - 1; i++) {
                int sum = previousRow[i] + previousRow[i + 1];
                currentRow[i + 1] = sum;
            }
            nums[row] = currentRow;
        }

        return convert(nums);
    }

    private List<List<Integer>> convert(int[][] nums) {
        List<List<Integer>> matrix = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < nums[i].length; j++) {
                row.add(nums[i][j]);
            }
            matrix.add(row);
        }
        return matrix;
    }


    public static void main(String[] args) {
        PascalsTriangle pascalsTriangle = new PascalsTriangle();
        List<List<Integer>> matrix = pascalsTriangle.generate(1);
        pascalsTriangle.printMatrix(matrix);
    }

    private void printMatrix(List<List<Integer>> matrix) {
        for (List<Integer> nums : matrix) {
            for (int num : nums) {
                System.out.printf(num + " ");
            }
            System.out.println();
        }
    }

    private void printMatrix(int[][] matrix) {
        for (int[] nums : matrix) {
            for (int num : nums) {
                System.out.printf(num + " ");
            }
            System.out.println();
        }
    }
}
