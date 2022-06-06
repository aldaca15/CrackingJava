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

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * This class is for testing purposes with JUnit
 * @author Ali Adame
 */
public class ReverseStringSolution {
    @Test
    public void a3DigitStringReverse() {
        String input = "123";
        System.out.println("input: "+input);
        assertEquals("321", ReverseString.reverseArray(input));
    }
    @Test
    public void a5CharStringReverse() {
        String input = "1a2b3";
        System.out.println("input: "+input);
        assertEquals("3b2a1", ReverseString.reverseArray(input));
    }
}
