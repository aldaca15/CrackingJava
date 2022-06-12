package collections;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.assertEquals;

/**
 * Given an integer array or numbers return only the values of repeated elements
 * no matter if they are positive or negative values.
 * The statement fact means that for the purpose of this algorithm a 2 will be equals to a -2
 * Example given the array [-2, -1, 0, 1, 2, 3] result should be [1, 2] since 0 and 3 are only once
 * Another ex. given the array [2, 3, 0, 1, 2, 3] result should be [2, 3] since 2 and 3 are repeated
 * @author Ali Adame
 */
public class AbsoluteRepeatedNumbers {
public static Set<Integer> repeatedAbsoluteValues(int[] array) {
    Map<Integer,Integer> repeatedValue = new HashMap<>();
    Set<Integer> repeatedNumbers = new LinkedHashSet<>();
    for(int i = 0; i < array.length; i++) {
      int value = Math.abs(array[i]);
      if(!repeatedValue.containsKey(value)) {
        repeatedValue.put(value, 0);
      } else if(repeatedValue.containsKey(value)){
        int totalTimes = repeatedValue.get(value);
        totalTimes += 1;
        repeatedValue.replace(value, totalTimes);
        repeatedNumbers.add(value);
      }
    }
    return repeatedNumbers;
  }

  public static void main (String[] args) {
      int[] inputData = new int[]{5, -5, 2, 6, 9, -6, 3, -2, 1, -1, 1};
      Set<Integer> result = repeatedAbsoluteValues(inputData);
      assertEquals(result.toString(), "[5, 6, 2, 1]");
      
      inputData = new int[]{2, 3, 0, 1, 2, 3};
      result = repeatedAbsoluteValues(inputData);
      assertEquals(result.toString(), "[2, 3]");
      
      inputData = new int[]{-2, -1, 0, 1, 2, 3};
      result = repeatedAbsoluteValues(inputData);
      assertEquals(result.toString(), "[1, 2]");
  }

}