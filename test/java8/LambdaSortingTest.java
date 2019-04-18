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
package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

/**
 * A class that test sorting using lambdas declarations
 * @author Ali Adame
 * @see Vogella article <link>https://www.vogella.com/tutorials/JUnit/article.html</link>
 */
public class LambdaSortingTest {
    
    @Test
    public void testLambdaSortingByLength() {
        
        String str[] = new String[] {"aabb", "a", "ba", "cba"};
        
        Assert.assertEquals("a", new LambdaSorting(str).listStr.get(0));
        Assert.assertEquals("ba", new LambdaSorting(str).listStr.get(1));
        Assert.assertEquals("aabb", new LambdaSorting(str).listStr.get(3));
        
    }
    
}

class LambdaSorting {
    public List<String> listStr = new ArrayList<>();
    
    public LambdaSorting(String input[]) {
        listStr = Arrays.asList(input);
        
        /*listStr.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        });*/
        
        // The following line declares the same than lines 59 to 64
        listStr.sort((s1, s2) -> s1.length() - s2.length());
    }
}