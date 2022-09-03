import javax.swing.*;
import java.awt.event.*;
public class Pro{
    private JFrame f = new JFrame("Login");
    private JButton bok = new JButton("OK");

    public Pro() {

        f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        f.getContentPane().add(bok);

        bok.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                f.dispose();
                new Project1();
            }
        });
        f.setSize(100,100);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new Pro();
    }
}