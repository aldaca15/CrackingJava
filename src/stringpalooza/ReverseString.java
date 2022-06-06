/*
 * The MIT License
 *
 * Copyright 2022 Ali Adame.
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
package stringpalooza;

/**
 * This is a class with its methods that will reverse an array
 * using a simple approach [O(n)+O(n)] will reverse any give array
 * There aren't constraints for reversal process
 * @author Ali Adame
 */
public class ReverseString {
    public static void main(String[] args) {
        ReverseStringSolution solutionTest = new ReverseStringSolution();
        solutionTest.a3DigitStringReverse();
        solutionTest.a5CharStringReverse();
    }
    
    public static String reverseArray(String array) {
        int start = 0;
        int end = array.length()-1;
        // We'll store nth array value as int , 
        // from given value of ASCII table
        int[] intArr = new int[array.length()];
        while (start <= end) {            
            int tempo = array.charAt(start);
            intArr[start] = array.charAt(end);
            intArr[end] = tempo;
            // Change start and end
            start += 1;
            end -= 1;
        }
        StringBuilder sb = new StringBuilder();
        // Build new array as String
        for (int i = 0; i < intArr.length; i++) {
            int toText = intArr[i];
            String appendable = Character.toString((char)toText);
            sb.append(appendable);
        }
        return sb.toString();
    }
}
