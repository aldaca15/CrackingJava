package intpalooza;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

/**
 * Given a 6x6 array like this one
 * 1 1 1 0 0 0
 * 0 1 0 0 0 0
 * 1 1 1 0 0 0
 * 0 0 0 0 0 0
 * 0 0 0 0 0 0
 * 0 0 0 0 0 0
 * We've defined an hourglass in array to be a 
 * subset of values with indices falling in this pattern 
 * in array's graphical representation:
 * a b c
 *   d
 * e f g
 * Meaning that, to traverse the array with the hourglass
 * there would be 16 different combinations
 * The goal is to print the highest possible value sum in hourglass, example in:
 * 1 1 1 0 0 0
 * 0 1 0 0 0 0
 * 1 1 1 0 0 0
 * 0 0 2 4 4 0
 * 0 0 0 2 0 0
 * 0 0 1 2 4 0
 * MaxMatrixSum to print would be 19 since the following hourglass has the biggest sum
 * 2 4 4
 *   2
 * 1 2 4
 * @see https://www.hackerrank.com/challenges/30-2d-arrays
 * @author Ali Adame
 */
public class MaxMatrixSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;
        int g = 0;
        Integer maxMatrixSum = null;
        //int a,b,c,d,e,f,g = 0;
        
        for(int py = 0; py < 4; py++) {
            for(int px = 0; px < 4; px++) {
                for(int y = 0; y < arr.size(); y++) {
                    List<Integer> ly = arr.get(y);
                    for(int x = 0; x < ly.size(); x++) {
                        if(x == 0+px && y == 0+py) {
                            a = arr.get(y).get(x);
                        } else if(x == 1+px && y == 0+py) {
                            b = arr.get(y).get(x);
                        } else if(x == 2+px && y == 0+py) {
                            c = arr.get(y).get(x);
                        } else if(x == 1+px && y == 1+py) {
                            d = arr.get(y).get(x);
                        } else if(x == 0+px && y == 2+py) {
                            e = arr.get(y).get(x);
                        } else if(x == 1+px && y == 2+py) {
                            f = arr.get(y).get(x);
                        } else if(x == 2+px && y == 2+py) {
                            g = arr.get(y).get(x);
                        }
                    }
                    if(maxMatrixSum == null || maxMatrixSum < (a + b + c + d + e + f + g)) {
                        maxMatrixSum = (a + b + c + d + e + f + g);
                    }
                }   
            }
        }        
        System.out.println(maxMatrixSum);

        bufferedReader.close();
    }
}

