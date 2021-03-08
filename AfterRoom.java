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

public class AfterRoom extends JFrame
{
    private JPanel contentPane;
    private JTextField rno;
    
    public static void main(final String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    final AfterRoom frame = new AfterRoom();
                    frame.setVisible(true);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public AfterRoom() {
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 662, 513);
        (this.contentPane = new JPanel()).setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout(null);
        final JLabel lblRoomNo = new JLabel("Room No. :");
        lblRoomNo.setIcon(new ImageIcon(AfterRoom.class.getResource("/images/room-key.png")));
        lblRoomNo.setFont(new Font("Tahoma", 1, 24));
        lblRoomNo.setBounds(151, 209, 178, 21);
        this.contentPane.add(lblRoomNo);
        (this.rno = new JTextField()).setBounds(356, 213, 116, 22);
        this.contentPane.add(this.rno);
        this.rno.setColumns(10);
        final JButton btnSubmit = new JButton("Submit");
        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                final String m = AfterRoom.this.rno.getText();
                final AfterRoomNo arno = new AfterRoomNo(m);
                arno.show();
                AfterRoom.this.setVisible(false);
            }
        });
        btnSubmit.setBounds(392, 266, 80, 25);
        this.contentPane.add(btnSubmit);
        final JButton btnNewButton = new JButton("");
        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent arg0) {
                AfterRoom.this.setVisible(false);
            }
        });
        btnNewButton.setIcon(new ImageIcon(AfterRoom.class.getResource("/images/house.png")));
        btnNewButton.setBounds(12, 13, 53, 38);
        this.contentPane.add(btnNewButton);
        final JLabel lblHome = new JLabel("Home");
        lblHome.setFont(new Font("Tahoma", 1, 13));
        lblHome.setBounds(77, 26, 56, 16);
        this.contentPane.add(lblHome);
        final JButton btnNewButton_1 = new JButton("");
        btnNewButton_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                AfterRoom.this.setVisible(false);
            }
        });
        btnNewButton_1.setIcon(new ImageIcon(AfterRoom.class.getResource("/images/back.png")));
        btnNewButton_1.setBounds(12, 415, 53, 38);
        this.contentPane.add(btnNewButton_1);
        final JLabel lblGoBack = new JLabel("Go Back");
        lblGoBack.setFont(new Font("Tahoma", 1, 13));
        lblGoBack.setBounds(77, 437, 56, 16);
        this.contentPane.add(lblGoBack);
        final JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon(AfterRoom.class.getResource("/images/ad.jpg")));
        lblNewLabel.setBounds(0, 0, 644, 466);
        this.contentPane.add(lblNewLabel);
    }
}
