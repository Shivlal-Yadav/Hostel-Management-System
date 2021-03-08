// 
// Decompiled by Procyon v0.5.36
// 

package proFinal;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.LayoutManager;
import java.awt.Container;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.EventQueue;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class EmpSal extends JFrame
{
    private JPanel contentPane;
    
    public static void main(final String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    final EmpSal frame = new EmpSal();
                    frame.setVisible(true);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public EmpSal() {
        this.setDefaultCloseOperation(3);
        this.setBounds(100, 100, 504, 513);
        (this.contentPane = new JPanel()).setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout(null);
        final JButton btnPay = new JButton("Pay");
        btnPay.setFont(new Font("Tahoma", 1, 13));
        btnPay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                final SalaryPay sp = new SalaryPay();
                sp.setVisible(true);
                EmpSal.this.setVisible(false);
            }
        });
        btnPay.setBounds(279, 160, 97, 32);
        this.contentPane.add(btnPay);
        final JLabel lblPay = new JLabel("Pay");
        lblPay.setIcon(new ImageIcon(EmpSal.class.getResource("/images/credit-card(1).png")));
        lblPay.setFont(new Font("Tahoma", 1, 22));
        lblPay.setBounds(80, 155, 127, 32);
        this.contentPane.add(lblPay);
        final JLabel lblShow = new JLabel("Show");
        lblShow.setIcon(new ImageIcon(EmpSal.class.getResource("/images/search.png")));
        lblShow.setFont(new Font("Tahoma", 1, 22));
        lblShow.setBounds(80, 262, 127, 32);
        this.contentPane.add(lblShow);
        final JButton btnShow = new JButton("Show");
        btnShow.setFont(new Font("Tahoma", 1, 13));
        btnShow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                final ViewSalary vs = new ViewSalary();
                vs.setVisible(true);
            }
        });
        btnShow.setBounds(279, 262, 97, 32);
        this.contentPane.add(btnShow);
        final JButton button = new JButton("");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                EmpSal.this.setVisible(false);
            }
        });
        button.setIcon(new ImageIcon(EmpSal.class.getResource("/images/house.png")));
        button.setBounds(12, 13, 51, 49);
        this.contentPane.add(button);
        final JButton button_1 = new JButton("");
        button_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                final AfterEmployee ae = new AfterEmployee();
                ae.show();
                EmpSal.this.setVisible(false);
            }
        });
        button_1.setIcon(new ImageIcon(EmpSal.class.getResource("/images/back.png")));
        button_1.setBounds(12, 404, 51, 49);
        this.contentPane.add(button_1);
        final JLabel label = new JLabel("");
        label.setIcon(new ImageIcon(EmpSal.class.getResource("/images/ad.jpg")));
        label.setBounds(0, 0, 486, 466);
        this.contentPane.add(label);
    }
}
