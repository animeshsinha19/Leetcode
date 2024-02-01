package arrays_2;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RotateMatrixTest {
    private final RotateMatrix rotateMatrix = new RotateMatrix();

    @Test
    public void test1() {
        int[][] srcMatrix = new int[][] {
                {5,1,9,11},
                {2,4,8,10},
                {13,3,6,7},
                {15,14,12,16}};
        rotateMatrix.rotate(srcMatrix);
        int[][] dstMatrix = new int[][] {
                {15,13,2,5},
                {14,3,4,1},
                {12,6,8,9},
                {16,7,10,11}};
        assertThat(srcMatrix).isDeepEqualTo(dstMatrix);
    }

    @Test
    public void test2() {
        int[][] srcMatrix = new int[][] {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}};
        rotateMatrix.rotate(srcMatrix);
        int[][] dstMatrix = new int[][] {
                {21, 16, 11, 6, 1},
                {22, 17, 12, 7, 2},
                {23, 18, 13, 8, 3},
                {24, 19, 14, 9, 4},
                {25, 20, 15, 10, 5}};
        assertThat(srcMatrix).isDeepEqualTo(dstMatrix);
    }
}
