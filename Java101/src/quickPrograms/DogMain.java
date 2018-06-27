package quickPrograms;
import java.util.*;
public class DogMain {

	public static void main(String[] args) {
		Dog leo = new Dog(4, "Leo", "Yorkshire Terrier", "Black/Brown");
		Dog buck = new Dog(6, "Buck", "German Shepherd", "Black/Brown");
		Dog black = new Dog(3, "Black", "German Shepherd", "Black/Brown");
		System.out.println(leo);
		System.out.println("============================================================");
		System.out.println(buck);
		System.out.println("============================================================");
		System.out.println(black);
		System.out.println("============================================================");
		
		//Now allow the user to specify their own dog.
		int ageChoice;
		String nameChoice, breedChoice, colorChoice;
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your dog's name?");
		nameChoice = scan.nextLine();
		System.out.println("What breed is " + nameChoice);
		breedChoice = scan.nextLine();
		System.out.println("How old is " + nameChoice);
		ageChoice = scan.nextInt();
		System.out.println("What color is " + nameChoice);
		colorChoice = scan.next();
		
		Dog choice = new Dog(ageChoice, nameChoice, breedChoice, colorChoice);
		System.out.println(choice);


	}

}