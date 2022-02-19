package com.plants.archive;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.sql.*;
import java.lang.*;
import java.util.Calendar;

public class Rbill extends JFrame implements ActionListener
{
	
     JLabel jLabel1,jLabel2,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,dt,rdt;
     JButton aDelB,aHomeB,aSaveB,aTotalB,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
     JPanel Pan1,Pan2;
     int a1,a2,a3,a4,a5,q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,q11,q12,y1,rr1,rr2,rr3,rr4,rr5,p1;
     float p2,p3,p6,p7,p10,p11,p14,p15,p18,p19,tr1,tr2,tr3,tr4,tr5;
     double p4,p8,p12,p16,p20;
     String d="",m1="",m2="",m3="",m4="";
     JTextField dt1,rdt1,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20,t21,t22,t23,t24,t25,t26,t27; 
     public Rbill()  
  {
  		super("BILL FOR RENT");
  		
                  
        Pan1 = new JPanel();
        Pan2 = new JPanel();
        
        l1= new JLabel();
        l2= new JLabel();
        l3 = new JLabel();
        l4 = new JLabel();
        l5 = new JLabel();
        l6 = new JLabel();
        l7 = new JLabel();
        l8 = new JLabel();
        l9 = new JLabel();
        l10=new JLabel();
        rdt=new JLabel();
        dt=new JLabel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();


        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t4 = new JTextField();
        t5 = new JTextField();
        t6 = new JTextField();
        t7 = new JTextField();
        t8 = new JTextField();
        t9 = new JTextField();
        t10 = new JTextField();
        t11 = new JTextField(); 
        t12 = new JTextField();
        t13 = new JTextField();
        t14 = new JTextField();        
        t15 = new JTextField();
        t16 = new JTextField();
        t17 = new JTextField();
        t18 = new JTextField();
        t19 = new JTextField();
        t20 = new JTextField();
        t21 = new JTextField();
        t22 = new JTextField();
        t23 = new JTextField();
        t24 = new JTextField();
        t25 = new JTextField();
        t26 = new JTextField();
        t27=new JTextField();
        dt1=new JTextField();
        rdt1=new JTextField();
        aSaveB = new JButton();
        aDelB = new JButton();
        aHomeB = new JButton();
        aTotalB = new JButton(); 
        b1=new JButton();
        b2=new JButton();
        b3=new JButton();
        b4=new JButton();
        b5=new JButton();
        b6=new JButton();
        b7=new JButton();
        b8=new JButton();
        b9=new JButton();
        b10=new JButton();
                      
		Container contentPane = getContentPane();
        contentPane.setLayout(null);

        Pan1.setLayout(null);
        Pan1.setBorder(new LineBorder(new Color(153, 51, 0), 2, true));
        Pan1.setForeground(new Color(153, 51, 0));
     
        jLabel1.setFont(new Font("Arial", 1, 24));
        jLabel1.setForeground(new Color(51, 51, 255));
        jLabel1.setText("The Plants World");
        jLabel1.setHorizontalTextPosition(SwingConstants.CENTER);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 5, 350, 40);
       
        jLabel2.setFont(new Font("Arial", 1, 24));
        jLabel2.setForeground(new Color(51, 51, 255));
        jLabel2.setText(" BILL FOR RENT");
        jLabel2.setHorizontalTextPosition(SwingConstants.CENTER);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(180, 45, 250, 40);

        l1.setFont(new Font("Arial", 0, 13));
        l1.setText("NO");
        l1.setMaximumSize(new Dimension(105, 15));
        l1.setMinimumSize(new Dimension(105, 15));
        Pan1.add(l1);
        l1.setBounds(20,40,150,25);

        t1.setFont(new Font("Arial", 0, 13));
        t1.addActionListener(this);
        Pan1.add(t1);
        t1.setBounds(200, 40, 300, 25);
       
        dt.setFont(new Font("Arial", 0, 13));
        dt.setText("IDATE  :");
        dt.setMaximumSize(new Dimension(105, 15));
        dt.setMinimumSize(new Dimension(105, 15));
        Pan1.add(dt);
        dt.setBounds(20,80,90,25);
        
         rdt.setFont(new Font("Arial", 0, 13));
        rdt.setText("RDATE  :");
        rdt.setMaximumSize(new Dimension(105, 15));
        rdt.setMinimumSize(new Dimension(105, 15));
        Pan1.add(rdt);
        rdt.setBounds(230,80,90,25);

