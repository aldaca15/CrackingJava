package intpalooza;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;

/**
 * Diagonal Diff., given a matrix get the difference of its diagonals
 * @see https://www.hackerrank.com/challenges/diagonal-difference
 * @author Ali Adame
 */
class ResultDD {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */
    public static int diagonalDifference(List<List<Integer>> arr) {
        int diag1 = 0;
        int diag2 = 0;
        int invIndex = 1000;
        for(int axisY = 0; axisY < arr.size(); axisY++) {
            List<Integer> arrX = arr.get(axisY);
            if(axisY == 0) {
                invIndex = arrX.size()-1;
            }
            for(int axisX = 0; axisX < arrX.size(); axisX++) {
                if(axisY == axisX) {
                    diag1 += arr.get(axisY).get(axisX);
                }
                if(axisX == invIndex) {
                    diag2 += arr.get(axisY).get(axisX);
                    invIndex--;
                }
            }
            
        }
        return diag1 - diag2;
    }

}

public class DiagonalDifference {
    public static void main(String[] args) {
        // Computing diagonals should be something like
        // Diagonal1 = 1 + 5 + 9
        // Diagonal2 = 3 + 5 + 9
        // DiagonalDifference = Diagonal1 - Diagonal2
        // Thus 15 - 17, then result is -2
        int[] line1 = new int[]{1,2,3};
        int[] line2 = new int[]{4,5,6};
        int[] line3 = new int[]{9,8,9};
        List<Integer> listL1 = new ArrayList<Integer>(line1.length);
        for (int i : line1) {
            listL1.add(i);
        }
        List<Integer> listL2 = new ArrayList<Integer>(line2.length);
        for (int i : line2) {
            listL2.add(i);
        }
        List<Integer> listL3 = new ArrayList<Integer>(line3.length);
        for (int i : line3) {
            listL3.add(i);
        }
        List<List<Integer>> listXY = new ArrayList<>();
        listXY.add(listL1);
        listXY.add(listL2);
        listXY.add(listL3);
        assertEquals(-2, ResultDD.diagonalDifference(listXY));
    }
}