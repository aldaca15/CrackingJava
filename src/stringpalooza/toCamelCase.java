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
 * @see https://www.codewars.com/kata/517abf86da9663f1d2000003
 * @author Ali Adame
 * @date 20220515
 */
public class toCamelCase {
    public static void main(String[] args) {
        toCamelCaseSolution objectClass = new toCamelCaseSolution();
        objectClass.testSomeDashLowerStart();
        objectClass.testSomeUnderscoreLowerStart();
        objectClass.testUpperAfterDash();
    }
    
    /**
     * A method to generate a camelCase
     * @param s the String to convert to camelCase
     * @return String with the built camelCase
     */
    static String toCamelCase(String s) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            Character eval = s.charAt(i);
            // Every chat is checked with compliance with 3 possible results -1, 0 and 1
            // as stated on compliesCamelRule()
            if(compliesCamelRule(eval.toString(), i) == 1) {
                result.append(eval.toString().toUpperCase());
            } else if(compliesCamelRule(eval.toString(), i) == -1 && (i + 1) != s.length()) {
                eval = s.charAt(i+1);
                result.append(eval.toString().toUpperCase());
                i++;
            } else {
                result.append(eval);
            }
        }
        return result.toString();
    }
    
    /**
     * A method to decide what to do with a character from a String to make camelCase
     * @param eval
     * @return 0 if complies rules, 1 to make uppercase the char, -1 to eliminateChar and Upper next
     */
    static int compliesCamelRule(String s, int pos) {
        int response = 0;
        Pattern IS_LOWERATOZ = Pattern.compile("[a-z]");
        Matcher matcher = IS_LOWERATOZ.matcher(s);
        if(isScore(s)) {
            return -1;
        } else if(matcher.find() || pos == 0) {
            return 0;
        } else {
            return 1;
        }        
    }
    
    /**
     * Method to check against score or underscore
     * @param s
     * @return true if String has a score(or underscore)
     */
    static boolean isScore(String s) {
        boolean result = false;
        if("_".equals(s) || "-".equals(s)) {
            return true;
        }
        return result;
    }
}
