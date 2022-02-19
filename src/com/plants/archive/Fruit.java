package com.plants.archive;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Fruit extends JFrame implements ActionListener
 {

  public Fruit() 
  {
  	super("FRUITS");
  	JButton bok;
  
    
    setSize(600, 265);
    setLocation(400,290);
   // addWindowListener(new BasicWindowMonitor());

    JTable jt = new JTable(new String[][] { 
                               {"29", "CHIKU","60"},
                               {"30", "ORANGE","60"},
                               {"31","CUSTARD APPLE","35"}, 
                               {"32","ANJIR","40"},
                               {"33","HAPHUS MANGO","150"},
                               {"34","KESHAR MANGO","90"},
                               {"35","RATNAGIRI HAPHUS MANGO","200"},
                               {"36","BARAMASI MANGO","300"},
                               {"37","SIMPLE COCONUT","40"},
                               {"38","SINGAPURI ALODA","120"},
                               {"39","GUAVA","55","40"}},
                           new String[] {"PLANT_NO", "PLANT_NAME","RATE"});
    jt.setEnabled(false);
    JScrollPane jsp = new JScrollPane(jt);
    getContentPane().add(jsp, BorderLayout.CENTER);
    
    bok=new JButton("BACK");
    bok.setToolTipText("Click Here ToGo MainWinDow");
    bok.setSize(10,30);
    bok.setBounds(250, 150, 100, 20);
    JScrollPane jsp1 = new JScrollPane(bok);
    bok.addActionListener(this);
    getContentPane().add(jsp1, BorderLayout.SOUTH);
    
  }

  public static void main(String args[])
   {
    Fruit f = new Fruit();
    f.setVisible(true);
  }
  public void actionPerformed(ActionEvent ae)
  {
  	    String str;
    	str=ae.getActionCommand();
        if(str.equals("BACK"))
          {
    	    	dispose();	
                Lab l1=new Lab();
                l1.setVisible(true);
    	  }
		
  }
}
