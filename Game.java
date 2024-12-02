package Javacollege;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Game implements MouseListener{
    JFrame f;
    JButton[][] buttons =new JButton[3][3];
    int count=0;
    Game()
    {
        f=new JFrame();
        f.setSize(500,600 );
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++)
            {
                buttons[i][j]= new JButton();
                f.add(buttons[i][j]);
                buttons[i][j].addMouseListener(this);
                buttons[i][j].setEnabled(false);
                buttons[i][j].setFocusable(false);

            }
            f.setLayout(new GridLayout(3, 3));
        }
        f.setVisible(true);
    }
    public void mouseClicked(MouseEvent e) {
        count++;
        Object source = e.getSource();
        if (source instanceof JButton) {
            JButton clickedButton = (JButton) source;
            if (clickedButton.getText().isEmpty()) {
                if (count % 2 == 0) {

                    clickedButton.setText("X");

                } else {
                    // Cast the source to a JButton
                    clickedButton.setText("O");
                }
            }
        }
    }
    @Override
    public void mousePressed(MouseEvent e) {
    }
    @Override
    public void mouseReleased(MouseEvent e) {
    }
    @Override
    public void mouseEntered(MouseEvent e) {
    }
    @Override
    public void mouseExited(MouseEvent e)
    {
    }
}

