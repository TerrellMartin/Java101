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

public class copyCat {
	JPanel titleNamePanel, startButtonPanel, mainBoxPanel, attackButtonPanel, playerPanel, enemyPanel, characterSelectPanel, characterSelectPanel2;
	JLabel title, hpLabel, hpLabelNumber, weaponLabel, weaponLabelName, enemyHpLabel, enemyName;
	JFrame window;
	//Buttons
	JButton startButton,characterButton,character1, character2, attack1, attack2, attack3, attack4;
	//end of Buttons
	Container con;
	Font titleFont = new Font("Times New Roman", Font.PLAIN, 90);
	Font normalFont = new Font("Times New Roman", Font.PLAIN, 30);
	int playerHp;
	String weapon, choice, position;
	//Other class objects
	TitleScreenHandler TSHandler = new TitleScreenHandler();
	ChoiceHandler Chandler = new ChoiceHandler();
	CSScreenHandler CharacterHandler = new CSScreenHandler();
	CharacterButtonHandler CBhandler = new CharacterButtonHandler();
	
	public static void main(String[] args) {
		new copyCat();

	}
	

	public copyCat() {
		//This will create the window for the game. 
		window = new JFrame();
		window.setSize(1280, 760);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//This statement will allow us to close the program properly.
		window.getContentPane().setBackground(Color.gray);
		//This sets the background color of the window. 
		window.setLayout(null);
		window.setVisible(true);
		con = window.getContentPane();
		
		titleNamePanel = new JPanel();
		titleNamePanel.setBounds(145, 100, 1000, 150);
		titleNamePanel.setBackground(Color.darkGray);
		title = new JLabel("Kleve: The Dragon's gems");
		title.setForeground(Color.WHITE);
		title.setFont(titleFont);
		
		//startButton
		startButtonPanel = new JPanel();
		startButtonPanel.setBounds(500,400,200,100);
		startButtonPanel.setBackground(Color.GRAY);
		
		startButton = new JButton("Start");
		startButton.setBackground(Color.CYAN);
		startButton.setForeground(Color.WHITE);
		startButton.setFont(normalFont);
		startButton.addActionListener(TSHandler);
		startButton.setFocusPainted(false);
		titleNamePanel.add(title);
		
		//characterButton
		/*
		 * 
		 */
		characterSelectPanel = new JPanel();
		characterSelectPanel.setBounds(500,500,200,100);
		characterSelectPanel.setBackground(Color.GRAY);
		
		characterButton = new JButton("Character");
		characterButton.setBackground(Color.MAGENTA);
		characterButton.setForeground(Color.WHITE);
		characterButton.setFont(normalFont);
		characterButton.addActionListener(CharacterHandler);
		characterButton.setFocusPainted(false);
		characterSelectPanel.add(characterButton);
		
		startButtonPanel.add(startButton);
		con.add(titleNamePanel);
		con.add(startButtonPanel);
		con.add(characterSelectPanel);
		
	}
	public void characterSelectScreen() {
		titleNamePanel.setVisible(false);
		startButtonPanel.setVisible(false);
		characterSelectPanel.setVisible(false);
		
		//Panel that goes over the character select buttons.
		characterSelectPanel2 = new JPanel();
		characterSelectPanel2.setBounds(350, 250, 300, 250);
		characterSelectPanel2.setBackground(Color.BLACK);
		con.add(characterSelectPanel2);
		
		//Character1 choice button
		character1 = new JButton("Trent");
		character1.setBackground(Color.blue);
		character1.setForeground(Color.WHITE);
		character1.setFont(normalFont);
		character1.addActionListener(CBhandler);
		character1.setFocusPainted(false);
		character1.setActionCommand("c1");
		characterSelectPanel2.add(character1);
		
		character2 = new JButton("Leon");
		character2.setBackground(Color.red);
		character2.setForeground(Color.WHITE);
		character2.setFont(normalFont);
		character2.addActionListener(CBhandler);
		character2.setFocusPainted(false);
		character2.setActionCommand("c2");
		characterSelectPanel2.add(character2);
	}
	public void createGameScreen() {
		titleNamePanel.setVisible(false);
		startButtonPanel.setVisible(false);
		characterSelectPanel.setVisible(false);
		
		mainBoxPanel = new JPanel();
		mainBoxPanel.setBounds(400, 470, 600, 250);
		mainBoxPanel.setBackground(Color.BLACK);
		con.add(mainBoxPanel);
		//COOOOMEEEEE BACCCCKKK HERRREEEEE
		
		attackButtonPanel = new JPanel();
		attackButtonPanel.setBounds(50,550,300,150);
		attackButtonPanel.setBackground(Color.BLACK);
		attackButtonPanel.setLayout(new GridLayout(3,1));
		con.add(attackButtonPanel);
		
		//attack choice 1
		attack1 = new JButton("Attack1");
		attack1.setBackground(Color.black);
		attack1.setForeground(Color.white);
		attack1.setFont(normalFont);
		attack1.setFocusPainted(false);
		attack1.addActionListener(Chandler);
		attack1.setActionCommand("a1");
		attackButtonPanel.add(attack1);
		
		//attack choice 2
		attack2 = new JButton("Attack2");
		attack2.setBackground(Color.black);
		attack2.setForeground(Color.white);
		attack2.setFont(normalFont);
		attack2.setFocusPainted(false);
		attack2.addActionListener(Chandler);
		attack2.setActionCommand("a2");
		attackButtonPanel.add(attack2);
		
		//attack choice 3
		attack3 = new JButton("Attack3");
		attack3.setBackground(Color.black);
		attack3.setForeground(Color.white);
		attack3.setFont(normalFont);
		attack3.setFocusPainted(false);
		attack3.addActionListener(Chandler);
		attack3.setActionCommand("a3");
		attackButtonPanel.add(attack3);
		
		playerPanel = new JPanel();
		playerPanel.setBounds(50,500,300,50);
		playerPanel.setBackground(Color.blue);
		playerPanel.setLayout(new GridLayout(1,4));
		con.add(playerPanel);
		
		hpLabel = new JLabel("HP: ");
		hpLabel.setFont(normalFont);
		hpLabel.setForeground(Color.white);
		playerPanel.add(hpLabel);
		
		hpLabelNumber = new JLabel("hphp");
		hpLabelNumber.setFont(normalFont);
		hpLabelNumber.setForeground(Color.white);
		playerPanel.add(hpLabelNumber);
		
		weaponLabel = new JLabel("Weapon: ");
		weaponLabel.setBounds(50,450,300,50);
		weaponLabel.setFont(normalFont);
		weaponLabel.setForeground(Color.white);
		con.add(weaponLabel);
		
		weaponLabelName = new JLabel("sword");
		weaponLabelName.setBounds(180,450,300,50);
		weaponLabelName.setFont(normalFont);
		weaponLabelName.setForeground(Color.white);
		con.add(weaponLabelName);
		
		enemyPanel = new JPanel();
		enemyPanel.setBounds(950,20,300,150);
		enemyPanel.setBackground(Color.blue);
		enemyPanel.setLayout(new GridLayout(2,1));
		con.add(enemyPanel);
		
		enemyName = new JLabel("Enemy ");
		enemyName.setFont(normalFont);
		enemyName.setForeground(Color.white);
		enemyPanel.add(enemyName);
		
		enemyHpLabel = new JLabel("Enemy HP: ");
		enemyHpLabel.setFont(normalFont);
		enemyHpLabel.setForeground(Color.white);
		enemyPanel.add(enemyHpLabel);
		
		playerSetup();
		
	}
	//DEFAULT player setup.
	public void playerSetup() {
		playerHp = 50;
		weapon = "Sword";
		
		weaponLabelName.setText(weapon);
		hpLabelNumber.setText(" " + playerHp);
	}
	
	public void playerChoice(int choiceNum) {
		if (choiceNum == 1) {
			playerHp = 120;
			weapon = "dagger";
			
			weaponLabelName.setText(weapon);
			hpLabelNumber.setText(" " + playerHp);
		}
		if (choiceNum == 2) {
			playerHp = 150;
			weapon = "LongSword";
			
			weaponLabelName.setText(weapon);
			hpLabelNumber.setText(" " + playerHp);
		}
		else {
			//Go to default player settings.
			playerSetup();
		}
	}
	
	public class TitleScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			createGameScreen();
		}
	}
	public class ChoiceHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent event) {
			String yourChoice = event.getActionCommand();
			
			
		}
		
	}
	//Character Select Screen Handler
	public class CSScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			characterSelectScreen();
		}
	}
	//character button Handler
	public class CharacterButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			String choiceChosen = event.getActionCommand();
																					//We left off here. Author:Terrell Martin 07/04/2018
																					/*
																					 * Next goal: allow for the user to select between 2 characters.
																					 */
			switch(position) {
			case "characterSelect":
				switch(choice) {
				case "c1": playerChoice(1);
				createGameScreen();
				break;
				case "c2": playerChoice(2);
				createGameScreen();
				break;
				}
			}
		}
	}
}
