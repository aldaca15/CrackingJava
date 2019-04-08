/*
 * This project was created but not limited to explore how java works in depth, the project it's provided with and MIT license
 * @author Ali Adame
 */
package crackingjava;

import crackingjava.oopfundamentals.BitwiseOperators;
import crackingjava.oopfundamentals.Inheritance;
import crackingjava.oopfundamentals.IntegerPointers;
import crackingjava.oopfundamentals.ReadConsole;
import algorithms.sorting.BubbleSort;
import algorithms.sorting.InsertionSort;
import algorithms.sorting.SelectionSort;

/**
 * This class is intended to run the examples of the different subjects.
 * In this project all the processes are conducted by object implementation and method calls
 * @author Ali Adame
 */
public class Startpoint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Java supports feature from inheritance as others OOP's
        Inheritance inheritedObj = new Inheritance();
        inheritedObj.printState();
        
        // It can permorm bitwise operations
        BitwiseOperators bitwiseObj = new BitwiseOperators();
        
        // And the management of values 
        IntegerPointers integerPointers = new IntegerPointers();
        
        //ReadConsole stdIn = new ReadConsole(); // Just uncomment it if you need to use the console
        
        int arrayToSort[] = new int[]{69,65,95,3,5,4,15,32};
        //BubbleSort bsAlg = new BubbleSort(arrayToSort);
        //SelectionSort ssAlg = new SelectionSort(arrayToSort);
        InsertionSort isAlg = new InsertionSort(arrayToSort);
        
        //BinarySearch binSearchAlg = new BinarySearch(arrayToSort, 32);
        
    }
    
}
