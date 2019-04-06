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
package crackingjava.oopfundamentals;

/**
 * This class was intended to show the basic of inheritance in java
 * @author Ali Adame
 */
class ObjectContract {
    void declareOrigin() {
        System.out.println("The origin of this call came from the ObjectContract");
    }
}
/**
 * This another class displays the presence of an inherited method from parent class
 * @see declareOrigin()
 * @author Ali Adame
 */
public class Inheritance extends ObjectContract {
    public boolean isActive;
    
    
    public Inheritance() {
        super();
        this.setIsActive();
        this.declareOrigin();
    }
    
    public void setIsActive() {
        this.isActive = true;
    }
    
    public boolean isActive() {
        return isActive;
    }
    
    public void printState() {
        System.out.println("Current object state: "+ isActive());
    }
}
