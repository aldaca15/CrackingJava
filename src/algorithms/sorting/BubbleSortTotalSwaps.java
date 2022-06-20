package algorithms.sorting;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

/**
 * Performs in-place bubble sort.
 * To check it, implemented method bubbleSort will return an array of 3 elements
 * First elements is number of total swaps performed, second the smallest value
 * and finally third, the biggest one in the sorted array.
 * @see https://www.hackerrank.com/challenges/30-sorting/
 * @author Ali Adame
 */
public class BubbleSortTotalSwaps {
    /**
     * Does in-place array sorting using bubbleSort
     * @param sort_arr the array to sort
     * @return a 3 value array, first element total swaps, second smallest values
     * and third, the biggest one.
     */
    public static int[] bubbleSort(int [] sort_arr){
        int len = sort_arr.length;
        int totalSwaps = 0; 
        for (int i=0;i<len-1;++i){
            for(int j=0;j<len-i-1; ++j){
                if(sort_arr[j+1]<sort_arr[j]){
                    int swap = sort_arr[j];
                    sort_arr[j] = sort_arr[j+1];
                    sort_arr[j+1] = swap;
                    totalSwaps += 1;
                }
            }
        }
        return new int[]{totalSwaps, sort_arr[0], sort_arr[sort_arr.length-1]};
    }
    
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(4, 3, 1, 2);
        int[] arrayToSort = a.stream().mapToInt(Integer::intValue).toArray();
        int[] result = bubbleSort(arrayToSort);
        List<Integer> resultList = Arrays.stream(result)        // IntStream
                                    .boxed()          // Stream<Integer>
                                    .collect(Collectors.toList());
        List<Integer> expectedArray = Arrays.asList(5,1,4);
        //original a: 4 3 1 2
        //round 1  a: 3 1 2 4 swaps this round: 3
        //round 2  a: 1 2 3 4 swaps this round: 2
        //round 3  a: 1 2 3 4 swaps this round: 0
        assertEquals(expectedArray, resultList);
        System.out.println("Array is sorted in " + result[1] + " swaps.");
        System.out.println("First Element: " + result[1] + "\nLast Element: " + result[2]);
    }
}