package com.plants.archive;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.util.Calendar;
import java.sql.*;
public class dstock extends JFrame implements ActionListener
{
  Connection con;
  Statement stmt;
  ResultSet rs,resultt1;
  boolean flag=false;
  boolean flag1=false;
  JPanel p1,p2,p3,p4,p5;
  JButton b1,b2,b3,b4,b5,b6,b7;
  JLabel dt,l1,l2,l3,l5,l,l4;
  JTextField dt1,tf1,tf2,tf3,tf4,tf5;
  JTextArea ta1;
//  JFrame frame;
   public dstock()
   {
  //  frame=new JFrame();
    l=new JLabel("DETAIL STOCK");
    p3=new JPanel();
    dt=new JLabel("Date   :");
    dt1=new JTextField();
    p1=new JPanel();
    l2=new JLabel("SEARCH FOR  ");
    l3=new JLabel("  PLANT NAME     :");
    l5=new JLabel("CATAGERY ");
   
    
     tf3=new JTextField();
     tf4=new JTextField();
     
      p2=new JPanel();
      l4=new JLabel("STOCK");
      tf5=new JTextField();
      
       p4=new JPanel();
       b1=new JButton();
       b2=new JButton();
       b3=new JButton();
       b4=new JButton();
       b5=new JButton();
       b6=new JButton();
       b7=new JButton();
       
       
      tf3=new JTextField();
      p5=new JPanel();  
      
      Container contentPane=getContentPane();
     contentPane.setLayout(null);
     //contentPane.setBackground(new Color(250,170,255));
      
       l.setFont(new Font("Arial",1,25));
       l.setForeground(new Color(200,0,0));
        l.setHorizontalTextPosition(SwingConstants.CENTER);
        contentPane.add(l);
        l.setBounds(300,10,250,30);
       
         p3.setLayout(null);
         dt.setFont(new Font("Arial",1,14));
         p3.add(dt);
         dt.setBounds(10,0,60,20);
         
         dt1.setFont(new Font("Arial",1,13));
         p3.add(dt1);
         dt1.setBorder(new LineBorder(new Color(0,0,0)));
         dt1.setBounds(60,0,80,17);
         
         contentPane.add(p3);
         p3.setBounds(30,30,250,30);
         
         contentPane.add(p1);
         p1.setLayout(null);
         p1.setBackground(new Color(204,204,255));
         p1.setFont(new Font("Arial",1,14));
         p1.setForeground(new Color(51,51,51));
         p1.setBorder(new LineBorder(new Color(0,0,0),2,true));
        
         p1.setBounds(30,70,370,310);
  
         l2.setFont(new Font("Arial",1,22));
         l2.setForeground(new Color(255,51,51));
         p1.add(l2); 
        
         
         l3.setFont(new Font("Arial",1,13));
         p1.add(l3);
         l3.setBounds(10,100,120,15);
         


         l5.setFont(new Font("Arial",1,13));
         p1.add(l5);
         l5.setBounds(10,180,120,15);
         
       
         
         tf3.setFont(new Font("Arial",1,12));
         tf3.setBorder(new LineBorder(new Color(0,0,0)));
         p1.add(tf3);
         tf3.setBounds(150,180,190,20);
        
          
         p1.add(tf4); 
         tf4.setFont(new Font("Arial",1,12));
         tf4.setBorder(new LineBorder(new Color(0,0,0)));
         p1.add(tf4);
         tf4.setBounds(150,100,190,20);
         
       
         
         contentPane.add(p1);
         p1.setBounds(30,70,370,310);
         
         p2.setLayout(null);
         p2.setBackground(new Color(204,204,255));
         p2.setBorder(new LineBorder(new Color(0,0,0),2,true));
         
         l4.setFont(new Font("Arial",1,22));
         l4.setBackground(new Color(255,51,51));
         p2.add(l4);
         l4.setBounds(120,20,170,19);

             
         tf5.setFont(new Font("Arial",1,12));
         tf5.setBorder(new LineBorder(new Color(0,0,0)));
         p2.add(tf5);
         tf5.setBounds(110,80,120,80);

       
        b4.setFont(new Font("Arial",1,12));
        b4.setText("SEARCH");
       // b4.setMnemonic('e');
        b4.setForeground(new Color(255,51,51));
        b4.setBorder(new LineBorder(new Color(0,0,0),1,true));
        p2.add(b4);
        b4.addActionListener(this);
        b4.setBounds(130,250,80,40);
        
        contentPane.add(p2);
        p2.setBounds(420,70,370,310);
         
        p5.setLayout(null);
        p5.setBackground(new Color(204,204,255));
        p5.setBorder(new LineBorder(new Color(0,0,0),2,true));
        p5.setForeground(new Color(51,51,51));
        contentPane.add(p5); 
        p5.setBounds(160,410,400,60);  
          
        b2.setFont(new Font("Arial",1,12));
        b2.setText("SAVE");
        b2.setMnemonic('s');
        //b1.setForeground(new Color(255,51,51));
        b2.setBorder(new LineBorder(new Color(0,0,0),1,true));
        p5.add(b2);
        b2.addActionListener(this);
        b2.setBounds(270,20,80,30);
     
        b1.setFont(new Font("Arial",1,12));
        b1.setText("NEW");
        b1.setMnemonic('n');
        //b1.setForeground(new Color(255,51,51));
        b1.setBorder(new LineBorder(new Color(0,0,0),1,true));
        p5.add(b1);
        b1.addActionListener(this);
        b3.addActionListener(this);
        b1.setBounds(160,20,80,30);
    
       b6.setFont(new Font("Arial",1,12));
        b6.setText("BACK");
        b6.setMnemonic('b');
        //b1.setForeground(new Color(255,51,51));
        b6.setBorder(new LineBorder(new Color(0,0,0),1,true));
        p5.add(b6);
     b6.addActionListener(this);
        b6.setBounds(50,20,80,30);

        
        setVisible(true);
         setSize(800,570);

         Calendar cal=Calendar.getInstance();
         dt1.setText((cal.get(Calendar.DATE))+"/"+(cal.get(Calendar.MONTH)+1)+"/"+(cal.get(Calendar.YEAR)));
         dt1.setEditable(false);  
}

void exitForm(WindowEvent evt)
{
   System.exit(0);
}
public void actionPerformed(ActionEvent e)
{
  if(e.getSource()== b6)
  {
    dispose();
    stock j=new stock();
    j.setVisible(true);
  }
  if(e.getSource()== b4)
  {
    String categary=tf3.getText();
    if(categary.equals(""))
     JOptionPane.showMessageDialog(null,"ENTER ITEM CODE");
     try
     {
         	
     	Class.forName("com.mysql.cj.jdbc.Driver");
     	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nms?useSSL=false","root","root");
     	Statement s1=con.createStatement();
     	ResultSet r1=s1.executeQuery("select sum(p_qty) from purchase where p_categary='"+tf3.getText()+"' and p_name='"+tf4.getText()+"'");
     	r1.next();
     	Statement s2=con.createStatement();
     	ResultSet r2=s2.executeQuery("Select sum(p_qty) from Sale where p_categary='"+tf3.getText()+"'and p_name='"+tf4.getText()+"'");
     	r2.next();
     	tf5.setFont(new Font("Arial",0,56));
     	int i1=r1.getInt(1)-r2.getInt(1);
     	tf5.setText(i1+"");
  }
  catch(Exception e1)
  {
  }
 } 	

if(e.getSource()==b1)
{
	
	tf4.setText("");
	tf3.setText("");
	tf5.setText("");
}
	
if(e.getSource()==b2)
{

		try
		{
		 Class.forName("com.mysql.cj.jdbc.Driver");
               Connection c1=DriverManager.getConnection("jdbc:mysql://localhost:3306/nms?useSSL=false", "root", "root");
               Statement s1=c1.createStatement();
               String  ss1=("insert into d_stock values('"+tf4.getText()+"','"+tf3.getText()+"','"+tf5.getText()+"')");
               
               s1.executeUpdate(ss1);                                             
               c1.close();	
               
           	JOptionPane.showMessageDialog(null,"RECORD SAVED SUCESSFULLY!");
           	
           	tf4.setText("");
        	tf3.setText("");
        	tf5.setText("");
		
		}
		catch(SQLException ex)
		{
		}
		catch(ClassNotFoundException ex)
		{
		}
		catch(Exception e2)	
		{
		}
}
/*	else
	{
		JOptionPane.showMessageDialog(dstock.this,"check all fields","","JOptionPane.INFORMATION_MESSAGE);
	}*/
 

}						
public static void main(String args[])
{
   dstock d=new dstock();
    d.show();
   d.setDefaultCloseOperation(d.EXIT_ON_CLOSE);
}

}       