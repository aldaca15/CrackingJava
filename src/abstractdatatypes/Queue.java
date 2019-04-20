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
 * The purpose of this class is to show how do the queue abstract data type works
 * One of the interesting parts of the queue is that inserting a value at end and recall the element with top priority has O(1) complexity
 * @author Ali Adame
 */
public class Queue {
    private NodeQ first;
    private NodeQ last;
    
    /**
     * Adds an element at the end of the queue
     * @param item with some king of Object alike information
     */
    public void Enqueue(Object item) {
        if(first == null) {
            last = new NodeQ(item);
            first = last;
        } else {
            last.next = new NodeQ(item);
            last = last.next;
        }
    }
    
    /**
     * Removes and resolve the following element to be dispatched from the Queue
     * @param item Object
     * @return Object from the Queue that's "next in line"
     */
    public Object Dequeue() {
        if(first != null) {
            Object item = first.data;
            first = first.next;
            return item;
        }
        
        return null;
    }
}

/**
 * This dummy class will handle the data and linking of elements
 * @author Ali Adame
 */
class NodeQ {
    Object data;
    NodeQ next = null;
    
    public NodeQ(Object item) {
        this.data = item;
    }
}
