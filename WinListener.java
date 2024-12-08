package Javacollege;

import java.awt.*;
import java.awt.event.*;
 class WinListener implements  WindowListener {
     Frame f;
     public WinListener()
     {
         f=new Frame();
         f.setSize(500,600);
         f.setVisible(true);
         f.addWindowListener(this);


     }
     public void windowClosing(WindowEvent e)
     {
         System.exit(0);
     }
     public void windowClosed(WindowEvent  e)
     {

     }
     public void windowOpened(WindowEvent e)
     {

     }
     public void windowActivated(WindowEvent e)
     {

     }
     public void windowDeactivated(WindowEvent e)
     {

     }
     public void windowIconified(WindowEvent e)

     {

     }
     public void windowDeiconified(WindowEvent e)
     {

     }
     public static void main(String [] args)
     {
         new WinListener();
     }

}