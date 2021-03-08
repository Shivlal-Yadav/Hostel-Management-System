// 
// Decompiled by Procyon v0.5.36
// 

package proFinal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Component;
import java.awt.Font;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.LayoutManager;
import java.awt.Container;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class fupdate extends JFrame
{
    int test;
    private JPanel contentPane;
    private JTextField t1;
    private JLabel lblReceiveAmount;
    private JTextField t2;
    private JButton btnNewButton;
    private JButton btnBack;
    private JButton btnNewButton_1;
    private JLabel lblNewLabel;
    private JLabel lblNewLabel_1;
    
    public static void main(final String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    final fupdate frame = new fupdate();
                    frame.setVisible(true);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public fupdate() {
        super("FEE EDIT");
        this.setResizable(false);
        this.setDefaultCloseOperation(3);
        this.setBounds(100, 100, 662, 513);
        (this.contentPane = new JPanel()).setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout(null);
        final JLabel lblUsn = new JLabel("USN");
        lblUsn.setIcon(new ImageIcon(fupdate.class.getResource("/images/id-card(1).png")));
        lblUsn.setFont(new Font("Tahoma", 1, 22));
        lblUsn.setBounds(283, 110, 87, 23);
        this.contentPane.add(lblUsn);
        (this.t1 = new JTextField()).setBounds(250, 146, 158, 23);
        this.contentPane.add(this.t1);
        this.t1.setColumns(10);
        (this.lblReceiveAmount = new JLabel("RECEIVED AMOUNT")).setIcon(new ImageIcon(fupdate.class.getResource("/images/credit-card(1).png")));
        this.lblReceiveAmount.setFont(new Font("Tahoma", 1, 22));
        this.lblReceiveAmount.setBounds(213, 205, 256, 23);
        this.contentPane.add(this.lblReceiveAmount);
        (this.btnNewButton = new JButton("Submit")).setFont(new Font("Tahoma", 1, 15));
        this.btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent arg0) {
                try {
                    final String usn = fupdate.this.t1.getText();
                    final int paid = Integer.parseInt(fupdate.this.t2.getText());
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "");
                    final String qry = "select usn,paid from fees where usn='" + usn + "'";
                    final Statement stmt = con.createStatement();
                    final ResultSet rs = stmt.executeQuery(qry);
                    if (!rs.next()) {
                        final int[] c = new int[2];
                        c[3] = 5;
                    }
                    final int ppaid = rs.getInt(2);
                    if (paid + ppaid <= 60000) {
                        Class.forName("com.mysql.jdbc.Driver");
                        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "");
                        final String query = " update fees set paid=paid+?,balance=fees-paid where usn=?";
                        final PreparedStatement ps = con.prepareStatement(query);
                        ps.setInt(1, paid);
                        ps.setString(2, usn);
                        ps.execute();
                        JOptionPane.showMessageDialog(null, "Paid SUCCESSFULLY");
                        con.close();
                    }
                }
                catch (ArrayIndexOutOfBoundsException z) {
                    JOptionPane.showMessageDialog(null, "USN NOT FOUND");
                }
                catch (ArithmeticException x) {
                    JOptionPane.showMessageDialog(null, "TOTAL PAID CANT BE MORE THAN 60000");
                }
                catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "USN NOT FOUND");
                }
            }
        });
        this.btnNewButton.setBounds(283, 311, 89, 32);
        this.contentPane.add(this.btnNewButton);
        (this.t2 = new JTextField()).setBounds(250, 241, 158, 23);
        this.contentPane.add(this.t2);
        this.t2.setColumns(10);
        (this.btnBack = new JButton("")).setIcon(new ImageIcon(fupdate.class.getResource("/images/back.png")));
        this.btnBack.setFont(new Font("Tahoma", 1, 13));
        this.btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent arg0) {
                final AfterFeesButton ob1 = new AfterFeesButton();
                ob1.setVisible(true);
                fupdate.this.setVisible(false);
            }
        });
        this.btnBack.setBounds(12, 408, 67, 57);
        this.contentPane.add(this.btnBack);
        (this.btnNewButton_1 = new JButton("")).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                fupdate.this.setVisible(false);
            }
        });
        this.btnNewButton_1.setIcon(new ImageIcon(fupdate.class.getResource("/images/house.png")));
        this.btnNewButton_1.setBounds(12, 13, 67, 57);
        this.contentPane.add(this.btnNewButton_1);
        (this.lblNewLabel = new JLabel("")).setIcon(new ImageIcon(fupdate.class.getResource("/images/checked.png")));
        this.lblNewLabel.setBounds(384, 311, 32, 32);
        this.contentPane.add(this.lblNewLabel);
        (this.lblNewLabel_1 = new JLabel("")).setIcon(new ImageIcon(fupdate.class.getResource("/images/ad.jpg")));
        this.lblNewLabel_1.setBounds(0, 0, 656, 478);
        this.contentPane.add(this.lblNewLabel_1);
    }
}
