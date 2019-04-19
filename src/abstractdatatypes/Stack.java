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
package abstractdatatypes;

/**
 * The purpose of this class is to show how stacks work
 * @author Ali Adame
 */
public class Stack {
    SNode top;
    
    /**
     * Pop action for the top element of the stack
     * This operation has O(1) complexity
     * @return Object
     */
    public Object pop() {
        if(top != null) {
            Object item = top.data;
            top = top.next;
            
            return item;
        }
        return null;
    }
    
    /**
     * Pushes an element into the stack
     * This operation has O(1) complexity
     * @param item with object compatible data 
     */
    public void push(Object item) {
        SNode t = new SNode(item);
        t.next = top;
        top = t;
    }
    
    /**
     * Gets the data on top of stack, for handling purposes
     * With a complexity O(1)
     * @return item with object compatible data
     */
    public Object peek() {
        return top.data;
    }
    
}

/**
 * This class is used to handle the stack members
 * @author Ali Adame
 */
class SNode {
    Object data;
    SNode next = null;
    
    public SNode(Object data) {
        this.data = data;
    }
}