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

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Taken from CodeWars for testing and preparation
 * The purpose of this class is testing an input as an ATM PIN
 * @see https://www.codewars.com/kata/55f8a9c06c018a0d6e000132/
 * @author Ali Adame
 * @date 20220515
 */
public class readATMpin4to6 {
    public static void main(String[] args) {
        readATMpin4to6Solution testSolutions = new readATMpin4to6Solution();
        testSolutions.a3DigitString();
        testSolutions.a5DigitString();
        testSolutions.a6DigitString();
        testSolutions.aNotOnlyDigitString();
    }
    
    static boolean validatePin(String pin) {
        // Check for correct length
        if(pin != null && (pin.length() == 4 || pin.length() == 6) ) {
          // Defining right REGEX
          Pattern ISNUMBER = Pattern.compile("[0-9]");
          for(int i = 0; i < pin.length(); i++) {
            Character c = pin.charAt(i);
            Matcher matcher = ISNUMBER.matcher(c.toString());
            if(!matcher.find())
              return false;
          }
          return true;
        }
        return false;
    }
    
    static boolean validatePin2(String pin) {
        if(pin != null && (pin.length() == 4 || pin.length() == 6) ) {
            for(int i = 0; i < pin.length(); i++) {
                int v = (int) pin.charAt(i);
                if(v >= 48 && v <= 57) { // ASCII 0 ... 9
                } else {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
