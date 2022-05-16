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
 * This class if for testing purposes with JUnit
 * @author Ali Adame
 */
public class readATMpin4to6Solution {
    @Test
    public void a3DigitString() {
        String input = "123";
        System.out.println("input: "+input);
        assertEquals(false, readATMpin4to6.validatePin2(input));
    }
    @Test
    public void a5DigitString() {
        String input = "12345";
        System.out.println("input: "+input);
        assertEquals(false, readATMpin4to6.validatePin2(input));
    }
    @Test
    public void a6DigitString() {
        String input = "123456";
        System.out.println("input: "+input);
        assertEquals(true, readATMpin4to6.validatePin2(input));
    }
    @Test
    public void aNotOnlyDigitString() {
        String input = "1234gb";
        System.out.println("input: "+input);
        assertEquals(false, readATMpin4to6.validatePin2(input));
    }
}
