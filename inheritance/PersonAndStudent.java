package inheritance;

import static org.junit.Assert.assertEquals;

/**
 * This class is a representation of a students which is also a person
 * Person will have a print method which will be adapted to show data
 * When a person is student will have a special method to get his average
 * and every range of averages comes with a student ranking
 * O if Average from 90 to 100
 * E if Average from 80 to 89
 * A if Average from 70 to 79
 * P if Average from 55 to 69
 * D if Average from 40 to 54
 * T if Average below 40
 * @see https://www.hackerrank.com/challenges/30-inheritance
 * @author Ali Adame
 */

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;
	
    // Constructor
    Person(String firstName, String lastName, int identification){
	this.firstName = firstName;
	this.lastName = lastName;
	this.idNumber = identification;
    }
	
    // Print person data
    public void printPerson(){
        System.out.println("Name: " + lastName + ", " + firstName 
            + 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
    final private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    Student(String firstName, String lastName, int identification, int[] testScores) {
        super(firstName, lastName, identification);
        this.testScores = testScores;
    }
    
    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    public Character calculate(){
        int total = 0;
        for (int i : this.testScores) {
           total += i; 
        }
        int average = total / testScores.length;
        if(average >= 90) {
            return 'O';
        } else if(average >= 80) {
            return 'E';
        } else if(average >= 70) {
            return 'A';
        } else if(average >= 55) {
            return 'P';
        } else if(average >= 40) {
            return 'D';
        } else {
            return 'T';
        }
    }
}

public class PersonAndStudent {
    // Testing
    public static void main(String[] args) {
        String firstName = "Heraldo";
        String lastName = "Memelli ";
        int id = 8135627;
        int[] testScores = new int[]{100, 80};
        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
        assertEquals('O', s.calculate().charValue());
    }
}
