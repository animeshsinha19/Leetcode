import org.testng.annotations.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class PascalsTriangleTest {
    private final PascalsTriangle pascalsTriangle = new PascalsTriangle();
    private List<List<Integer>> srcMatrix;
    private List<List<Integer>> dstMatrix;

    @Test
    public void test1() {
        srcMatrix = pascalsTriangle.generate(1);
        dstMatrix = List.of(
                List.of(1)
        );
        int dstIndex = 0;
        for (List<Integer> numList : srcMatrix) {
            assertThat(numList).containsExactlyElementsOf(dstMatrix.get(dstIndex++));
        }
    }

    @Test
    public void test2() {
        srcMatrix = pascalsTriangle.generate(2);
        dstMatrix = List.of(
                List.of(1),
                List.of(1,1)
        );
        int dstIndex = 0;
        for (List<Integer> numList : srcMatrix) {
            assertThat(numList).containsExactlyElementsOf(dstMatrix.get(dstIndex++));
        }
    }

    @Test
    public void test3() {
        srcMatrix = pascalsTriangle.generate(3);
        dstMatrix = List.of(
                List.of(1),
                List.of(1,1),
                List.of(1,2,1)
        );
        int dstIndex = 0;
        for (List<Integer> numList : srcMatrix) {
            assertThat(numList).containsExactlyElementsOf(dstMatrix.get(dstIndex++));
        }
    }

    @Test
    public void test4() {
        srcMatrix = pascalsTriangle.generate(5);
        dstMatrix = List.of(
                List.of(1),
                List.of(1,1),
                List.of(1,2,1),
                List.of(1,3,3,1),
                List.of(1,4,6,4,1)
        );
        int dstIndex = 0;
        for (List<Integer> numList : srcMatrix) {
            assertThat(numList).containsExactlyElementsOf(dstMatrix.get(dstIndex++));
        }
    }
}
