package challenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Your local library needs your help, they need you to create a fine calculator
 * algorithm
 * If the book is returned on or before the expected return date, 
 * no fine will be charged (i.e.: fine = 0 )
 * If the book is returned after the expected return day but still 
 * within the same calendar month and year as the expected return date,
 * (i.e.: fine = 15 x daysDue )
 * If the book is returned after the expected return month but still 
 * within the same calendar year as the expected return date, the fine
 * (i.e.: fine = 500 x monthsDue )
 * If the book is returned after the calendar year in 
 * which it was expected, there is a fixed fine of 1000 monetary units
 * @see https://www.hackerrank.com/challenges/30-nested-logic/
 * @author Ali Adame
 */
public class FineCalculator {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String dateR = new String(br.readLine());
            Calendar returned = convertStringToCalendar(dateR);
            String dateD = new String(br.readLine());
            Calendar due = convertStringToCalendar(dateD);
            int fineAmount = returnAmountOfFine(returned, due);
            System.out.println(fineAmount);
        } catch (IOException ioe) {
            System.out.println(ioe);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public static int returnAmountOfFine(Calendar x, Calendar due) {
        int fine = 0;
        if(x.getTime().before(due.getTime())) {
            return fine;
        }
        if(due.get(Calendar.YEAR) != x.get(Calendar.YEAR)) {
            return 10000;
        }
        if(due.get(Calendar.MONTH) != x.get(Calendar.MONTH)) {
            int monthsDue = x.get(Calendar.MONTH) - due.get(Calendar.MONTH);
            return (500 * monthsDue);
        }
        // return 24 12 1898 against due 18 9 1898 must return 1500
        if(x.get(Calendar.DAY_OF_MONTH) != due.get(Calendar.DAY_OF_MONTH)) {
            int daysDue = x.get(Calendar.DAY_OF_MONTH) - due.get(Calendar.DAY_OF_MONTH);
            return (15 * daysDue);
        }
        // returned 24 10 1776 against due 10 10 1776 must return 210
        // returned 9 6 2015 against due 6 6 2015 must return 45
        return fine;
    }
    
    public static Calendar convertStringToCalendar(String fromString) {
        if(fromString.split(" ").length != 3) {
            new IOException("Invalid date");
        }
        String[] dateComponents = fromString.split(" ");
        Integer year = Integer.parseInt(dateComponents[2]);
        Integer month = Integer.parseInt(dateComponents[1]);
        Integer day = Integer.parseInt(dateComponents[0]);
        return new GregorianCalendar(year, month-1, day);
    }
}
