package com.plants.archive;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;

class Home extends JFrame implements ActionListener {
    JPanel p1, p2, p3, p4;
    JButton b1, b2, b3, b4, b5;
    JLabel l1, l2;
    Menu Stock, Maintenance, Customer, Bill;
    MenuBar mb;
    MenuItem i1, i2, i3, i4, i5, i6, i7, i8;
    Icon img;

    public Home()
    {
        super("Nursery Home");
        p1 = new JPanel();
        p2 = new JPanel();
        p4 = new JPanel();

        img = new ImageIcon("");
        l2 = new JLabel(img);
        l2.setBounds(10, 100, 480, 310);
        p1.add(l2);
        b1 = new JButton("STOCK");
        b2 = new JButton("PURCHASE");
        b3 = new JButton("SALE");
        b4 = new JButton("REPORT");
        b5 = new JButton("CLOSE");

        mb = new MenuBar();
        Stock = new Menu("PLANT");
        Maintenance = new Menu("MAINTENANCE");
        i6 = new MenuItem("INFORMATION");
        Customer = new Menu("CUSTOMER");
        i7 = new MenuItem("CUSTOMER ISSUE");
        i8 = new MenuItem("CUSTOMER REGISTRATION");
        i1 = new MenuItem("PLANT DETAILS");
        Bill = new Menu("BILL");
        i3 = new MenuItem("FOR SALE");
        i4 = new MenuItem("FOR RENT");
        i5 = new MenuItem("EXIT");

        i1.addActionListener(this);
        i3.addActionListener(this);
        i4.addActionListener(this);
        i5.addActionListener(this);
        i6.addActionListener(this);
        i7.addActionListener(this);
        i8.addActionListener(this);
        Stock.add(i1);
        Stock.add(Bill);
        Bill.add(i3);
        Bill.add(i4);
        Stock.addSeparator();
        Stock.add(i5);
        Stock.addSeparator();
        Maintenance.addActionListener(this);
        mb.add(Stock);
        mb.add(Maintenance);
        mb.add(Customer);
        Maintenance.add(i6);
        Customer.add(i7);
        Customer.add(i8);

        setMenuBar(mb);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                setVisible(false);
            }
        });

        Container contentPane = getContentPane();
        getContentPane().setLayout(null);

        p2.setBackground(new Color(190, 170, 255));
        p2.setLayout(null);
        contentPane.add(p2);
        p2.setBounds(500, 125, 230, 260);
        p2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));

        p4.setBackground(new Color(51-153-255));
        p4.setLayout(null);
        contentPane.add(p4);
        p4.setBounds(190, 16, 380, 50);

        p1.setBackground(new Color(204,204,250));
        p1.setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPane.add(p1);
        p1.setBounds(0, 0, 800, 575);

        l1 = new JLabel("The Plants World", JLabel.CENTER);

        b1.setFont(new Font("Arial", 0, 18));
        b1.setMnemonic('a');
        b1.setForeground(new Color(255, 51, 51));
        b1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        p1.add(b5);
        p2.add(b1);
        b1.addActionListener(this);
        b1.setBounds(20, 20, 180, 40);

        b2.setFont(new Font("Arial", 0, 18));
        // b2.setMnemonic('a');
        b2.setForeground(new Color(255, 51, 51));
        b2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        p1.add(b5);
        p2.add(b2);
        b2.addActionListener(this);
        b2.setBounds(20, 180, 180, 40);

        b3.setFont(new Font("Arial", 0, 18));
        // b3.setMnemonic('a');
        b3.setForeground(new Color(255, 51, 51));
        b3.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        p1.add(b5);
        p2.add(b3);
        b3.addActionListener(this);
        b3.setBounds(20, 100, 180, 40);

        b4.setFont(new Font("Arial", 0, 18));
        // b4.setMnemonic('r');
        b4.setForeground(new Color(255, 51, 51));
        b4.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        p1.add(b4);
        p1.add(b4);
        b4.addActionListener(this);
        b4.setBounds(100, 440, 120, 40);

        b5.setFont(new Font("Arial", 0, 18));
        // b5.setMnemonic('b');
        b5.setForeground(new Color(255, 51, 51));
        b5.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        p1.add(b5);
        b5.addActionListener(this);
        b5.setBounds(290, 440, 120, 40);

        Font f = new Font("Charlemagne", Font.BOLD, 25);
        l1.setFont(f);
        l1.setForeground(Color.black);
        //l1.setBackground(Color.green);
        p4.add(l1);
        l1.setBounds(10, 5, 330, 40);
        setIconImage(Toolkit.getDefaultToolkit().getImage("out/production/ENV/resources/Main Frame Icon.jpg"));
        setLocation(350,140);
        setSize(800, 575);
        setVisible(true);


    }

    public void actionPerformed(ActionEvent e) {

           if(e.getActionCommand().equalsIgnoreCase("Customer Registration"))
           {
               dispose();
               new CustomerBill();
           }

            if (e.getActionCommand().equalsIgnoreCase("Stock")) {
            dispose();
            new stock();

        }
        if (e.getActionCommand().equalsIgnoreCase("Purchase")) {
            dispose();
            new Purchase();
        }

        if (e.getActionCommand().equalsIgnoreCase("Sale")) {
            dispose();
            new Sale();
        }
        if (e.getActionCommand().equalsIgnoreCase("Report")) {
            dispose();
            new Reports();

        }
        if (e.getActionCommand().equalsIgnoreCase("Stock")) {
            dispose();

        }
        if (e.getActionCommand().equalsIgnoreCase("Information")) {
            dispose();
            new Maint();

        }
        if (e.getActionCommand().equalsIgnoreCase("Plant Details")) {
            dispose();
            new pdetail();

        }
        if (e.getActionCommand().equalsIgnoreCase("For Sale")) {
            dispose();
            new Bill1();
        }

        if (e.getActionCommand().equalsIgnoreCase("PURCHASE REPORT"))
        {
            dispose();
            new Reports();
        }

        if (e.getActionCommand().equalsIgnoreCase("Customer Issue")) {
            dispose();
            new CustomerIssue();
        }
        if (e.getActionCommand().equalsIgnoreCase("Rbill")) {
            dispose();
            new Rbill();
        }


    }

    public static void main(String args[]) {

        new UserLogin();


        //h.setDefaultCloseOperation(h.EXIT_ON_CLOSE);
    }
}