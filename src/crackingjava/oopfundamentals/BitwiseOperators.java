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
package crackingjava.oopfundamentals;

/**
 * This class is intended to show how do bitwise operators work
 * @see https://www.geeksforgeeks.org/bitwise-operators-in-java/
 * @author Ali Adame
 */
public class BitwiseOperators {
    
    public BitwiseOperators() {
        super();
        consoleOutput();
    }
    
    public String consoleOutput() {
        StringBuffer sb = new StringBuffer();
        //if int a = 010 java considers it as octal value of 8 as number starts with 0.
        int a = 0x0005;
        int b = 0x0007;
        
        String consoleValue = null;
        String lineBreak = "\n";

        // bitwise and
        // 0101 & 0111=0101
        consoleValue = "a&b = " + (a & b);
        System.out.println(consoleValue);
        sb.append(consoleValue + lineBreak);
        
        // Prints: a&b = 5

        // bitwise and
        // 0101 | 0111=0111
        consoleValue = "a|b = " + (a | b);
        System.out.println(consoleValue);
        sb.append(consoleValue + lineBreak);
        // Prints: a|b = 7
        
        // bitwise xor
        // 0101 ^ 0111=0010
        consoleValue = "a^b = " + (a ^ b);
        System.out.println(consoleValue);
        sb.append(consoleValue + lineBreak);
        // Prints: a^b = 2

        // bitwise and
        // ~0101=1010
        consoleValue = "~a = " + ~a;
        System.out.println(consoleValue);
        sb.append(consoleValue + lineBreak);
        // Prints: ~a = -6

        // can also be combined with
        // assignment operator to provide shorthand
        // assignment
        // a=a&b
        a &= b;
        consoleValue = "a= " + a;
        System.out.println(consoleValue);
        sb.append(consoleValue + lineBreak);
        // Prints: a= 5
        
        return sb.toString();
    } 
    
}
