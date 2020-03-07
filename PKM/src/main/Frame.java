package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Frame {

	private JFrame frmPkmV;
	public JFrame frame1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	public double q;
	public double h;
	public double lp;
	public double nw;
	public double lw;
	public double r0;
	public double r1;
	public double s;
	public double lambdaGr;
	public double d3;
	public double d;
	public double lambda;
	public double pstat;
	public double pruch;
	public double dz1;
	public double dz0;
	public double hn;
	public double n;
	public double d1;	
	public static double[] dx; 
	private JTextField textField_9;
	private JTextField textField_10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame window = new Frame();
					window.frmPkmV.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public static double getvalue(int i) {
		return dx[i];
	}

	/**
	 * Create the application.
	 */
	public Frame() {
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPkmV = new JFrame();
		frmPkmV.setTitle("PKM v1.2");
		frmPkmV.setBounds(100, 100, 504, 450);
		frmPkmV.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frmPkmV.getContentPane().setLayout(springLayout);
		
		JLabel lblNewLabel = new JLabel("Q");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 10, SpringLayout.NORTH, frmPkmV.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 10, SpringLayout.WEST, frmPkmV.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, 56, SpringLayout.WEST, frmPkmV.getContentPane());
		frmPkmV.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("E(materia\u0142u)");
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_1, 10, SpringLayout.WEST, frmPkmV.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_1, 0, SpringLayout.EAST, lblNewLabel);
		frmPkmV.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Lp");
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel_1, -15, SpringLayout.NORTH, lblNewLabel_2);
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 70, SpringLayout.NORTH, frmPkmV.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_2, 10, SpringLayout.WEST, frmPkmV.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_2, 46, SpringLayout.WEST, lblNewLabel);
		frmPkmV.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nw");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_3, 16, SpringLayout.SOUTH, lblNewLabel_2);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_3, 0, SpringLayout.WEST, lblNewLabel);
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel_3, 30, SpringLayout.SOUTH, lblNewLabel_2);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_3, 0, SpringLayout.EAST, lblNewLabel);
		frmPkmV.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("R0");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_4, 16, SpringLayout.SOUTH, lblNewLabel_3);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_4, 0, SpringLayout.WEST, lblNewLabel);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_4, 0, SpringLayout.EAST, lblNewLabel);
		frmPkmV.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("R1");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_5, 16, SpringLayout.SOUTH, lblNewLabel_4);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_5, 0, SpringLayout.WEST, lblNewLabel);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_5, 0, SpringLayout.EAST, lblNewLabel);
		frmPkmV.getContentPane().add(lblNewLabel_5);
		
		textField = new JTextField();
		springLayout.putConstraint(SpringLayout.WEST, textField, 14, SpringLayout.EAST, lblNewLabel);
		springLayout.putConstraint(SpringLayout.SOUTH, textField, 0, SpringLayout.SOUTH, lblNewLabel);
		frmPkmV.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField_1, 0, SpringLayout.NORTH, lblNewLabel_1);
		springLayout.putConstraint(SpringLayout.EAST, textField_1, 0, SpringLayout.EAST, textField);
		frmPkmV.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField_2, 0, SpringLayout.NORTH, lblNewLabel_2);
		springLayout.putConstraint(SpringLayout.EAST, textField_2, 0, SpringLayout.EAST, textField);
		frmPkmV.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		springLayout.putConstraint(SpringLayout.WEST, textField_3, 0, SpringLayout.WEST, textField);
		springLayout.putConstraint(SpringLayout.SOUTH, textField_3, 0, SpringLayout.SOUTH, lblNewLabel_3);
		frmPkmV.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		springLayout.putConstraint(SpringLayout.SOUTH, textField_4, 0, SpringLayout.SOUTH, lblNewLabel_4);
		springLayout.putConstraint(SpringLayout.EAST, textField_4, 0, SpringLayout.EAST, textField);
		frmPkmV.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		springLayout.putConstraint(SpringLayout.SOUTH, textField_5, 0, SpringLayout.SOUTH, lblNewLabel_5);
		springLayout.putConstraint(SpringLayout.EAST, textField_5, 0, SpringLayout.EAST, textField);
		frmPkmV.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("p spocz");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_6, 17, SpringLayout.SOUTH, lblNewLabel_5);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_6, 0, SpringLayout.WEST, lblNewLabel);
		frmPkmV.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("p dop ruch");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_7, 15, SpringLayout.SOUTH, lblNewLabel_6);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_7, 0, SpringLayout.WEST, lblNewLabel);
		frmPkmV.getContentPane().add(lblNewLabel_7);
		
		textField_6 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField_6, 0, SpringLayout.NORTH, lblNewLabel_6);
		springLayout.putConstraint(SpringLayout.WEST, textField_6, 0, SpringLayout.WEST, textField);
		frmPkmV.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField_7, 0, SpringLayout.NORTH, lblNewLabel_7);
		springLayout.putConstraint(SpringLayout.EAST, textField_7, 0, SpringLayout.EAST, textField);
		frmPkmV.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JButton btnNewButton = new JButton("d3");
		btnNewButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				dx = new double[10];
				dx[0] = Double.parseDouble(textField.getText());
				dx[2] = Double.parseDouble(textField_2.getText());
				dx[3] = Double.parseDouble(textField_3.getText());
				dx[4] = Double.parseDouble(textField_4.getText());
				dx[5] = Double.parseDouble(textField_5.getText());
				D3.oblicz();
				
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							wynik window2 = new wynik("d3wynik");
							window2.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton, 28, SpringLayout.SOUTH, textField_7);
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton, 0, SpringLayout.WEST, lblNewLabel);
		frmPkmV.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Dz1");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				dx = new double[10];
				dx[0] = Double.parseDouble(textField.getText());
				dx[1] = Double.parseDouble(textField_8.getText());
				dx[2] = Double.parseDouble(textField_6.getText());
				Dz1.oblicz();
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							wynik window2 = new wynik("Dz1wynik");
							window2.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_1, 6, SpringLayout.SOUTH, btnNewButton);
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton_1, 0, SpringLayout.WEST, lblNewLabel);
		frmPkmV.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("n");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dx = new double[10];
				dx[0] = Double.parseDouble(textField.getText());
				dx[1] = Double.parseDouble(textField_8.getText());
				dx[2] = Double.parseDouble(textField_9.getText());
				dx[3] = Double.parseDouble(textField_7.getText());
				N.oblicz();
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							wynik window2 = new wynik("Nwynik");
							window2.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_2, 6, SpringLayout.SOUTH, btnNewButton_1);
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton_2, 10, SpringLayout.WEST, frmPkmV.getContentPane());
		frmPkmV.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_8 = new JLabel("Pa");
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_8, 6, SpringLayout.EAST, textField_7);
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel_8, 0, SpringLayout.SOUTH, textField_7);
		frmPkmV.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Pa");
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_9, 1, SpringLayout.EAST, textField_6);
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel_9, 0, SpringLayout.SOUTH, textField_6);
		frmPkmV.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Pa");
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_10, 0, SpringLayout.WEST, lblNewLabel_9);
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel_10, 0, SpringLayout.SOUTH, lblNewLabel_5);
		frmPkmV.getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Pa");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_11, 0, SpringLayout.NORTH, lblNewLabel_4);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_11, 0, SpringLayout.WEST, lblNewLabel_9);
		frmPkmV.getContentPane().add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("m");
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_12, 0, SpringLayout.EAST, textField_2);
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel_12, 0, SpringLayout.SOUTH, textField_2);
		frmPkmV.getContentPane().add(lblNewLabel_12);
		
		JLabel lblNewLabel_14 = new JLabel("N");
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_14, 0, SpringLayout.WEST, lblNewLabel_9);
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel_14, 0, SpringLayout.SOUTH, lblNewLabel);
		frmPkmV.getContentPane().add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Oblicz:");
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_15, 0, SpringLayout.WEST, lblNewLabel);
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel_15, -6, SpringLayout.NORTH, btnNewButton);
		frmPkmV.getContentPane().add(lblNewLabel_15);
		
		JLabel lblNewLabel_19 = new JLabel("D(odczytaj z tabelki)");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_19, 4, SpringLayout.NORTH, btnNewButton_1);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_19, 13, SpringLayout.WEST, lblNewLabel_8);
		frmPkmV.getContentPane().add(lblNewLabel_19);
		
		textField_8 = new JTextField();
		springLayout.putConstraint(SpringLayout.WEST, textField_8, 283, SpringLayout.WEST, frmPkmV.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_19, -3, SpringLayout.WEST, textField_8);
		springLayout.putConstraint(SpringLayout.NORTH, textField_8, 0, SpringLayout.NORTH, btnNewButton_1);
		frmPkmV.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("Tabelka");
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_3, 0, SpringLayout.NORTH, btnNewButton);
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton_3, 0, SpringLayout.WEST, textField_8);
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton_3, 69, SpringLayout.WEST, textField_8);
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							tabelka window1 = new tabelka(1);
							window1.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				
			}
		});
		frmPkmV.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Hn");
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dx = new double[10];
				dx[0] = Double.parseDouble(textField_10.getText());
				dx[1] = Double.parseDouble(textField_9.getText());
				dx[2] = Double.parseDouble(textField_8.getText());
				Hn.oblicz();
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							wynik window2 = new wynik("Hnwynik");
							window2.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton_4, 0, SpringLayout.WEST, lblNewLabel);
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_4, -10, SpringLayout.SOUTH, frmPkmV.getContentPane());
		frmPkmV.getContentPane().add(btnNewButton_4);
		
		JLabel lblNewLabel_20 = new JLabel("m");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_20, 4, SpringLayout.NORTH, btnNewButton_1);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_20, 6, SpringLayout.EAST, textField_8);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_20, -23, SpringLayout.EAST, frmPkmV.getContentPane());
		frmPkmV.getContentPane().add(lblNewLabel_20);
		
		JLabel lblNewLabel_21 = new JLabel("D1");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_21, 0, SpringLayout.NORTH, btnNewButton_2);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_21, 0, SpringLayout.EAST, lblNewLabel_19);
		frmPkmV.getContentPane().add(lblNewLabel_21);
		
		textField_9 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField_9, 6, SpringLayout.SOUTH, lblNewLabel_19);
		springLayout.putConstraint(SpringLayout.WEST, textField_9, 0, SpringLayout.WEST, textField_8);
		frmPkmV.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_22 = new JLabel("m");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_22, 4, SpringLayout.NORTH, btnNewButton_2);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_22, 0, SpringLayout.WEST, lblNewLabel_20);
		frmPkmV.getContentPane().add(lblNewLabel_22);
		
		JLabel lblNewLabel_23 = new JLabel("Skok");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_23, 6, SpringLayout.SOUTH, lblNewLabel_21);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_23, 0, SpringLayout.EAST, lblNewLabel_19);
		frmPkmV.getContentPane().add(lblNewLabel_23);
		
		textField_10 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField_10, 6, SpringLayout.SOUTH, textField_9);
		springLayout.putConstraint(SpringLayout.WEST, textField_10, 0, SpringLayout.WEST, textField_8);
		frmPkmV.getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		JButton btnNewButton_5 = new JButton("Sprawdz D3");
		btnNewButton_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dx = new double[10];
				dx[0] = Double.parseDouble(textField_2.getText());
				dx[1] = Double.parseDouble(textField_8.getText());
				dx[2] = Double.parseDouble(textField.getText());
				dx[3] = Double.parseDouble(textField_3.getText());
				dx[4] = Double.parseDouble(textField_1.getText());
				Lambda.oblicz();
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							wynik window2 = new wynik("lambda");
							window2.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_5, 0, SpringLayout.NORTH, btnNewButton);
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton_5, 0, SpringLayout.EAST, lblNewLabel_8);
		frmPkmV.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton(".");
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_6, 1, SpringLayout.NORTH, frmPkmV.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton_6, -12, SpringLayout.EAST, frmPkmV.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_6, 15, SpringLayout.NORTH, frmPkmV.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton_6, 0, SpringLayout.EAST, frmPkmV.getContentPane());
		frmPkmV.getContentPane().add(btnNewButton_6);
		btnNewButton_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							tabelka window1 = new tabelka(2);
							window1.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		
	}
}
