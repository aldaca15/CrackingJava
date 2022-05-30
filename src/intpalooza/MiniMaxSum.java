package intpalooza;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.stream.Collectors;
import static org.junit.Assert.assertEquals;

/**
 * Takes the sum of the biggest nth values (minus one)
 * And the sum of the smallest nth values (minus one)
 * And prints it
 * @see https://www.hackerrank.com/challenges/mini-max-sum/
 * @author Ali Adame
 */
class ResultMMS {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */    
    public static String miniMaxSum(List<Integer> arr) {
        // Write your code here
        // Arranging array in asc order
        Collections.sort(arr);
        int counter = 0;
        int minStart = arr.size() - (arr.size() - 1);
        int maxEnd = arr.size() - 1;
        // As the sum of values can be bigger than 32 bit values we use long
        long smallest4 = 0;
        long biggest4 = 0;
        for(Integer currVal : arr) {
            if(counter < maxEnd) {
                smallest4 += currVal;
            }
            if(counter >= minStart) {
                biggest4 += currVal;
            }
            counter++;
        }
        String result = smallest4 + " " + biggest4;
        System.out.println(result);
        return result;
    }

}

public class MiniMaxSum {
    public static void main(String[] args) {
        int[] ints = new int[]{1, 2, 3, 4, 5};
        List<Integer> list = Arrays.stream(ints).boxed().collect(Collectors.toList());
        assertEquals("10 14", ResultMMS.miniMaxSum(list));
    }
}
