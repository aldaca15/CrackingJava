package intpalooza;

/**
 * A test class for a coding interview
 * Write a method to determine de biggest difference between a pair of numbers
 * Example, with the array [ 6, 22, 16, 29, 23 ]
 * the result would be 23, as 29 and 6 are the edges
 * @author Ali Adame
 */
import static org.junit.Assert.assertEquals;
public class PairDifference {
    public static int mayorDiferencia(int[] arr) {
        int smallest = 0;
        int biggest = 0;
        for(int i = 0; i < arr.length; i++){
            int n = arr[i];
            if(i == 0) {
                smallest = n;
                biggest = n;
            }
            if(n < smallest) {
               smallest = n; 
            }
            if(n > biggest) {
               biggest = n; 
            }
        }
        return biggest - smallest;
    }
    public static void main(String[] args) {
        assertEquals(3, mayorDiferencia(new int[]{ 1, 1, 4 })); // Returns 3;
        assertEquals(1, mayorDiferencia(new int[]{ 9, 8 })); // Returns 1;
        assertEquals(23, mayorDiferencia(new int[]{ 6, 22, 16, 29, 23 })); // Returns 23;
        assertEquals(25, mayorDiferencia(new int[]{ 28, 16, 28, 11, 14, 26, 23, 25, 17, 3, 22, 23, 23, 10 })); // Returns 25;
    }
}