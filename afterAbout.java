// 
// Decompiled by Procyon v0.5.36
// 

package proFinal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
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

public class afterAbout extends JFrame
{
    private JPanel contentPane;
    
    public static void main(final String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    final afterAbout frame = new afterAbout();
                    frame.setVisible(true);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public afterAbout() {
        this.setDefaultCloseOperation(3);
        this.setBounds(100, 100, 450, 300);
        (this.contentPane = new JPanel()).setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout(null);
        final JLabel lblAToolMade = new JLabel("A tool made for the hostel admins to manage the hostel ");
        lblAToolMade.setFont(new Font("Sitka Text", 1, 15));
        lblAToolMade.setBounds(12, 87, 420, 38);
        this.contentPane.add(lblAToolMade);
        final JLabel lblEasilyAndMake = new JLabel(" easily and make their work easy!");
        lblEasilyAndMake.setFont(new Font("Sitka Text", 1, 15));
        lblEasilyAndMake.setBounds(78, 138, 269, 16);
        this.contentPane.add(lblEasilyAndMake);
        final JLabel lblV = new JLabel("v6.9 2018-19");
        lblV.setFont(new Font("Sitka Text", 0, 13));
        lblV.setBounds(326, 224, 81, 16);
        this.contentPane.add(lblV);
        final JLabel lblAbout = new JLabel("About");
        lblAbout.setIcon(new ImageIcon(afterAbout.class.getResource("/images/manager.png")));
        lblAbout.setFont(new Font("Segoe UI Light", 1, 19));
        lblAbout.setBounds(164, 13, 115, 32);
        this.contentPane.add(lblAbout);
        final JButton btnOk = new JButton("OK");
        btnOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                afterAbout.this.setVisible(false);
            }
        });
        btnOk.setBounds(156, 181, 97, 25);
        this.contentPane.add(btnOk);
        final JLabel label = new JLabel("");
        label.setIcon(new ImageIcon(afterAbout.class.getResource("/images/ad.jpg")));
        label.setBounds(0, 0, 432, 253);
        this.contentPane.add(label);
    }
}
