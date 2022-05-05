import ds.arrays.MoveZerosToEnd;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MoveZerosToEndTest
{
    @Test
    public void testMoveZeroTest_1()
    {
        MoveZerosToEnd moveZerosToEnd = new MoveZerosToEnd();
        Integer[] input = new Integer[]{5,2,0,1,0,8};
        Integer[] expectedOutput = new Integer[]{5,2,1,8,0,0};
        assertArrayEquals(expectedOutput,moveZerosToEnd.moveZerosToEnd(input));
    }

    @Test
    public void testMoveZeroTest_2()
    {
        MoveZerosToEnd moveZerosToEnd = new MoveZerosToEnd();
        Integer[] input = new Integer[]{123,0,5,2,0,1,0,8};
        Integer[] expectedOutput = new Integer[]{123,5,2,1,8,0,0,0};
        assertArrayEquals(expectedOutput,moveZerosToEnd.moveZerosToEnd(input));
    }
}
