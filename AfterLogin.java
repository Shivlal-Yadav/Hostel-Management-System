// 
// Decompiled by Procyon v0.5.36
// 

package proFinal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.LayoutManager;
import java.awt.Container;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.EventQueue;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class AfterLogin extends JFrame
{
    private JPanel contentPane;
    
    public static void main(final String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    final AfterLogin frame = new AfterLogin("a");
                    frame.setVisible(true);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public AfterLogin(final String am) {
        this.setResizable(false);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\shubh\\Downloads\\avatar.png"));
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 662, 513);
        (this.contentPane = new JPanel()).setBackground(Color.WHITE);
        this.contentPane.setForeground(Color.LIGHT_GRAY);
        this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout(null);
        final String wel = "Welcome " + am;
        this.setTitle(wel);
        final JLabel lblRegsiter = new JLabel("Regsiter");
        lblRegsiter.setFont(new Font("Tahoma", 1, 16));
        lblRegsiter.setBounds(33, 147, 76, 32);
        this.contentPane.add(lblRegsiter);
        final JLabel lblFees = new JLabel("Fees");
        lblFees.setFont(new Font("Tahoma", 1, 16));
        lblFees.setBounds(455, 155, 56, 16);
        this.contentPane.add(lblFees);
        final JLabel lblRoom = new JLabel("Room Status");
        lblRoom.setFont(new Font("Tahoma", 1, 16));
        lblRoom.setBounds(222, 155, 112, 16);
        this.contentPane.add(lblRoom);
        final JButton btnSubmit_1 = new JButton("");
        btnSubmit_1.setForeground(SystemColor.desktop);
        btnSubmit_1.setIcon(new ImageIcon(AfterLogin.class.getResource("/images/desk(1).png")));
        btnSubmit_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                final AfterRoom arm = new AfterRoom();
                arm.setVisible(true);
            }
        });
        btnSubmit_1.setBounds(252, 13, 122, 135);
        this.contentPane.add(btnSubmit_1);
        final JLabel lblUpdateshow = new JLabel("Update/Show");
        lblUpdateshow.setFont(new Font("Tahoma", 1, 16));
        lblUpdateshow.setBounds(12, 428, 112, 16);
        this.contentPane.add(lblUpdateshow);
        final JButton button = new JButton("");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                final AfterRegister ar = new AfterRegister();
                ar.setVisible(true);
            }
        });
        button.setIcon(new ImageIcon(AfterLogin.class.getResource("/images/clipboard.png")));
        button.setBounds(12, 13, 112, 135);
        this.contentPane.add(button);
        final JButton btnNewButton = new JButton("");
        btnNewButton.setBounds(453, 13, 135, 135);
        this.contentPane.add(btnNewButton);
        btnNewButton.setIcon(new ImageIcon(AfterLogin.class.getResource("/images/pay-per-click.png")));
        final JButton btnNewButton_1 = new JButton("");
        btnNewButton_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                final AfterUpdate au = new AfterUpdate();
                au.show();
            }
        });
        btnNewButton_1.setIcon(new ImageIcon(AfterLogin.class.getResource("/images/content.png")));
        btnNewButton_1.setBounds(12, 278, 112, 135);
        this.contentPane.add(btnNewButton_1);
        final JButton btnNewButton_2 = new JButton("");
        btnNewButton_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                final AfterEmployee ae = new AfterEmployee();
                ae.setVisible(true);
            }
        });
        btnNewButton_2.setIcon(new ImageIcon(AfterLogin.class.getResource("/images/collaboration(2).png")));
        btnNewButton_2.setBounds(252, 278, 122, 135);
        this.contentPane.add(btnNewButton_2);
        final JLabel lblEmployees = new JLabel("Employees");
        lblEmployees.setFont(new Font("Tahoma", 1, 16));
        lblEmployees.setBounds(222, 429, 106, 16);
        this.contentPane.add(lblEmployees);
        final JButton btnNewButton_3 = new JButton("");
        btnNewButton_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent arg0) {
                final afterAbout abt = new afterAbout();
                abt.setVisible(true);
            }
        });
        btnNewButton_3.setIcon(new ImageIcon(AfterLogin.class.getResource("/images/question.png")));
        btnNewButton_3.setBounds(464, 278, 135, 135);
        this.contentPane.add(btnNewButton_3);
        final JLabel lblAbout = new JLabel("About");
        lblAbout.setFont(new Font("Tahoma", 1, 16));
        lblAbout.setBounds(452, 428, 69, 16);
        this.contentPane.add(lblAbout);
        final JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon(AfterLogin.class.getResource("/images/ad.jpg")));
        lblNewLabel.setBounds(0, 0, 644, 466);
        this.contentPane.add(lblNewLabel);
        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                final AfterFeesButton af = new AfterFeesButton();
                af.show();
            }
        });
    }
}
