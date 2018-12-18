package com.awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.utility.Utility;

import java.awt.*;

public class ButtonEX implements ActionListener
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame frame = new Frame("This is first demo ");
		Button b = new Button("Click here");
		
	//	b.setBounds(x, y, width, height);
		b.setBounds(50 ,30,70,30);
		frame.add(b);
		b.addActionListener(null);
		frame.setSize(400, 400);
	    frame.setLayout(null);
	    frame.setVisible(true);
		b.show(true);
		b.setEnabled(true);
		b.addActionListener();
		
		
	}
	public void ActionListner() 
	 {                                         
	  int clicked = 0;
	  clicked++;
	  if(clicked == 2) {
		  System.out.println("hiii");
	  }
	  System.out.println(clicked);
	 }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	} 
	
 
}