        l3.setFont(new Font("Arial", 0, 13));
        l3.setText("CUSTOMER NO");
        l3.setMaximumSize(new Dimension(105, 15));
        l3.setMinimumSize(new Dimension(105, 15));
        Pan1.add(l3);
        l3.setBounds(20,120, 150, 25);

        l4.setFont(new Font("Arial", 0, 13));
        l4.setText("CUSTOMER NAME");
        l4.setMaximumSize(new Dimension(105, 15));
        l4.setMinimumSize(new Dimension(105, 15));
        Pan1.add(l4);
        l4.setBounds(20,160, 150, 25);

        l5.setText("_____________________________________________________________________________________________________________________");
        l5.setBounds(00,160,1200,100);
        Pan1.add(l5);
        
        
        l10.setFont(new Font("Arial",0,13));
        l10.setText("SR.NO");
        l10.setMaximumSize(new Dimension(105,15));
        l10.setMinimumSize(new Dimension(105,15));
        Pan1.add(l10);
        l10.setBounds(35,230,150,25);
       
        l6.setFont(new Font("Arial",0,13));
        l6.setText("QUANTITY");
        l6.setMaximumSize(new Dimension(105,15));
        l6.setMinimumSize(new Dimension(105,15));
        Pan1.add(l6);
        l6.setBounds(140,230,150,25);
        
        l7.setFont(new Font("Arial",0,13));
        l7.setText("PERTICULAR");
        l7.setMaximumSize(new Dimension(105,15));
        l7.setMinimumSize(new Dimension(105,15));
        Pan1.add(l7);
        l7.setBounds(260,230,150,25);
        
        l8.setFont(new Font("Arial",0,13));
        l8.setText("AMOUNT");
        l8.setMaximumSize(new Dimension(105,15));
        l8.setMinimumSize(new Dimension(105,15));
        Pan1.add(l8);
        l8.setBounds(430,230,150,25);
        
        t3.setFont(new Font("Arial", 0, 13));
        t3.addActionListener(this);
        Pan1.add(t3);
        t3.setBounds(200, 120, 300, 25);

        t4.setFont(new Font("Arial", 0, 13));
        t4.addActionListener(this);
        Pan1.add(t4);
        t4.setBounds(200, 160, 300, 25);

        t5.setFont(new Font("Arial", 0, 13));
        t5.addActionListener(this);
        Pan1.add(t5);
        t5.setBounds(20, 260, 80, 25);
        
        
        t6.setFont(new Font("Arial",0,13));
        Pan1.add(t6);
        t6.addActionListener(this);
        t6.setBounds(100,260,140,25);
         
        t7.setFont(new Font("Arial",0,13));
        t7.addActionListener(this);
        Pan1.add(t7);
        t7.setBounds(240,260,140,25);

        t8.setFont(new Font("Arial",0,13));
        t8.addActionListener(this);
        Pan1.add(t8);
        t8.setBounds(410,260,149,25);
                       
                    
        t9.setFont(new Font("Arial",0,13));
        t9.addActionListener(this);
        Pan1.add(t9);
        t9.setBounds(20,285,80,25);   
          
        t10.setFont(new Font("Arial",0,13));
        t10.addActionListener(this);
        Pan1.add(t10);
        t10.setBounds(100,285,140,25);
        
        t11.setFont(new Font("Arial",0,13));
        t11.addActionListener(this);
        Pan1.add(t11);
        t11.setBounds(240,285,140,25);
        
        t12.setFont(new Font("Arial",0,13));
        t12.addActionListener(this);
        Pan1.add(t12);
        t12.setBounds(410,285,149,25);
                
       
              
        t13.setFont(new Font("Arial",0,13));
        t13.addActionListener(this);
        Pan1.add(t13);
        t13.setBounds(20,310,80,25);
        
        t14.setFont(new Font("Arial",0,13));
        t14.addActionListener(this);
        Pan1.add(t14);
        t14.setBounds(100,310,140,25);
        
        t15.setFont(new Font("Arial",0,13));
        t15.addActionListener(this);
        Pan1.add(t15);
        t15.setBounds(240,310,140,25);
        
        t16.setFont(new Font("Arial",0,13));
        t16.addActionListener(this);
        Pan1.add(t16);
        t16.setBounds(410,310,149,25);
               
                     
        t17.setFont(new Font("Arial",0,13));
        t17.addActionListener(this);
        Pan1.add(t17);
        t17.setBounds(20,335,80,25);
        
