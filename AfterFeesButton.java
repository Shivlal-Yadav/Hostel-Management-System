// 
// Decompiled by Procyon v0.5.36
// 

package proFinal;

import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.LayoutManager;
import java.awt.Container;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.EventQueue;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class AfterFeesButton extends JFrame
{
    private JPanel contentPane;
    
    public static void main(final String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    final AfterFeesButton frame = new AfterFeesButton();
                    frame.setVisible(true);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public AfterFeesButton() {
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 662, 513);
        (this.contentPane = new JPanel()).setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout(null);
        final JButton btnNewButton = new JButton("");
        btnNewButton.setIcon(new ImageIcon(AfterFeesButton.class.getResource("/images/debit-card(1).png")));
        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                final fupdate ap = new fupdate();
                ap.setVisible(true);
                AfterFeesButton.this.setVisible(false);
            }
        });
        btnNewButton.setBounds(244, 159, 65, 59);
        this.contentPane.add(btnNewButton);
        final JButton btnShow = new JButton("");
        btnShow.setIcon(new ImageIcon(AfterFeesButton.class.getResource("/images/search.png")));
        btnShow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                final AfterFeesShow afs = new AfterFeesShow();
                afs.show();
                AfterFeesButton.this.setVisible(false);
            }
        });
        btnShow.setBounds(244, 268, 65, 59);
        this.contentPane.add(btnShow);
        final JLabel lblPay = new JLabel("PAY");
        lblPay.setFont(new Font("Tahoma", 1, 15));
        lblPay.setBounds(350, 180, 38, 16);
        this.contentPane.add(lblPay);
        final JLabel lblShow = new JLabel("SHOW");
        lblShow.setFont(new Font("Tahoma", 1, 16));
        lblShow.setBounds(343, 294, 56, 16);
        this.contentPane.add(lblShow);
        final JButton btnNewButton_1 = new JButton("");
        btnNewButton_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                AfterFeesButton.this.setVisible(false);
            }
        });
        btnNewButton_1.setIcon(new ImageIcon(AfterFeesButton.class.getResource("/images/house.png")));
        btnNewButton_1.setBounds(12, 13, 56, 54);
        this.contentPane.add(btnNewButton_1);
        final JButton btnNewButton_2 = new JButton("");
        btnNewButton_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                AfterFeesButton.this.setVisible(false);
            }
        });
        btnNewButton_2.setIcon(new ImageIcon(AfterFeesButton.class.getResource("/images/back.png")));
        btnNewButton_2.setBounds(12, 384, 56, 54);
        this.contentPane.add(btnNewButton_2);
        final JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon(AfterFeesButton.class.getResource("/images/ad.jpg")));
        lblNewLabel.setBounds(0, 0, 644, 466);
        this.contentPane.add(lblNewLabel);
    }
}
