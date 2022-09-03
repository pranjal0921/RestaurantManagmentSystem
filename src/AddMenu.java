import java.awt.*;
import javax.swing.*;

public class AddMenu {
        JFrame f=new JFrame();
        AddMenu() {

            f = new JFrame();

            JLabel l1 = new JLabel("MENU ID:");
            JLabel l2 = new JLabel("ITEM NAME:");
            JLabel l3 = new JLabel("PRICE:");
            JLabel l4 = new JLabel("TYPE:");
            JTextField t=new JTextField();
            JTextField t1=new JTextField();
            JTextField t2=new JTextField();
            Choice c=new Choice();
            JButton b = new JButton("ADD");
            JButton b1=new JButton("BACK");

            l1.setBounds(100, 100, 50, 30);
            l2.setBounds(100, 150, 80, 30);
            l3.setBounds(100, 200, 80, 30);
            l4.setBounds(100, 250, 50, 30);
            t.setBounds(200, 100, 150, 30);
            t1.setBounds(200, 150, 150, 30);
            t2.setBounds(200, 200, 150, 30);
            c.setBounds(200, 250, 150, 30);
            b.setBounds(150, 300, 80, 30);
            b1.setBounds(250, 300, 80, 30);

            c.add("MAIN");
            c.add("APPETIZERS");
            c.add("DRINKS");
            c.add("DESSERT");


            f.add(l1);
            f.add(l2);
            f.add(l3);
            f.add(l4);
            f.add(t);
            f.add(t1);
            f.add(t2);
            f.add(b);
            f.add(b1);
            f.add(c);


            f.setSize(3000,3000);
            f.setTitle("ADD ITEM IN MENU");
            f.setLayout(null);
            f.setVisible(true);
        }
        public static void main(String[] args){
            AddMenu m=new AddMenu();
        }
    }