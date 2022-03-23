package com.plants.archive;

import com.mysql.cj.jdbc.exceptions.MysqlDataTruncation;
import com.plants.DatabasePipleline.GlobleConnection;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.PreparedStatement;
import java.sql.SQLIntegrityConstraintViolationException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class UserRegistration extends JFrame implements ActionListener , Runnable
{
    JTextField date,user_id,user_name,user_password,user_contact,authorized_by;

    JLabel user_registration_label,date_label,user_role_label,user_id_label,user_name_label,user_password_label,user_contact_label,authorized_by_label,user_status_label;
    String catchtime="";
    StringBuffer sb = new StringBuffer();
    Calendar calendar;
    int i,loop=1;

    JComboBox user_role,user_status;

    JButton registerbtn, cancelbtn, UserLogin;

    private final String user_types [] = new String[]{"Administrator","Sub-Admin"};
    private final  String user_status_types [] = new String[]{"Active","Inactive"};

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

    private static boolean validateNumber(String mobNumber)
    {
//validates phone numbers having 10 digits (9998887776)
        if (mobNumber.matches("\\d{10}"))
            return true;
//validates phone numbers having digits, -, . or spaces
        else if (mobNumber.matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}"))
            return true;
        else if (mobNumber.matches("\\d{4}[-\\.\\s]\\d{3}[-\\.\\s]\\d{3}"))
            return true;
//validates phone numbers having digits and extension (length 3 to 5)
        else if (mobNumber.matches("\\d{3}-\\d{3}-\\d{4}\\s(x|(ext))\\d{3,5}"))
            return true;
//validates phone numbers having digits and area code in braces
        else if (mobNumber.matches("\\(\\d{3}\\)-\\d{3}-\\d{4}"))
            return true;
        else if (mobNumber.matches("\\(\\d{5}\\)-\\d{3}-\\d{3}"))
            return true;
        else if (mobNumber.matches("\\(\\d{4}\\)-\\d{3}-\\d{3}"))
            return true;
//return false if any of the input matches is not found
        else
            return false;
    }
              private void createUser(String user_id, String user_name, String user_password, String user_contact,String user_role,String authorized_by,String dateTime,String user_status_ai)
            {
                if (validateNumber(user_contact))
                {

                    String catchtime = "";
                    StringBuffer sb = new StringBuffer();

                    try {
                        int cnt = 0;

                      //  System.out.println(calendar.getTime().toString());
                      //  System.out.println("CT:" + catchtime);
                        //sb.append(Calendar.getInstance().getTime().toString().substring(0,10)+" "+catchtime.substring(11,catchtime.length())+" "+Calendar.getInstance().getTime().toString().substring(20,28));


                        PreparedStatement ps = GlobleConnection.connection.prepareStatement("INSERT INTO `the_plants_world`.`user_administration` (`user_id`, `user_name`, `user_password`, `user_contact`, `user_role`, `authorized_by`, `user_creation_time`, `last_password`, `pass_changed_count`, `last_token`, `user_status`) VALUES (?,?,?,?,?,?,?,?,?,?,?)");
            /*
            INSERT INTO `the_plants_world`.`user_administration` (`user_id`, `user_name`, `user_password`, `user_contact`, `user_role`, `authorized_by`, `user_creation_time`, `last_password`, `pass_changed_count`, `last_token`) VALUES (?,?,?,?,?,?,?,?,?,?);
             */
                       // System.out.println(sb);

                        ps.setString(1, user_id);
                        ps.setString(2, user_name);
                        ps.setString(3, user_password);
                        ps.setString(4, user_contact);
                        ps.setString(5, user_role);
                        ps.setString(6, authorized_by);
                        ps.setString(7, dateTime);
                        ps.setString(8, "None");
                        ps.setString(9, "0");
                        ps.setString(10, "To be Generated..");
                        ps.setString(11, user_status_ai);

                     //   System.out.println("Before Insert:" + GlobleConnection.connection.hashCode() + ": " + ps.hashCode());

                        i = ps.executeUpdate();
                      //  System.out.println("Printing i:" + i);
                        if (i == 1) {
                            //System.out.println("User Creation Successful....");
                            JOptionPane.showMessageDialog(null, "!! User Account For "+user_name+" has been Created Succesfully!!");
                            dispose();
                            new Home();

                        } else {
                            JOptionPane.showMessageDialog(null, "!! User Creation Failed !!\nPlease Contact Database Administrator : +91-8796374863");

                        }
                        System.out.println("After Insert:" + GlobleConnection.connection.hashCode());

                    } catch (SQLIntegrityConstraintViolationException sqlIntegrityConstraintViolationException) {
                        JOptionPane.showMessageDialog(null, user_name +" have an Existing Account For User Identification Number:"+user_id);
                    //    System.out.println(sqlIntegrityConstraintViolationException.getMessage());
                    } catch (MysqlDataTruncation mysqlDataTruncation) {
                        mysqlDataTruncation.printStackTrace();
                    }
                 catch(Exception exception){
                    exception.printStackTrace();
                }
            }
                else {
                JOptionPane.showMessageDialog(null, "Invalid Contact Number\nPlease Enter 10 Digits Contact Number\nE.g:8796374863");
            }
    }

    public void run()
    {
        try {
                for(int i=0;i<100;i++) {
                calendar = Calendar.getInstance();
                long timeInmills = System.currentTimeMillis();
                calendar.setTimeInMillis(timeInmills);
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss aa");
                date.setText(dateFormat.format(calendar.getTime()));
                catchtime = dateFormat.format(calendar.getTime());
                Thread.sleep(998);

            }
            //sb.append(Calendar.getInstance().getTime().toString().substring(0,10)+" "+catchtime.substring(11,catchtime.length())+" "+Calendar.getInstance().getTime().toString().substring(20,28));
        }
        catch(Exception interruptedException)
        {
            interruptedException.printStackTrace();
        }
    }

    public UserRegistration()
    {
        GlobleConnection.authenticator("root","root@123","Administrator");


        Container contentPane = getContentPane();
        contentPane.setLayout(null);
        contentPane.setBackground(new Color(170, 200, 224));

        JPanel p1 = new JPanel();

        p1.setLayout(null);

        p1.setBorder(new LineBorder(new Color(150, 180, 50), 3, true));
        p1.setForeground(new Color(153, 51, 0));
        p1.setBackground(new Color(255, 250, 250));

        user_registration_label =new JLabel();
        Font title = new Font("Arial",Font.BOLD , 25);
        user_registration_label.setFont(title);
        //l.setFont(Font.BOLD);
        user_registration_label.setForeground(Color.black);
        user_registration_label.setText("Create New User");
        user_registration_label.setHorizontalTextPosition(SwingConstants.CENTER);
        getContentPane().add(user_registration_label);
        user_registration_label.setBounds(228, 15, 250, 40);

        date_label = new JLabel();
        date_label.setFont(new Font("Arial", Font.BOLD, 15));
        date_label.setText("DATE :");
        date_label.setMaximumSize(new Dimension(105, 15));
        date_label.setMinimumSize(new Dimension(105, 15));
        p1.add(date_label);
        date_label.setBounds(59, 30, 150, 25);


        date = new JTextField();
        date.addActionListener(this);
        date.setEditable(false);
        p1.add(date);
        date.setBounds(150, 25, 300, 30);

        calendar = Calendar.getInstance();
        long timeInmills = System.currentTimeMillis();
        calendar.setTimeInMillis(timeInmills);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss aa");
        date.setText(dateFormat.format(calendar.getTime()));
        catchtime = dateFormat.format(calendar.getTime());

        user_role_label = new JLabel();
        user_role_label.setFont(new Font("Arial",Font.BOLD, 15));
        user_role_label.setForeground(Color.DARK_GRAY);
        user_role_label.setText("User Type :");
        user_role_label.setMaximumSize(new Dimension(105, 15));
        user_role_label.setMinimumSize(new Dimension(105, 15));
        p1.add(user_role_label);
        user_role_label.setBounds(45, 65, 160, 26);

        user_role = new JComboBox(user_types);
        user_role.setEditable(false);
        user_role.setBounds(190, 125, 300, 30);
        user_role.addActionListener(this);
        add(user_role);

        user_id_label = new JLabel();
        user_id_label.setFont(new Font("Arial", 1, 18));
        user_id_label.setText("User id:");
        user_id_label.setMaximumSize(new Dimension(105, 15));
        user_id_label.setMinimumSize(new Dimension(105, 15));
        p1.add(user_id_label);
        user_id_label.setBounds(50, 112, 150, 25);

        user_id = new JTextField();
        user_id.setFont(new Font("Arial", 1, 13));
        user_id.addActionListener(this);
        p1.add(user_id);
        user_id.setBounds(150, 110, 350, 32);

        user_name_label = new JLabel();
        user_name_label.setFont(new Font("Arial", 1, 15));
        user_name_label.setText("User Name:");
        p1.add(user_name_label);
        user_name_label.setBounds(50, 153, 150, 25);

        user_name = new JTextField();
        user_name.setFont(new Font("Arial", 1, 13));
        user_name.addActionListener(this);
        p1.add(user_name);
        user_name.setBounds(150, 150, 350, 32);

        user_password_label = new JLabel();
        user_password_label.setFont(new Font("Arial", 1, 15));
        user_password_label.setText("User Password:");
        user_password_label.setMaximumSize(new Dimension(105, 15));
        user_password_label.setMinimumSize(new Dimension(105, 15));
        user_password_label.setBounds(25, 195, 150, 25);
        p1.add(user_password_label);

        user_password = new JTextField();
        user_password.setFont(new Font("Arial", 1, 13));
        user_password.addActionListener(this);
        user_password.setBounds(150, 195, 350, 32);
        p1.add(user_password);

        user_contact_label = new JLabel();
        user_contact_label.setFont(new Font("Arial", 1, 15));
        user_contact_label.setText("User Contact:");
        user_contact_label.setMaximumSize(new Dimension(105, 15));
        user_contact_label.setMinimumSize(new Dimension(105, 15));
        p1.add(user_contact_label);
        user_contact_label.setBounds(40, 240, 150, 25);

        user_contact = new JTextField();
        user_contact.setFont(new Font("Arial", 1, 15));
        user_contact.addActionListener(this);
        p1.add(user_contact);
        user_contact.setBounds(150, 240, 350, 32);

        authorized_by_label = new JLabel();
        authorized_by_label.setFont(new Font("Arial", 1, 15));
        authorized_by_label.setText("Authorized By:");
        authorized_by_label.setMaximumSize(new Dimension(105, 15));
        authorized_by_label.setMinimumSize(new Dimension(105, 15));
        p1.add(authorized_by_label);
        authorized_by_label.setBounds(35, 280, 150, 25);

        authorized_by = new JTextField();
        authorized_by.setFont(new Font("Arial", 1, 13));
        authorized_by.addActionListener(this);
        p1.add(authorized_by);
        authorized_by.setBounds(150, 280, 350, 32);

        user_status_label = new JLabel();
        user_status_label.setFont(new Font("Arial", 1, 15));
        user_status_label.setText("User Status:");
        user_status_label.setMaximumSize(new Dimension(105, 15));
        user_status_label.setMinimumSize(new Dimension(105, 15));
        p1.add(user_status_label);
        user_status_label.setBounds(40, 320, 150, 25);

        user_status = new JComboBox(user_status_types);
        user_status.setEditable(false);
        user_status.setBounds(150, 320, 350, 32);
        user_status.addActionListener(this);
        p1.add(user_status);

        getContentPane();
        add(p1);
        p1.setBounds(40, 60, 600, 390);

        JPanel p2 = new JPanel();

        p2.setLayout(null);
        p2.setBackground(new Color(25, 200, 150));
        p2.setBorder(new LineBorder(new Color(18, 51, 25), 2, true));

        registerbtn = new JButton();
        registerbtn.setFont(new Font("Arial", 1, 12));
        registerbtn.setText("Submit");
        registerbtn.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        registerbtn.addActionListener(this);
        p2.add(registerbtn);
        registerbtn.setBounds(100, 20, 80, 28);

        cancelbtn = new JButton();
        cancelbtn.setFont(new Font("Arial", 1, 12));
        cancelbtn.setText("CLEAR");
        cancelbtn.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        cancelbtn.addActionListener(this);
        p2.add(cancelbtn);
        cancelbtn.setBounds(210, 20, 90, 28);
        sb.append(Calendar.getInstance().getTime().toString().substring(0,10)+" "+catchtime.substring(11,catchtime.length())+" "+Calendar.getInstance().getTime().toString().substring(20,28));


        UserLogin = new JButton();
        UserLogin.setFont(new Font("Arial", 1, 12));
        UserLogin.setText("Login");
        UserLogin.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        UserLogin.addActionListener(this);
        p2.add(UserLogin);
        UserLogin.setBounds(330, 20, 100, 28);

        contentPane.add(p2);
        p2.setBounds(40, 455, 600, 60);

        //loopMethod(loop)

//        try {
//            while (true) {
//                calendar = Calendar.getInstance();
//                long timeInmills = System.currentTimeMillis();
//                calendar.setTimeInMillis(timeInmills);
//                SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss aa");
//                date.setText(dateFormat.format(calendar.getTime()));
//                catchtime = dateFormat.format(calendar.getTime());
//                Thread.sleep(998);
//
//            }
//            //sb.append(Calendar.getInstance().getTime().toString().substring(0,10)+" "+catchtime.substring(11,catchtime.length())+" "+Calendar.getInstance().getTime().toString().substring(20,28));
//        }
//        catch(Exception interruptedException)
//        {
//            interruptedException.printStackTrace();
//        }

        setLocation(450,100);
        setSize(680,600);
        setVisible(true);
        setTitle("User Registration");
        setIconImage(Toolkit.getDefaultToolkit().getImage("out/production/ENV/Resources/User Login.png"));
        setBackground(new Color(200, 150, 20));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getActionCommand().equalsIgnoreCase("Submit"))
        {
                    if(user_id.getText().equalsIgnoreCase("") || user_name.getText().equalsIgnoreCase("")||user_password.getText().equalsIgnoreCase("") || user_contact.getText().equalsIgnoreCase("") || user_role.getSelectedItem().toString().equalsIgnoreCase("") || authorized_by.getText().equalsIgnoreCase("") || user_status.getSelectedItem().toString().equalsIgnoreCase(""))
                    {
                        JOptionPane.showMessageDialog(null,"!! Incomplete User Credentials !!");
                    }
                    else {
                        this.createUser(user_id.getText(), user_name.getText(), passwordKeyGenerator(user_password.getText()), user_contact.getText(), user_role.getSelectedItem().toString(), authorized_by.getText(), catchtime, user_status.getSelectedItem().toString());
                    }
        }

        if(e.getActionCommand().equalsIgnoreCase("Clear"))
        {

            user_id.setText("");
            user_name.setText("");
            user_password.setText("");
            user_contact.setText("");
            authorized_by.setText("");

        }
         if(e.getActionCommand().equalsIgnoreCase("Login"))
        {
            dispose();
            new UserLogin();
        }



    }
}

