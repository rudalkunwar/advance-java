import javax.swing.*;
import java.awt.*;
public class Layouts{
    JFrame f = new JFrame("Layouts");
    JLabel l1,l2;
    JTextField t1,t2;
    JButton btn;
    public Layouts(){

    

        l1 = new JLabel("username");
        l2 = new JLabel("password");

        t1 = new JTextField(30);
        t2 = new JTextField(30);

        btn = new JButton("Submit");


        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(btn);

        // FlowLayout fl = new FlowLayout();
        // GridLayout gl = new GridLayout(3,3);
        GridBagLayout gb = new GridBagLayout();

        f.setLayout(gb);
        f.setSize(500,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        new Layouts();
    }
}