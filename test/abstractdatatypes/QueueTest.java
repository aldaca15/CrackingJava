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

import org.junit.Assert;
import org.junit.Test;

/**
 * This test case is intended to test the queue abstract data type implementation
 * @author Ali Adame
 */
public class QueueTest {
    
    @Test
    public void testQueue() {
        Queue q = new Queue();
        q.Enqueue(new Integer(1));
        q.Enqueue(new Integer(2));
        q.Enqueue(new Integer(3));
        q.Enqueue(new Integer(4));
        q.Enqueue(new Integer(5));
        q.Enqueue(new Integer(6));
        q.Enqueue(new Integer(7));
        q.Enqueue(new Integer(8));
        
        Assert.assertEquals(1, q.Dequeue());
        Assert.assertEquals(2, q.Dequeue());
        Assert.assertEquals(3, q.Dequeue());
        Assert.assertEquals(4, q.Dequeue());
        Assert.assertEquals(5, q.Dequeue());
        Assert.assertEquals(6, q.Dequeue());
        Assert.assertEquals(7, q.Dequeue());
        Assert.assertEquals(8, q.Dequeue());
        Assert.assertNull(q.Dequeue());
    }
    
}
