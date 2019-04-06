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
 * The purpose of this class is to show how the object management works in the JVM and objects 
 * even when they looked equal are located in different memory locations
 * @author Ali Adame
 */
public class IntegerPointers {
    
    Integer integerValue = null;
    
    public IntegerPointers(int intval) {
        integerValue = intval;
    }
    
    public IntegerPointers() {
        demonstrate();
    }
    
    public void demonstrate() {
	Integer a = 400, b = 400;
		
	if(a == b) {
            System.out.println("Integers objects are the same");
	} else if(a != b) {
            System.out.println("Integers objects are NOT the same");
	}
        
        IntegerPointers x = new IntegerPointers(5);
        IntegerPointers y = new IntegerPointers(5);
        IntegerPointers z = x;
        
        if(x == y) {
            System.out.println("Objects are the same");
        } else {
            System.out.println("Objects are NOT the same");
        }
        
        if(x == z) {
            System.out.println("Objects are the same");
        } else {
            System.out.println("Objects are NOT the same");
        }
    }
}
