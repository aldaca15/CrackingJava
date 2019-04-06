/*
 * This project was created but not limited to explore how java works in depth, the project it's provided with and MIT license
 * @author Ali Adame
 */
package crackingjava;

import crackingjava.oopfundamentals.BitwiseOperators;
import crackingjava.oopfundamentals.Inheritance;
import crackingjava.oopfundamentals.IntegerPointers;

/**
 * This class is intended to run the examples of the different subjects in the package all the methods are called by object implementation
 * @author Ali Adame
 */
public class Startpoint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Inheritance inheritedObj = new Inheritance();
        inheritedObj.printState();
        
        BitwiseOperators bitwiseObj = new BitwiseOperators();
        IntegerPointers integerPointers = new IntegerPointers();
    }
    
}
