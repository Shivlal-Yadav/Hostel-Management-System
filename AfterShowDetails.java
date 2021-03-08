// 
// Decompiled by Procyon v0.5.36
// 

package proFinal;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Component;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.LayoutManager;
import java.awt.Container;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.EventQueue;
import javax.swing.JTable;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class AfterShowDetails extends JFrame
{
    private JPanel contentPane;
    private JTable table;
    public Object[][] data;
    
    public static void main(final String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    final AfterShowDetails frame = new AfterShowDetails();
                    frame.setVisible(true);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public AfterShowDetails() {
        this.data = new Object[500][500];
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 614, 515);
        (this.contentPane = new JPanel()).setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout(null);
        final JButton btnShow = new JButton("Show");
        final String[] colNames = { "First Name", "Last Name", "USN", "Contact", "Email" };
        final JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(100, 80, 400, 341);
        this.contentPane.add(scrollPane);
        scrollPane.setViewportView(this.table = new JTable(this.data, colNames));
        btnShow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    final Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "");
                    final String q = "call testrout";
                    final PreparedStatement ps1 = con.prepareStatement(q);
                    final ResultSet rs = ps1.executeQuery(q);
                    int row = 0;
                    while (rs.next()) {
                        AfterShowDetails.this.table.setValueAt(rs.getString("FirstName"), row, 0);
                        AfterShowDetails.this.table.setValueAt(rs.getString("LastName"), row, 1);
                        AfterShowDetails.this.table.setValueAt(rs.getString("USN"), row, 2);
                        AfterShowDetails.this.table.setValueAt(rs.getString("contact"), row, 3);
                        AfterShowDetails.this.table.setValueAt(rs.getString("email"), row, 4);
                        ++row;
                    }
                }
                catch (Exception e2) {
                    System.out.println(e2);
                }
            }
        });
        btnShow.setFont(new Font("Tahoma", 1, 13));
        btnShow.setBounds(257, 13, 97, 41);
        this.contentPane.add(btnShow);
        final JLabel label = new JLabel("");
        label.setIcon(new ImageIcon(AfterShowDetails.class.getResource("/images/search(1).png")));
        label.setBounds(181, 0, 64, 67);
        this.contentPane.add(label);
        final JButton btnNewButton = new JButton("");
        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                AfterShowDetails.this.setVisible(false);
            }
        });
        btnNewButton.setIcon(new ImageIcon(AfterShowDetails.class.getResource("/images/house.png")));
        btnNewButton.setBounds(12, 13, 55, 54);
        this.contentPane.add(btnNewButton);
        final JButton button = new JButton("");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                final AfterUpdate au = new AfterUpdate();
                au.show();
                AfterShowDetails.this.setVisible(false);
            }
        });
        button.setIcon(new ImageIcon(AfterShowDetails.class.getResource("/images/back.png")));
        button.setBounds(12, 405, 55, 54);
        this.contentPane.add(button);
        final JLabel label_1 = new JLabel("");
        label_1.setIcon(new ImageIcon(AfterShowDetails.class.getResource("/images/ad.jpg")));
        label_1.setBounds(0, 0, 596, 468);
        this.contentPane.add(label_1);
    }
}
