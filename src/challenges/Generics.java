package challenges;

import static org.junit.Assert.assertEquals;

/**
 * Write a single generic function named printArray;
 * this function must take an array of generic elements as a parameter.
 * The locked Solution class in your editor tests your function.
 * Note: You must use generics to solve this challenge. 
 * Do not write overloaded functions.
 * @see https://www.hackerrank.com/challenges/30-generics/
 * @author Ali Adame
 */
class Printer <T> {

    /**
    *    Method Name: printArray
    *    Print each element of the generic array on a new line. Do not return anything.
    *    @param A generic array
    **/
    public Object printArray(Object[] values) {
        for(Object obj : values){
            if(obj instanceof String) {
                return (String)obj;
            } else if(obj instanceof Integer) {
                return (Integer)obj;
            }
        }
        return false;
    }

}

public class Generics {
    
    public static void main(String args[]){
        Printer<Integer> intPrinter = new Printer<Integer>();
        Printer<String> stringPrinter = new Printer<String>();
        Object intPrinterFirstE = intPrinter.printArray( new Object[]{2,4} );
        assertEquals(2, intPrinterFirstE);
        Object stringPrinterFirstE = stringPrinter.printArray( new Object[]{"Ali","Adame"} );
        assertEquals("Ali", stringPrinterFirstE);
        if(Printer.class.getDeclaredMethods().length > 1){
            System.out.println("The Printer class should only have 1 method named printArray.");
        }
    } 
}