package main;

import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.SpringLayout;
import javax.swing.JTextField;

public class wynik {

	JFrame frame;
	private JTextField textField;



	/**
	 * Create the application.
	 */
	public wynik(String a) {
		initialize(a);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String i) {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JLabel lblNewLabel = new JLabel("Wynik: ");
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField, 122, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, textField, 198, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, -14, SpringLayout.SOUTH, textField);
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel, 0, SpringLayout.SOUTH, textField);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, -6, SpringLayout.WEST, textField);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		if(i.equals("d3wynik")) {
			System.out.print(D3.get()); //nie wiem jak przekazac wartosc z innej krlasy chodz raz sie uda�o
		}
	}
}
