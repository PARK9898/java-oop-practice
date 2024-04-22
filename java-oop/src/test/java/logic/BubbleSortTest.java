package logic;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BubbleSortTest {
    @Test
    void bubbleSortTest() {
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        List<Integer> actual = bubbleSort.sort(List.of(3,2,1,5,6));
        Assertions.assertEquals(List.of(1,2,3,5,6), actual);
    }
}