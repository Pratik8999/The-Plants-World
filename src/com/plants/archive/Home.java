package com.plants.archive;

import com.plants.DatabasePipleline.GlobleConnection;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @Author: Pratik Joshi
 * @Date : 01 March 2022
 * @Info : Home Screen Of The Plants World Application
 *
 */

class Home extends JFrame implements ActionListener {

    JButton Stockbtn, SaleBtn, CreateUser, CustManageBtn,BillBtn,AddSaleBtn;
    JLabel frameTitlelabel, bgImageLabel;
    JMenu plantMenuItem, Maintenance, Customer,loginDetails;
    JMenuBar menuBar,loginMenuBar;
    JMenuItem plantDetailsItem,informationItem, customerIssueItem, customerRegistrationItem,logoutItem,accountSettingItem;
    Icon iconImage;

    public Home() {

        super("Nursery Home");

        setLayout(null);

        Stockbtn = new JButton("STOCK");
        SaleBtn = new JButton("SALE");
        CreateUser = new JButton("Create User");
        CustManageBtn = new JButton("Manage Customers");
        BillBtn = new JButton("Generate Bill");
        AddSaleBtn = new JButton("Related Ingredients");

        frameTitlelabel = new JLabel("   The Plants World");
        bgImageLabel = new JLabel(new ImageIcon("G:\\My Drive\\The-Plants-World\\Resources\\Frame Image.jpg"));

        menuBar = new JMenuBar();
        loginMenuBar = new JMenuBar();

        plantMenuItem = new JMenu("PLANT");
        plantDetailsItem = new JMenuItem("PLANT DETAILS");

        Maintenance = new JMenu("MAINTENANCE");

        informationItem = new JMenuItem("INFORMATION");

        Customer = new JMenu("CUSTOMER");

        customerIssueItem = new JMenuItem("CUSTOMER ISSUE");
        customerRegistrationItem = new JMenuItem("CUSTOMER REGISTRATION");

        loginDetails = new JMenu("  Login");

        accountSettingItem  = new JMenuItem("Settings");
        logoutItem = new JMenuItem("Logout");

        plantDetailsItem.addActionListener(this);
        Maintenance.addActionListener(this);
        informationItem.addActionListener(this);
        customerIssueItem.addActionListener(this);
        customerRegistrationItem.addActionListener(this);
        accountSettingItem.addActionListener(this);
        logoutItem.addActionListener(this);

        plantMenuItem.add(plantDetailsItem);
        Maintenance.add(informationItem);
        Customer.add(customerIssueItem);
        Customer.add(customerRegistrationItem);
        loginDetails.add(accountSettingItem);
        loginDetails.add(logoutItem);

        menuBar.add(plantMenuItem);
        menuBar.add(Maintenance);
        menuBar.add(Customer);
        loginMenuBar.add(loginDetails);

        frameTitlelabel.setSize(280,37);
        frameTitlelabel.setFont(new Font("Arial Bold", Font.BOLD, 30));
        frameTitlelabel.setForeground(new Color(0-0-0 ));
        frameTitlelabel.setLocation(185,33);
        add(frameTitlelabel);

        bgImageLabel.setSize(700,535);
        bgImageLabel.setLocation(0,0);
        add(bgImageLabel);

        menuBar.setSize(616,20);
        menuBar.setLocation(0,0);
        menuBar.setBackground(new Color(91, 204, 143));
        loginMenuBar.setSize(80,20);
        loginMenuBar.setLocation(616,0);
        bgImageLabel.add(menuBar);
        bgImageLabel.add(loginMenuBar);

        Stockbtn.setFont(new Font("Arial", 1, 18));
        Stockbtn.setBackground(new Color(240, 176, 110));
        Stockbtn.setForeground(new Color(0,0,0));
        Stockbtn.setBounds(540,150,135,32);
        Stockbtn.addActionListener(this);
        bgImageLabel.add(Stockbtn);

        SaleBtn.setFont(new Font("Arial", 1, 18));
        SaleBtn.setBackground(new Color(214, 152, 182));
        SaleBtn.setForeground(new Color(0,0,0));
        SaleBtn.setBounds(540,225,135,32);
        //SaleBtn.setBorder(new LineBorder(new Color(0-0-0),1,false));
        SaleBtn.addActionListener(this);
        bgImageLabel.add(SaleBtn);

        CreateUser.setFont(new Font("Arial", 1, 18)); //
        CreateUser.setBackground(new Color(162, 109, 237));
        CreateUser.setForeground(new Color(0,0,0));
        CreateUser.setBounds(536,300,145,32);
        CreateUser.addActionListener(this);
        bgImageLabel.add(CreateUser);

        CustManageBtn.setFont(new Font("Arial", 1, 16));
        CustManageBtn.setBackground(new Color(167, 149, 245));
        CustManageBtn.setForeground(new Color(0,0,0));
        CustManageBtn.setBounds(320,150,195,32);
        CustManageBtn.addActionListener(this);
        bgImageLabel.add(CustManageBtn);

        BillBtn.setFont(new Font("Arial", 1, 16));
        BillBtn.setBackground(new Color(174, 232, 179));
        BillBtn.setForeground(new Color(0,0,0));
        BillBtn.setBounds(320,225,195,32);
        BillBtn.addActionListener(this);
        bgImageLabel.add(BillBtn);

        AddSaleBtn.setFont(new Font("Arial", 1, 16));
        AddSaleBtn.setBackground(new Color(247, 206, 92));
        AddSaleBtn.setForeground(new Color(0,0,0));
        AddSaleBtn.setBounds(320,300,195,32);
        AddSaleBtn.addActionListener(this);
        bgImageLabel.add(AddSaleBtn);

        //this.getContentPane().setBackground(new Color(92, 204, 143));
        setIconImage(Toolkit.getDefaultToolkit().getImage("G:\\My Drive\\The-Plants-World\\Resources\\Frame Icons\\Home Screen Green Tree.jpg"));
        setSize(700, 540);
        setLocation(430, 122);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //this.changeBg();
    }

