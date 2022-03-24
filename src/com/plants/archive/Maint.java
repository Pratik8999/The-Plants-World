package com.plants.archive;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;
public class Maint extends JFrame implements ActionListener
{
	public Maint()
	{
	super("MAINTAINANCE");

    setLayout(null);

  	JButton home;
  	JPanel Pan1,Pan2;
  	JLabel l;
  	Pan1=new JPanel();
  	Pan2=new JPanel();
  	l=new JLabel();
    

   // addWindowListener(new BasicWindowMonitor());
     
    String val = " \nNURSERY SPENT LOT OF EFFORTS ON MAINTAINANCE OF PLANTS WHICH INCLUDE: :\n"+ 
                  "\n * CUTTING  \n" +
                  " * WATERING  \n"+
                  " * PROVIDING FERTILIZERS  \n"+
                  " * SRAYING OF ANTI-FUNGAL,ANTI-BACTERIAL \n"+
                  "  \n\n    SPRAYS IN ORDER TO CONTROL THE PEST AND DISEASE.\n"+
                  "      THE PLANTATION PERIOD OF EVERY PLANT IS OF ABOUT 2 TO 3 MONTHS.DURING THIS PERIOD\n"+
                  " CUTTING OF EVERY PLANT WAS DONE AFTER 15 DAYS TO REMOVE DEAD LEAVES,INFECTED BRANCHES \n"+
                  " AND LEAVES.WITHIN THIS 15 DAYS PERIOD ALSO PROVIDED FERTILIZERS TO ENHANCE THE GROWTH \n"+
                  " AND TO OBTAIN HEALTHY PLANTS.ALSO VARIOUS DISINFECTED SPRAYS ARE SPRAYED TO CONTROL EARLY\n"+
                  "INFECTION OF YOUNG PLANT";                  

                      JTextArea text=new JTextArea(val,20,40);
                      text.setEditable(false);
                      text.setForeground(Color.blue);
    

    
      l.setFont(new Font("Mon0.1111otype Corsiva",Font.BOLD, 30));
      l.setForeground(Color.red);
      l.setText("The Plants World");
      l.setHorizontalTextPosition(SwingConstants.CENTER);
      getContentPane().add(l);
      l.setBounds(190, 10, 350, 50);
    
    Pan1.setBorder(new LineBorder(new Color(153, 51, 0), 2, true));
    Pan1.setForeground(new Color(153, 51, 0));
    Pan1.add(text);
    getContentPane();
    add(Pan1);
    Pan1.setBounds(40, 60, 670, 335);

    Pan2.setLayout(null);
    Pan2.setBorder(new LineBorder(new Color(153, 51, 0), 2, true));
    Pan2.setBounds(40, 400,  670, 60);
    add(Pan2);
    
    home=new JButton("HOME");
    home.setSize(10,30);
    home.setBounds(20,20,20,20);
    home.addActionListener(this);
    Pan2.add(home);
    home.setBounds(250, 20, 100, 20);


    setSize(750, 515);
    setLocation(400,150);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  }


  public void actionPerformed(ActionEvent ae)
  {
  	    String str;
    	str=ae.getActionCommand();
        if(str.equals("HOME"))
          {
    	       dispose();	
               Home fm=new Home();
    	  }
		
  }
}