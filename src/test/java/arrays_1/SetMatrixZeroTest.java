package arrays_1;

import arrays_1.SetMatrixZero;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SetMatrixZeroTest {
    private final SetMatrixZero setMatrixZero = new SetMatrixZero();
    private int[][] srcMatrix;
    private int[][] dstMatrix;

    @Test
    public void test1() {
        srcMatrix = new int[][] {
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };
        setMatrixZero.setZeroes(srcMatrix);
        dstMatrix = new int[][] {
                {1,0,1},
                {0,0,0},
                {1,0,1}
        };
        assertThat(srcMatrix).isDeepEqualTo(dstMatrix);
    }

    @Test
    public void test2() {
        srcMatrix = new int[][] {
                {0,1,1,0},
                {1,1,1,1},
                {1,1,1,1},
        };
        setMatrixZero.setZeroes(srcMatrix);
        dstMatrix = new int[][] {
                {0,0,0,0},
                {0,1,1,0},
                {0,1,1,0},
        };
        assertThat(srcMatrix).isDeepEqualTo(dstMatrix);
    }

    @Test
    public void test3() {
        srcMatrix = new int[][] {
                {0,1,1,1},
                {1,1,1,1},
                {1,1,1,0},
        };
        setMatrixZero.setZeroes(srcMatrix);
        dstMatrix = new int[][] {
                {0,0,0,0},
                {0,1,1,0},
                {0,0,0,0},
        };
        assertThat(srcMatrix).isDeepEqualTo(dstMatrix);
    }

    @Test
    public void test4() {
        srcMatrix = new int[][] {
                {1,1,1,0}
        };
        setMatrixZero.setZeroes(srcMatrix);
        dstMatrix = new int[][] {
                {0,0,0,0}
        };
        assertThat(srcMatrix).isDeepEqualTo(dstMatrix);
    }
}
