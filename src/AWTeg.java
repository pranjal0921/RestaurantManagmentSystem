import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class AWTeg extends WindowAdapter{
    Frame f = new Frame();
    AWTeg() {
        f=new Frame();

        f.addWindowListener (this);

        Label l=new Label("UserID:");
        Label l2= new Label("Password:");
        Button b=new Button("LOGIN");
        Button b2=new Button("SIGN UP");
        TextField t=new TextField("");
        TextField t2=new TextField();

        l.setBounds(20, 100, 80, 30);
        l2.setBounds(10, 150, 80, 30);
        t.setBounds(100, 100, 300, 30);
        t2.setBounds(100, 150, 300, 30);
        b.setBounds(200, 250, 80, 30);
        b2.setBounds(90, 250, 80, 30);

        f.add(b);
        f.add(b2);
        f.add(l);
        f.add(l2);
        f.add(t);
        f.add(t2);

        f.setSize(400,300);
        f.setTitle("LOGIN");
        f.setLayout(null);
        f.setVisible(true);

    }
    public void windowClosing (WindowEvent e) {
        f.dispose(); }
    public static void main(String[] args)
    {
        AWTeg a=new AWTeg();
    }
    }