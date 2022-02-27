package com.plants.archive;

import com.plants.DatabasePipleline.GlobleConnection;

import java.awt.*;
import java.awt.event.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;
import javax.swing.border.*;

public class UserLogin extends JFrame implements ActionListener {
	private final TextField userNameTf, passwordTf;
	private final JButton loginBtn, cancelBtn;

	public UserLogin() {

		Container C = getContentPane();
		C.setLayout(null);
		C.setBackground(new Color(25, 200, 150));


		JPanel P1 = new JPanel();
		P1.setLayout(null);
		P1.setBackground(new Color(204, 204, 250));
		P1.setBorder(new LineBorder(new Color(25, 251, 50), 3));
		P1.setBounds(50, 50, 500, 300);

		JLabel tpwLabel = new JLabel();
		tpwLabel.setFont(new Font("Consoles", Font.BOLD, 30));
		tpwLabel.setForeground(Color.black);
		tpwLabel.setText(" Welcome To The Plants World");
		C.add(tpwLabel);
		tpwLabel.setBounds(80, 50, 800, 50);

		JLabel loginLabel = new JLabel();
		loginLabel.setFont(new Font("Consoles", Font.BOLD, 20));
		loginLabel.setForeground(new Color(50, 10, 150));
		loginLabel.setText("Username ::");
		C.add(loginLabel);
		loginLabel.setBounds(125, 169, 149, 29);

		JLabel passwordLabel = new JLabel();
		passwordLabel.setFont(new Font("Consoles", Font.BOLD, 20));
		passwordLabel.setForeground(new Color(50, 10, 150));
		passwordLabel.setText("Password ::");
		C.add(passwordLabel);
		passwordLabel.setBounds(125, 230, 160, 50);

		userNameTf = new TextField();
		P1.add(userNameTf);

		userNameTf.setBounds(250, 120, 150, 25);

		C.add(P1);

		passwordTf = new TextField();
		P1.add(passwordTf);
		passwordTf.setBounds(250, 195, 150, 25);
		passwordTf.setEchoChar('*');

		JPanel P2 = new JPanel();
		P2.setLayout(null);
		P2.setBackground(new Color(204, 204, 255));
		P2.setBorder(new LineBorder(new Color(250, 50, 0), 3));
		P2.setBounds(100, 400, 400, 75);

		loginBtn = new JButton("LOGIN");
		loginBtn.setFont(new Font("Arial", Font.BOLD, 20));
		loginBtn.addActionListener(this);
		P2.add(loginBtn);
		loginBtn.setBounds(80, 25, 100, 30);

		cancelBtn = new JButton("EXIT");
		cancelBtn.setFont(new Font("Arial", Font.BOLD, 20));
		cancelBtn.addActionListener(this);
		P2.add(cancelBtn);
		cancelBtn.setBounds(220, 25, 100, 30);

		C.add(P2);

		setSize(650, 650);
		setLocation(430, 110);
		setVisible(true);
		setTitle("Administrator Login");
		setIconImage(Toolkit.getDefaultToolkit().getImage("out/production/ENV/Resources/User Login.png"));
		setBackground(new Color(50, 150, 20));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == loginBtn) {
			try {
				new GlobleConnection();

				PreparedStatement loginStatement = GlobleConnection.connection.prepareStatement("select user_name,user_password from user_administration where user_name=? and user_password=?");
				loginStatement.setString(1,userNameTf.getText());
				loginStatement.setString(2,passwordTf.getText());

				ResultSet loginResultSet = loginStatement.executeQuery();

				System.out.println(userNameTf.getText() + ":" + passwordTf.getText());

				if(loginResultSet.next()){
					JOptionPane.showMessageDialog(null,"! Login Successful !");
					System.out.println(loginResultSet.getString(1)+":"+loginResultSet.getString(2));
					dispose();
					new Home();
				}
				else {

					JOptionPane.showMessageDialog(null,"!! Login Failed !!");
					dispose();
				}

			} catch (Exception throwable) {
				throwable.printStackTrace();
			}//JOptionPane.showMessageDialog(null, "!! Unable to Connect Database !!\nPlease Contact Database Administrator : +91-8796374863");


		}
		else if (e.getSource() == cancelBtn) {
			userNameTf.setText("");
			passwordTf.setText("");
			dispose();
		}
	}
}