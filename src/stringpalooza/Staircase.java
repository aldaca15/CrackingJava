package stringpalooza;

/**
 * The staircase problem, draw a staircase as big as the given 'floors'
 * @see https://www.hackerrank.com/challenges/staircase/
 * @author Ali Adame
 */
class ResultSTRCS {

    /*
     * Complete the 'staircase' function below.
     * The starcase is basically a figure in which the base are all '#' chars
     * Height of the staircase is according to n size
     * Example: If n is 6
     * Then it will print a staircase similar to this
     *     #
     *    ##
     *   ###
     *  ####
     * #####
     *######
     * The function accepts INTEGER n as parameter.
     */
    public static void staircase(int n) {
        // Stores position from where staircase is being draw
        int fromHereHashtag = n - 1;
        for(int i = 0; i < n; i++) {
            String staircase = "";
            for(int k = 0; k < n; k++) {
                if(k >= fromHereHashtag) {
                    staircase += "#";
                    continue;
                }
                staircase += " ";
            }
            // Update position to draw staircase
            fromHereHashtag -= 1;
            System.out.println(staircase);
        }
    }
}

public class Staircase {
    public static void main(String[] args) {
        ResultSTRCS.staircase(10);
    }
}
