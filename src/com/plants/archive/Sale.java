package com.plants.archive;

import com.plants.DatabasePipleline.GlobleConnection;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.sql.*;
import java.util.Calendar;

public class Sale extends JFrame implements ActionListener {

	JLabel l, l1, l2, l3, l5, l6, l7, dt;
	JButton b1, b2, b3;
	JPanel p1, p2;

	JTextField tf2, tf3, tf5, tf6, tf7, dt1;

	public Sale() {
		super(" Sale ");

		p1 = new JPanel();
		p2 = new JPanel();

		l = new JLabel();
		l1 = new JLabel();
		l2 = new JLabel();
		l3 = new JLabel();

		l5 = new JLabel();
		l6 = new JLabel();
		l7 = new JLabel();
		dt = new JLabel();

		tf2 = new JTextField();
		tf3 = new JTextField();

		tf5 = new JTextField();
		tf6 = new JTextField();
		tf7 = new JTextField();
		dt1 = new JTextField();

		b1 = new JButton();
		b2 = new JButton();
		b3 = new JButton();

		Container contentPane = getContentPane();
		contentPane.setLayout(null);

		p1.setLayout(null);

		p1.setBorder(new LineBorder(new Color(153, 51, 0), 2, true));
		p1.setBackground(new Color(250, 200, 255));

		l.setFont(new Font("Arial",Font.BOLD, 25));
		l.setForeground(Color.red);
		l.setText("The Plants World");
		l.setHorizontalTextPosition(SwingConstants.CENTER);
		getContentPane().add(l);
		l.setBounds(120, 25, 250, 40);

		l1.setFont(new Font("Arial",Font.BOLD, 30));
		l1.setForeground(Color.black);
		l1.setText(" SALE ");
		l1.setMaximumSize(new Dimension(150, 25));
		l1.setMinimumSize(new Dimension(150, 25));
		p1.add(l1);
		l1.setBounds(180, 20, 280, 40);

		dt.setFont(new Font("Arial", 1, 13));
		dt.setText("DATE:");
		l2.setMaximumSize(new Dimension(105, 15));
		dt.setMinimumSize(new Dimension(105, 15));
		p1.add(dt);
		dt.setBounds(20, 75, 150, 25);

		l2.setFont(new Font("Arial", 1, 13));
		l2.setText("SALE NO:");
		l2.setMaximumSize(new Dimension(105, 15));
		l2.setMinimumSize(new Dimension(105, 15));
		p1.add(l2);
		l2.setBounds(20, 150, 150, 25);

		tf2.setFont(new Font("Arial", 1, 13));
		tf2.addActionListener(this);
		p1.add(tf2);
		tf2.setBounds(200, 150, 300, 25);

		l3.setFont(new Font("Arial", 1, 13));
		l3.setText("CATEGORY:");
		p1.add(l3);
		l3.setBounds(20, 210, 150, 25);

		l5.setFont(new Font("Arial", 1, 13));
		l5.setText("PLANT NAME:");
		l5.setMaximumSize(new Dimension(105, 15));
		l5.setMinimumSize(new Dimension(105, 15));
		p1.add(l5);
		l5.setBounds(20, 270, 150, 25);

		l6.setFont(new Font("Arial", 1, 13));
		l6.setText("PLANT QTY:");
		l6.setMaximumSize(new Dimension(105, 15));
		l6.setMinimumSize(new Dimension(105, 15));
		p1.add(l6);
		l6.setBounds(20, 330, 150, 25);

		l7.setFont(new Font("Arial", 1, 13));
		l7.setText("PLANT AMT:");
		l7.setMaximumSize(new Dimension(105, 15));
		l7.setMinimumSize(new Dimension(105, 15));
		p1.add(l7);
		l7.setBounds(20, 395, 150, 25);

		tf3.setFont(new Font("Arial", 1, 13));
		tf3.addActionListener(this);
		p1.add(tf3);
		tf3.setBounds(200, 210, 300, 25);

		tf5.setFont(new Font("Arial", 1, 13));
		tf5.addActionListener(this);
		p1.add(tf5);
		tf5.setBounds(200, 270, 300, 25);

		tf6.setFont(new Font("Arial", 1, 13));
		tf6.addActionListener(this);
		p1.add(tf6);
		tf6.setBounds(200, 330, 300, 25);
		
		tf7.setFont(new Font("Arial", 1, 13));
		tf7.addActionListener(this);
		p1.add(tf7);
		tf7.setBounds(200, 395, 300, 25);

		dt1.setFont(new Font("Arial", 1, 13));
		dt1.addActionListener(this);
		p1.add(dt1);
		dt1.setBounds(200, 75, 300, 25);

		getContentPane();
		add(p1);
		p1.setBounds(40, 60, 670, 460);

		p2.setLayout(null);
		p2.setBorder(new LineBorder(new Color(153, 51, 0), 2, true));
		p2.setBackground(new Color(250, 200, 255));

		b1.setFont(new Font("Arial", 1, 12));
		b1.setText("SAVE");
		b1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		b1.addActionListener(this);
		p2.add(b1);
		b1.setBounds(70, 20, 70, 20);

		b2.setFont(new Font("Arial", 1, 12));
		b2.setText("CLEAR");
		b2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		b2.addActionListener(this);
		p2.add(b2);
		b2.setBounds(160, 20, 90, 20);

		b3.setFont(new Font("Arial", 1, 12));
		b3.setText("HOME");
		b3.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		b3.addActionListener(this);
		p2.add(b3);
		b3.setBounds(270, 20, 100, 20);

		contentPane.add(p2);
		p2.setBounds(40, 525, 670, 60);

		Calendar cal = Calendar.getInstance();
		dt1.setText((cal.get(Calendar.DATE)) + "/" + (cal.get(Calendar.MONTH) + 1) + "/" + (cal.get(Calendar.YEAR)));
		dt1.setEditable(false);
		setVisible(true);
		setSize(750, 650);
		setLocation(350,140);

	}// aform

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b3) {
			dispose();
			Home h = new Home();

		}
		if (e.getSource() == b1) {
			try {

				Statement s1 = GlobleConnection.connection.createStatement();
				String ss1 = ("insert into Sale values('" + tf2.getText() + "','" + tf3.getText() + "','"
						+ tf5.getText() + "','" + tf6.getText() + "','" + tf7.getText() + "','" + dt1.getText() + "')");
				s1.executeUpdate(ss1);

				
				JOptionPane.showMessageDialog(null,"RECORD SAVED SUCESSFULLY!");
				
				tf2.setText("");
				tf3.setText("");

				tf5.setText("");
				tf6.setText("");
				tf7.setText("");


			} catch (Exception ex) {
				System.out.println(ex);
			}

		}
		if (e.getSource() == b2) {

			tf2.setText("");
			tf3.setText("");

			tf5.setText("");
			tf6.setText("");
			tf7.setText("");
			// dt1.setText("");
		}

	}

	public static void main(String args[]) {
		Sale s1 = new Sale();
		s1.show();
		s1.setDefaultCloseOperation(s1.EXIT_ON_CLOSE);
	}
}