package intpalooza;
import java.util.Stack;
import static org.junit.Assert.assertEquals;

/**
 * For a given binary number 
 * @author Ali Adame
 */
public class BinaryNumber1Streak {
    
    public static int binaryNumber1Streak(int n) {
        String binaryN = Integer.toBinaryString(n);
        Stack<Character> st = new Stack<>();
        int maxBinary1 = 0;
        for (int i = 0; i < binaryN.length(); i++) {
            Character c = binaryN.charAt(i);
            if(c.equals('0')) {
                st.clear();
            } else {
                st.add(c);
                if(st.size() > maxBinary1) {
                    maxBinary1 = st.size();
                }
            }
        }
        return maxBinary1;
    }
    
    public static void main(String[] args) {
        assertEquals(2,BinaryNumber1Streak.binaryNumber1Streak(13));
        assertEquals(3,BinaryNumber1Streak.binaryNumber1Streak(29));
        assertEquals(10,BinaryNumber1Streak.binaryNumber1Streak(1023));
    }
    
}
