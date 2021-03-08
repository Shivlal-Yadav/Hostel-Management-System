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

public class ViewSalary extends JFrame
{
    private JPanel contentPane;
    private JTextField eid;
    
    public static void main(final String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    final ViewSalary frame = new ViewSalary();
                    frame.setVisible(true);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public ViewSalary() {
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 451, 419);
        (this.contentPane = new JPanel()).setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout(null);
        final JLabel lblEid = new JLabel("EID");
        lblEid.setIcon(new ImageIcon(ViewSalary.class.getResource("/images/manager.png")));
        lblEid.setFont(new Font("Tahoma", 1, 16));
        lblEid.setBounds(43, 128, 79, 32);
        this.contentPane.add(lblEid);
        (this.eid = new JTextField()).setBounds(147, 134, 116, 22);
        this.contentPane.add(this.eid);
        this.eid.setColumns(10);
        final JButton btnSubmit = new JButton("Submit");
        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    final Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "");
                    final String q = "Select * from salary where Eid='" + ViewSalary.this.eid.getText() + "'";
                    final Statement stmt = con.createStatement();
                    final ResultSet rs = stmt.executeQuery(q);
                    if (rs.next()) {
                        final AfterSalaryEID ase = new AfterSalaryEID(ViewSalary.this.eid.getText(), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                        ase.setVisible(true);
                    }
                }
                catch (Exception e2) {
                    System.out.println(e2);
                }
            }
        });
        btnSubmit.setBounds(297, 133, 97, 25);
        this.contentPane.add(btnSubmit);
        final JButton btnViewAll = new JButton("View All");
        btnViewAll.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                final AllSalary as = new AllSalary();
                as.setVisible(true);
            }
        });
        btnViewAll.setBounds(147, 253, 97, 25);
        this.contentPane.add(btnViewAll);
        final JLabel lblViewSalary = new JLabel("VIEW SALARY");
        lblViewSalary.setIcon(new ImageIcon(ViewSalary.class.getResource("/images/search(1).png")));
        lblViewSalary.setFont(new Font("Tahoma", 1, 15));
        lblViewSalary.setBounds(120, 13, 174, 74);
        this.contentPane.add(lblViewSalary);
        final JLabel label = new JLabel("");
        label.setIcon(new ImageIcon(ViewSalary.class.getResource("/images/search.png")));
        label.setBounds(90, 241, 45, 37);
        this.contentPane.add(label);
        final JButton button = new JButton("");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                final EmpSal es = new EmpSal();
                es.show();
                ViewSalary.this.setVisible(false);
            }
        });
        button.setIcon(new ImageIcon(ViewSalary.class.getResource("/images/back.png")));
        button.setBounds(12, 316, 45, 43);
        this.contentPane.add(button);
        final JButton button_1 = new JButton("");
        button_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                ViewSalary.this.setVisible(false);
            }
        });
        button_1.setIcon(new ImageIcon(ViewSalary.class.getResource("/images/house.png")));
        button_1.setBounds(12, 13, 45, 43);
        this.contentPane.add(button_1);
        final JLabel label_1 = new JLabel("");
        label_1.setIcon(new ImageIcon(ViewSalary.class.getResource("/images/ad.jpg")));
        label_1.setBounds(0, 0, 433, 372);
        this.contentPane.add(label_1);
    }
}
