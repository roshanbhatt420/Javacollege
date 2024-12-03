package Javacollege;
import java.awt.*;
import java.awt.event.*;
class First implements  ActionListener{
    Frame  f;
    Button b;
    TextField t;
    public First()
    {
        f= new Frame("title");
        b= new Button("CLICK ME");
        t=new TextField();
        t.setBounds(150,150,150,150);
        b.setBounds(250,250,15,15);
        f.setSize(500,600);
        f.add(t);
        f.add(b);
        b.setForeground(Color.BLUE);
        f.setVisible(true);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {

    }
    public static void main(String [] args)
    {
        new First();
    }

}
