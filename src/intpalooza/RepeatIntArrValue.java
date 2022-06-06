package intpalooza;

import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

/**
 * A test class for a coding interview
 * Write a method to determine if a given number repeats at least n times on a given array
 * Example, with the array [4, 5, 2, 4, 5, 9, 9, 4, 4]
 * contiene(arreglo, 4, 5) must return true
 contiene(arreglo, 4, 4)); // Returns true;
 * @author Ali Adame
 */
public class RepeatIntArrValue {
    /**
     * A method to determine if number repeats at least n time on a given array
     * @param arr an array of integer
     * @param number the integer value
     * @param times the minimal amount of repetitions
     * @return true if it repeats the given times, false if not
     */
    public static boolean contiene(int[] arr, int number, int times) {
        int counter = 0;
        for(int n: arr){
            if(n == number) {
                counter++;
            }
            if(counter == times) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arreglo = new int[]{4, 5, 2, 4, 5, 9, 9, 4, 4};
        assertEquals(false, contiene(arreglo, 4, 5)); // Returns false;
        assertEquals(true, contiene(arreglo, 4, 4)); // Returns true;
        assertEquals(true, contiene(arreglo, 4, 3)); // Returns true;
        assertEquals(true, contiene(arreglo, 9, 2)); // Returns true;
        assertEquals(false, contiene(arreglo, 0, 1)); // Returns false;
        assertEquals(true, contiene(arreglo, 2, 1)); // Returns true;
        assertEquals(true, contiene(arreglo, 9, 1)); // Returns false;
    }
}