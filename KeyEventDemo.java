import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class KeyEventDemo implements KeyListener{

    JFrame f = new JFrame("Key event ");
    JTextField f1 = new JTextField(30);
    JLabel lbl = new JLabel("Key : ");

    public KeyEventDemo(){

        lbl.setBounds(200,100,100,30);
        f1.setBounds(200,120,100,30);

        f.add(f1);
        f.add(lbl);

        f1.addKeyListener(this);

        f.setVisible(true);
        f.setSize(600,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void keyPressed(KeyEvent e){

        String txt = f1.getText();
        lbl.setText(txt);

    }
    public void keyReleased(KeyEvent e){
       lbl.setText("release");
    }
    public void keyTyped(KeyEvent e){
     String txt = f1.getText();
        lbl.setText(txt);
    }

    public static void main(String[] args){
        new KeyEventDemo();
    }
    
}