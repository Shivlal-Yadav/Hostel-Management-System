// 
// Decompiled by Procyon v0.5.36
// 

package proFinal;

import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import com.mysql.jdbc.Connection;
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
import javax.swing.JPanel;
import javax.swing.JFrame;

public class DeleteDialog extends JFrame
{
    private JPanel contentPane;
    
    public static void main(final String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    final DeleteDialog frame = new DeleteDialog("");
                    frame.setVisible(true);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public DeleteDialog(final String USN) {
        this.setDefaultCloseOperation(3);
        this.setBounds(100, 100, 372, 248);
        (this.contentPane = new JPanel()).setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout(null);
        final JLabel lblNewLabel = new JLabel("Do you want to delete this record?");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\shubh\\Desktop\\dbms_pro_img\\warning.png"));
        lblNewLabel.setFont(new Font("Tahoma", 0, 16));
        lblNewLabel.setBounds(25, 38, 298, 29);
        this.contentPane.add(lblNewLabel);
        final JButton btnNewButton = new JButton("No");
        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                DeleteDialog.this.setVisible(false);
            }
        });
        btnNewButton.setBounds(38, 124, 97, 25);
        this.contentPane.add(btnNewButton);
        final JButton btnNewButton_1 = new JButton("Yes");
        btnNewButton_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    final Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "");
                    final String sql1 = "SELECT COUNT(*) AS total FROM register WHERE USN =?";
                    final PreparedStatement ps3 = con.prepareStatement(sql1);
                    ps3.setString(1, USN);
                    final ResultSet rs = ps3.executeQuery();
                    if (rs.next()) {
                        final int c = rs.getInt("total");
                        System.out.println(c);
                        if (c >= 1) {
                            final String sql2 = "DELETE FROM register WHERE USN=?";
                            final PreparedStatement ps4 = con.prepareStatement(sql2);
                            ps4.setString(1, USN);
                            ps4.executeUpdate();
                            final String sq = "DELETE FROM fees WHERE USN=?";
                            final PreparedStatement ps5 = con.prepareStatement(sq);
                            ps5.setString(1, USN);
                            ps5.executeUpdate();
                            DeleteDialog.this.setVisible(false);
                            final AfterStuDelete asd = new AfterStuDelete();
                            asd.setVisible(true);
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "Unsuccessful");
                        }
                    }
                }
                catch (Exception e2) {
                    System.out.println("ded" + e2);
                }
            }
        });
        btnNewButton_1.setBounds(213, 124, 97, 25);
        this.contentPane.add(btnNewButton_1);
    }
}
