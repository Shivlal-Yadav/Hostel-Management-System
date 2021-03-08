// 
// Decompiled by Procyon v0.5.36
// 

package proFinal;

import java.sql.ResultSet;
import java.sql.Statement;
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

public class AfterFeesShow extends JFrame
{
    private JPanel contentPane;
    private JTextField usn;
    
    public static void main(final String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    final AfterFeesShow frame = new AfterFeesShow();
                    frame.setVisible(true);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public AfterFeesShow() {
        this.setDefaultCloseOperation(3);
        this.setBounds(100, 100, 662, 513);
        (this.contentPane = new JPanel()).setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout(null);
        final JLabel lblUsn = new JLabel("USN");
        lblUsn.setIcon(new ImageIcon(AfterFeesShow.class.getResource("/images/id-card(1).png")));
        lblUsn.setFont(new Font("Tahoma", 1, 22));
        lblUsn.setBounds(138, 153, 103, 39);
        this.contentPane.add(lblUsn);
        (this.usn = new JTextField()).setBounds(253, 153, 116, 34);
        this.contentPane.add(this.usn);
        this.usn.setColumns(10);
        final JButton btnNewButton = new JButton("Submit");
        btnNewButton.setFont(new Font("Tahoma", 1, 14));
        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    final Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "");
                    final String q = "Select * from fees where USN='" + AfterFeesShow.this.usn.getText() + "'";
                    final Statement stmt = con.createStatement();
                    final ResultSet rs = stmt.executeQuery(q);
                    AfterFeesShow.this.setVisible(false);
                    if (rs.next()) {
                        final AfterFeesUSN afu = new AfterFeesUSN(AfterFeesShow.this.usn.getText(), rs.getString(2), rs.getString(4), rs.getString(5));
                        afu.setVisible(true);
                    }
                }
                catch (Exception ex) {}
            }
        });
        btnNewButton.setBounds(403, 155, 97, 25);
        this.contentPane.add(btnNewButton);
        final JButton btnSubmit = new JButton("Submit");
        btnSubmit.setFont(new Font("Tahoma", 1, 14));
        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                final ShowAllFee saf = new ShowAllFee();
                saf.show();
                AfterFeesShow.this.setVisible(false);
            }
        });
        btnSubmit.setBounds(253, 265, 97, 25);
        this.contentPane.add(btnSubmit);
        final JLabel lblView = new JLabel("View");
        lblView.setIcon(new ImageIcon(AfterFeesShow.class.getResource("/images/search.png")));
        lblView.setFont(new Font("Tahoma", 1, 22));
        lblView.setBounds(138, 258, 116, 32);
        this.contentPane.add(lblView);
        final JButton btnNewButton_1 = new JButton("");
        btnNewButton_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                AfterFeesShow.this.setVisible(false);
            }
        });
        btnNewButton_1.setIcon(new ImageIcon(AfterFeesShow.class.getResource("/images/house.png")));
        btnNewButton_1.setBounds(12, 13, 54, 50);
        this.contentPane.add(btnNewButton_1);
        final JButton btnNewButton_2 = new JButton("");
        btnNewButton_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                AfterFeesShow.this.setVisible(false);
                final AfterFeesButton afb = new AfterFeesButton();
                afb.setVisible(true);
            }
        });
        btnNewButton_2.setIcon(new ImageIcon(AfterFeesShow.class.getResource("/images/back.png")));
        btnNewButton_2.setBounds(12, 403, 54, 50);
        this.contentPane.add(btnNewButton_2);
        final JLabel label = new JLabel("");
        label.setIcon(new ImageIcon(AfterFeesShow.class.getResource("/images/ad.jpg")));
        label.setBounds(0, 0, 656, 466);
        this.contentPane.add(label);
    }
}
