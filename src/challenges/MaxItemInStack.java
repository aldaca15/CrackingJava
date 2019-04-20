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
package challenges;

import java.util.Stack;

/**
 * Find the element in a existing stack with the maximum numerical value
 * @see Holcer Balacz {@link https://www.udemy.com/algorithms-and-data-structures}
 * @author Ali Adame
 */
public class MaxItemInStack {

    /**
     * This method returns the biggest value from a stack that contains numbers
     * @param stackedInformation which may contain a stack filled with information
     * @return 
     */
    public Integer biggestStackValue(Stack stackedInformation) {        
        java.util.Stack maxValue = new java.util.Stack<>();
        
        for(Object i : stackedInformation) {
            Integer value = (Integer) i;
            if(maxValue.isEmpty()) {
                maxValue.push(value);
            } else {
                if(((Integer)maxValue.peek()) < value) {
                    System.out.println("New maxValue: " + value);
                    maxValue.pop();
                    maxValue.add(value);
                }
            }
        }
        
        if(!maxValue.isEmpty()) {
            return (Integer) maxValue.peek();
        }
        return null;
    }
    
}
