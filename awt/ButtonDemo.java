package com.awt;
import java.awt.*;
import java.awt.event.*;

public class ButtonDemo extends Frame implements WindowListener,ActionListener {

	    private int numClicks = 0;
        long  startTimer = 0;
        long endTimer = 0;

        public static void main(String[] args) {
                ButtonDemo b = new ButtonDemo("My first window");
                b.setSize(350,100);
                b.setVisible(true);
        }
        public ButtonDemo(String title) {

                super(title);
               setLayout(new FlowLayout());
              //this.setLayout(getLayout());
               // this.setSize(100, 50);
               addWindowListener(this);
              Button  b = new Button("Click me");
                add(b);
               // add(text);
                b.addActionListener(this);
        }

        public void actionPerformed(ActionEvent e) {
                
        	
        	numClicks++;
              
                if(numClicks == 1) {
                	//startTimer = System.currentTimeMillis();
                }
                
                if(numClicks==2) {
                	
                	//endTimer = System.currentTimeMillis();
                	
                	if((endTimer - startTimer)< 500) {
                		numClicks = 0;
                		System.out.println("hi swapnil");
                		
                }
                	else {
                		System.out.println("error");
                	}
                	
                	
                	/*else {
                		System.out.println("U have taking to much time to click :");
                	}
*/
        }
                }
        

        public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
        }

       public void windowOpened(WindowEvent e) {}
        public void windowActivated(WindowEvent e) {}
        public void windowIconified(WindowEvent e) {}
        public void windowDeiconified(WindowEvent e) {}
        public void windowDeactivated(WindowEvent e) {}
        public void windowClosed(WindowEvent e) {}

}