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
	public void examineTheFrontDoor() {
		position = "examineFrontTheDoor";
		mainTextArea.setText("You open the door and stare fearlessly at the \n troubled man. \n Strange Man: HELP ! HELP! They're \n EVERYWHERE. The Ding Drogs are invading \n our city.");
		
		choice1.setText("Help");
		choice2.setText("Attack");
		choice3.setText("Question ");
		choice4.setText("Ignore");
				
	}
	public void attackTheStranger() {
		position = "attackTheStranger";
		mainTextArea.setText("You attack the stranger and he falls down. He brushes himself off then walks away. You close the door and proceed to meditate. ");		
		choice1.setText("Meditate More");
		choice2.setText("Call Someone");
		choice3.setText("Look out the window ");
		choice4.setText("Sleep");
				
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
			case "theCity":
				switch(yourChoice) {
				case "c1": examineTheFrontDoor(); 
				break;
				case "c2": attackTheStranger();
				break;
					
				}
			
			}
			
		}
	}

}
