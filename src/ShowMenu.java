import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
public class ShowMenu implements ActionListener {
    JFrame f;
    JTable t;
    JButton b, b1;

    public ShowMenu() {
        f = new JFrame();

        JLabel l1 = new JLabel("CATEGORY:");
        JLabel l2 = new JLabel("ITEM ID:");
        JLabel l3 = new JLabel("ITEM NAME:");
        JLabel l4 = new JLabel("PRICE:");
        t = new JTable();

        b = new JButton("ALL");
        b.addActionListener(this);
        b1 = new JButton("APPETIZERS");
        JButton b2 = new JButton("MAIN");
        JButton b3 = new JButton("DRINKS");
        JButton b4 = new JButton("DESSERT");
        JButton b5 = new JButton("BACK");


        l1.setBounds(100, 100, 90, 30);
        l2.setBounds(200, 100, 90, 30);
        l3.setBounds(300, 100, 90, 30);
        l4.setBounds(630, 100, 90, 30);
        t.setBounds(90, 150, 750, 350);
        b.setBounds(100, 500, 100, 30);
        b1.setBounds(210, 500, 120, 30);
        b2.setBounds(340, 500, 100, 30);
        b3.setBounds(450, 500, 110, 30);
        b4.setBounds(570, 500, 100, 30);
        b5.setBounds(680, 500, 80, 30);

        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(t);
        f.add(b);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(3000, 3000);
        f.setTitle("MENU");
        f.setLayout(null);
        f.setVisible(true);
    }
    //button click event
        public void actionPerformed(ActionEvent e){
            b = (JButton) e.getSource();
            getOperation();
        }
        public void getOperation ()
        {
            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaproject", "root", "12345");
                String sql = "select * from menu";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                DefaultTableModel model = new DefaultTableModel(new String[]{"type", "menuID", "item_name", "item_price"}, 0);

                while (rs.next()) {
                    String type = rs.getString("type");
                    String menuID = rs.getString("menuID");
                    String item_name = rs.getString("item_name");
                    String item_price = rs.getString("item_price");
                    model.addRow(new String[]{type, menuID, item_name, item_price});
                }
                JScrollPane scrollPane = new JScrollPane();
                scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
                JTable table = new JTable(model);
                scrollPane.setViewportView(table);
                //JFrame frame = new JFrame("Table Column Add");
                //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                //frame.setBounds(100, 100, 600, 300);
                f.add(scrollPane);
                f.setVisible(true);
                /*t.setModel(model);
                JScrollPane scrollPane = new JScrollPane(t);
                scrollPane.setVisible(true);
                f.add(scrollPane);*/

            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Error",
                        JOptionPane.ERROR_MESSAGE);
            }

    }

    //Connection to database
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
        ShowMenu m = new ShowMenu();
    }
}