        t18.setFont(new Font("Arial",0,13));
        t18.addActionListener(this);
        Pan1.add(t18);
        t18.setBounds(100,335,140,25);
        
        t19.setFont(new Font("Arial",0,13));
        t19.addActionListener(this);
        Pan1.add(t19);
        t19.setBounds(240,335,140,25);
        
        t20.setFont(new Font("Arial",0,13));
        t20.addActionListener(this);
        Pan1.add(t20);
        t20.setBounds(410,335,149,25);
              
                  
        t21.setFont(new Font("Arial",0,13));
        t21.addActionListener(this);
        Pan1.add(t21);
        t21.setBounds(410,390,149,25);
        t21.setEditable(false);
        
        t27.setFont(new Font("Arial",0,13));
        t27.addActionListener(this);
        Pan1.add(t27);
        t27.setBounds(410,360,149,25);
       
        
          dt1.setFont(new Font("Arial",0,13));
         Pan1.add(dt1);
         dt1.setBorder(new LineBorder(new Color(0,0,0)));
         dt1.setBounds(90,80,100,25);
         
         rdt1.setFont(new Font("Arial",0,13));
         Pan1.add(rdt1);
         rdt1.setBorder(new LineBorder(new Color(0,0,0)));
         rdt1.setBounds(300,80,100,25);
               
        b5.setText("");
        b5.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        b5.addActionListener(this);
        b5.setBounds(385,261,19,20);
        Pan1.add(b5);
        
        b6.setText("");
        b6.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        b6.addActionListener(this);
        b6.setBounds(385,286,19,20);
        Pan1.add(b6);
        
        b7.setText("");
        b7.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        b7.addActionListener(this);
        b7.setBounds(385,311,19,20);
        Pan1.add(b7);
        
        b8.setText("");
        b8.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        b8.addActionListener(this);
        b8.setBounds(385,336,19,20);
        Pan1.add(b8);
      
        Pan2.add(aSaveB);
        aSaveB.setBounds(80, 20, 60, 20);
        getContentPane();
        add(Pan1);
        Pan1.setBounds(50, 90, 640, 420);

        Pan2.setLayout(null);

        Pan2.setBorder(new LineBorder(new Color(153, 51, 0), 2, true));
        aSaveB.setFont(new Font("Arial", 0, 12));
        aSaveB.setText("SAVE");
        aSaveB.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        aSaveB.addActionListener(this);
        Pan2.add(aSaveB);
        aSaveB.setBounds(80, 20, 60, 20);

        aDelB.setFont(new Font("Arial", 0, 12));
        aDelB.setText("CLEAR");
        aDelB.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        aDelB.addActionListener(this);
        Pan2.add(aDelB);
        aDelB.setBounds(150, 20, 90, 20);

        aHomeB.setFont(new Font("Arial", 0, 12));
        aHomeB.setText("HOME");
        aHomeB.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        aHomeB.addActionListener(this);
        Pan2.add(aHomeB);
        aHomeB.setBounds(250, 20, 100, 20);
        
        b10.setFont(new Font("Arial",0,13));
        b10.setText("LATE CHARGES");
        b10.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        b10.addActionListener(this);
        Pan1.add(b10);
        b10.setBounds(275,365,105,20);
        
        aTotalB.setFont(new Font("Arial",0,13));
        aTotalB.setText("TOTAL");
        aTotalB.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        aTotalB.addActionListener(this);
        Pan1.add(aTotalB);
        aTotalB.setBounds(275,387,105,25);

        contentPane.add(Pan2);
        Pan2.setBounds(50, 513,  640, 60);
        
        Calendar cal=Calendar.getInstance();
        dt1.setText((cal.get(Calendar.DATE))+"/"+(cal.get(Calendar.MONTH)+1)+"/"+(cal.get(Calendar.YEAR)));
        dt1.setEditable(false);  
        setVisible(true);
        setSize(800,800);
        t8.setText("0");
        t12.setText("0");
        t16.setText("0");
        t20.setText("0");
        t27.setText("0"); 
 
        
   
   
 } 	
   
