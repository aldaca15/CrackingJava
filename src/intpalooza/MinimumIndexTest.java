package intpalooza;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedHashSet;

/**
 * A test unit code to check (and returns) the index that have the minimal value
 * on a given array
 * Your company needs a function that meets the following requirements:
 * - For a given array of  integers, the function returns the index of 
 * the element with the minimum value in the array. 
 * - If there is more than one element with the minimum value, 
 * it returns the smallest one.
 * - If an empty array is passed to the function, it raises an exception.
 * Finish the implementation of  classes to provide data and expected
 * results for the tests.
 * Complete the following methods. In the class TestDataEmptyArray:
 * - get_array() returns an empty array
 * In the class TestDataUniqueValues:
 * - get_array() returns an array of size at least 2 with all unique elements
 * - get_expected_result() returns the expected minimum value index for this array
 * In the class TestDataExactlyTwoDifferentMinimums:
 * - get_array() returns an array where the minimum value occurs at exactly 2 indices
 * - get_expected_result() returns the expected index
 * @see https://www.hackerrank.com/challenges/30-testing/
 * @author Ali Adame
 */

public class MinimumIndexTest {
    Calendar user = new GregorianCalendar(2022, Calendar.MAY, 17);
    public static int minimum_index(int[] seq) {
        if (seq.length == 0) {
            throw new IllegalArgumentException("Cannot get the minimum value index from an empty sequence");
        }
        int min_idx = 0;
        for (int i = 1; i < seq.length; ++i) {
            if (seq[i] < seq[min_idx]) {
                min_idx = i;
            }
        }
        return min_idx;
    }
static class TestDataEmptyArray {    
    static int[] get_array() {
        return new int[]{};
    }    
}
static class TestDataUniqueValues {    
    static int[] get_array() {
        return new int[]{5,2,3,4,6};
    }   
    static int get_expected_result() {
        return 1;
    } 
}
static class TestDataExactlyTwoDifferentMinimums {
    static int[] get_array() {
        return new int[]{1,2,3,1,5};
    }   
    static int get_expected_result() {
        return 0;
    } 
}


    
	public static void TestWithEmptyArray() {
        try {
            int[] seq = TestDataEmptyArray.get_array();
            int result = minimum_index(seq);
        } catch (IllegalArgumentException e) {
            return;
        }
        throw new AssertionError("Exception wasn't thrown as expected");
    }

    public static void TestWithUniqueValues() {
        int[] seq = TestDataUniqueValues.get_array();
        if (seq.length < 2) {
            throw new AssertionError("less than 2 elements in the array");
        }

        Integer[] tmp = new Integer[seq.length];
        for (int i = 0; i < seq.length; ++i) {
            tmp[i] = Integer.valueOf(seq[i]);
        }
        if (!((new LinkedHashSet<Integer>(Arrays.asList(tmp))).size() == seq.length)) {
            throw new AssertionError("not all values are unique");
        }

        int expected_result = TestDataUniqueValues.get_expected_result();
        int result = minimum_index(seq);
        if (result != expected_result) {
            throw new AssertionError("result is different than the expected result");
        }
    }

    public static void TestWithExactlyTwoDifferentMinimums() {
        int[] seq = TestDataExactlyTwoDifferentMinimums.get_array();
        if (seq.length < 2) {
            throw new AssertionError("less than 2 elements in the array");
        }

        int[] tmp = seq.clone();
        Arrays.sort(tmp);
        if (!(tmp[0] == tmp[1] && (tmp.length == 2 || tmp[1] < tmp[2]))) {
            throw new AssertionError("there are not exactly two minimums in the array");
        }

        int expected_result = TestDataExactlyTwoDifferentMinimums.get_expected_result();
        int result = minimum_index(seq);
        if (result != expected_result) {
            throw new AssertionError("result is different than the expected result");
        }
    }

    public static void main(String[] args) {
        TestWithEmptyArray();
        TestWithUniqueValues();
        TestWithExactlyTwoDifferentMinimums();
        System.out.println("OK");
    }
}
