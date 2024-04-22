package logic;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class JavaSortTest {
    @Test
    void javaSortTest() {
        JavaSort<Integer> javaSort = new JavaSort<>();
        List<Integer> actual = javaSort.sort(List.of(3,2,1,4,5));

        Assertions.assertEquals(List.of(1,2,3,4,5), actual);
    }

}