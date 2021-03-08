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

public class AfterUpdate extends JFrame
{
    private JPanel contentPane;
    
    public static void main(final String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    final AfterUpdate frame = new AfterUpdate();
                    frame.setVisible(true);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public AfterUpdate() {
        this.setResizable(false);
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 662, 513);
        (this.contentPane = new JPanel()).setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout(null);
        final JLabel lblUpdate = new JLabel("Update");
        lblUpdate.setFont(new Font("Tahoma", 1, 16));
        lblUpdate.setBounds(24, 132, 69, 16);
        this.contentPane.add(lblUpdate);
        final JButton btnUpdate = new JButton("");
        btnUpdate.setIcon(new ImageIcon(AfterUpdate.class.getResource("/images/search(1).png")));
        btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                final AfterShowDetails asd = new AfterShowDetails();
                asd.show();
                AfterUpdate.this.setVisible(false);
            }
        });
        btnUpdate.setBounds(288, 188, 69, 73);
        this.contentPane.add(btnUpdate);
        final JLabel lblShow = new JLabel("Show");
        lblShow.setFont(new Font("Tahoma", 1, 16));
        lblShow.setBounds(286, 132, 56, 16);
        this.contentPane.add(lblShow);
        final JButton btnShow = new JButton("");
        btnShow.setIcon(new ImageIcon(AfterUpdate.class.getResource("/images/saq.png")));
        btnShow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent arg0) {
                final String a = "Hi";
                final AfterUpdateButton aub = new AfterUpdateButton(a);
                aub.show();
                AfterUpdate.this.setVisible(false);
            }
        });
        btnShow.setBounds(24, 188, 69, 73);
        this.contentPane.add(btnShow);
        final JButton btnRemove = new JButton("");
        btnRemove.setIcon(new ImageIcon(AfterUpdate.class.getResource("/images/delete.png")));
        btnRemove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                final AfterStuDelete asd = new AfterStuDelete();
                asd.setVisible(true);
                AfterUpdate.this.setVisible(false);
            }
        });
        btnRemove.setBounds(548, 188, 69, 73);
        this.contentPane.add(btnRemove);
        final JLabel lblRemove = new JLabel("Remove");
        lblRemove.setFont(new Font("Tahoma", 1, 16));
        lblRemove.setBounds(548, 132, 87, 16);
        this.contentPane.add(lblRemove);
        final JButton btnNewButton = new JButton("");
        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                AfterUpdate.this.setVisible(false);
            }
        });
        btnNewButton.setIcon(new ImageIcon(AfterUpdate.class.getResource("/images/back.png")));
        btnNewButton.setBounds(12, 386, 56, 39);
        this.contentPane.add(btnNewButton);
        final JButton button = new JButton("");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                AfterUpdate.this.setVisible(false);
            }
        });
        button.setIcon(new ImageIcon(AfterUpdate.class.getResource("/images/house.png")));
        button.setBounds(12, 13, 56, 39);
        this.contentPane.add(button);
        final JLabel label = new JLabel("");
        label.setIcon(new ImageIcon(AfterUpdate.class.getResource("/images/ad.jpg")));
        label.setBounds(0, 0, 656, 478);
        this.contentPane.add(label);
    }
}
