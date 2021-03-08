// 
// Decompiled by Procyon v0.5.36
// 

package proFinal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.LayoutManager;
import java.awt.Container;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.EventQueue;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class AfterEmployee extends JFrame
{
    private JPanel contentPane;
    
    public static void main(final String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    final AfterEmployee frame = new AfterEmployee();
                    frame.setVisible(true);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public AfterEmployee() {
        this.setDefaultCloseOperation(3);
        this.setBounds(100, 100, 540, 516);
        (this.contentPane = new JPanel()).setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout(null);
        final JLabel lblAdd = new JLabel("Add");
        lblAdd.setFont(new Font("Tahoma", 1, 16));
        lblAdd.setBounds(48, 141, 56, 25);
        this.contentPane.add(lblAdd);
        final JLabel lblUpdate = new JLabel("Update");
        lblUpdate.setFont(new Font("Tahoma", 1, 16));
        lblUpdate.setBounds(214, 141, 69, 25);
        this.contentPane.add(lblUpdate);
        final JLabel lblSalary = new JLabel("Salary");
        lblSalary.setFont(new Font("Tahoma", 1, 16));
        lblSalary.setBounds(401, 141, 56, 25);
        this.contentPane.add(lblSalary);
        final JButton btnNewButton = new JButton("");
        btnNewButton.setIcon(new ImageIcon(AfterEmployee.class.getResource("/images/user.png")));
        btnNewButton.setBounds(35, 179, 82, 82);
        this.contentPane.add(btnNewButton);
        final JButton btnNewButton_1 = new JButton("");
        btnNewButton_1.setIcon(new ImageIcon(AfterEmployee.class.getResource("/images/contract.png")));
        btnNewButton_1.setBounds(215, 179, 82, 82);
        this.contentPane.add(btnNewButton_1);
        final JButton btnNewButton_2 = new JButton("");
        btnNewButton_2.setIcon(new ImageIcon(AfterEmployee.class.getResource("/images/hand.png")));
        btnNewButton_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent arg0) {
                final EmpSal es = new EmpSal();
                es.setVisible(true);
                AfterEmployee.this.setVisible(false);
            }
        });
        btnNewButton_2.setBounds(395, 179, 82, 82);
        this.contentPane.add(btnNewButton_2);
        final JButton button = new JButton("");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                AfterEmployee.this.setVisible(false);
            }
        });
        button.setIcon(new ImageIcon(AfterEmployee.class.getResource("/images/house.png")));
        button.setBounds(12, 13, 56, 57);
        this.contentPane.add(button);
        final JButton button_1 = new JButton("");
        button_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                AfterEmployee.this.setVisible(false);
            }
        });
        button_1.setIcon(new ImageIcon(AfterEmployee.class.getResource("/images/back.png")));
        button_1.setBounds(12, 399, 56, 57);
        this.contentPane.add(button_1);
        final JLabel label = new JLabel("");
        label.setIcon(new ImageIcon(AfterEmployee.class.getResource("/images/ad.jpg")));
        label.setBounds(0, 0, 522, 469);
        this.contentPane.add(label);
        btnNewButton_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent arg0) {
                final AfterEmpUpdate aeu = new AfterEmpUpdate();
                aeu.setVisible(true);
                AfterEmployee.this.setVisible(false);
            }
        });
        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent arg0) {
                final AfterEmpAdd aeA = new AfterEmpAdd();
                aeA.setVisible(true);
                AfterEmployee.this.setVisible(false);
            }
        });
    }
}
