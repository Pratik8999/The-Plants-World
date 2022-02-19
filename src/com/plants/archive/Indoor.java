package com.plants.archive;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Indoor extends JFrame implements ActionListener
{

    public Indoor()
    {
        super("Outdoor Plants");
        JButton bok;

        setSize(600, 220);
        setLocation(430,270);

        JTable jt = new JTable(new String[][] {
                {"01", "DRESSINA","100"},
                {"02", "PETRA","120"},
                {"03","ESPA GRASS","70"},
                {"04","DYEFERN","90"},
                {"05","CELLUM","400"},
                {"06","STEPLERRA","120"},
                {"07","ELPINA","150"},
                {"08","ZEBRINA","110"}},
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


        setSize(600, 220);
        setLocation(430,270);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

     public void actionPerformed(ActionEvent ae)
    {
        if(ae.getActionCommand().equalsIgnoreCase("BACK"))
        {
            dispose();
            new Lab();

        }

    }
}
