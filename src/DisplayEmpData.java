import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Vector;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class DisplayEmpData {

    public static void main(String[] args){
        JTable table=new JTable(10, 5);
        JScrollPane s= new JScrollPane(table);
    }
}
