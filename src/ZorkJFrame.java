

//TODO: To use the JFRAME, set the done value in the commands class to True


//DO NOT TOUCH THIS FILE UNLESS YOU ARE BRAVE ENOUGH TO MAKE ENHANCMENTS
//THIS FILE DOES WORK, if it isn't working, its probably an issue with your commands class

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.SystemColor;

public class ZorkJFrame {

	private JFrame frmZorkCheckpoint;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ZorkJFrame window = new ZorkJFrame();
					window.frmZorkCheckpoint.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ZorkJFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmZorkCheckpoint = new JFrame();
		frmZorkCheckpoint.setTitle("Zork Checkpoint 2");
		frmZorkCheckpoint.setResizable(false);
		frmZorkCheckpoint.setBounds(100, 100, 600, 400);
		frmZorkCheckpoint.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmZorkCheckpoint.getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(SystemColor.control);
		textArea.setBounds(27, 29, 549, 273);
		frmZorkCheckpoint.getContentPane().add(textArea);
		textArea.setText(Commands.gameIntro());
		
		textField = new JTextField();
		textField.setBounds(27, 316, 450, 23);
		frmZorkCheckpoint.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton submitButton = new JButton("Submit");
		submitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String userInput = textField.getText();
				//get the command from the user input
				if (userInput.equals("quit"))
					frmZorkCheckpoint.dispose();
				String command = Commands.getFirstWord(userInput);
				
				//get the rest of the string after the first word if available
				
				String item = Commands.getRestOfSentence(userInput);
				
				//use the command and item to determine the proper output
				
				String output = Commands.executeCommand(command, item);
				output += "\n" + Commands.getCurrentRoom().getName();
				output += "\n" + Commands.getCurrentRoom().getDescription();
				//print the output for the user
				textArea.setText(output);
				textField.setText("");
			}
		});
		submitButton.setBounds(487, 316, 89, 23);
		frmZorkCheckpoint.getContentPane().add(submitButton);
		frmZorkCheckpoint.getRootPane().setDefaultButton(submitButton);

		Commands.runGame(); //set done value in Commands class to True to use JFRAME

	}
	
}