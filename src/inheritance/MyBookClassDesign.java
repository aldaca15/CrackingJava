package inheritance;
import static org.junit.Assert.assertEquals;

/**
 * Given a Book class and a Solution class, write a MyBook class that does the following:
 * 1.- Inherits from Book
 * 2.- Has a parameterized constructor taking these  parameters:
 * A string title, a string author, and an int price
 * 3.- Implements the Book class' abstract display() method so it prints these  lines:
 * Title:, a space, and then the current instance's .
 * Author:, a space, and then the current instance's .
 * Price:, a space, and then the current instance's .
 * @see https://www.hackerrank.com/challenges/30-abstract-classes/
 * @author Ali Adame
 */
abstract class Book {
    String title;
    String author;
    
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    abstract String display();
}

class MyBook extends Book {
    
    // Declare the price instance variable
    protected int price;
    
    /**   
    *   Class Constructor
    *   @param title The book's title.
    *   @param author The book's author.
    *   @param price The book's price.
    **/
    MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }
    
    /**   
    *   Method Name: display
    *   
    *   Print the title, author, and price in the specified format.
    **/
    @Override
    String display() {
        String result = "";
        result += "Title: " + this.title;
        result += "\nAuthor: " + this.author;
        result += "\nPrice: " + this.price;
        return result;
    }
    
}    
// End classes
public class MyBookClassDesign {
   
    public static void main(String[] args) {
        String title = "The Alchemist";
        String author = "Paulo Coelho";
        int price = 248;

        Book book = new MyBook(title, author, price);
        String bookData = book.display();
        String expectedResult = "Title: The Alchemist\n" + "Author: Paulo Coelho\n" + "Price: 248";
        assertEquals(expectedResult, bookData);
    }
}