public static void main(String args[]) 
    {
        Rbill r= new Rbill();
        r.setVisible(true);
    }
 
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b5)
       {
       	  
   
   	  try
        {
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nms","root","root");
        	Statement s1=con.createStatement();
        	ResultSet r1=s1.executeQuery("select p_rate from plant where p_name='"+t7.getText()+"'");
            r1.next();
            int p1=r1.getInt(1);
            p2=(float)p1;
            String ss1=t6.getText();
            rr1=Integer.parseInt(ss1);
            p3=(float)rr1;
            p4=p3*p2;
            double i1=p4*(0.5);
            t8.setText(i1+"");
             
  }
  catch(Exception e1)
  {
  }	
       	
        }
         if(e.getSource()==b6)
       {
       	  
   
   	  try
        {
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nms","root","root");
        	Statement s2=con.createStatement();
        	ResultSet r2=s2.executeQuery("select p_rate from plant where p_name='"+t11.getText()+"'");
            r2.next();
            int p5=r2.getInt(1);
            p6=(float)p5;
            String ss2=t10.getText();
            rr2=Integer.parseInt(ss2);
            p7=(float)rr2;
            p8=p7*p6;
            double i2=p8*(0.5);
            t12.setText(i2+"");
             
  }
  catch(Exception e2)
  {
  }	
       	
        }
          if(e.getSource()==b7)
       {
       	  
   
   	  try
        {
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nms","root","root");
        	Statement s3=con.createStatement();
        	ResultSet r3=s3.executeQuery("select p_rate from plant where p_name='"+t15.getText()+"'");
            r3.next();
            int p9=r3.getInt(1);
            p10=(float)p9;
            String ss3=t14.getText();
            rr3=Integer.parseInt(ss3);
            p11=(float)rr3;
            p12=p11*(0.5);
            double i3=p10*p12;
            t16.setText(i3+"");
             
  }
  catch(Exception e3)
  {
  }	
       	
        }
         if(e.getSource()==b8)
       {
       	  
   
   	  try
        {
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nms","root","root");
        	Statement s4=con.createStatement();
        	ResultSet r4=s4.executeQuery("select p_rate from plant where p_name='"+t19.getText()+"'");
            r4.next();
            int p13=r4.getInt(1);
            p14=(float)p13;
            String ss4=t18.getText();
            rr4=Integer.parseInt(ss4);
            p15=(float)rr4;
            p16=p11*(0.5);
            double i4=p14*p16;
            t20.setText(i4+"");
             
  }
  catch(Exception e3)
  {
  }	
       	
       }
     
    	if(e.getSource()==aTotalB)
    	{
    		
    		String s1=t8.getText();
    	   	a1=Integer.parseInt(s1);
    	    tr1=(float)a1;
        	String s2=t12.getText();
            a2=Integer.parseInt(s2);
           tr2=(float)a2;
    		String s3=t16.getText();
    	    a3=Integer.parseInt(s3);
    	    tr3=(float)a3;
    	    String s4=t20.getText();
    	    a4=Integer.parseInt(s4);
    	    tr4=(float)a4;
    	    String s5=t27.getText();
    	    a5=Integer.parseInt(s5);
    	    tr5=(float)a5;
    	    double a6=tr1+tr2+tr3+tr4+tr5;	
    	    t21.setText(a6+"");
           
    	}
    	
    	if(e.getSource()==aHomeB)
    	{
    		dispose();	
            Home h=new Home();
    	}
    	
     if(e.getSource()==aSaveB)
     {
       try
       {
     	       Class.forName("com.mysql.cj.jdbc.Driver");
               Connection c1=DriverManager.getConnection("jdbc:mysql://localhost:3306/nms", "root", "root");
               Statement s5=c1.createStatement();
               String  ss5=("insert into bill_for_rent values('"+t1.getText()+"','"+dt.getText()+"','" +rdt.getText() + "','" +t3.getText() + "','" +t4.getText() + "','" +t6.getText() + "','"+t7.getText() + "','"+t8.getText() +"','"+t27.getText()+"','"+t21.getText()+"')");
               s5.executeUpdate(ss5);
               c1.close();
            
        
	   }
	    catch(Exception ex)
	    {
	    	System.out.println(ex);
	    }
	    
     }
     if(e.getSource()==aDelB)
    	{
    		t1.setText("");
    		t2.setText("");
    		t3.setText("");
    		t4.setText("");
    		t5.setText("");
    		t6.setText("");
    		t7.setText("");
    		t8.setText("");
    		t9.setText("");
    		t10.setText("");
    		t11.setText("");
    		t12.setText("");
    		t13.setText("");
    		t14.setText("");
    		t15.setText("");
    		t16.setText("");
    		t17.setText("");
    		t18.setText("");
    		t19.setText("");
    		t20.setText("");
    		t21.setText("");
    	}
    
   }
     
}
