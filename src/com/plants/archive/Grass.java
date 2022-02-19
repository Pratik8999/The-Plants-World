package com.plants.archive;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Grass extends JFrame implements ActionListener
 {

  public Grass() 
  {
  	super("OTHERS");
  	JButton bok;
  //	JPanel pan1,pan2;
  	
    
    setSize(700,170);
    setLocation(400,250);
    
   // addWindowListener(new BasicWindowMonitor());

    JTable jt = new JTable(new String[][] { 
                             {"PAUDHA LAUN GRASS","MEDIUM fINE","250"},
                              {"ANNUAL BLUE GRASS","MEDIUM FINE", "200"},
                               {"AUGUSTINE GRASS","ROUGH","190"} ,
                               {"BERMUDA GRASS","COARSE","1000"},
                               {"A SPECIAL GRADE LAWN GRASS","MEDIUM","5000"}},
                            new String[] {"GRASS NAME","TEXTURE", "RATE"});
    //jt.setLocation(25, 25);
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

  public static void main(String args[]) {
    Grass g = new Grass();
    g.setVisible(true);
  }
  public void actionPerformed(ActionEvent ae)
  {
  	    String str;
    	str=ae.getActionCommand();
        if(str.equals("BACK"))
          {
    	    	dispose();	
                pdetail fm=new pdetail();
                fm.setVisible(true);
    	  }
		
  }
}
