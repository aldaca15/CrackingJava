package stringpalooza;

import static org.junit.Assert.assertEquals;

/**
 * This class translates and test a current time with PM format
 * to hours
 * Note: 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
 * @author Ali Adame
 */
class ResultTC24H {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) throws Exception {
        String firstHours = s.substring(0, 2);
        String meridian = s.substring(s.length()-2);
        String composedT = s.substring(2, s.length()-2);
        Integer hours = Integer.parseInt(firstHours);
        if(hours == 12 && "AM".equals(meridian)) {
            hours = hours - 12;
        } else if("PM".equals(meridian) && hours != 12) {
            hours = hours + 12;
        }
        // We add format to fill any leading zero on left of the hours
        // Ex: in case time is less than 12pm
        return String.format("%02d", hours) + composedT;
    }
}

public class TimeConversion24Hours {
    public static void main(String[] args) throws Exception {
        String s1 = "07:05:45PM"; // Must output 19:05:45
        String s2 = "12:01:00AM"; // Must output 00:01:00
        String s3 = "10:01:00AM"; // Must output 10:01:00
        String s4 = "12:01:00PM"; // Must output 10:01:00
        assertEquals("19:05:45", ResultTC24H.timeConversion(s1));
        assertEquals("00:01:00", ResultTC24H.timeConversion(s2));
        assertEquals("10:01:00", ResultTC24H.timeConversion(s3));
        assertEquals("12:01:00", ResultTC24H.timeConversion(s4));
    }
}
