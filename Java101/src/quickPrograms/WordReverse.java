package quickPrograms;
import java.util.*;

public class WordReverse {

	public static void main(String[] args) {
		String word;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word.");
		word = scan.next();
		
		for (int i = word.length(); i >= 0; i--) {
			System.out.println(word.charAt(i));
			System.out.println();
		}
		

	}

}
