package ds.arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

/**
 * Problem statement
 * Given an array of random numbers, Push all the zero’s of a given array to the end of the array.
 * For example, if the given arrays is {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0}, it should be changed
 * to {1, 9, 8, 4, 2, 7, 6, 0, 0, 0, 0}.
 * The order of all other elements should be same.
 * Expected time complexity is O(n) and extra space is O(1).
 */
public class MoveZerosToEnd {
    private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    public static void main(String[] args) {
        Integer[] input = new Integer[]{5,2,0,1,0,8};
        Integer[] output = moveZerosToEnd(input);
    }

    public static Integer[] moveZerosToEnd(Integer[] input)
    {
        int nonZeroCount = 0;
        for (int i=0;i<input.length;i++ )
        {
            if(input[i]!=0)
            {
                input[nonZeroCount]=input[i];
                nonZeroCount ++;
            }
        }

        while (nonZeroCount<input.length)
        {
            input[nonZeroCount]=0;
            nonZeroCount ++;
        }

        logger.info("Array after zero movement");
        for (int i=0;i<input.length;i++ )
        {
            logger.info("input[{}]={}",i,input[i]);
        }
        return input;
    }


}
