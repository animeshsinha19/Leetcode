public class SetMatrixZero {
    public void setZeroes(int[][] matrix) {
        boolean isFirstRowZero = false;
        boolean isFirstColumnZero = false;

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                isFirstColumnZero = true;
                break;
            }
        }

        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[0][i] == 0) {
                isFirstRowZero = true;
                break;
            }
        }

        /*
         * Use first element in each row and column as flags,
         * mark them as zero for a given '0' element in the matrix
         * */
        for (int rowIndex = 1; rowIndex < matrix.length; rowIndex++) {
            for (int colIndex = 1; colIndex < matrix[0].length; colIndex++) {
                if (matrix[rowIndex][colIndex] == 0) {
                    matrix[rowIndex][0] = 0;
                    matrix[0][colIndex] = 0;
                }
            }
        }

        /*
        * Traverse first column, from top to bottom starting from 1st index position
        * If any element is 0, then set the entire row to 0
        * */
        for (int rowIndex = 1; rowIndex < matrix.length; rowIndex++) {
            if (matrix[rowIndex][0] == 0) {
                for (int colIndex = 1; colIndex < matrix[0].length; colIndex++) {
                    matrix[rowIndex][colIndex] = 0;
                }
            }
        }

        /*
         * Traverse first row, from left to right starting from 1st index position
         * If any element is 0, then set the entire column to 0
         * */
        for (int colIndex = 1; colIndex < matrix[0].length; colIndex++) {
            if (matrix[0][colIndex] == 0) {
                for (int rowIndex = 1; rowIndex < matrix.length; rowIndex++) {
                    matrix[rowIndex][colIndex] = 0;
                }
            }
        }

       if (isFirstColumnZero) {
           for (int j = 0; j < matrix.length; j++) {
               matrix[j][0] = 0;
           }
       }

        if (isFirstRowZero) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[0][j] = 0;
            }
        }
    }

    public static void main(String[] args) {
        SetMatrixZero setMatrixZero = new SetMatrixZero();

        int[][] matrix = new int[][] {
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };

        setMatrixZero.setZeroes(matrix);
        setMatrixZero.printMatrix(matrix);
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
