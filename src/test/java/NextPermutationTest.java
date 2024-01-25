import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NextPermutationTest {
    private final NextPermutation nextPermutation = new NextPermutation();
    private int[] srcArr;
    private int[] dstArr;

    @Test
    public void test1() {
        srcArr = new int[] {1,2,3,4,5};
        dstArr = new int[] {1,2,3,5,4};
        nextPermutation.nextPermutation(srcArr);
        assertThat(srcArr).containsExactly(dstArr);
    }

    @Test
    public void test2() {
        srcArr = new int[] {2,3,1};
        dstArr = new int[] {3,1,2};
        nextPermutation.nextPermutation(srcArr);
        assertThat(srcArr).containsExactly(dstArr);
    }

    @Test
    public void test3() {
        srcArr = new int[] {5,4,3,2,1};
        dstArr = new int[] {1,2,3,4,5};
        nextPermutation.nextPermutation(srcArr);
        assertThat(srcArr).containsExactly(dstArr);
    }

    @Test
    public void test4() {
        srcArr = new int[] {3,1,2,5,4};
        dstArr = new int[] {3,1,4,2,5};
        nextPermutation.nextPermutation(srcArr);
        assertThat(srcArr).containsExactly(dstArr);
    }

    @Test
    public void test5() {
        srcArr = new int[] {2,3,1,3,3};
        dstArr = new int[] {2,3,3,1,3};
        nextPermutation.nextPermutation(srcArr);
        assertThat(srcArr).containsExactly(dstArr);
    }
}
