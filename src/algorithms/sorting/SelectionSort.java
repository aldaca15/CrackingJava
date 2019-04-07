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
 * Implementation of the selection sort algorithm
 * @author Ali Adame
 */
public class SelectionSort {
    
    public SelectionSort(int[] unsortedArray) {
        super();
        improvedSort(unsortedArray);
        System.out.println("Selection Sorted output: ");
        for (int i = 0; i < unsortedArray.length; i++) {
            System.out.println(unsortedArray[i]);
        }
    }
    
    /**
     * Improved version of Selection sort created by Sarah Ettritch
     * @see For more information: https://www.udemy.com/data-structures-and-algorithms-deep-dive-using-java/
     * @param array containing elements to sort
     */
    public void improvedSort(int[] array) {
        for(int lastUnsortedIndex = array.length -1; lastUnsortedIndex > 0; 
                lastUnsortedIndex --) {
            int largest = 0;
            for (int i = 0; i <= lastUnsortedIndex; i++) {
                if(array[i] > array[largest]) {
                    largest = i;
                }
            }
            swap(array, lastUnsortedIndex, largest);
        }
    }
    
    /**
     * Method to perform swaps on SelectionSort algorithm
     * @param xPosition of a candidate of swapping
     * @param yPosition of the other candidate for swapping
     * @param unsortedArray that may content changes 
     */
    public void swap(int[] unsortedArray, int xPosition, int yPosition) {
        
        if(xPosition == yPosition) {
            return;
        }
        
        int temp = unsortedArray[xPosition];
        unsortedArray[xPosition] = unsortedArray[yPosition];
        unsortedArray[yPosition] = temp;
    }
    
}
