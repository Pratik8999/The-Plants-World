package com.plants.archive;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Lab extends JFrame implements ActionListener
{
  JPanel p;
  JLabel l1,l2;
  JButton b1,b2,b3,b4,b5;
public Lab()
{
   super("Plants Library");

   p=new JPanel();
   p.setLayout(null);
   p.setBackground(new Color(250,200,255));
   getContentPane().add(p);
   l1=new JLabel("The Plants World");
   l2=new JLabel("Plants Library");
   
   b1=new JButton("Outdoor");
   b2=new JButton("Indoor ");
   b3=new JButton("Hybrid");
   b4=new JButton("Fruits");
   b5=new JButton("BACK");
      
    Font f=new Font("Monotype Corsiva",Font.BOLD,30);
    l1.setFont( f );
    l1.setForeground(Color.red);
    
    l2.setFont(f);
    l2.setForeground(Color.blue);
    
    p.add(l1);
    l1.setBounds(100,15,380,60);
    
    p.add(l2);
    l2.setBounds(140,70,380,60);
    
    p.add(b1);
    b1.setBounds(90,180,150,30);
    
    p.add(b2);
    b2.setBounds(320,180,150,30);
    
    p.add(b3);
    b3.setBounds(90,250,150,30);
    
    p.add(b4);
    b4.setBounds(320,250,150,30);
    
    p.add(b5);
    b5.setBounds(210,320,150,30);

     b1.addActionListener(this);
     b2.addActionListener(this);
     b3.addActionListener(this);
     b4.addActionListener(this);
     b5.addActionListener(this);

    setVisible(true);
    setSize(600,400);
    setLocation(390,180);
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
public void actionPerformed(ActionEvent e)
{
   
  if(e.getSource()==b1)
  {
	  dispose();
      new Indoor();

  }	
  if(e.getSource()==b2)
  {
	 dispose();
  	new Outdoor();

  }	
  if(e.getSource()==b3)
  {
	 dispose();
  	Semiset s=new Semiset();
  	s.setVisible(true);
  }	
  if(e.getSource()==b4)
  {
	 dispose();
  	Fruit f=new Fruit();
  	f.setVisible(true);
  }	
  if(e.getSource()==b5)
  
     {
       
       pdetail p=new pdetail();
        p.setVisible(true);
        dispose();
      }
   }
public static void main(String args[])
{
      Lab l1=new Lab();
      l1.show();
     
}
} 




