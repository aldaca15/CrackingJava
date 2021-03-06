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

import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for: LargestNumberAtLeastTwiceofOthers_LC747
 * In a given integer array nums, there is always exactly one largest element. 
 * Find whether the largest element in the array is at least twice as much as every other number in the array.
 * If it is, return the index of the largest element, otherwise return -1.
 * @author Ali Adame
 * @see LeetCode challenge 747: {@link https://leetcode.com/articles/largest-number-at-least-twice-of-others}
 */
public class LargestNumberAtLeastTwiceofOthers_LC747Test {
    
    @Test
    public void testLargestNumberAtLeastTwiceofOthers_LC747() {
        
        Assert.assertEquals(1, new LargestNumberAtLeastTwiceofOthers_LC747().dominantIndex(new int[] {3, 6, 1, 0}));
        
        Assert.assertEquals(-1, new LargestNumberAtLeastTwiceofOthers_LC747().dominantIndex(new int[] {1, 2, 3, 4}));
        
        Assert.assertEquals(3, new LargestNumberAtLeastTwiceofOthers_LC747().dominantIndex(new int[] {0, 0, 0, 1}));
        
    }
    
}
