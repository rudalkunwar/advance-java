import javax.swing.*;
public class Comp extends JFrame{
       public Comp(){

            JCheckBox cb1,cb2;
            JRadioButton rb1,rb2;
            JComboBox cmb;

           DefaultListModel<String> list = new DefaultListModel<String>();
           list.addElement("Nepal");
           list.addElement("India");
           list.addElement("China");

            JList<String> l1 = new JList <> (list);


            cb1 = new JCheckBox("Science");
            cb2 = new JCheckBox("Math");

            rb1 = new JRadioButton("Male");
            rb2 = new JRadioButton("Female");
            ButtonGroup bg = new ButtonGroup();

            bg.add(rb1);
            bg.add(rb2);

            String[] name = {"rudal","aaksh","pratik"};

            cmb = new JComboBox(name);


            cb1.setBounds(100,100,100,20);
            cb2.setBounds(200,100,100,20);
            rb1.setBounds(100,200,100,20);
            rb2.setBounds(200,200,100,20);
            l1.setBounds(200,300,50,20);
            cmb.setBounds(200,400,50,20);

            add(cb1);
            add(cb2);
            add(rb1);
            add(rb2);
            add(l1);
            add(cmb);


            setVisible(true);
            setSize(500,400);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            
        }
    public static void main(String[] args){
     new Comp();
    }
}