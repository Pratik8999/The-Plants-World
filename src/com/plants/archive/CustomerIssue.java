package com.plants.archive;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.sql.*;
import java.util.Calendar;

public class CustomerIssue extends JFrame implements ActionListener {

	JLabel l, l1, l2, l3, l4, l5, dt;
	JButton b1, b2, b3;
	JPanel p1, p2;

	JTextField tf2, tf3, tf4, tf5, dt1;

	public CustomerIssue() {
		super(" CUSTOMER ISSUE ");

		p1 = new JPanel();
		p2 = new JPanel();

		l = new JLabel();
		l1 = new JLabel();
		l2 = new JLabel();
		l3 = new JLabel();
		l4 = new JLabel();
		l5 = new JLabel();
		dt = new JLabel();

		tf2 = new JTextField();
		tf3 = new JTextField();
		tf4 = new JTextField();
		tf5 = new JTextField();
		dt1 = new JTextField();

		b1 = new JButton();
		b2 = new JButton();
		b3 = new JButton();

		Container contentPane = getContentPane();
		contentPane.setLayout(null);

		p1.setLayout(null);

		p1.setBorder(new LineBorder(new Color(153, 51, 0), 2, true));
		p1.setBackground(new Color(250, 200, 255));
		
		Font title = new Font("Arial",Font.BOLD , 25);
		l.setFont(title);
		l.setForeground(new Color(200, 40, 0));
		l.setText("The Plants World");
		l.setHorizontalTextPosition(SwingConstants.CENTER);
		getContentPane().add(l);
		l.setBounds(190, 25, 270, 40);

		l1.setFont(new Font("Arial",Font.BOLD, 25));
		l1.setText("CUSTOMER ISSUE");
		l1.setMaximumSize(new Dimension(150, 25));
		l1.setMinimumSize(new Dimension(150, 25));
		p1.add(l1);
		l1.setBounds(120, 25, 320, 20);

		l2.setFont(new Font("Arial", 1, 13));
		l2.setText("CUSTOMER NO:");
		l2.setMaximumSize(new Dimension(105, 15));
		l2.setMinimumSize(new Dimension(105, 15));
		p1.add(l2);
		l2.setBounds(20, 130, 150, 25);

		tf2.setFont(new Font("Arial", 1, 13));
		tf2.addActionListener(this);
		p1.add(tf2);
		tf2.setBounds(200, 130, 300, 25);

		l3.setFont(new Font("Arial", 1, 13));
		l3.setText("CUSTOMER NAME:");
		p1.add(l3);
		l3.setBounds(20, 185, 150, 25);

		l4.setFont(new Font("Arial", 1, 13));
		l4.setText("CUSTOMER ADDRESS:");
		l4.setMaximumSize(new Dimension(105, 15));
		l4.setMinimumSize(new Dimension(105, 15));
		p1.add(l4);
		l4.setBounds(20, 240, 150, 25);

		l5.setFont(new Font("Arial", 1, 13));
		l5.setText("CUSTOMER ISSUE:");
		l5.setMaximumSize(new Dimension(105, 15));
		l5.setMinimumSize(new Dimension(105, 15));
		p1.add(l5);
		l5.setBounds(20, 295, 150, 25);

		dt.setFont(new Font("Arial", 1, 13));
		dt.setText("IDATE");
		dt.setMaximumSize(new Dimension(105, 15));
		dt.setMinimumSize(new Dimension(105, 15));
		p1.add(dt);
		dt.setBounds(20, 75, 150, 25);

		tf3.setFont(new Font("Arial", 1, 13));
		tf3.addActionListener(this);
		p1.add(tf3);
		tf3.setBounds(200, 185, 300, 25);

		tf4.setFont(new Font("Arial", 1, 13));
		tf4.addActionListener(this);
		p1.add(tf4);
		tf4.setBounds(200, 240, 300, 25);

		tf5.setFont(new Font("Arial", 1, 13));
		tf5.addActionListener(this);
		p1.add(tf5);
		tf5.setBounds(200, 295, 300, 25);

		dt1.setFont(new Font("Arial", 1, 13));
		dt1.addActionListener(this);
		p1.add(dt1);
		dt1.setBounds(200, 75, 300, 25);

		getContentPane();
		add(p1);
		p1.setBounds(40, 60, 670, 390);

		p2.setLayout(null);
		p2.setBackground(new Color(250, 200, 255));
		p2.setBorder(new LineBorder(new Color(153, 51, 0), 2, true));

		b1.setFont(new Font("Arial", 1, 12));
		b1.setText("SAVE");
		b1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		b1.addActionListener(this);
		p2.add(b1);
		b1.setBounds(70, 20, 80, 20);

		b2.setFont(new Font("Arial", 1, 12));
		b2.setText("CLEAR");
		b2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		b2.addActionListener(this);
		p2.add(b2);
		b2.setBounds(180, 20, 90, 20);

		b3.setFont(new Font("Arial", 1, 12));
		b3.setText("HOME");
		b3.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		b3.addActionListener(this);
		p2.add(b3);
		b3.setBounds(300, 20, 100, 20);

		contentPane.add(p2);
		p2.setBounds(40, 455, 670, 60);

		Calendar cal = Calendar.getInstance();
		dt1.setText((cal.get(Calendar.DATE)) + "/" + (cal.get(Calendar.MONTH) + 1) + "/" + (cal.get(Calendar.YEAR)));
		dt1.setEditable(false);
		setVisible(true);
		setSize(800, 600);
		setLocation(380,110);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b3) {
			dispose();
			Home h = new Home();

		}
		if (e.getSource() == b1) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection c1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/nms?useSSL=false", "root", "");
				Statement s1 = c1.createStatement();
				String ss1 = ("insert into customer_issue values('" + tf2.getText() + "','" + tf3.getText() + "','"
						+ tf4.getText() + "','" + tf5.getText() + "','" + dt1.getText() + "')");
				s1.executeUpdate(ss1);

				c1.close();
				
				JOptionPane.showMessageDialog(null,"RECORD SAVED SUCESSFULLY!");
				tf2.setText("");
				tf3.setText("");
				tf4.setText("");
				tf5.setText("");
				

			} catch (Exception ex) {
				System.out.println(ex);
			}

		}
		if (e.getSource() == b2) {

			tf2.setText("");
			tf3.setText("");
			tf4.setText("");
			tf5.setText("");
			dt1.setText("");
		}

	}

	public static void main(String args[]) {
		CustomerIssue c1 = new CustomerIssue();
		c1.show();
		c1.setDefaultCloseOperation(c1.EXIT_ON_CLOSE);
	}
}