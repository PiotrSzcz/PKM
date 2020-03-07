package main;

import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.SpringLayout;
import javax.swing.JTextField;

public class wynik {

	JFrame frame;
	private JTextField textField;
	private JLabel lblNewLabel;



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
		frame.setBounds(100, 100, 658, 158);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		textField = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField, 53, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, textField, 201, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, textField, -70, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		lblNewLabel = new JLabel("Wynik: ");
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel, 0, SpringLayout.SOUTH, textField);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, -6, SpringLayout.WEST, textField);
		frame.getContentPane().add(lblNewLabel);
		if(i.equals("d3wynik")) {
			textField.setText(Double.toString(D3.get())+" "+"mm");
		}
		if(i.equals("Dz1wynik")) {
			textField.setText(Double.toString(Dz1.get())+" "+"mm");
		}
		
		if(i.equals("Hnwynik")) {
			textField.setText(Double.toString(Hn.get())+" "+"mm");
		}
		
		if(i.equals("Nwynik")) {
			textField.setText(Double.toString(N.get())+" "+"mm");
		}
		if(i.equals("lambda")) {
			if(Lambda.get()<90) {
			textField.setText("Lambda= "+Double.toString(Lambda.get())+ "D3= "+ D3.get());}
			if(Lambda.get()>90) {
			textField.setText("Lambda= "+Double.toString(Lambda.get())+ "D3= "+ Lambda.de());}
		}
	}
}
