package quickPrograms;
import java.util.*;
/*
 * Author: Terrell Martin
 * Date: 5/19/2018
 * Purpose: Class to emulate the properties of an actual dice.
 */
public class Dice {
	private int numDice;
	private Random random;
	
	//default constructor
	public Dice() {
		numDice = 1;
		random = new Random();
	}
	
	public Dice(int n) {
		numDice = n;
		random = new Random();
	}
	
	public int rollDice() {
		int sum = 0;
		for (int i = 1; i <= numDice; i++)
			sum += random.nextInt(6) + 1;
		return sum;
	}
	
	public int getNumDice() {
		return numDice;
	}
	
	public void setNumDice(int n) {
		numDice = n;
	}

}
