import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Game {
	//variables
	JFrame window;
	Container con;
	JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel;
	JLabel title;
	JLabel hpLabel, hpLabelNumber, mpLabel, mpLabelNumber, expLabel, expLabelNumber, weaponLabel, weaponLabelName;
	Font titleFont = new Font("Times New Roman", Font.PLAIN, 90);
	Font normalFont = new Font("Times New Roman", Font.PLAIN, 30);
	JButton startButton, choice1, choice2, choice3, choice4;
	JTextArea mainTextArea;
	int playerHp;
	String weapon, position;
	
	//other class objects
	TitleScreenHandler TSHandler = new TitleScreenHandler();
	ChoiceHandler CHandler = new ChoiceHandler();
	

	public static void main(String[] args) {
		new Game();

	}
	
	public Game() {
		//Create a window
		window = new JFrame();
		window.setSize(800, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//allows for proper exit of program ^
		window.getContentPane().setBackground(Color.BLACK);
		//set color of the window ^
		
		window.setLayout(null);
		window.setVisible(true);
		con = window.getContentPane();
		
		//Create the title.
		titleNamePanel = new JPanel();
		titleNamePanel.setBounds(100, 100, 600, 150);
		titleNamePanel.setBackground(Color.red);
		title = new JLabel("Moncha");
		title.setForeground(Color.orange);
		title.setFont(titleFont);
		
		//Create the start button.
		startButtonPanel = new JPanel();
		startButtonPanel.setBounds(300, 400, 200, 100);
		startButtonPanel.setBackground(Color.black);
		
		
		startButton = new JButton("Start Game");
		startButton.setBackground(Color.orange);
		startButton.setForeground(Color.white);
		startButton.setFont(normalFont);
		startButton.addActionListener(TSHandler);
		startButton.setFocusPainted(false);
		//now put the title name onto the title name panel.
		titleNamePanel.add(title);
		
		startButtonPanel.add(startButton);
		con.add(titleNamePanel);
		con.add(startButtonPanel);
		
	}
	
	public void createGameScreen() {
		//when you press the start button, these two visible functions will disable the
		//two previous panels to allow to load new data onto the screen. Cool.
		titleNamePanel.setVisible(false);
		startButtonPanel.setVisible(false);
		
		mainTextPanel = new JPanel();
		mainTextPanel.setBounds(100, 100, 600, 250);
		mainTextPanel.setBackground(Color.black);
		con.add(mainTextPanel);
		
		mainTextArea = new JTextArea("This is the main text area.");
		mainTextArea.setBounds(100, 100, 600, 250);
		mainTextArea.setBackground(Color.black);
		mainTextArea.setForeground(Color.white);
		mainTextArea.setFont(normalFont);
		mainTextArea.setLineWrap(true); //text lapping, if too long will be lapped
		
		mainTextPanel.add(mainTextArea);
		
		choiceButtonPanel = new JPanel();
		choiceButtonPanel.setBounds(250,350, 300, 150);
		choiceButtonPanel.setBackground(Color.black);
		choiceButtonPanel.setLayout(new GridLayout(4,1));
		con.add(choiceButtonPanel);
		
		//button 1
		choice1 = new JButton("Choice1");
		choice1.setBackground(Color.black);
		choice1.setForeground(Color.white);
		choice1.setFont(normalFont);
		choice1.setFocusPainted(false);
		choice1.addActionListener(CHandler);
		choice1.setActionCommand("c1");
		choiceButtonPanel.add(choice1);
		
		//button 2
		choice2 = new JButton("Choice2");
		choice2.setBackground(Color.black);
		choice2.setForeground(Color.white);
		choice2.setFont(normalFont);
		choice2.setFocusPainted(false);
		choice2.addActionListener(CHandler);
		choice2.setActionCommand("c2");
		choiceButtonPanel.add(choice2);
		
		//button 3
		choice3 = new JButton("Choice3");
		choice3.setBackground(Color.black);
		choice3.setForeground(Color.white);
		choice3.setFont(normalFont);
		choice3.setFocusPainted(false);
		choice3.addActionListener(CHandler);
		choice3.setActionCommand("c3");
		choiceButtonPanel.add(choice3);
		 
		//button 4
		choice4 = new JButton("Choice4");
		choice4.setBackground(Color.black);
		choice4.setForeground(Color.white);
		choice4.setFont(normalFont);
		choice4.setFocusPainted(false);
		choice4.addActionListener(CHandler);
		choice4.setActionCommand("c4");
		choiceButtonPanel.add(choice4);
		
		playerPanel = new JPanel();
		playerPanel.setBounds(100,15,600,50);
		playerPanel.setBackground(Color.black);
		playerPanel.setLayout(new GridLayout(1,4));
		con.add(playerPanel);
		
		hpLabel = new JLabel("HP: ");
		hpLabel.setFont(normalFont);
		hpLabel.setForeground(Color.white);
		playerPanel.add(hpLabel);
		
		hpLabelNumber = new JLabel();
		hpLabelNumber.setFont(normalFont);
		hpLabelNumber.setForeground(Color.white);
		playerPanel.add(hpLabelNumber);
		
		weaponLabel = new JLabel("Weapon: ");
		weaponLabel.setFont(normalFont);
		weaponLabel.setForeground(Color.white);
		playerPanel.add(weaponLabel);
		
		weaponLabelName = new JLabel();
		weaponLabelName.setFont(normalFont);
		weaponLabelName.setForeground(Color.WHITE);
		playerPanel.add(weaponLabelName);
		
		playerSetup();
		
	}
	
	public void playerSetup() {
		playerHp = 15;
		weapon = "Claw";
		
		//now display the variables
		//First, knife..
		weaponLabelName.setText(weapon);
		hpLabelNumber.setText("" + playerHp);
		
		theCity();
	}
	
	public void theCity() {
		position = "theCity";
		mainTextArea.setText("You are currently in the City of Jonas inside your peaceful home. You hear a familiar knock at your door.\n\n What do you do?");
		
		choice1.setText("Examine");
		choice2.setText("Attack");
		choice3.setText("Question ");
		choice4.setText("Ignore");
		
	}
	//First encounter options!
	public void examineTheFrontDoor() {
		position = "examineFrontTheDoor";
		mainTextArea.setText("You open the door and stare fearlessly at the \n troubled man. \n Strange Man: HELP ! HELP! They're \n EVERYWHERE. The Ding Drogs are invading \n our city.");
		choice1.setText("Leave");
		choice2.setText("Attack");
		choice3.setText("..");
		choice4.setText("..");
				
	}
	public void attackTheStranger() {
		position = "attackTheStranger";
		mainTextArea.setText("You attack the stranger and he falls down. He \nbrushes himself off then walks away. You close \nthe door and proceed to meditate. ");		
		choice1.setText("Leave");
		choice2.setText("..");
		choice3.setText("..");
		choice4.setText("..");
				
	}
	public void questionTheStranger() {
		position = "questionTheStranger";
		mainTextArea.setText("You ask, 'Why should I help? I was peacefully \nminding my business.' \nStranger: 'There's no time to ask questions! Come with me.' ");		
		choice1.setText("Leave");
		choice2.setText("..");
		choice3.setText("..");
		choice4.setText("..");
				
	}
	public void ignoreTheStranger() {
		position = "ignoreTheStranger";
		mainTextArea.setText("You ignore the stranger and close the door. The stranger walks away and moments later a weird force opens the door. ");		
		choice1.setText("Leave");
		choice2.setText("..");
		choice3.setText("..");
		choice4.setText("..");
				
	}
	//Second encounter options. You're practically forced to leave the home to explore. 
	public void leaveTheStranger() {
		position = "leaveTheStranger";
		mainTextArea.setText("You are brought between a two path crossroads. Which way do you wish to go? West or East? ");		
		choice1.setText("Go West");
		choice2.setText("Go East");
		choice3.setText("..");
		choice4.setText("..");
	}
	public void enterMarket() {
		position = "enterMarket";
		mainTextArea.setText("Which item do you wish to purchase?");		
		choice1.setText("Buy 1 HP potion");
		choice2.setText("Buy Small Sword");
		choice3.setText("Buy Small Mallet");
		choice4.setText("Buy Ninja Stars");
	}
	//Third encounter. If chosen West or East. Also this is the default 2 path crossroad encounter. 
	public void eastWay1() {
		position = "eastWay1";
		mainTextArea.setText("You decided to go east. You are later encountered by a dark cloud like spirit. What do want to do..? ");		
		choice1.setText("Run !");
		choice2.setText("Question");
		choice3.setText("Challenge");
		choice4.setText("..");
	}
	public void westWay1() {
		position = "westWay1";
		mainTextArea.setText("You decided to go west. You stumble across a old man. What do you want to do..?");		
		choice1.setText("Ignore");
		choice2.setText("Question");
		choice3.setText("Steal");
		choice4.setText("..");
	}
	
	//Market options (Everytime you buy an item you will spawn to either a two path crossroads or three path crossroads)
	public void buyHpPotion() {
		position = "buyHpPotion";
		mainTextArea.setText("You have successfully purchase x1 Hp Potion.");		
		choice1.setText("Leave");
		choice2.setText("..");
		choice3.setText("..");
		choice4.setText("..");
	}
	public void buySmallSword() {
		position = "buySmallSword";
		mainTextArea.setText("You have successfully purchase a Small Sword.");		
		choice1.setText("Leave");
		choice2.setText("..");
		choice3.setText("..");
		choice4.setText("..");
	}
	public void buySmallMallet() {
		position = "buySmallMallet";
		mainTextArea.setText("You have successfully purchase a Small Mallet.");		
		choice1.setText("Leave");
		choice2.setText("..");
		choice3.setText("..");
		choice4.setText("..");
	}
	public void buyNinjaStars() {
		position = "buyNinjaStars";
		mainTextArea.setText("You have successfully purchase Ninja Stars.");		
		choice1.setText("Leave");
		choice2.setText("..");
		choice3.setText("..");
		choice4.setText("..");
	}
	 
	//class created to add function to the start button so it can process the game screen.
	public class TitleScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			createGameScreen();
		}
		
	} 
	public class ChoiceHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			//get the action command from the choices
			String yourChoice = event.getActionCommand();
			
			//finish making the case statements. Video Stopped at 17:52 P5.
			switch(position) {
			//Intro
			case "theCity":
				switch(yourChoice) {
				case "c1": examineTheFrontDoor(); 
				break;
				case "c2": attackTheStranger();
				break;
				case "c3": questionTheStranger();
				break;
				case "c4": ignoreTheStranger();
				}break;
				
			//First Encounter..
			case "attackTheStranger()":
				switch(yourChoice) {
				case "c1": leaveTheStranger();
				break;
				case "c2": 
				break;
				case "c3":
				break;
				case "c4":
				break;
				}break;
				
			case "examineFrontTheDoor":
				switch(yourChoice) {
				case "c1": leaveTheStranger();
				break;
				case "c2": attackTheStranger();
				break;
				case "c3":
				break;
				case "c4":
				break;
				}break;
				
			case "questionTheStranger":
				switch(yourChoice) {
				case "c1": leaveTheStranger();
				break;
				case "c2": enterMarket();
				break;
				case "c3": 
				break;
				case "c4":
				break;
				}break;
				
			case "enterMarket":
				switch(yourChoice) {
				case "c1": buyHpPotion();
				break;
				case "c2": buySmallSword();
					weapon = "Small Sword";
					weaponLabelName.setText(weapon);
				break;
				case "c3": buySmallMallet();
					weapon = "Mallet";
					weaponLabelName.setText(weapon);
				break;
				case "c4": buyNinjaStars();
					weapon = "NinjaStars";
					weaponLabelName.setText(weapon);
				break;
				}break;
				//Market encounter. (2 path crossroad afterwards)
			case "buyHpPotion":
				switch(yourChoice) {
				case "c1": leaveTheStranger();
				break;
				case "c2": 
				break;
				case "c3": 
				break;
				case "c4":
				break;
				}break;
			
			case "buySmallSword":
				switch(yourChoice) {
				case "c1": leaveTheStranger();
				break;
				case "c2": 
				break;
				case "c3": 
				break;
				case "c4":
				break;
				}break;
				
			case "buySmallMallet":
				switch(yourChoice) {
				case "c1": leaveTheStranger();
				break;
				case "c2": 
				break;
				case "c3": 
				break;
				case "c4":
				break;
				}break;
				
			case "buyNinjaStars":
				switch(yourChoice) {
				case "c1": leaveTheStranger();
				break;
				case "c2": 
				break;
				case "c3": 
				break;
				case "c4":
				break;
				}break;
				
				//End of Market encounter
				
			case "leaveTheStranger" :
				switch(yourChoice) {
				case "c1": westWay1();
				break;
				case "c2": eastWay1();
				break;
				case "c3":
				break;
				case "c4":
				break;
				}break;
				
			}
			
		}
	}

}
