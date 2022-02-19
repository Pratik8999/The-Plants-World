package com.plants.archive;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Semiset extends JFrame implements ActionListener
 {

  public Semiset() 
  {
  	super("HYBRID");
  	JButton bok;
  
    
    setSize(400, 154);
    setLocation(499,290);
   // addWindowListener(new BasicWindowMonitor());

    JTable jt = new JTable(new String[][] { 
                               {" 25 ", " OKRA "," 120 "},
                               {" 26 ", " EARLY SUNGLOW "," 150 "},
                               {" 27 "," OLYMPIA "," 370 "}, 
                               {" 28 "," TEA ROSE "," 250 "}},
                           new String[] {" PLANT_NO ", " PLANT_NAME "," RATE "});
    jt.setEnabled(false);
    JScrollPane jsp = new JScrollPane(jt);
    getContentPane().add(jsp, BorderLayout.CENTER);
    
    
    bok=new JButton("BACK");
    bok.setToolTipText("Go To Main WinDow");
    bok.setSize(10,30);
    bok.setBounds(250, 150, 100, 20);
    JScrollPane jsp1 = new JScrollPane(bok);
    bok.addActionListener(this);
    getContentPane().add(jsp1, BorderLayout.SOUTH);
    
  }

  public static void main(String args[]) {
    Semiset s = new Semiset();
    s.setVisible(true);
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
