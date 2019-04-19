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
import java.util.List;

/**
 * This class shows how using a parallel stream it is possible to accelerate operations of different kind in streams
 * @author Ali Adame
 */
public class ParallelStream {
    
    public static void main(String[] args) {
        ParallelStream parallelStream = new ParallelStream(new Integer[]{1,2,3,4,5,6,7,8,9,10});
    }
    
    public ParallelStream(Integer[] intArr) {
        List<Integer> li = Arrays.asList(intArr);
        System.out.println("Sum:" + sumWithParallelStream(li));
    }
    
    /**
     * Performs sum from data USING parallel computing if no delimiters are added
     * @param intArr an Integer Array
     */
    public int sumWithParallelStream(List<Integer> li) {
        return li.parallelStream().peek(System.out::println).reduce(0, (a,b) -> a+b);
                
    }
    
    /**
     * Performs sum from data WITHOUT parallel computing
     * @param intArr an Integer Array
     */
    public int sumWithoutParallelStream(List<Integer> li) {
        return li.stream().peek(System.out::println).reduce(0, (a,b) -> a+b);
    }
    
}
