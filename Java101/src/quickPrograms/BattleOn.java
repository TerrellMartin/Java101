package quickPrograms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.JTextArea;

public class BattleOn {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BattleOn window = new BattleOn();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BattleOn() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel enemy = new JLabel("Character:");
		enemy.setBounds(10, 11, 62, 14);
		frame.getContentPane().add(enemy);
		
		JProgressBar HealthBar = new JProgressBar();
		HealthBar.setBackground(Color.GREEN);
		HealthBar.setBounds(10, 26, 146, 14);
		frame.getContentPane().add(HealthBar);
		
		JProgressBar ExperienceBar = new JProgressBar();
		ExperienceBar.setBackground(Color.YELLOW);
		ExperienceBar.setBounds(10, 36, 146, 14);
		frame.getContentPane().add(ExperienceBar);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBackground(Color.YELLOW);
		progressBar.setBounds(278, 237, 146, 14);
		frame.getContentPane().add(progressBar);
		
		JProgressBar progressBar_1 = new JProgressBar();
		progressBar_1.setBackground(Color.GREEN);
		progressBar_1.setBounds(278, 222, 146, 14);
		frame.getContentPane().add(progressBar_1);
		
		JLabel player1 = new JLabel("Character:");
		player1.setBounds(278, 197, 146, 14);
		frame.getContentPane().add(player1);
		
		JRadioButton rdbtnAttack = new JRadioButton("attack1");
		rdbtnAttack.setBounds(6, 193, 109, 23);
		frame.getContentPane().add(rdbtnAttack);
		
		JRadioButton rdbtnAttack_1 = new JRadioButton("attack2");
		rdbtnAttack_1.setBounds(6, 222, 109, 23);
		frame.getContentPane().add(rdbtnAttack_1);
		
		JLabel lblHp = new JLabel("HP:");
		lblHp.setBounds(255, 222, 23, 14);
		frame.getContentPane().add(lblHp);
	}
}
