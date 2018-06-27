package quickPrograms;
import java.util.*;
/*
 * Author: Terrell Martin
 * Date: 05.28/2018
 * Purpose: The 'TVRemote' program was made to allow the user to power on/off the TV. Also, it allows the user to control the volume button up/down and
 * change the channel up/down.
 */

public class TVRemote {
	Boolean state = true;
	int volume, channel, choice;
	Scanner scan = new Scanner(System.in);
	
	//constructor method
	public TVRemote(Boolean state, int volume, int channel) {
		this.state = state;
		this.volume = volume;
		this.channel = channel;
	}
	
	//method allows for the user to raise volume.
	public void raiseVolume() {
		if (state) {
			volume += 1;
		}
		
	}
	
	//method allows for the user to decrease volume.
	public void decreaseVolume() {
		if (state) {
			volume -= 1;
		}
	}
	
	//method allows for the user to increase channel.
	public void increaseChannel() {
		if (state) {
			channel += 1;
		}
		
	}
	
	//method allows for the user to decrease channel.
	public void decreaseChannel() {
		if (state) {
			channel -= 1;
		}
	}
	
	//method allows for the user to select a channel by inputting a integer value of 1-60.
	public void pickChannel() {
		System.out.println("What channel do you wish to pick? (1-60)");
		choice = scan.nextInt();
		if (choice <= 60 && choice >= 0){
			channel = choice;
		}
		else {
			System.out.println(" You have selected a channel that is either too high or too low. 1-60 ONLY");
		}
	}
	
	//method allows for the user to turn on the TV.
	public void TurnOnTV() {
		state = true;
	}
	
	//method allows for the user to turn off the TV.
	public void TurnOffTV() {
		state = false;
	}
	
	//Override
	public String toString() {
		return(" Power: " + this.state + "\n" +
	           " Channel: " + this.channel + "\n" +
			   " Volume: " + this.volume);
	}

}
