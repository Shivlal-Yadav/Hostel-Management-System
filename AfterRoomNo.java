// 
// Decompiled by Procyon v0.5.36
// 

package proFinal;

import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.JScrollPane;
import java.awt.LayoutManager;
import java.awt.Container;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.EventQueue;
import javax.swing.JTable;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class AfterRoomNo extends JFrame
{
    private JPanel contentPane;
    private JTable table;
    public Object[][] data;
    
    public static void main(final String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    final AfterRoomNo frame = new AfterRoomNo("54");
                    frame.setVisible(true);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public AfterRoomNo(final String rn) {
        this.data = new Object[500][500];
        this.setResizable(false);
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 662, 513);
        (this.contentPane = new JPanel()).setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout(null);
        final JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(148, 24, 400, 341);
        this.contentPane.add(scrollPane);
        final String[] colNames = { "First Name", "Last Name", "Room Number" };
        this.table = new JTable(this.data, colNames);
        final JButton btnNewButton = new JButton("Show");
        scrollPane.setViewportView(this.table);
        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                try {
                    AfterRoomNo.this.table.setVisible(true);
                    Class.forName("com.mysql.jdbc.Driver");
                    final Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "");
                    final String q = "select * from register where RoomNo='" + rn + "'";
                    final Statement stmt = con.createStatement();
                    final ResultSet qs;
                    final ResultSet rs = qs = stmt.executeQuery(q);
                    int row = 0;
                    int i = 0;
                    while (rs.next()) {
                        AfterRoomNo.this.table.setValueAt(rs.getString("FirstName"), row, 0);
                        AfterRoomNo.this.table.setValueAt(rs.getString("LastName"), row, 1);
                        AfterRoomNo.this.table.setValueAt(rs.getString("RoomNo"), row, 2);
                        ++row;
                        ++i;
                    }
                    if (i == 0) {
                        System.out.println("Wrong");
                    }
                }
                catch (Exception e2) {
                    System.out.println(e2);
                }
            }
        });
        btnNewButton.setBounds(310, 378, 97, 25);
        this.contentPane.add(btnNewButton);
        final JButton btnNewButton_1 = new JButton("");
        btnNewButton_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                AfterRoomNo.this.setVisible(false);
            }
        });
        btnNewButton_1.setIcon(new ImageIcon(AfterRoomNo.class.getResource("/images/house.png")));
        btnNewButton_1.setBounds(12, 13, 53, 58);
        this.contentPane.add(btnNewButton_1);
        final JButton btnNewButton_2 = new JButton("");
        btnNewButton_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                final AfterRoom ar = new AfterRoom();
                ar.setVisible(true);
                AfterRoomNo.this.setVisible(false);
            }
        });
        btnNewButton_2.setIcon(new ImageIcon(AfterRoomNo.class.getResource("/images/back.png")));
        btnNewButton_2.setBounds(12, 385, 53, 58);
        this.contentPane.add(btnNewButton_2);
        final JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon(AfterRoomNo.class.getResource("/images/ad.jpg")));
        lblNewLabel.setBounds(0, 0, 644, 466);
        this.contentPane.add(lblNewLabel);
    }
}
