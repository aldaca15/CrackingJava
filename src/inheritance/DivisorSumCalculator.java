package inheritance;

import static org.junit.Assert.assertEquals;
/** Given a number calculate the sum of its Divisors, also,
 * declare the method divisor sum using interfaces
 * @see https://www.hackerrank.com/challenges/30-interfaces/
 * @author Ali Adame
 */

interface AdvancedArithmetic{
   int divisorSum(int n);
}
class Calculator implements AdvancedArithmetic {
    @Override
    public int divisorSum(int n) {
        int total = 0;
        int x = 1;
        while(x <= n) {
            if(n % x == 0) {
                total += x;
            }
            x += 1;
        }
        return total;
    }
}

public class DivisorSumCalculator {
    public static void main(String[] args) {
        // Instance of calculator to use divisorSum
        AdvancedArithmetic myCalculator = new Calculator(); 
        // Test for calculator sum for 25, 6, 20
        assertEquals(31, myCalculator.divisorSum(25)); // Is 25 as 1 + 5 + 25 is 31
        assertEquals(12, myCalculator.divisorSum(6)); // Is 6 as 1 + 2 + 3 is 6
        assertEquals(42, myCalculator.divisorSum(20)); // Is 42 as 1 + 2 + 4 + 5 + 10 + 20 is 42
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
    }
}