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
 * This class considers a buble sort implementation
 * @author Ali Adame
 */
public class BubbleSort {
    
    /**
    * This method considers a first implementation of bubbleSort
    * @author Ali Adame
    * @param unsortedArray integers array
    */
    public BubbleSort(int[] unsortedArray) {
        super();
        sort(unsortedArray);
    }
    
    public int[] sort(int[] unsortedArray) {        
        int indexOrderPointer = 0;
        while(indexOrderPointer < unsortedArray.length) {
            for(int i = 0; i < unsortedArray.length; i++) {
                if(i != unsortedArray.length-1) {
                    if(unsortedArray[i] > unsortedArray[i+1]) {
                        int temp = unsortedArray[i+1];
                        unsortedArray[i+1] = unsortedArray[i];
                        unsortedArray[i] = temp;
                    }
                }
            }
            indexOrderPointer++;
        }
        System.out.println("BubbleSorted output ");
        for (int i = 0; i < unsortedArray.length; i++) {
            System.out.println(unsortedArray[i]);
        }
        return unsortedArray;
    }
}
