// 
// Decompiled by Procyon v0.5.36
// 

package proFinal;

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

public class AfterStuDelete extends JFrame
{
    private JPanel contentPane;
    private JTextField textField;
    
    public static void main(final String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    final AfterStuDelete frame = new AfterStuDelete();
                    frame.setVisible(true);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public AfterStuDelete() {
        this.setDefaultCloseOperation(3);
        this.setBounds(100, 100, 552, 513);
        (this.contentPane = new JPanel()).setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout(null);
        final JLabel lblUsn = new JLabel("USN");
        lblUsn.setIcon(new ImageIcon(AfterStuDelete.class.getResource("/images/id-card(1).png")));
        lblUsn.setFont(new Font("Tahoma", 1, 24));
        lblUsn.setBounds(235, 136, 104, 45);
        this.contentPane.add(lblUsn);
        (this.textField = new JTextField()).setBounds(185, 194, 195, 22);
        this.contentPane.add(this.textField);
        this.textField.setColumns(10);
        final JButton btnDelete = new JButton("Delete");
        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent arg0) {
                final String u = AfterStuDelete.this.textField.getText();
                final DeleteDialog dg = new DeleteDialog(u);
                dg.setVisible(true);
            }
        });
        btnDelete.setBounds(246, 275, 97, 25);
        this.contentPane.add(btnDelete);
        final JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon(AfterStuDelete.class.getResource("/images/delete-photo.png")));
        lblNewLabel.setBounds(197, 268, 32, 32);
        this.contentPane.add(lblNewLabel);
        final JButton button = new JButton("");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                AfterStuDelete.this.setVisible(false);
                final AfterUpdate au = new AfterUpdate();
                au.setVisible(true);
            }
        });
        button.setIcon(new ImageIcon(AfterStuDelete.class.getResource("/images/back.png")));
        button.setBounds(25, 393, 56, 45);
        this.contentPane.add(button);
        final JButton btnNewButton = new JButton("");
        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                AfterStuDelete.this.setVisible(false);
            }
        });
        btnNewButton.setIcon(new ImageIcon(AfterStuDelete.class.getResource("/images/house.png")));
        btnNewButton.setBounds(12, 13, 56, 45);
        this.contentPane.add(btnNewButton);
        final JLabel label = new JLabel("");
        label.setIcon(new ImageIcon(AfterStuDelete.class.getResource("/images/ad.jpg")));
        label.setBounds(0, 0, 534, 466);
        this.contentPane.add(label);
    }
}
