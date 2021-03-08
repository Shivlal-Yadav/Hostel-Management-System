// 
// Decompiled by Procyon v0.5.36
// 

package proFinal;

import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.awt.Component;
import java.awt.Font;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.LayoutManager;
import java.awt.Container;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.EventQueue;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class AfterUpdateButton extends JFrame
{
    private JPanel contentPane;
    private JTextField usn;
    
    public static void main(final String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    final AfterUpdateButton frame = new AfterUpdateButton("sa");
                    frame.setVisible(true);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public AfterUpdateButton(final String a) {
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 662, 513);
        (this.contentPane = new JPanel()).setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout(null);
        final JLabel lblUsn = new JLabel("USN");
        lblUsn.setIcon(new ImageIcon(AfterUpdateButton.class.getResource("/images/id-card(1).png")));
        lblUsn.setFont(new Font("Tahoma", 1, 24));
        lblUsn.setBounds(182, 173, 91, 32);
        this.contentPane.add(lblUsn);
        (this.usn = new JTextField()).setBounds(283, 179, 116, 22);
        this.contentPane.add(this.usn);
        this.usn.setColumns(10);
        final JButton btnNewButton = new JButton("Submit");
        btnNewButton.setFont(new Font("Tahoma", 1, 15));
        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                final String o = AfterUpdateButton.this.usn.getText();
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    final Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "");
                    final String query = "Select * from register where usn=?";
                    final PreparedStatement ps = con.prepareStatement(query);
                    ps.setString(1, o);
                    final ResultSet rs = ps.executeQuery();
                    if (rs.next()) {
                        final String FirstName = rs.getString(1);
                        final String LastName = rs.getString(2);
                        final String USN = rs.getString(3);
                        final String DOB = rs.getString(4);
                        final String CourseId = rs.getString(5);
                        final String Contact = rs.getString(6);
                        final String Email = rs.getString(7);
                        final String PName = rs.getString(8);
                        final String PLName = rs.getString(9);
                        final String PContact = rs.getString(10);
                        final String RoomNo = rs.getString(11);
                        final AfterStuUpdate ar1 = new AfterStuUpdate(FirstName, LastName, USN, CourseId, Contact, Email, PContact, RoomNo);
                        ar1.show();
                    }
                }
                catch (Exception e2) {
                    System.out.println(e2);
                }
            }
        });
        btnNewButton.setBounds(283, 242, 97, 25);
        this.contentPane.add(btnNewButton);
        final JLabel label = new JLabel("");
        label.setIcon(new ImageIcon(AfterUpdateButton.class.getResource("/images/checked.png")));
        label.setBounds(403, 235, 37, 32);
        this.contentPane.add(label);
        final JButton btnNewButton_1 = new JButton("");
        btnNewButton_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                AfterUpdateButton.this.setVisible(false);
            }
        });
        btnNewButton_1.setIcon(new ImageIcon(AfterUpdateButton.class.getResource("/images/house.png")));
        btnNewButton_1.setBounds(12, 13, 47, 36);
        this.contentPane.add(btnNewButton_1);
        final JButton button = new JButton("");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                final AfterUpdate au = new AfterUpdate();
                au.setVisible(true);
                AfterUpdateButton.this.setVisible(false);
            }
        });
        button.setIcon(new ImageIcon(AfterUpdateButton.class.getResource("/images/back.png")));
        button.setBounds(12, 417, 47, 36);
        this.contentPane.add(button);
        final JLabel label_1 = new JLabel("");
        label_1.setIcon(new ImageIcon(AfterUpdateButton.class.getResource("/images/ad.jpg")));
        label_1.setBounds(0, 0, 644, 466);
        this.contentPane.add(label_1);
    }
}
