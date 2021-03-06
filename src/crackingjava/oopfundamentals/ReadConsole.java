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

import java.util.Scanner;

/**
 * This class was created with the purpose of show how to read data from console
 * @author Ali Adame
 */
public class ReadConsole {
    
    public ReadConsole() {
        super();
        performConsoleRead();
    }
    
    /**
    * This method will process data from console to perform a sum of a signed value
    * @author Ali Adame
    */
    public void performConsoleRead() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(sc.hasNextInt()) {
            int currentVal = sc.nextInt();
            sum += currentVal;
        }
        // In future implmentation it is important to consider the efects of using nextLine() after any neXXXt() elememt
        
        System.out.println("Sum of al given values is " + sum);
    }
    
}
