/**
 * Function that checks a palindrome, which is a word,
 * phrase or formally a string, that backwards is read the same
 * @author Ali Adame
 */
public class Palindrome {
	public static void main(String[] args) {
		boolean response = Palindrome.isPalindrome("hey you!"); // false
		System.out.println(response);
		response = Palindrome.isPalindrome("anna"); // true
		System.out.println(response);
		response = Palindrome.isPalindrome("ana"); // true
		System.out.println(response);
		response = Palindrome.isPalindrome("anita"); // false
		System.out.println(response);
		response = Palindrome.isPalindrome("adanesne-ensenada"); // true
		System.out.println(response);
		response = Palindrome.isPalindrome("adanesneensenada"); // true
		System.out.println(response);
		response = Palindrome.isPalindrome("madeAliAdame"); // false
		System.out.println(response);
	}
	
	/**
	 * This method will receive a String and will check on the contrary side
	 * if characters are equal; if yes will continue and move to the next character,
	 * after that it will continue until reach the center of the word
	 * At that given moment if characters were equal will return true
	 * As this exercise was done in minutes, it may have bugs
	 * @param String with a value to check palindrome
	 * @return boolean returning true if palindrome; otherwise false.
	 */
	public static boolean isPalindrome(String value) {
		// For performance middle index will tell until where to go
		int middleIndex = value.length()/2;
		// We use a counter useful to calculate the extraction of characters on the right side
		int counter = 1;
		for(int i = 0; i<value.length(); i++) {
			if(i > middleIndex) {
				break;
			}
			char x = value.charAt(i);			
			if(x != value.charAt(value.length()-counter)) {
				return false;
			}
			counter++;
		}
		return true;
	}
}
