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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * This class demonstrate how java 8 can implement interfaces methods with logic inside
 * Also demonstrates the functional interface approach and lambda implementation
 * @author Ali Adame
 */
public class ProcessorImpl implements ProcessorI {
    
    public ProcessorImpl() {
        super();
    }

    /**
     * Print a processed value
     * @param str
     */
    @Override
    public void process(String str) {
        System.out.println(str);
    }

    /**
     * Overrides a processor implementation in determined class
     * @author Ali Adame
     * @param strArr with words Array
     * @see <link>https://www.udemy.com/lambda-java-8</link>
     */
    @Override
    public void process(String[] strArr) {
        System.out.println("Overrided implementation from Processor Interface");
        ProcessorI.super.process(strArr);
    }
    
    public List<String> orderByLength(String[] strArr) {
        List<String> newList = Arrays.asList(strArr);
        
        // Basic lambda
        Collections.sort(newList, (o1, o2) -> o1.length() - o2.length());
        return newList;
    }
    
}
