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
 * The purpose of this class is to implement a simple Singly Linked List
 * Advantages:
 * - Dynamic data structure; can grow in memeory and size
 * - Efficiency to manipulate first element: O(1)
 *  - Insert at start O(1)
 *  - Insert at end O(N), requires to traverse the whole list to find the last (with null)
 *  - Remove at start O(1), only set first to null
 *  - Remove at any other position O(n), traverse array until find, get reference, remove element, update reference
 * - Can store items of different sizes
 * - Grows as it gets filled; unlike array. O(1)
 * Easy to implement
 * 
 * Disadvantages
 * - Node access is sequential O(n) while with arrays is O(1)
 * - Reverse a singly linked list is difficult, if reversal needed use Doubly Linked List
 * @author Ali Adame
 * @see Algnote: {@link https://play.google.com/store/apps/details?id=com.marcyliao.app.algnote}
 */
public class SinglyLinkedList {
    
    SLLNode head = null;
    
    public SinglyLinkedList() {
        super();
    }
    
    /**
     * Returns first item value or null if not present
     * @return Integer with first item value
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
     * Returns last item value or null if not present
     * @return Integer with last item value
     */
    public Object lastItem() {
        Object elementVal = null;
        if(head.next == null) {
            System.out.println("No elements in list");
        } else {
            SLLNode n = head;
            while(n.next != null) {
                n = n.next;
            }
            
            elementVal = n.data;
            System.out.println("Last item value is: " + elementVal);
        }
        return elementVal;
    }
    
    /**
     * Adds an element to the end of the list
     * @param data to be added to list
     */
    public void append(int data) {
        if(head == null) {
            head = new SLLNode(data);
        } else {
            SLLNode n = head;
            while(n.next != null) {
                n = n.next;
            }
            
            n.next = new SLLNode(data);
        }
    }
}

/**
 * A dummy node representation for Linked List
 * @author Ali Adame
 */
class SLLNode {
    Object data;
    SLLNode next = null;
    
    public SLLNode(Object data) {
        this.data = data;
    }
}