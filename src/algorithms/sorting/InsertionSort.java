/*
 * The MIT License
 *
 * Copyright 2019 Ali Adame.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package algorithms.sorting;

/**
 * This class shows an implementation of the Insertion Sort algorithm
 * @author Ali Adame
 */
public class InsertionSort {
    
    public InsertionSort(int unsortedArray[]) {
        improvedSort(unsortedArray);
        System.out.println("Result of inserted sort: ");
        for (int i = 0; i < unsortedArray.length; i++) {
            System.out.println(unsortedArray[i]);
        }
    }
    
    /**
     * Implementation of the insertion sort algorithm
     * @param array to sort
     * @see For more information: <link>https://www.udemy.com/data-structures-and-algorithms-deep-dive-using-java</link>
     */
    public void improvedSort(int[] array) {
        for(int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; 
                firstUnsortedIndex++) {
            int newElement = array[firstUnsortedIndex];
            
            int i;
            
            for(i = firstUnsortedIndex; i > 0 && array[i - 1] > newElement; i--) {
                array[i] = array[i - 1];
            }
            
            array[i] = newElement;
        }   
            
    }
    
}
