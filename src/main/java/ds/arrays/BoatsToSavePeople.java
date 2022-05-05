package ds.arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * You are given an array people where people[i] is the weight of the ith person,
 * and an infinite number of boats where each boat can carry a maximum weight of limit.
 * Each boat carries at most two people at the same time, provided the sum of the weight of
 * those people is at most limit.
 *
 * Return the minimum number of boats to carry every given person.
 */
public class BoatsToSavePeople {
    public static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    public static void main(String[] args) {
        Integer[] input = new Integer[]{1,2,3,4,5,6};
        Integer maxWeight=6;
        Arrays.sort(input);
        boatsToSavePeople(input,maxWeight);
    }
    public static void boatsToSavePeople(Integer[] input,Integer maxWeight) {
        int size = input.length;
        int sum = 0;
        int i = 0;
        List<Integer> numbers = new ArrayList<>();
        while(i<size) {
            Integer item = input[i];
            if(item==maxWeight)
            {
                numbers.add(item);
                logger.info("numbers:{}", numbers);
                numbers.clear();
                i++;
                sum=0;
            }
            else
            {
                if( (sum<maxWeight) && (sum+item <=maxWeight))
                {
                    sum=sum+item;
                    numbers.add(item);
                    //logger.info("numbers:{}", numbers);
                    i++;
                    //logger.info("element:{}", input[i]);
                }
                else
                {
                    logger.info("sum:{},numbers:{}", sum,numbers);
                    sum=0;
                    numbers.clear();
                }
            }


        }
    }
}
