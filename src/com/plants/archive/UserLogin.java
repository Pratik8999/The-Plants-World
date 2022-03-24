package com.plants.archive;

import com.plants.DatabasePipleline.GlobleConnection;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.TextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.Container;
import javax.swing.border.LineBorder;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class UserLogin extends JFrame implements ActionListener {
	private final TextField userNameTf, passwordTf;
	private final JButton loginBtn, cancelBtn,userRegistration;
	private JComboBox user_role;

	private String[] user_roles = {"Administrator","Sub-Admin"};

	public UserLogin() {

		Container C = getContentPane();
		C.setLayout(null);
		C.setBackground(new Color(25, 200, 150));

		JPanel P1 = new JPanel();
		P1.setLayout(null);
		P1.setBackground(new Color(204, 204, 250));
		P1.setBorder(new LineBorder(new Color(25, 251, 50), 3));
		P1.setBounds(50, 50, 500, 300);

		user_role  = new JComboBox(user_roles);
		user_role.setEditable(false);
		user_role.setBounds(250, 82, 150, 25);
		user_role.addActionListener(this);
		P1.add(user_role);

		JLabel tpwLabel = new JLabel();
		tpwLabel.setFont(new Font("Consoles", Font.BOLD, 30));
		tpwLabel.setForeground(Color.black);
		tpwLabel.setText(" Welcome To The Plants World");
		C.add(tpwLabel);
		tpwLabel.setBounds(80, 50, 800, 50);

		JLabel user_Role = new JLabel("User Type ::");
		user_Role.setFont(new Font("Consoles", Font.BOLD, 20));
		user_Role.setForeground(new Color(50, 10, 150));
		C.add(user_Role);
		user_Role.setBounds(140, 130, 149, 25);

		JLabel loginLabel = new JLabel();
		loginLabel.setFont(new Font("Consoles", Font.BOLD, 20));
		loginLabel.setForeground(new Color(50, 10, 150));
		loginLabel.setText("Username ::");
		C.add(loginLabel);
		loginLabel.setBounds(140, 185, 149, 29);

		JLabel passwordLabel = new JLabel();
		passwordLabel.setFont(new Font("Arial", Font.BOLD, 20));
		passwordLabel.setForeground(new Color(50, 10, 150));
		passwordLabel.setText("Password ::");
		C.add(passwordLabel);
		passwordLabel.setBounds(140, 242, 160, 50);

		userNameTf = new TextField();
		P1.add(userNameTf);

		userNameTf.setBounds(250, 140, 150, 25);

		C.add(P1);

		passwordTf = new TextField();
		P1.add(passwordTf);
		passwordTf.setBounds(250, 205, 150, 25);
		passwordTf.setEchoChar('*');

		JPanel P2 = new JPanel();
		P2.setLayout(null);
		P2.setBackground(new Color(204, 204, 255));
		P2.setBorder(new LineBorder(new Color(250, 50, 0), 3));
		P2.setBounds(100, 400, 400, 75);
		//P2.setLocation(350,500);

		loginBtn = new JButton("LOGIN");
		loginBtn.setFont(new Font("Arial", Font.BOLD, 20));
		loginBtn.addActionListener(this);
		P2.add(loginBtn);
		loginBtn.setBounds(80, 25, 100, 30);

		cancelBtn = new JButton("EXIT ");
		cancelBtn.setFont(new Font("Arial", Font.BOLD, 20));
		cancelBtn.addActionListener(this);
		cancelBtn.setBounds(220, 25, 150, 30);
		P2.add(cancelBtn);

		C.add(P2);

		userRegistration = new JButton("Create New User");
		userRegistration.setFont(new Font("Arial", Font.BOLD, 17));
		userRegistration.setBackground(Color.LIGHT_GRAY);
		userRegistration.setForeground(Color.blue);
		userRegistration.setSize(200,50);
		userRegistration.setLocation(390,500);
		userRegistration.addActionListener(this);

		C.add(userRegistration);


		setSize(650, 650);
		setLocation(430, 110);
		setVisible(true);
		setTitle("Administrator Login");
		setIconImage(Toolkit.getDefaultToolkit().getImage("out/production/ENV/Resources/User Login.png"));
		setBackground(new Color(50, 150, 20));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private String passwordKeyGenerator(String user_password)
	{
		Character ch[]={'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z','a','b','c','d','e','f','g','h','i','j','k','l','m','m','n','o','p','q','r','s','t','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9','@','#','$','%','^','&','*'};

		String ch1 [] = new String[70];
		StringBuffer stringBuffer = new StringBuffer();

		char character[] = user_password.toCharArray();

		for(int i=0;i<character.length;i++)
		{
			for(int j=0;j<ch.length;j++)
			{
				if (character[i] == ch[j]) {
					//System.out.print("Founded at :" + j);
					stringBuffer.append(""+(char) ((ch[j]-12) + (ch[j]+21)  )+ (char) ((ch[j]+6 + ch[j]-12)) + Integer.toString((ch[j]+3)*2));
				}
			}
		}

		user_password = new String(stringBuffer);

        /*if(user_password.equalsIgnoreCase("©\u009A166íÞ234Ë¼200ñâ238ÛÌ216ßÐ220\u0089z134k\\104m^106o`108o`108"))
        {
            System.out.println("Key Generation Successful");
        }
        else
        {
            System.out.println("Key Generation Failed !!");
        }

        System.out.println(user_password);

         */

		return user_password;
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == loginBtn) {
						if (userNameTf.getText().equalsIgnoreCase("")) {
							JOptionPane.showMessageDialog(null,"!! Please Enter User Name To Login !!");

				} else if (passwordTf.getText().equalsIgnoreCase("")) {
							JOptionPane.showMessageDialog(null,"!! Please Enter User Password For User : "+userNameTf.getText());

				} else {
								try {
					GlobleConnection.authenticator(userNameTf.getText(), passwordTf.getText(), "User");

					PreparedStatement loginStatement = GlobleConnection.connection.prepareStatement("select user_name,user_password,user_role from user_administration where user_name=? and user_password=? and user_role=?");
					loginStatement.setString(1, userNameTf.getText());
					loginStatement.setString(2, passwordKeyGenerator(passwordTf.getText()));
					loginStatement.setString(3,user_role.getSelectedItem().toString());

					ResultSet loginResultSet = loginStatement.executeQuery();

					if(loginResultSet != null/*!(loginResultSet.getString(3).equalsIgnoreCase("Administrator"))*/)
					{
							JOptionPane.showMessageDialog(null, "! Login Failed\nPlease Select Appropriate User Role !");
							return;
					}

					//System.out.println(userNameTf.getText() + ":" + passwordTf.getText());

					if (loginResultSet.next()) {
						JOptionPane.showMessageDialog(null, "! Login Successful !");
						System.out.println(loginResultSet.getString(1)+":"+loginResultSet.getString(2)+":"+loginResultSet.getString(3));
						if(!(loginResultSet.getString(3).equalsIgnoreCase("Administrator")))
						{
							JOptionPane.showMessageDialog(null, "! Login Failed\nPlease Select Appropriate User Role !");
							return;
						}
						dispose();
						new Home();
					}
					else {

						JOptionPane.showMessageDialog(null, "Unable To Find User : " + userNameTf.getText() + "\nPlease Create the User Account Setup first.\nTo Create User Click On ' Create New User '");
						//dispose();
					}

				} catch(Exception throwable){
					throwable.printStackTrace();
				}//JOptionPane.showMessageDialog(null, "!! Unable to Connect Database !!\nPlease Contact Database Administrator : +91-8796374863");
			}
		}
		else if (e.getSource() == cancelBtn) {

			userNameTf.setText("");
			passwordTf.setText("");
			dispose();

		}
		else if(e.getSource() == userRegistration)
		{
			dispose();
			//new UserRegistration();
			new UserRegistration();
		}
	}
}