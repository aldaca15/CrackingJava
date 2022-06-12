package intpalooza;

/**
 * A test class for a coding interview
 * Write a method to determine if consecutive numbers are equally apart
 * Example, with the array [44, 37, 30, 23 ]
 * the result would be 7, as theres a difference of +7 or -7
 * @author Ali Adame
 */
import static org.junit.Assert.assertEquals;
public class SameDifference {
    public static boolean mismaDiferencia(float[] arr) {
        float difference1 = 0;
        for(int i = 1; i < arr.length && arr.length > 1 ; i++){
            if(arr.length < 2) {
                return false;
            }
            if(i == 1) { // Start point to measure absolute diff
                difference1 = Math.abs(arr[i] - arr[i-1]);
            }
            if((arr[i] - arr[i-1]) == difference1
                    || (arr[i] - arr[i-1]) == (difference1 * -1) ) {
                // Comparision of elements
                continue;
            }
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        assertEquals(true, mismaDiferencia(new float[]{ 1, 3, 5 })); // Returns true;
        assertEquals(false, mismaDiferencia(new float[]{ 194, 54, 23, 7, 3, 6, 8 })); // Returns false;
        assertEquals(true, mismaDiferencia(new float[]{ 44, 37, 30, 23 })); // Returns true;
        assertEquals(true, mismaDiferencia(new float[]{ 3, 2, 1, 2, 3, 4, 3 })); // Returns true;
        assertEquals(true, mismaDiferencia(new float[]{ 1, 8 })); // Returns true;
//        assertEquals(true, mismaDiferencia(new float[]{  -2.3f, -1.1f, 0.1f, 1.3f, 2.5f, 3.7f })); // Returns true;
    }
}