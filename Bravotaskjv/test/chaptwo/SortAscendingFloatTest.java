package chaptwo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class SortAscendingFloatTest {
    private final SortAscendingFloat sort = new SortAscendingFloat();

    @Test
   public void testSortAscendingFloat_FuncExist() {
        float [] exist =  SortAscendingFloat.getSorted(new float[]{0});
        assertArrayEquals(exist, SortAscendingFloat.getSorted(new float[]{0}));
    }

    @Test
    public void testSortAscending_Not_Float_Is_False() {
        float [] notExist = SortAscendingFloat.getSorted(new float []{68});
        //assertTrue(notExist, true);
        assertArrayEquals(notExist, SortAscendingFloat.getSorted(new float[]{6}));
    }

}