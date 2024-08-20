import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class AdapterDemo{
    JFrame f = new JFrame("Adapter demo");
    JButton btn = new JButton("Click");
    JLabel lbl = new JLabel("Click");
    public AdapterDemo(){


        lbl.setBounds(100,100,100,20);
        btn.setBounds(100,130,100,20);
        f.add(lbl);
        f.add(btn);

        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                lbl.setText("Button clicked");
            }
        });

        btn.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
                lbl.setText("mouse pressed");
            }
        });


        f.setVisible(true);
        f.setSize(500,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new AdapterDemo();
    }
}