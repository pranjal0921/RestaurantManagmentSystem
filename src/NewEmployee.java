import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;

public class NewEmployee  extends WindowAdapter  {

        JFrame f=new JFrame();
        NewEmployee() {
            f=new JFrame();

            JLabel l=new JLabel("STAFF ID:");
            JLabel l2=new JLabel("FIRST NAME:");
            JLabel l3=new JLabel("LAST NAME:");
            JLabel l4=new JLabel("ADDRESS:");
            JLabel l5=new JLabel("PHONE NO:");
            JLabel l6=new JLabel("DATE OF BIRTH:");
            JLabel l7=new JLabel("DATE OF JOINING:");
            JLabel l8=new JLabel("SALARY:");
            JLabel l9=new JLabel("SHIFT:");
            JLabel l10=new JLabel("DATE OF LEAVING:");
            JTextField t=new JTextField();
            JTextField t2=new JTextField();
            JTextField t3=new JTextField();
            JTextField t4=new JTextField();
            JTextField t5=new JTextField();
            JTextField t6=new JTextField();
            JTextField t7=new JTextField();
            JTextField t8=new JTextField();
            JTextField t9=new JTextField();
            JTextField t10=new JTextField();
            JButton b=new JButton("SUBMIT");

            JButton b1=new JButton("BACK");
            b1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    f.dispose();
                }
            });

            l.setBounds(100, 100, 100, 30);
            l2.setBounds(100, 150, 100, 30);
            l3.setBounds(100, 200, 100, 30);
            l4.setBounds(100, 250, 100, 30);
            l5.setBounds(100, 300, 100, 30);
            l6.setBounds(100, 350, 100, 30);
            l7.setBounds(100, 400, 100, 30);
            l8.setBounds(100, 450, 100, 30);
            l9.setBounds(100, 500, 100, 30);
            l10.setBounds(100, 550, 120, 30);
            t.setBounds(400, 100, 100, 30);
            t2.setBounds(400, 150, 300, 30);
            t3.setBounds(400, 200, 300, 30);
            t4.setBounds(400, 250, 300, 30);
            t5.setBounds(400, 300, 150, 30);
            t6.setBounds(400, 350, 150, 30);
            t7.setBounds(400, 400, 150, 30);
            t8.setBounds(400, 450, 150, 30);
            t9.setBounds(400, 500, 150, 30);
            t10.setBounds(400, 550, 150, 30);
            b.setBounds(250, 600, 80, 30);
            b1.setBounds(350, 600, 80, 30);

            f.add(l);
            f.add(l2);
            f.add(l3);
            f.add(l4);
            f.add(l5);
            f.add(l6);
            f.add(l7);
            f.add(l8);
            f.add(l9);
            f.add(l10);
            f.add(t);
            f.add(t2);
            f.add(t3);
            f.add(t4);
            f.add(t5);
            f.add(t6);
            f.add(t7);
            f.add(t8);
            f.add(t9);
            f.add(t10);
            f.add(b);
            f.add(b1);

            f.addWindowListener(this);
            f.setSize(3000,3000);
            f.setTitle("ADD EMPLOYEE");
            f.setLayout(null);
            f.setVisible(true);
        }
        public void windowClosing (WindowEvent e) {
            f.dispose(); }

        public static void main(String[] args) throws Exception {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/javaproject";
            String username = "root";
            String password = "12345";

            Connection con = DriverManager.getConnection(url, username, password);
            if (con != null) {
                System.out.println("Database Connected successfully");
            } else {
                System.out.println("Database Connection failed");
            }
            NewEmployee m=new NewEmployee();
        }
    }