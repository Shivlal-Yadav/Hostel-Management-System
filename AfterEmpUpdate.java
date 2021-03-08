// 
// Decompiled by Procyon v0.5.36
// 

package proFinal;

import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;
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

public class AfterEmpUpdate extends JFrame
{
    private JPanel contentPane;
    private JTextField eid;
    
    public static void main(final String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    final AfterEmpUpdate frame = new AfterEmpUpdate();
                    frame.setVisible(true);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public AfterEmpUpdate() {
        this.setDefaultCloseOperation(3);
        this.setBounds(100, 100, 419, 300);
        (this.contentPane = new JPanel()).setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout(null);
        final JLabel lblEid = new JLabel("Employee ID");
        lblEid.setIcon(new ImageIcon(AfterEmpUpdate.class.getResource("/images/manager.png")));
        lblEid.setFont(new Font("Tahoma", 1, 15));
        lblEid.setBounds(71, 84, 130, 32);
        this.contentPane.add(lblEid);
        (this.eid = new JTextField()).setBounds(221, 90, 116, 22);
        this.contentPane.add(this.eid);
        this.eid.setColumns(10);
        final JButton btnSubmit = new JButton("Submit");
        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                final String o = AfterEmpUpdate.this.eid.getText();
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    final Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "");
                    final String query = "Select * from employee where eid=?";
                    final PreparedStatement ps = con.prepareStatement(query);
                    ps.setString(1, o);
                    final ResultSet rs = ps.executeQuery();
                    if (rs.next()) {
                        final String Name = rs.getString(2);
                        final String Designation = rs.getString(3);
                        final String Department = rs.getString(4);
                        final String Salary = rs.getString(5);
                        final String Age = rs.getString(6);
                        final Emp_Update aefn = new Emp_Update(AfterEmpUpdate.this.eid.getText(), Name, Designation, Department, Salary, Age);
                        aefn.show();
                        AfterEmpUpdate.this.setVisible(false);
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Invalid Details");
                    }
                }
                catch (Exception e2) {
                    System.out.println(e2);
                }
            }
        });
        btnSubmit.setBounds(221, 137, 97, 25);
        this.contentPane.add(btnSubmit);
        final JButton btnNewButton = new JButton("");
        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                AfterEmpUpdate.this.setVisible(false);
            }
        });
        btnNewButton.setIcon(new ImageIcon(AfterEmpUpdate.class.getResource("/images/house.png")));
        btnNewButton.setBounds(12, 13, 54, 47);
        this.contentPane.add(btnNewButton);
        final JButton button = new JButton("");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                final AfterEmployee ae = new AfterEmployee();
                ae.show();
                AfterEmpUpdate.this.setVisible(false);
            }
        });
        button.setIcon(new ImageIcon(AfterEmpUpdate.class.getResource("/images/back.png")));
        button.setBounds(12, 180, 54, 60);
        this.contentPane.add(button);
        final JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon(AfterEmpUpdate.class.getResource("/images/checked.png")));
        lblNewLabel.setBounds(332, 130, 38, 32);
        this.contentPane.add(lblNewLabel);
        final JLabel label = new JLabel("");
        label.setIcon(new ImageIcon(AfterEmpUpdate.class.getResource("/images/ad.jpg")));
        label.setBounds(0, 0, 401, 253);
        this.contentPane.add(label);
    }
}
