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

public class AfterFeesUSN extends JFrame
{
    private JPanel contentPane;
    private JTextField name;
    private JTextField usn;
    private JTextField fees;
    private JTextField paid;
    private JTextField due;
    
    public static void main(final String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    final AfterFeesUSN frame = new AfterFeesUSN("", "", "", "");
                    frame.setVisible(true);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public AfterFeesUSN(final String u, final String Name, final String paid1, final String due1) {
        this.setResizable(false);
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 662, 513);
        (this.contentPane = new JPanel()).setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout(null);
        final JLabel lblName = new JLabel("Name");
        lblName.setIcon(new ImageIcon("C:\\Users\\shubh\\Desktop\\dbms_pro_img\\sas.png"));
        lblName.setFont(new Font("Tahoma", 0, 15));
        lblName.setBounds(199, 72, 95, 32);
        this.contentPane.add(lblName);
        (this.name = new JTextField()).setBounds(345, 78, 116, 22);
        this.contentPane.add(this.name);
        this.name.setColumns(10);
        this.name.setText(Name);
        this.name.setEditable(false);
        final JLabel lblUsn = new JLabel("USN");
        lblUsn.setIcon(new ImageIcon("C:\\Users\\shubh\\Desktop\\dbms_pro_img\\id-card(1).png"));
        lblUsn.setFont(new Font("Tahoma", 0, 15));
        lblUsn.setBounds(199, 134, 72, 32);
        this.contentPane.add(lblUsn);
        (this.usn = new JTextField()).setBounds(345, 140, 116, 22);
        this.contentPane.add(this.usn);
        this.usn.setColumns(10);
        this.usn.setText(u);
        final JLabel lblFeesPaid = new JLabel("Fees");
        lblFeesPaid.setIcon(new ImageIcon("C:\\Users\\shubh\\Downloads\\transaction.png"));
        lblFeesPaid.setFont(new Font("Tahoma", 0, 15));
        lblFeesPaid.setBounds(199, 195, 85, 32);
        this.contentPane.add(lblFeesPaid);
        (this.fees = new JTextField()).setEditable(false);
        this.fees.setText("60000");
        this.fees.setBounds(345, 201, 116, 22);
        this.contentPane.add(this.fees);
        this.fees.setColumns(10);
        final JLabel lblFeesPaid_1 = new JLabel("Paid");
        lblFeesPaid_1.setIcon(new ImageIcon("C:\\Users\\shubh\\Desktop\\dbms_pro_img\\debit-card(1).png"));
        lblFeesPaid_1.setFont(new Font("Tahoma", 0, 15));
        lblFeesPaid_1.setBounds(199, 259, 95, 43);
        this.contentPane.add(lblFeesPaid_1);
        (this.paid = new JTextField()).setEditable(false);
        this.paid.setBounds(345, 270, 116, 22);
        this.contentPane.add(this.paid);
        this.paid.setColumns(10);
        this.paid.setText(paid1);
        final JLabel lblDue = new JLabel("Due");
        lblDue.setIcon(new ImageIcon("C:\\Users\\shubh\\Desktop\\dbms_pro_img\\credit-card(1).png"));
        lblDue.setFont(new Font("Tahoma", 0, 15));
        lblDue.setBounds(199, 340, 79, 33);
        this.contentPane.add(lblDue);
        (this.due = new JTextField()).setEditable(false);
        this.due.setBounds(345, 346, 116, 22);
        this.contentPane.add(this.due);
        this.due.setColumns(10);
        this.due.setText(due1);
        this.due.setEditable(false);
        final JLabel lblFeeStatus = new JLabel("FEE STATUS");
        lblFeeStatus.setFont(new Font("Tahoma", 1, 23));
        lblFeeStatus.setBounds(260, 13, 156, 32);
        this.contentPane.add(lblFeeStatus);
        final JButton btnNewButton = new JButton("Ok");
        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                AfterFeesUSN.this.setVisible(false);
            }
        });
        btnNewButton.setBounds(289, 414, 97, 25);
        this.contentPane.add(btnNewButton);
        final JLabel label = new JLabel("");
        label.setIcon(new ImageIcon("C:\\Users\\shubh\\Desktop\\ad.jpg"));
        label.setBounds(0, 0, 656, 478);
        this.contentPane.add(label);
    }
}
