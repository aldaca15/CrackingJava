package intpalooza;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import static org.junit.Assert.assertEquals;

/**
 * A class that calculate the total quantity of biggest values
 * @see https://www.hackerrank.com/challenges/birthday-cake-candles/
 * @author Ali Adame
 */
class ResultBCC {

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */
    public static int birthdayCakeCandles(List<Integer> candles) {
        Map<Integer, Integer> candlesOrder = new TreeMap<>();
        int biggestSoFar = 0;
        if(candles == null) {
            // No candles, no bigger one
            return biggestSoFar;
        }
        // Candle iteration and grouping by size
        // Also recolection for biggest candle size
        for(int i = 0; i < candles.size(); i++) {
            Integer currVal = candles.get(i);
            if(!candlesOrder.containsKey(currVal)) {
                candlesOrder.put(currVal, 1);
            } else if(candlesOrder.containsKey(currVal)) {
                // Get current candles for specific length
                Integer ttCanles = candlesOrder.get(currVal);
                candlesOrder.replace(currVal, ttCanles+1);
            }
            if(currVal > biggestSoFar) {
                biggestSoFar = currVal;
            }
        }
        return candlesOrder.get(biggestSoFar);
    }
}

public class BirthdayCakeCandles {
    
    public static void main(String[] args) {
        List<Integer> candlesWithSize = new ArrayList<>();
        // A group of candles with height 3, 2, 2, 1, 3, 3
        // will return 2 since there are two longest candles (with value 3 each)
        candlesWithSize.add(3);
        candlesWithSize.add(2);
        candlesWithSize.add(2);
        candlesWithSize.add(1);
        candlesWithSize.add(3);
        candlesWithSize.add(3);
        assertEquals(3, ResultBCC.birthdayCakeCandles(candlesWithSize));
        candlesWithSize = null;
        ResultBCC.birthdayCakeCandles(candlesWithSize);
    }
}
