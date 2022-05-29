package intpalooza;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


/**
 * Shows the ratio from total numbers of positive, neutral and negative integers
 * Ex: given the array {1,2,3,-1,0}
 * Result should print only number, with a precision of 6 decimals that
 * Positive = 0.600000 (since 3 values out of 5 are positive)
 * Neutral = 0.200000
 * Negative = 0.200000
 * @see https://www.hackerrank.com/challenges/plus-minus/
 * @author Ali Adame
 */
class ResultPNNR {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    public static void plusMinus(List<Integer> arr) {
        int positive = 0;
        int neutral = 0;
        int negative = 0;
        for(Integer i : arr) {
            if(i > 0)
                positive++;
            else if(i<0)
                negative++;
            else
                neutral++;
        }
        float total = arr.size();
        System.out.println(String.format("%06f", positive/total));
        System.out.println(String.format("%06f", negative/total));
        System.out.println(String.format("%06f", neutral/total));
    }

}

public class PositiveNeutralNegativeRatio {
    public static void main(String[] args) throws IOException {
        int[] ints = new int[]{1,2,-1,0,3};
        List<Integer> arr = new ArrayList<>();
        Collections.addAll(arr, Arrays.stream(ints).boxed().toArray(Integer[]::new));
        ResultPNNR.plusMinus(arr);
    }
}