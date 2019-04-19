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
 * In this example we are improving singly linked list by adding a tail, that way we get tail with O(1) complexity reference
 * @see SinglyLinkedList.java
 * @author Ali Adame
 */
public class SinglyLinkedListImproved {
    
    SLLNode head = null;
    SLLNode tail = null;
    
    public SinglyLinkedListImproved() {
        super();
        this.firstItem();
        this.append(3);
        this.append(1);
        this.lastItem();
        this.append(-1);
        this.firstItem();
        this.lastItem();
    }
    
    /**
     * Returns the first item of this linked list implementation
     * @return Object
     */
    public Object firstItem() {
        Object elementVal = null;
        if(head == null) {
            System.out.println("No elements in list");
        } else {
            elementVal = head.data;
            System.out.println("First element in list: " + head.data);
        }
        return elementVal;
    }
    
    /**
     * Returns the last item of this linked list implementation
     * @return Object
     */
    public Object lastItem() {
        Object elementVal = null;
        if(tail == null) {
            System.out.println("No elements in list");
        } else {            
            elementVal = tail.data;
            System.out.println("Last item value is: " + elementVal);
        }
        return elementVal;
    }
    
    /**
     * Store one more item into this Linked List implementation
     */
    public void append(Object data) {
        if(tail == null) {
            head = new SLLNode(data);
            tail = head;
        } else {
            tail.next = new SLLNode(data);
            tail = tail.next;
        }
    }
    
    // Deleting, inserting a node in a position different than 
    // first or last is a still a linear time operation which means O(n)
    // Searching also involves O(n) complexity operations
    
}
