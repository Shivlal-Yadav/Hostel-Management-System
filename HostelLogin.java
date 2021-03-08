// 
// Decompiled by Procyon v0.5.36
// 

package proFinal;

import java.text.DateFormat;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.sql.DriverManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.awt.Component;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.EventQueue;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JFrame;

public class HostelLogin extends JFrame
{
    private JTextField user;
    private JPasswordField pass;
    JLabel alertText;
    JLabel at;
    
    public static void main(final String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    final HostelLogin frame = new HostelLogin();
                    frame.setVisible(true);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public HostelLogin() {
        this.setResizable(false);
        this.setBackground(SystemColor.activeCaption);
        this.setDefaultCloseOperation(3);
        this.setBounds(100, 100, 662, 513);
        this.getContentPane().setLayout(null);
        (this.alertText = new JLabel("")).setBounds(106, 206, 177, 30);
        final JLabel lblUsername = new JLabel("Username");
        lblUsername.setForeground(Color.WHITE);
        lblUsername.setFont(new Font("Segoe UI Historic", 1, 20));
        lblUsername.setBounds(188, 196, 118, 19);
        this.getContentPane().add(lblUsername);
        (this.user = new JTextField()).setBounds(318, 196, 145, 22);
        this.getContentPane().add(this.user);
        this.user.setColumns(10);
        final JLabel lblNewLabel = new JLabel("Password");
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setFont(new Font("Segoe UI Historic", 1, 20));
        lblNewLabel.setBounds(188, 257, 110, 21);
        this.getContentPane().add(lblNewLabel);
        (this.pass = new JPasswordField()).setBounds(318, 256, 145, 22);
        this.getContentPane().add(this.pass);
        (this.at = new JLabel("")).setBounds(174, 404, 305, 25);
        this.getContentPane().add(this.at);
        final JButton btnSubmit = new JButton("Submit");
        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent arg0) {
                try {
                    HostelLogin.this.at.setText("");
                    Class.forName("com.mysql.jdbc.Driver");
                    final Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "");
                    final int i = 0;
                    final String query = "Select * from username where BINARY username=? and BINARY password=?";
                    final String m = HostelLogin.this.user.getText();
                    final String n = HostelLogin.this.pass.getText();
                    final PreparedStatement ps = con.prepareStatement(query);
                    ps.setString(1, m);
                    ps.setString(2, n);
                    final String a = HostelLogin.this.user.getText();
                    final String b = HostelLogin.this.pass.getText();
                    System.out.println(a);
                    System.out.println(b);
                    HostelLogin.this.at.setText("");
                    final ResultSet rs = ps.executeQuery();
                    if (rs.next()) {
                        HostelLogin.this.at.setText("");
                        final DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                        final Date date = new Date();
                        final DateFormat time = new SimpleDateFormat("HH:mm:ss");
                        final Date time2 = new Date();
                        final PreparedStatement ps2 = con.prepareStatement("INSERT INTO `loginlog`(username,password,time,date) VALUES (?, ?, ?, ?)");
                        ps2.setString(1, m);
                        ps2.setString(2, n);
                        ps2.setString(3, time.format(time2));
                        ps2.setString(4, dateFormat.format(date));
                        ps2.executeUpdate();
                        final String a2 = HostelLogin.this.user.getText();
                        final AfterLogin h = new AfterLogin(a);
                        h.setVisible(true);
                        HostelLogin.this.user.setText("");
                        HostelLogin.this.pass.setText("");
                        HostelLogin.this.setVisible(false);
                    }
                    else if (HostelLogin.this.pass.getText().equals("") && !HostelLogin.this.user.getText().isEmpty()) {
                        HostelLogin.this.at.setText("Enter Password");
                        HostelLogin.this.at.setForeground(Color.red);
                        HostelLogin.this.at.setIcon(new ImageIcon("E:\\am.png"));
                        HostelLogin.this.at.setFont(new Font("Russo One 13", 0, 14));
                    }
                    else if (!HostelLogin.this.pass.getText().isEmpty() && HostelLogin.this.user.getText().isEmpty()) {
                        HostelLogin.this.at.setText("");
                        HostelLogin.this.at.setText("Enter the Username");
                        HostelLogin.this.at.setIcon(new ImageIcon("E:\\am.png"));
                        HostelLogin.this.at.setForeground(Color.red);
                        HostelLogin.this.at.setFont(new Font("Russo One 13", 0, 14));
                    }
                    else if (HostelLogin.this.pass.getText().isEmpty() && HostelLogin.this.user.getText().isEmpty()) {
                        HostelLogin.this.at.setText("");
                        HostelLogin.this.at.setText("Enter the username and password");
                        HostelLogin.this.at.setForeground(Color.red);
                        HostelLogin.this.at.setIcon(new ImageIcon("E:\\am.png"));
                        HostelLogin.this.at.setFont(new Font("Russo One 13", 0, 14));
                    }
                    else {
                        HostelLogin.this.at.setText("");
                        HostelLogin.this.at.setText("Username and password dont match");
                        HostelLogin.this.at.setForeground(Color.red);
                        HostelLogin.this.at.setIcon(new ImageIcon("E:\\am.png"));
                        HostelLogin.this.at.setFont(new Font("Russo One 13", 0, 14));
                    }
                }
                catch (Exception e2) {
                    System.out.println("Unsuccessful" + e2);
                }
            }
        });
        btnSubmit.setBounds(366, 300, 97, 25);
        this.getContentPane().add(btnSubmit);
        final JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon(HostelLogin.class.getResource("/proFinal/avatar(1).png")));
        lblNewLabel_1.setBounds(148, 196, 28, 25);
        this.getContentPane().add(lblNewLabel_1);
        final JLabel label = new JLabel("");
        label.setIcon(new ImageIcon(HostelLogin.class.getResource("/proFinal/lock.png")));
        label.setBounds(148, 252, 28, 22);
        this.getContentPane().add(label);
        final JLabel lblHostelBuddy = new JLabel("Hostel Buddy");
        lblHostelBuddy.setFont(new Font("Tahoma", 0, 42));
        lblHostelBuddy.setForeground(Color.WHITE);
        lblHostelBuddy.setBounds(200, 70, 281, 51);
        this.getContentPane().add(lblHostelBuddy);
        final JLabel label_1 = new JLabel("");
        label_1.setIcon(new ImageIcon(HostelLogin.class.getResource("/proFinal/abc.jpg")));
        label_1.setBounds(0, 0, 656, 478);
        this.getContentPane().add(label_1);
        final JFrame jf = new JFrame();
    }
}
