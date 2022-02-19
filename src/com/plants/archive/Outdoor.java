package com.plants.archive;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Outdoor extends JFrame implements ActionListener
 {

  public Outdoor() 
  {
  	super("Indoor Plants");
  	JButton bok;
  
    
    JTable jt = new JTable(new String[][] {
                               {"09", "PITONIA","15"},
                               {"10", "SALVIA","15"},
                               {"11","GAJENIA","15"}, 
                               {"12","HIBISCUS","20"},
                               {"13","JASVAND","30"},
                               {"14","PENTAS","50"},
                               {"15","SONCHAFA","300"},
                               {"16","SHEVANTI","15"},
                               {"17","KANTIA PALM","300"},
                               {"18","PONEX PALM","100"},
                               {"19","ARIKA PALM","500"},
                               {"20","TABLE PALM","80"},
                               {"21","BLACK ROSE","25"},
                               {"22","EUROPIAN ROSE","35"},
                               {"23","FLORY ROSE","49"},
                               {"24","KASHMIRI ROSE","60"}},
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

    setSize(600, 347);
    setLocation(400,190);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
  }

  public static void main(String args[]) {
    Outdoor o = new Outdoor();
    o.setVisible(true);
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
