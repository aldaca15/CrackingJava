package intpalooza;

import java.util.Arrays;
import static org.junit.Assert.assertEquals;

/**
 * Complete the Difference class by writing the following:
 * 1- A class constructor that takes an array of integers as a 
 * parameter and saves it to the _elements instance variable.
 * 2- A computeDifference method that finds the maximum 
 * absolute difference between any 2 numbers in _elements 
 * and stores it in the maximumDifference instance variable.
 * Example:
 * STDIN   Function
 * -----   --------
 * 3       __elements[] size N = 3
 * 1 2 5   __elements = [1, 2, 5]
 * Expected output: 4
 * @see https://www.hackerrank.com/challenges/30-scope/
 * @author Ali Adame
 */
public class PairDifference2 {
    
    public static void main(String[] args) {
        int[] a = new int[]{8, 8, 8, 8, 8};
        Difference difference = new Difference(a);
        difference.computeDifference();
        assertEquals(0, difference.maximumDifference); // Expected 0
        
        a = new int[]{8, 19, 3, 2, 7};
        difference = new Difference(a);
        difference.computeDifference();
        assertEquals(17, difference.maximumDifference); // Expected 17
        
        a = new int[]{1, 2, 5};
        difference = new Difference(a);
        difference.computeDifference();
        assertEquals(4, difference.maximumDifference); // Expected 4
    }
    
}
class Difference {
  	private int[] elements;
  	public int maximumDifference;

	public Difference(int[] a) {
        this.elements = a;
    }
    
    public void computeDifference() {
        Arrays.sort(this.elements);
        int maxValue = Math.abs(this.elements[this.elements.length-1]);
        int minValue = Math.abs(this.elements[0]);
        maximumDifference = maxValue - minValue;
    }

} // End of Difference class