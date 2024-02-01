package arrays_1;

import arrays_1.SortColors;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SortColorsTest {
    private final SortColors sortColors = new SortColors();

    @Test
    public void test1() {
        int[] srcArr = new int[] {2,0,2,1,1,0};
        int[] dstArr = new int[] {0,0,1,1,2,2};
        sortColors.sortColors(srcArr);
        assertThat(srcArr).containsExactly(dstArr);
    }

    @Test
    public void test2() {
        int[] srcArr = new int[] {2,0,1};
        int[] dstArr = new int[] {0,1,2};
        sortColors.sortColors(srcArr);
        assertThat(srcArr).containsExactly(dstArr);
    }
}
