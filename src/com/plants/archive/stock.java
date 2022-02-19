package com.plants.archive;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
class stock extends JFrame implements ActionListener
{
   Connection con;
  Statement stmt;
  ResultSet rs,resultt1;
  boolean flag=false;
  boolean flag1=false;	
  JPanel p1,p2,p3,p4;
  JFrame frame;
  JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
  JLabel l1,l2;
  Icon img;
  JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7;
 
   public stock()
   {
      frame=new JFrame();
      p1=new JPanel();
      p2=new JPanel();
      p3=new JPanel();
      p4=new JPanel();
      
      img=new ImageIcon("c:\\program files\\java\\jdk1.5.0\\bin\\project1\\flowers\\506.gif");
       l2=new JLabel(img); 
       l2.setBounds(250,80,290,230);
       p1.add(l2);
      
      tf1=new JTextField();
      tf2=new JTextField();
      tf3=new JTextField();
      tf4=new JTextField();
      tf5=new JTextField();
      tf6=new JTextField();
      tf7=new JTextField();
      
       frame.setSize(800,575); 
       frame.setVisible(true); 
       frame.getContentPane().add(p1);
       p1.setBackground(new Color(250,200,255)); 
       p4.setBackground(new Color(250,200,255));
       p1.add(p4);
       p4.setBounds(300,10,190,50);
       p1.setLayout(null);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.show();
       
        p2.setBorder(new javax.swing.border.LineBorder(new 
                                  java.awt.Color(0,0,0),4,true));
        
        b1=new JButton("INDOOR");
        b1.setMnemonic('i');
        p1.add(b1);
        b1.addActionListener(this);
        b1.setBounds(25,80,120,50);
        p1.add(tf1);
        tf1.setBounds(190,80,50,50);
     
        b2=new JButton("OUTDOOR");
        b2.setMnemonic('o');
        p1.add(b2);
        b2.addActionListener(this);
        b2.setBounds(25,150,120,50);

        b3=new JButton("SEMISET");
        b3.setMnemonic('s');
        p1.add(b3);
        b3.addActionListener(this);
        b3.setBounds(25,220,120,50);

        b4=new JButton("FRUITS");
        b4.setMnemonic('f');
        p1.add(b4);
        b4.addActionListener(this);
        b4.setBounds(545,80,120,50);

        b5=new JButton("LAWN GRASS");
        b5.setMnemonic('l');
        p1.add(b5);
        b5.addActionListener(this);
        b5.setBounds(545,150,120,50);

        b6=new JButton("BORDER OF ROADS");
        b6.setMnemonic('r');
        p1.add(b6);
        b6.addActionListener(this);
        b6.setBounds(545,220,120,50);

        b7=new JButton("WATER LILLYS");
        b7.setMnemonic('w');
        p1.add(b7);
        b7.addActionListener(this);
        b7.setBounds(260,320,180,50);

        b8=new JButton("DETAIL STOCK");
        b8.setMnemonic('d');
        p1.add(b8);
        b8.addActionListener(this);
        b8.setBounds(160,460,200,50);
        
        b9=new JButton("HOME");
        b9.setMnemonic('h');
        p1.add(b9);
        b9.addActionListener(this);
        b9.setBounds(400,460,180,50);
        
        p1.add(tf2);
        tf2.setBounds(190,150,50,50);
        p1.add(tf3);
        tf3.setBounds(190,220,50,50);
        p1.add(tf4);
        tf4.setBounds(700,80,50,50);
        p1.add(tf5);
        tf5.setBounds(700,150,50,50);
        p1.add(tf6);
        tf6.setBounds(700,220,50,50);
        p1.add(tf7);
        tf7.setBounds(470,320,50,50);

        l1=new JLabel("  STOCK ");
        Font f=new Font("Monotype corsiva",30,50);
        l1.setFont(f);
        l1.setForeground(Color.red);
        p4.add(l1);
        l1.setBounds(5,5,400,40);
        
} 	
  public void actionPerformed(ActionEvent e)
 {
   if(e.getSource()==b1)
   {
   	  try
        {
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nms","root","root");
        	Statement s1=con.createStatement();
        	ResultSet r1=s1.executeQuery("select sum(p_qty) from purchase where p_categary='indoor'");
            Statement ss1=con.createStatement();
        	ResultSet rr1=ss1.executeQuery("select sum(p_qty) from Sale where p_categary='indoor'");
             r1.next();
             rr1.next();
             int i1=r1.getInt(1)-rr1.getInt(1);
              tf1.setText(i1+"");
             
  }
  catch(Exception e1)
  {
  }	
   }   
     if(e.getSource()==b2)
   {
     try
        {
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nms","root","root");
        	Statement s2=con.createStatement();
        	ResultSet r2=s2.executeQuery("select sum(p_qty) from purchase where p_categary='outdoor'");
        	Statement ss2=con.createStatement();
        	ResultSet rr2=ss2.executeQuery("select sum(p_qty) from Sale where p_categary='outdoor'");
             r2.next();
             rr2.next();
             int i2=r2.getInt(1)-rr2.getInt(1);
              tf2.setText(i2+"");
             
  }
  catch(Exception e2)
  {
     
   }   
  }
    if(e.getSource()==b3)
   {
   	try
        {
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nms","root","");
        	Statement s3=con.createStatement();
        	ResultSet r3=s3.executeQuery("select sum(p_qty) from purchase where p_categary='semiset'");
        	Statement ss3=con.createStatement();
        	ResultSet rr3=ss3.executeQuery("select sum(p_qty) from Sale where p_categary='semiset'");
             r3.next();
             rr3.next();
             int i3=r3.getInt(1)-rr3.getInt(1);
              tf3.setText(i3+"");
             
  }
  catch(Exception e3)
  {
     
   }   
     
  }   
    if(e.getSource()==b4)
   {
     
     try
        {
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nms","root","");
        	Statement s4=con.createStatement();
        	ResultSet r4=s4.executeQuery("select sum(p_qty) from purchase where p_categary='indoor'");
            Statement ss4=con.createStatement();
        	ResultSet rr4=ss4.executeQuery("select sum(p_qty) from Sale where p_categary='indoor'");
             r4.next();
             rr4.next();
             int i4=r4.getInt(1)-rr4.getInt(1);
              tf4.setText(i4+"");
             
  }
  catch(Exception e4)
  {
     
   }   
   }   
    if(e.getSource()==b5)
   {
     
     try
        {
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nms","root","");
        	Statement s5=con.createStatement();
        	ResultSet r5=s5.executeQuery("select sum(p_qty) from purchase where p_categary='lawn grass'");
        	Statement ss5=con.createStatement();
        	ResultSet rr5=ss5.executeQuery("select sum(p_qty) from Sale where p_categary='lawn grass'");
             r5.next();
             rr5.next();
             int i5=r5.getInt(1)-rr5.getInt(1);
              tf5.setText(i5+"");
             
  }
  catch(Exception e5)
  {
     
   }   
   }   
     if(e.getSource()==b6)
   {
     try
        {
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nms","root","");
        	Statement s6=con.createStatement();
        	ResultSet r6=s6.executeQuery("select sum(p_qty) from purchase where p_categary='border of road'");
        	Statement ss6=con.createStatement();
        	ResultSet rr6=ss6.executeQuery("select sum(p_qty) from Sale where p_categary='border of road'");
             r6.next();
             rr6.next();
             int i6=r6.getInt(1)-rr6.getInt(1);
              tf6.setText(i6+"");
             
  }
  catch(Exception e6)
  {
     
   }   
   }   
    if(e.getSource()==b7)
   {
     try
        {
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nms","root","");
        	Statement s7=con.createStatement();
        	ResultSet r7=s7.executeQuery("select sum(p_qty) from purchase where p_categary='water lilly'");
        	Statement ss7=con.createStatement();
        	ResultSet rr7=ss7.executeQuery("select sum(p_qty) from Sale where p_categary='water lilly'");
             r7.next();
             rr7.next();
             int i7=r7.getInt(1)-rr7.getInt(1);
              tf7.setText(i7+"");
             
  }
  catch(Exception e7)
  {
     
   }   
   }  
    if(e.getSource()==b8)
   {
    dispose();
    dstock d=new dstock();
    d.setVisible(true);
}  
 if(e.getSource()==b9)
 {
 	dispose();
 	Home h=new Home();
 	h.setVisible(true);
} 
}
public static void main(String args[]) 
{
  
  stock s=new stock();
      s.show();
   s.setDefaultCloseOperation(s.EXIT_ON_CLOSE);


 

}
}


 
        