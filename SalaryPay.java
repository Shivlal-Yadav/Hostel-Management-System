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

public class SalaryPay extends JFrame
{
    int test;
    private JPanel contentPane;
    private JTextField t1;
    private JLabel lblReceiveAmount;
    private JTextField t2;
    private JButton btnNewButton;
    private JButton btnBack;
    private JButton button;
    private JLabel label;
    
    public static void main(final String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    final SalaryPay frame = new SalaryPay();
                    frame.setVisible(true);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public SalaryPay() {
        super("PAY");
        this.setResizable(false);
        this.setDefaultCloseOperation(3);
        this.setBounds(400, 75, 488, 306);
        (this.contentPane = new JPanel()).setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout(null);
        final JLabel lblUsn = new JLabel("EID");
        lblUsn.setIcon(new ImageIcon(SalaryPay.class.getResource("/images/manager.png")));
        lblUsn.setFont(new Font("Tahoma", 1, 16));
        lblUsn.setBounds(71, 86, 93, 32);
        this.contentPane.add(lblUsn);
        (this.t1 = new JTextField()).setBounds(218, 92, 158, 23);
        this.contentPane.add(this.t1);
        this.t1.setColumns(10);
        (this.lblReceiveAmount = new JLabel("Amount")).setIcon(new ImageIcon(SalaryPay.class.getResource("/images/debit-card(1).png")));
        this.lblReceiveAmount.setFont(new Font("Tahoma", 1, 16));
        this.lblReceiveAmount.setBounds(71, 133, 114, 39);
        this.contentPane.add(this.lblReceiveAmount);
        (this.btnNewButton = new JButton("Submit")).setFont(new Font("Tahoma", 1, 13));
        this.btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent arg0) {
                try {
                    final String eid = SalaryPay.this.t1.getText();
                    final int paid = Integer.parseInt(SalaryPay.this.t2.getText());
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "");
                    final String qry = "select Eid,paid from Salary where Eid='" + eid + "'";
                    final Statement stmt = con.createStatement();
                    final ResultSet rs = stmt.executeQuery(qry);
                    if (!rs.next()) {
                        final int[] c = new int[2];
                        c[3] = 5;
                    }
                    final int ppaid = rs.getInt(2);
                    final String q4 = "select Salary from salary where Eid='" + eid + "'";
                    final Statement stmt2 = con.createStatement();
                    final ResultSet rs2 = stmt.executeQuery(q4);
                    rs2.next();
                    final String sal = rs2.getString(1);
                    final int a = Integer.parseInt(sal);
                    System.out.println(a);
                    System.out.println(paid);
                    System.out.println(ppaid);
                    if (paid + ppaid <= a) {
                        Class.forName("com.mysql.jdbc.Driver");
                        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "");
                        final String query = " update Salary set paid=paid+?,balance=Salary-paid where eid=?";
                        final PreparedStatement ps = con.prepareStatement(query);
                        ps.setInt(1, paid);
                        ps.setString(2, eid);
                        ps.execute();
                        JOptionPane.showMessageDialog(null, "UPDATED SUCCESSFULLY");
                        con.close();
                    }
                }
                catch (ArrayIndexOutOfBoundsException z) {
                    JOptionPane.showMessageDialog(null, z);
                }
                catch (ArithmeticException x) {
                    JOptionPane.showMessageDialog(null, "TOTAL PAID CANT BE MORE THAN 60000");
                }
                catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        });
        this.btnNewButton.setBounds(215, 194, 89, 23);
        this.contentPane.add(this.btnNewButton);
        (this.t2 = new JTextField()).setBounds(218, 142, 158, 23);
        this.contentPane.add(this.t2);
        this.t2.setColumns(10);
        (this.btnBack = new JButton("")).setIcon(new ImageIcon(SalaryPay.class.getResource("/images/back.png")));
        this.btnBack.setFont(new Font("Tahoma", 1, 13));
        this.btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent arg0) {
                final EmpSal ob1 = new EmpSal();
                ob1.setVisible(true);
                SalaryPay.this.setVisible(false);
            }
        });
        this.btnBack.setBounds(12, 222, 48, 36);
        this.contentPane.add(this.btnBack);
        (this.button = new JButton("")).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                SalaryPay.this.setVisible(false);
            }
        });
        this.button.setIcon(new ImageIcon(SalaryPay.class.getResource("/images/house.png")));
        this.button.setBounds(12, 13, 48, 36);
        this.contentPane.add(this.button);
        (this.label = new JLabel("")).setIcon(new ImageIcon(SalaryPay.class.getResource("/images/ad.jpg")));
        this.label.setBounds(3, 0, 479, 271);
        this.contentPane.add(this.label);
    }
}
