package arrays_2;

public class RotateMatrix {
    public void rotate(int[][] matrix) {
        int originalLength = matrix.length;
        int newLength = originalLength;
        for (int i = 0; i < originalLength/2; i++) {
            int lastIndex = newLength - 1 + i;
            int offset = 0;
            for (int j = i; j < lastIndex; j++) {
                int temp = 0;
                if (i == j) { // vertex case
                    temp = matrix[lastIndex][i];
                    matrix[lastIndex][i] = matrix[lastIndex][lastIndex];
                    matrix[lastIndex][lastIndex] = matrix[i][lastIndex];
                    matrix[i][lastIndex] = matrix[i][i];
                    matrix[i][i] = temp;
                } else {
                    int offsetIndex = lastIndex - offset;
                    temp = matrix[offsetIndex][i];
                    matrix[offsetIndex][i] = matrix[lastIndex][offsetIndex];
                    matrix[lastIndex][offsetIndex] = matrix[j][lastIndex];
                    matrix[j][lastIndex] = matrix[i][j];
                    matrix[i][j] = temp;
                }
                offset = offset + 1;
            }
            newLength = newLength - 2;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][] {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}};
        RotateMatrix rotateMatrix = new RotateMatrix();
        rotateMatrix.rotate(matrix);
        rotateMatrix.printMatrix(matrix);
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
