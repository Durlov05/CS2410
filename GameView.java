package wordleGamePackage;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Font;

public class GameView extends JFrame {

	private JPanel contentPane;
	private JLabel tempLbl;
	private JLabel lblNewLabel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameView frame = new GameView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GameView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 302, 360);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(255, 255, 255), 10, false)); //sets contentPane border

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(6, 5, 0, 0));
		
		//used this for testing to see how formatting options look using drag and drop design editor.
//		lblNewLabel = new JLabel("New label");
//		lblNewLabel.setForeground(new Color(255, 255, 255));
//		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
//		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
////		lblNewLabel.
//		lblNewLabel.setOpaque(true);
//		contentPane.add(lblNewLabel);
		
		createBoard(6, "apple".toCharArray()); //FIXME pass the hidden word in from Game class or from Text file. Pass round in from Game. 
	}
	
	private Color letterColor(int i) //'i' is just one of the 30 blank labels, and is here to illustrate how the game can look.
	{
		if(i > 20) //FIXME try checking if a charAt a given index in the guessed word is equal to the charAt the same index in the hidden word.
		{
			return (Color.decode("#6aaa64"));//if the letter is a right place right letter
		} else if (i > 10) //FIXME try checking if the letter is contained within the guessed word.
		{
			return (Color.decode("#c9b458")); //if the letter is correct but in the wrong place
		} else 
		{
			return (Color.decode("#787c7e"));//else the letter is incorrect
		}
	}
	
	/**Creates board with 30 label spaces on it. 
	 * 
	 * @param int round tracks which rows should have text vs be blank
	 * @param char[] word the most recently guessed word.  
	 */
	private void createBoard(int round, char[] word) {
		//int round = 3; pass in round. 
		for (int i = 1; i < 31; i++) //FIXME not currently able to print an entire word from a character array. 
		{
			tempLbl = new JLabel("a");
			tempLbl.setOpaque(true);//makes the background visible
			tempLbl.setFont(new Font("Tahoma", Font.BOLD, 20));//sets font type, boldness, and type
			tempLbl.setForeground(new Color(255, 255, 255)); //sets font color
			tempLbl.setBackground(letterColor(i)); //sets the background color of a tile FIXME unfilled tiles should be left blank
			tempLbl.setHorizontalAlignment(SwingConstants.CENTER); //sets horizontal alignment to center
			tempLbl.setBorder(new LineBorder(new Color(255, 255, 255), 2, false)); //sets tile borders
			contentPane.add(tempLbl); //adds the tempLbl to the content pane.
		}
			
	}

}
