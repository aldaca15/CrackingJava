package collections;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Given on a series of people and their phone numbers write a program
 * able to store a phone book. This must resolve when someone is not found
 * the phrase "Not found" and return their name and number when it's on the book
 * Input example:
 * First line total number of contacts to store
 * Second to second + n (given on first line) the name and number of person
 * Final part, the names to retrieve as seen below (sam, edward and harry)
 * 3
 * sam 99912222
 * tom 11122222
 * harry 12299933
 * sam
 * edward
 * harry
 * @see https://www.hackerrank.com/challenges/30-dictionaries-and-maps/
 * @author Ali Adame
 */
public class Maps30DoC {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String, Integer> hm = new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            hm.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if(hm.containsKey(s)) {
                System.out.println(s + "=" + hm.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
