// 
// Decompiled by Procyon v0.5.36
// 

package proFinal;

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

public class AfterEmpAdd extends JFrame
{
    private JPanel contentPane;
    private JTextField fn;
    private JTextField eid;
    private JTextField des;
    private JTextField sal;
    private JTextField age;
    
    public static void main(final String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    final AfterEmpAdd frame = new AfterEmpAdd();
                    frame.setVisible(true);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public AfterEmpAdd() {
        this.setDefaultCloseOperation(3);
        this.setBounds(100, 100, 547, 547);
        (this.contentPane = new JPanel()).setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout(null);
        final JLabel lblName = new JLabel("Name");
        lblName.setIcon(new ImageIcon(AfterEmpAdd.class.getResource("/images/sas.png")));
        lblName.setFont(new Font("Tahoma", 1, 16));
        lblName.setBounds(91, 92, 90, 34);
        this.contentPane.add(lblName);
        (this.fn = new JTextField()).setBounds(300, 99, 167, 22);
        this.contentPane.add(this.fn);
        this.fn.setColumns(10);
        final JLabel lblEmployeeId = new JLabel("Employee ID");
        lblEmployeeId.setIcon(new ImageIcon(AfterEmpAdd.class.getResource("/images/employee-card.png")));
        lblEmployeeId.setFont(new Font("Tahoma", 1, 16));
        lblEmployeeId.setBounds(91, 147, 149, 22);
        this.contentPane.add(lblEmployeeId);
        (this.eid = new JTextField()).setBounds(300, 148, 116, 22);
        this.contentPane.add(this.eid);
        this.eid.setColumns(10);
        final JLabel lblNewLabel = new JLabel("Designation");
        lblNewLabel.setIcon(new ImageIcon(AfterEmpAdd.class.getResource("/images/manager.png")));
        lblNewLabel.setFont(new Font("Tahoma", 1, 16));
        lblNewLabel.setBounds(91, 194, 149, 34);
        this.contentPane.add(lblNewLabel);
        (this.des = new JTextField()).setBounds(300, 201, 116, 22);
        this.contentPane.add(this.des);
        this.des.setColumns(10);
        final JLabel lblDepartment = new JLabel("Department");
        lblDepartment.setIcon(new ImageIcon(AfterEmpAdd.class.getResource("/images/portfolio.png")));
        lblDepartment.setFont(new Font("Tahoma", 1, 16));
        lblDepartment.setBounds(91, 253, 149, 39);
        this.contentPane.add(lblDepartment);
        final String[] cids = { "Mess", "Office", "Security" };
        final JComboBox<String> dept = new JComboBox<String>(cids);
        dept.setBounds(300, 262, 116, 22);
        this.contentPane.add(dept);
        final JLabel lblSalary = new JLabel("Salary");
        lblSalary.setIcon(new ImageIcon(AfterEmpAdd.class.getResource("/images/debit-card(1).png")));
        lblSalary.setFont(new Font("Tahoma", 1, 16));
        lblSalary.setBounds(91, 317, 149, 34);
        this.contentPane.add(lblSalary);
        (this.sal = new JTextField()).setBounds(300, 324, 116, 22);
        this.contentPane.add(this.sal);
        this.sal.setColumns(10);
        final JLabel lblAge = new JLabel("Age");
        lblAge.setIcon(new ImageIcon(AfterEmpAdd.class.getResource("/images/circular-line-with-word-age-in-the-center(1).png")));
        lblAge.setFont(new Font("Tahoma", 1, 16));
        lblAge.setBounds(91, 379, 90, 34);
        this.contentPane.add(lblAge);
        (this.age = new JTextField()).setBounds(300, 386, 116, 22);
        this.contentPane.add(this.age);
        this.age.setColumns(10);
        final JLabel lblAdd = new JLabel("ADD");
        lblAdd.setIcon(new ImageIcon(AfterEmpAdd.class.getResource("/images/plus.png")));
        lblAdd.setFont(new Font("Tahoma", 1, 24));
        lblAdd.setBounds(186, 0, 167, 66);
        this.contentPane.add(lblAdd);
        final JButton btnSubmit = new JButton("Submit");
        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent arg0) {
                final String text = AfterEmpAdd.this.age.getText();
                final String name = AfterEmpAdd.this.fn.getText();
                final String desig = AfterEmpAdd.this.des.getText();
                final String dept1 = (String)dept.getSelectedItem();
                final String sala = AfterEmpAdd.this.sal.getText();
                final String age1 = AfterEmpAdd.this.age.getText();
                if (age1.matches("[0-9]+") && sala.matches("[0-9]+") && Integer.parseInt(age1) < 100) {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        final Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "");
                        final PreparedStatement ps1 = con.prepareStatement("INSERT INTO `employee` (Eid,Name,Designation,Department,Salary,Age)VALUES (?,?,?,?,?,?)");
                        ps1.setString(1, AfterEmpAdd.this.eid.getText());
                        ps1.setString(2, name);
                        ps1.setString(3, desig);
                        ps1.setString(4, dept1);
                        ps1.setString(5, sala);
                        ps1.setString(6, text);
                        ps1.executeUpdate();
                        final PreparedStatement ps2 = con.prepareStatement("INSERT INTO `salary`(Eid,Name,Salary,Paid,Balance) VALUES (?, ?, ?, ?,?)");
                        ps2.setString(1, AfterEmpAdd.this.eid.getText());
                        ps2.setString(2, name);
                        ps2.setString(3, sala);
                        ps2.setString(4, "0");
                        ps2.setString(5, sala);
                        ps2.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Updated");
                        AfterEmpAdd.this.setVisible(false);
                    }
                    catch (Exception e) {
                        System.out.println(e);
                    }
                }
                else {
                    JOptionPane.showMessageDialog(null, "Invalid Details");
                }
            }
        });
        btnSubmit.setBounds(214, 445, 97, 25);
        this.contentPane.add(btnSubmit);
        final JButton button = new JButton("");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                AfterEmpAdd.this.setVisible(false);
            }
        });
        button.setIcon(new ImageIcon(AfterEmpAdd.class.getResource("/images/house.png")));
        button.setBounds(12, 13, 60, 53);
        this.contentPane.add(button);
        final JButton button_1 = new JButton("");
        button_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                final AfterEmployee ae = new AfterEmployee();
                ae.show();
                AfterEmpAdd.this.setVisible(false);
            }
        });
        button_1.setIcon(new ImageIcon(AfterEmpAdd.class.getResource("/images/back.png")));
        button_1.setBounds(12, 434, 60, 53);
        this.contentPane.add(button_1);
        final JLabel label = new JLabel("");
        label.setIcon(new ImageIcon(AfterEmpAdd.class.getResource("/images/ad.jpg")));
        label.setBounds(0, 0, 529, 500);
        this.contentPane.add(label);
    }
    
    public AfterEmpAdd(final String eid1, final String n, final String desig, final String depat, final String sala, final String Age) {
        this.setDefaultCloseOperation(3);
        this.setBounds(100, 100, 451, 453);
        (this.contentPane = new JPanel()).setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout(null);
        final JLabel lblName = new JLabel("Name");
        lblName.setFont(new Font("Tahoma", 1, 16));
        lblName.setBounds(12, 81, 56, 16);
        this.contentPane.add(lblName);
        (this.fn = new JTextField()).setBounds(162, 79, 116, 22);
        this.contentPane.add(this.fn);
        this.fn.setColumns(10);
        this.fn.setText(n);
        final JLabel lblEmployeeId = new JLabel("Employee ID");
        lblEmployeeId.setFont(new Font("Tahoma", 1, 16));
        lblEmployeeId.setBounds(12, 126, 103, 16);
        this.contentPane.add(lblEmployeeId);
        (this.eid = new JTextField()).setBounds(162, 124, 116, 22);
        this.contentPane.add(this.eid);
        this.eid.setColumns(10);
        this.eid.setEditable(false);
        this.eid.setText(eid1);
        final JLabel lblNewLabel = new JLabel("Designation");
        lblNewLabel.setFont(new Font("Tahoma", 1, 16));
        lblNewLabel.setBounds(12, 169, 103, 20);
        this.contentPane.add(lblNewLabel);
        (this.des = new JTextField()).setBounds(162, 167, 116, 22);
        this.contentPane.add(this.des);
        this.des.setColumns(10);
        this.des.setText(desig);
        final JLabel lblDepartment = new JLabel("Department");
        lblDepartment.setFont(new Font("Tahoma", 1, 16));
        lblDepartment.setBounds(12, 215, 103, 16);
        this.contentPane.add(lblDepartment);
        final String[] cids = { "Mess", "Office", "Security" };
        final JComboBox<String> dept = new JComboBox<String>(cids);
        dept.setBounds(162, 213, 92, 22);
        this.contentPane.add(dept);
        dept.setSelectedItem(depat);
        final JLabel lblSalary = new JLabel("Salary");
        lblSalary.setFont(new Font("Tahoma", 1, 16));
        lblSalary.setBounds(12, 262, 56, 16);
        this.contentPane.add(lblSalary);
        (this.sal = new JTextField()).setBounds(162, 260, 116, 22);
        this.contentPane.add(this.sal);
        this.sal.setColumns(10);
        this.sal.setText(sala);
        final JLabel lblAge = new JLabel("Age");
        lblAge.setFont(new Font("Tahoma", 1, 16));
        lblAge.setBounds(12, 313, 56, 16);
        this.contentPane.add(lblAge);
        (this.age = new JTextField()).setBounds(162, 311, 116, 22);
        this.contentPane.add(this.age);
        this.age.setColumns(10);
        this.age.setText(Age);
        final JLabel lblAdd = new JLabel("Update");
        lblAdd.setFont(new Font("Tahoma", 1, 24));
        lblAdd.setBounds(176, 13, 56, 34);
        this.contentPane.add(lblAdd);
        final JButton btnSubmit = new JButton("Submit");
        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent arg0) {
                final String text = AfterEmpAdd.this.age.getText();
                final String name = n;
                final String desig1 = desig;
                final String dept1 = depat;
                final String sala1 = sala;
                final String age1 = Age;
                final String e = eid1;
                if (age1.matches("[0-9]+") && sala1.matches("[0-9]+") && Integer.parseInt(age1) < 100) {
                    try {
                        final Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "");
                        final String sql = "Update`EMPLOYEE`SET Name=?,Designation=?,Department=?,Salary=? Where Eid=?";
                        final PreparedStatement ps4 = con.prepareStatement(sql);
                        ps4.setString(1, AfterEmpAdd.this.fn.getText());
                        ps4.setString(3, (String)dept.getSelectedItem());
                        ps4.setString(2, AfterEmpAdd.this.des.getText());
                        ps4.setString(4, AfterEmpAdd.this.sal.getText());
                        ps4.setString(5, AfterEmpAdd.this.eid.getText());
                        ps4.executeUpdate();
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
        btnSubmit.setBounds(162, 368, 97, 25);
        this.contentPane.add(btnSubmit);
    }
}
