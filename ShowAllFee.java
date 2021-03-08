// 
// Decompiled by Procyon v0.5.36
// 

package proFinal;

import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.awt.Component;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.LayoutManager;
import java.awt.BorderLayout;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.EventQueue;
import javax.swing.JTable;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class ShowAllFee extends JFrame
{
    private JPanel contentPane;
    private JTable table;
    public Object[][] data;
    
    public static void main(final String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    final ShowAllFee frame = new ShowAllFee();
                    frame.setVisible(true);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public ShowAllFee() {
        this.data = new Object[500][500];
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 580, 484);
        (this.contentPane = new JPanel()).setBorder(new EmptyBorder(5, 5, 5, 5));
        this.contentPane.setLayout(new BorderLayout(0, 0));
        this.setContentPane(this.contentPane);
        final JButton btnShow = new JButton("Show");
        final String[] colNames = { "USN", "Name", "Fees", "Paid", "Balance" };
        final JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(100, 80, 400, 341);
        this.contentPane.add(scrollPane);
        scrollPane.setViewportView(this.table = new JTable(this.data, colNames));
        try {
            Class.forName("com.mysql.jdbc.Driver");
            final Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "");
            final String q = "Select * from fees";
            final PreparedStatement ps1 = con.prepareStatement(q);
            final ResultSet rs = ps1.executeQuery(q);
            int row = 0;
            while (rs.next()) {
                this.table.setValueAt(rs.getString("USN"), row, 0);
                this.table.setValueAt(rs.getString("Name"), row, 1);
                this.table.setValueAt(rs.getString("Fees"), row, 2);
                this.table.setValueAt(rs.getString("Paid"), row, 3);
                this.table.setValueAt(rs.getString("Balance"), row, 4);
                ++row;
            }
        }
        catch (Exception e2) {
            System.out.println(e2);
        }
    }
}
