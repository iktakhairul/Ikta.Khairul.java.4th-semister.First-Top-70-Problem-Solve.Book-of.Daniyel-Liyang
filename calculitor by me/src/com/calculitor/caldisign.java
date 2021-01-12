package com.calculitor;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;

import org.omg.CORBA.portable.ValueBase;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class caldisign {

	private JFrame frame;
	private JTextField number1;
	private JTextField number2;
	private JTextField answar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					caldisign window = new caldisign();
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
	public caldisign() {
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
		
		JButton btna = new JButton("+");
		btna.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int num1 ,num2,ans;
					num1 =Integer.parseInt(number1.getText());
					num2 =Integer.parseInt(number2.getText());
					ans = num1 + num2;
					answar.setText(Integer.toString(ans));
				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "enter ValueBase 1");
				}
				
			}
		});
		btna.setBounds(32, 98, 117, 29);
		frame.getContentPane().add(btna);
		
		number1 = new JTextField();
		number1.setBounds(32, 60, 130, 26);
		frame.getContentPane().add(number1);
		number1.setColumns(10);
		
		number2 = new JTextField();
		number2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		number2.setBounds(224, 60, 117, 26);
		frame.getContentPane().add(number2);
		number2.setColumns(10);
		
		JButton btns = new JButton("-");
		btns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					int num1 ,num2,ans;
					num1 =Integer.parseInt(number1.getText());
					num2 =Integer.parseInt(number2.getText());
					ans = num1 - num2;
					answar.setText(Integer.toString(ans));
				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "enter ValueBase 1");
				}
			}
		});
		btns.setBounds(224, 98, 117, 29);
		frame.getContentPane().add(btns);
		
		JButton btnm = new JButton("*");
		btnm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int num1 ,num2,ans;
					num1 =Integer.parseInt(number1.getText());
					num2 =Integer.parseInt(number2.getText());
					ans = num1 * num2;
					answar.setText(Integer.toString(ans));
				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "enter ValueBase 1");
				}
				
			}
		});
		btnm.setBounds(32, 139, 117, 29);
		frame.getContentPane().add(btnm);
		
		JButton btnd = new JButton("/");
		btnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					int num1 ,num2,ans;
					num1 =Integer.parseInt(number1.getText());
					num2 =Integer.parseInt(number2.getText());
					ans = num1 / num2;
					answar.setText(Integer.toString(ans));
				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "enter ValueBase 1");
				}
			}
		});
		btnd.setBounds(224, 139, 117, 29);
		frame.getContentPane().add(btnd);
		
		answar = new JTextField();
		answar.setBounds(234, 180, 107, 29);
		frame.getContentPane().add(answar);
		answar.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Ans :");
		lblNewLabel.setBounds(54, 180, 107, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("input 1");
		lblNewLabel_1.setBounds(40, 17, 107, 31);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("input 2");
		lblNewLabel_2.setBounds(208, 24, 78, 16);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
