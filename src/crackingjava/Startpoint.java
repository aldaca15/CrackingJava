/*
 * This project was created but not limited to explore how java works in depth, the project it's provided with and MIT license
 * @author Ali Adame
 */
package crackingjava;

import abstractdatatypes.SinglyLinkedListImproved;
import crackingjava.oopfundamentals.BitwiseOperators;
import crackingjava.oopfundamentals.Inheritance;
import crackingjava.oopfundamentals.IntegerPointers;
import crackingjava.oopfundamentals.ReadConsole;
import algorithms.sorting.BubbleSort;
import algorithms.sorting.InsertionSort;
import algorithms.sorting.SelectionSort;
import java8.ParallelStream;
import java8.StreamObj;

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
        
        int a = 120;
        System.out.println(a>>1);
        
        //BinarySearch binSearchAlg = new BinarySearch(arrayToSort, 32); // Coming soon
        
        // Example of how to use Streams in java
        //new StreamObj(new String[]{ "First", "Second", "Third" }); // A class to play with Java8 streams
        
        // A call to a sum using parallel streams in java
        //ParallelStream parallelStream = new ParallelStream(new Integer[]{1,2,3,4,5,6,7,8,9,10});
        
        // A singly linked list call
        SinglyLinkedListImproved slli = new SinglyLinkedListImproved();
        
    }
    
}
