import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
public class Welcome{

        private JFrame f;
        private JButton b, b2;
        private JLabel l, l2;
        private JTextField t;
        private JPasswordField p;
        Welcome() {
            f=new JFrame();
            l=new JLabel("UserID:");
            l2= new JLabel("Password:");
            b=new JButton("LOGIN");
            b.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    PreparedStatement ps;
                    ResultSet rs;
                    String userID = t.getText();
                    String password = String.valueOf(p.getPassword());
                    try {
                        String query = "SELECT * FROM `new_login` WHERE `userID` =? AND `password` =?";
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaproject", "root", "12345");
                        ps = con.prepareStatement(query);
                        ps.setString(1, userID);
                        ps.setString(2, password);
                        rs = ps.executeQuery();
                        if(rs.next())
                        {
                            f.setVisible(true);
                            f.pack();
                            f.setLocationRelativeTo(null);
                            f.setExtendedState(JFrame.MAXIMIZED_BOTH);
                            this.dispose();
                        } else{
                            JOptionPane.showMessageDialog(null, "Incorrect Username Or Password", "Login Failed", 2);
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
                private void dispose() {}
            });

            b2=new JButton("SIGN UP");
            b2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    f.dispose();
                    new Project1();
                }
            });

            t=new JTextField("");
            p=new JPasswordField();
            JCheckBox c=new JCheckBox("Login as Manager");
            JCheckBox c1=new JCheckBox("Show Password");

            //set location and size
            l.setBounds(500, 200, 80, 30);
            l2.setBounds(500, 250, 80, 30);
            t.setBounds(600, 200, 300, 30);
            p.setBounds(600, 250, 300, 30);
            b.setBounds(780, 350, 80, 30);
            b2.setBounds(630, 350, 80, 30);
            c.setBounds(580, 300, 150, 30);
            c1.setBounds(750, 300, 150, 30);

            //add component to container
            f.add(b);
            f.add(b2);
            f.add(l);
            f.add(l2);
            f.add(t);
            f.add(p);
            f.add(c);
            f.add(c1);
            f.getContentPane().add(b2);



            f.setSize(3000,3000);
            f.setTitle("LOGIN");
            f.setLayout(null);
            f.setVisible(true);

            JPanel p=new JPanel();
            p.setBounds(490, 120, 490, 300);
            f.add(p);
            p.setBackground(Color.lightGray);
        }


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
            Welcome w=new Welcome();
        }
    }