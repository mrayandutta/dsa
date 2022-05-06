package ds.divideandconquer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

public class CalculatePower {
    public static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    static int createNumber(int number, int power)
    {
        if (power == 0)
            return 1;
        else if (power % 2 == 0)
            return createNumber(number, power / 2) * createNumber(number, power / 2);
        else
            return number * createNumber(number, power / 2) * createNumber(number, power / 2);
    }

    public static void main(String[] args) {
        int number =2 ;
        int power = 0;
        logger.info("n={},p={},output={}",number,power,createNumber(number,power));

    }
}
