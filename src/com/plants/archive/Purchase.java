package com.plants.archive;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.sql.*;
import java.util.Calendar;

public class Purchase extends JFrame implements ActionListener {

	JLabel dt, l, l1, l2, l3, l4, l6, l7, l8;
	JButton b1, b2, b3;
	JPanel p1, p2;

	JTextField dt1, tf2, tf3, tf4, tf6, tf7, tf8;

	public Purchase() {
		super("PURCHASE");

		p1 = new JPanel();
		p2 = new JPanel();

		l = new JLabel();
		l1 = new JLabel();
		l2 = new JLabel();
		l3 = new JLabel();
		l4 = new JLabel();

		l6 = new JLabel();
		l7 = new JLabel();
		l8 = new JLabel();
		dt = new JLabel();

		tf2 = new JTextField();
		tf3 = new JTextField();
		tf4 = new JTextField();

		tf6 = new JTextField();
		tf7 = new JTextField();
		tf8 = new JTextField();
		dt1 = new JTextField();

		b1 = new JButton();
		b2 = new JButton();
		b3 = new JButton();

		Container contentPane = getContentPane();
		contentPane.setLayout(null);

		p1.setLayout(null);

		p1.setBorder(new LineBorder(new Color(153, 51, 0), 2, true));
		p1.setBackground(new Color(250, 200, 255));

		dt.setFont(new Font("Arial", 1, 13));
		dt.setText("DATE");
		dt.setMaximumSize(new Dimension(105, 15));
		dt.setMinimumSize(new Dimension(105, 15));
		p1.add(dt);
		dt.setBounds(20, 50, 150, 25);

		l.setFont(new Font("Monotype Corsiva", Font.BOLD, 25));
		l.setForeground(new Color(200, 40, 0));
		l.setText("The Plants World");
		l.setHorizontalTextPosition(SwingConstants.CENTER);
		getContentPane().add(l);
		l.setBounds(140, 20, 350, 50);

		l1.setFont(new Font("Monotype Corsiva", 3, 25));
		l1.setForeground(Color.black);
		l1.setText(" PURCHASE ");
		l1.setMaximumSize(new Dimension(125, 45));
		l1.setMinimumSize(new Dimension(125, 45));
		p1.add(l1);
		l1.setBounds(150, 0, 360, 60);

		l2.setFont(new Font("Arial", 1, 13));
		l2.setText("ORDER NO  :-");
		l2.setMaximumSize(new Dimension(105, 15));
		l2.setMinimumSize(new Dimension(105, 15));
		p1.add(l2);
		l2.setBounds(20, 90, 150, 25);

		tf2.setFont(new Font("Arial", 1, 13));
		tf2.addActionListener(this);
		p1.add(tf2);
		tf2.setBounds(200, 90, 300, 25);

		l3.setFont(new Font("Arial", 1, 13));
		l3.setText("SUPPLIER NAME");
		p1.add(l3);
		l3.setBounds(20, 150, 150, 25);

		l4.setFont(new Font("Arial", 1, 13));
		l4.setText("PLANT CATEGARY  :-");
		l4.setMaximumSize(new Dimension(105, 15));
		l4.setMinimumSize(new Dimension(105, 15));
		p1.add(l4);
		l4.setBounds(20, 210, 150, 25);

		l6.setFont(new Font("Arial", 1, 13));
		l6.setText("PLANT NAME :-");
		l6.setMaximumSize(new Dimension(105, 15));
		l6.setMinimumSize(new Dimension(105, 15));
		p1.add(l6);
		l6.setBounds(20, 270, 150, 25);

		l7.setFont(new Font("Arial", 1, 13));
		l7.setText("QUANTITY:-");
		l7.setMaximumSize(new Dimension(105, 15));
		l7.setMinimumSize(new Dimension(105, 15));
		p1.add(l7);
		l7.setBounds(20, 330, 150, 25);

		l8.setFont(new Font("Arial", 1, 13));
		l8.setText("RATE :-");
		l8.setMaximumSize(new Dimension(105, 15));
		l8.setMinimumSize(new Dimension(105, 15));
		p1.add(l8);
		l8.setBounds(20, 390, 150, 25);

		tf3.setFont(new Font("Arial", 1, 13));
		tf3.addActionListener(this);
		p1.add(tf3);
		tf3.setBounds(200, 150, 300, 25);

		tf4.setFont(new Font("Arial", 1, 13));
		tf4.addActionListener(this);
		p1.add(tf4);
		tf4.setBounds(200, 210, 300, 25);

		tf6.setFont(new Font("Arial", 1, 13));
		tf6.addActionListener(this);
		p1.add(tf6);
		tf6.setBounds(200, 270, 300, 25);

		tf7.setFont(new Font("Arial", 1, 13));
		tf7.addActionListener(this);
		p1.add(tf7);
		tf7.setBounds(200, 330, 300, 25);

		tf8.setFont(new Font("Arial", 1, 13));
		tf8.addActionListener(this);
		p1.add(tf8);
		tf8.setBounds(200, 390, 300, 25);

		dt1.setFont(new Font("Arial", 1, 13));
		p1.add(dt1);
		dt1.setBorder(new LineBorder(new Color(0, 0, 0)));
		dt1.setBounds(200, 50, 80, 17);

		contentPane.add(p1);
		p1.setBounds(40, 60, 670, 450);

		p2.setLayout(null);
		p2.setBorder(new LineBorder(new Color(153, 51, 0), 2, true));
		p2.setBackground(new Color(250, 200, 255));

		b1.setFont(new Font("Arial", 1, 12));
		b1.setText("SAVE");
		b1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		b1.addActionListener(this);
		p2.add(b1);
		b1.setBounds(80, 20, 80, 20);

		b2.setFont(new Font("Arial", 1, 12));
		b2.setText("CLEAR");
		b2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		b2.addActionListener(this);
		p2.add(b2);
		b2.setBounds(200, 20, 90, 20);

		b3.setFont(new Font("Arial", 1, 12));
		b3.setText("HOME");
		b3.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		b3.addActionListener(this);
		p2.add(b3);
		b3.setBounds(320, 20, 100, 20);

		contentPane.add(p2);
		p2.setBounds(40, 520, 670, 60);

		Calendar cal = Calendar.getInstance();
		dt1.setText((cal.get(Calendar.DATE)) + "/" + (cal.get(Calendar.MONTH) + 1) + "/" + (cal.get(Calendar.YEAR)));
		dt1.setEditable(false);

		setVisible(true);
		setSize(750, 650);
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == b1) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection c1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/nms?useSSL=false", "root",
						"");
				Statement s1 = c1.createStatement();
				String ss1 = ("insert into purchase values('" + tf2.getText() + "','" + tf3.getText() + "','"
						+ tf4.getText() + "','" + tf6.getText() + "','" + tf7.getText() + "','" + tf8.getText() + "','"
						+ dt1.getText() + "')");

				s1.executeUpdate(ss1);
				c1.close();

				JOptionPane.showMessageDialog(null,"RECORD SAVED SUCESSFULLY!");
				
				tf2.setText("");
				tf3.setText("");
				tf4.setText("");
				tf7.setText("");
				tf8.setText("");
				tf6.setText("");

			} catch (Exception ex) {
				System.out.println(ex);
			}

		}
		if (e.getSource() == b2) {
			tf2.setText("");
			tf3.setText("");
			tf4.setText("");
			tf7.setText("");
			tf8.setText("");
			tf6.setText("");

		}
		if (e.getSource() == b3) {
			dispose();
			Home h = new Home();

		}
	}

	public static void main(String args[]) {
		Purchase p = new Purchase();
		p.show();
		p.setDefaultCloseOperation(p.EXIT_ON_CLOSE);
	}

}