    public void changeBg() {
        try {
            String[] imagePaths={"G:\\My Drive\\The-Plants-World\\Resources\\Frame Image2.jpg","G:\\My Drive\\The-Plants-World\\Resources\\leonie-christine-JGJ51l7Uh_E-unsplash.jpg","G:\\My Drive\\The-Plants-World\\Resources\\sigmund-3WJIBxjWVYI-unsplash.jpg",""};

            for (int i = 0; i < imagePaths.length; i++) {
                Thread.sleep(1000);
                bgImageLabel.setIcon(new ImageIcon(imagePaths[i]));
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equalsIgnoreCase("Customer Registration")) {
            dispose();
            new CustomerBill();
        }

        if (e.getActionCommand().equalsIgnoreCase("Sale")) {

        }

        if (e.getActionCommand().equalsIgnoreCase("Stock")) {
            dispose();
            new Plantstock();
        }

        if (e.getActionCommand().equalsIgnoreCase("Information")) {
            dispose();
            new Maint();
        }

        if (e.getActionCommand().equalsIgnoreCase("Customer Issue")) {
            dispose();
            new CustomerIssue();
        }

        if(e.getActionCommand().equalsIgnoreCase("Exit") || e.getActionCommand().equalsIgnoreCase("Logout"))
        {
            dispose();
        }

        if (e.getSource() == plantDetailsItem) {
            dispose();
            new AddPlants();
        }

    }

    public static void main(String[] args) {

        try {
            //int i = 5 / 0;
            GlobleConnection.authenticator("root", "root@123", "Admin");
            //new Home();
            new UserLogin();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Unable To Launch Application.\nPlease Contact Application Support: apsupport@supportmail.com", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
}