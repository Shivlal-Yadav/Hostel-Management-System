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
import javax.swing.JComboBox;
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

public class Emp_Update extends JFrame
{
    private JPanel contentPane;
    private JTextField desig;
    private JTextField sal;
    
    public static void main(final String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    final Emp_Update frame = new Emp_Update("", "", "", "", "", "");
                    frame.setVisible(true);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public Emp_Update(final String eid1, final String Name1, final String Designation, final String Department, final String Salary, final String Age) {
        this.setDefaultCloseOperation(3);
        this.setBounds(100, 100, 426, 576);
        (this.contentPane = new JPanel()).setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout(null);
        final JLabel lblEid = new JLabel("Update");
        lblEid.setIcon(new ImageIcon(Emp_Update.class.getResource("/images/change(1).png")));
        lblEid.setFont(new Font("Tahoma", 1, 20));
        lblEid.setBounds(123, 13, 152, 64);
        this.contentPane.add(lblEid);
        final JLabel lblEid_1 = new JLabel("EID");
        lblEid_1.setIcon(new ImageIcon(Emp_Update.class.getResource("/images/employee-card.png")));
        lblEid_1.setFont(new Font("Tahoma", 1, 16));
        lblEid_1.setBounds(35, 116, 65, 32);
        this.contentPane.add(lblEid_1);
        final JLabel eid2 = new JLabel("");
        eid2.setFont(new Font("Tahoma", 1, 16));
        eid2.setBounds(204, 116, 71, 32);
        this.contentPane.add(eid2);
        eid2.setText(eid1);
        final JLabel lblName = new JLabel("NAME");
        lblName.setIcon(new ImageIcon(Emp_Update.class.getResource("/images/sas.png")));
        lblName.setFont(new Font("Tahoma", 1, 16));
        lblName.setBounds(35, 171, 94, 32);
        this.contentPane.add(lblName);
        final JLabel name = new JLabel("");
        name.setFont(new Font("Tahoma", 1, 15));
        name.setBounds(214, 171, 152, 32);
        this.contentPane.add(name);
        name.setText(Name1);
        final JLabel lblDesignation = new JLabel("Designation");
        lblDesignation.setIcon(new ImageIcon(Emp_Update.class.getResource("/images/manager.png")));
        lblDesignation.setFont(new Font("Tahoma", 1, 16));
        lblDesignation.setBounds(35, 236, 133, 32);
        this.contentPane.add(lblDesignation);
        (this.desig = new JTextField()).setBounds(205, 242, 138, 22);
        this.contentPane.add(this.desig);
        this.desig.setColumns(10);
        this.desig.setText(Designation);
        final JLabel lblDepartment = new JLabel("Department");
        lblDepartment.setIcon(new ImageIcon(Emp_Update.class.getResource("/images/portfolio.png")));
        lblDepartment.setFont(new Font("Tahoma", 1, 16));
        lblDepartment.setBounds(35, 302, 138, 26);
        this.contentPane.add(lblDepartment);
        final String[] cids = { "Mess", "Office", "Security" };
        final JComboBox dept = new JComboBox((E[])cids);
        dept.setBounds(204, 305, 101, 23);
        this.contentPane.add(dept);
        final JLabel lblSalary = new JLabel("Salary");
        lblSalary.setIcon(new ImageIcon(Emp_Update.class.getResource("/images/credit-card(1).png")));
        lblSalary.setFont(new Font("Tahoma", 1, 16));
        lblSalary.setBounds(35, 371, 133, 32);
        this.contentPane.add(lblSalary);
        (this.sal = new JTextField()).setBounds(205, 377, 116, 22);
        this.contentPane.add(this.sal);
        this.sal.setColumns(10);
        this.sal.setText(Salary);
        final JLabel lblAge = new JLabel("Age");
        lblAge.setFont(new Font("Tahoma", 1, 16));
        lblAge.setIcon(new ImageIcon(Emp_Update.class.getResource("/images/circular-line-with-word-age-in-the-center(1).png")));
        lblAge.setBounds(35, 434, 94, 32);
        this.contentPane.add(lblAge);
        final JLabel age = new JLabel("");
        age.setFont(new Font("Tahoma", 1, 15));
        age.setBounds(204, 434, 71, 32);
        this.contentPane.add(age);
        age.setText(Age);
        final JButton button = new JButton("");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent arg0) {
                final AfterEmpUpdate aeu = new AfterEmpUpdate();
                aeu.setVisible(true);
                Emp_Update.this.setVisible(false);
            }
        });
        button.setIcon(new ImageIcon(Emp_Update.class.getResource("/images/back.png")));
        button.setBounds(3, 13, 54, 52);
        this.contentPane.add(button);
        final JButton btnSubmit = new JButton("Submit");
        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent arg0) {
                final String text = age.getText();
                final String desig1 = Emp_Update.this.desig.getText();
                final String dept1 = (String)dept.getSelectedItem();
                final String sala1 = Emp_Update.this.sal.getText();
                final String e = eid1;
                if (text.matches("[0-9]+") && sala1.matches("[0-9]+") && Integer.parseInt(text) < 100) {
                    try {
                        final Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "");
                        final PreparedStatement ps123 = con.prepareStatement("Select Paid from Salary Where Eid=?");
                        ps123.setString(1, eid2.getText());
                        final ResultSet rs = ps123.executeQuery();
                        if (rs.next()) {
                            final String bal = rs.getString(1);
                            final int paid = Integer.parseInt(bal);
                            final int sal1 = Integer.parseInt(Emp_Update.this.sal.getText());
                            final int bal2 = sal1 - paid;
                            final String bal3 = Integer.toString(bal2);
                            final PreparedStatement ps124 = con.prepareStatement("Update`Salary`SET Salary=?, Balance=? Where Eid=?");
                            ps124.setString(1, Emp_Update.this.sal.getText());
                            ps124.setString(2, bal3);
                            ps124.setString(3, eid2.getText());
                            ps124.executeUpdate();
                            final String sql = "Update`EMPLOYEE`SET Designation=?,Department=?,Salary=? Where Eid=?";
                            final PreparedStatement ps125 = con.prepareStatement(sql);
                            ps125.setString(2, (String)dept.getSelectedItem());
                            ps125.setString(1, Emp_Update.this.desig.getText());
                            ps125.setString(3, Emp_Update.this.sal.getText());
                            ps125.setString(4, eid2.getText());
                            ps125.executeUpdate();
                            JOptionPane.showMessageDialog(null, "Updated");
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "Employee doesn't exist");
                        }
                        con.close();
                    }
                    catch (Exception e2) {
                        System.out.println(e2);
                    }
                }
                else {
                    JOptionPane.showMessageDialog(null, "Invalid Details");
                }
            }
        });
        btnSubmit.setBounds(145, 491, 97, 25);
        this.contentPane.add(btnSubmit);
        final JLabel label = new JLabel("");
        label.setIcon(new ImageIcon(Emp_Update.class.getResource("/images/ad.jpg")));
        label.setBounds(0, 0, 408, 529);
        this.contentPane.add(label);
    }
}
