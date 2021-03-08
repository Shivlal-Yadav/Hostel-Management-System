// 
// Decompiled by Procyon v0.5.36
// 

package proFinal;

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

public class AfterSalaryEID extends JFrame
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
                    final AfterSalaryEID frame = new AfterSalaryEID("", "", "", "", "");
                    frame.setVisible(true);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public AfterSalaryEID(final String u, final String Name, final String Salary, final String paid1, final String due1) {
        this.setResizable(false);
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 270, 437);
        (this.contentPane = new JPanel()).setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout(null);
        final JLabel lblName = new JLabel("Name");
        lblName.setIcon(new ImageIcon(AfterSalaryEID.class.getResource("/images/manager.png")));
        lblName.setFont(new Font("Tahoma", 0, 15));
        lblName.setBounds(12, 72, 95, 32);
        this.contentPane.add(lblName);
        (this.name = new JTextField()).setBounds(119, 78, 116, 22);
        this.contentPane.add(this.name);
        this.name.setColumns(10);
        this.name.setText(Name);
        this.name.setEditable(false);
        final JLabel lblUsn = new JLabel("EID");
        lblUsn.setIcon(new ImageIcon(AfterSalaryEID.class.getResource("/images/id-card(1).png")));
        lblUsn.setFont(new Font("Tahoma", 0, 15));
        lblUsn.setBounds(12, 117, 85, 32);
        this.contentPane.add(lblUsn);
        (this.usn = new JTextField()).setBounds(119, 123, 116, 22);
        this.contentPane.add(this.usn);
        this.usn.setColumns(10);
        this.usn.setText(u);
        final JLabel lblFeesPaid = new JLabel("Salary");
        lblFeesPaid.setIcon(new ImageIcon(AfterSalaryEID.class.getResource("/images/debit-card.png")));
        lblFeesPaid.setFont(new Font("Tahoma", 0, 15));
        lblFeesPaid.setBounds(12, 179, 85, 32);
        this.contentPane.add(lblFeesPaid);
        (this.fees = new JTextField()).setEditable(false);
        this.fees.setText(Salary);
        this.fees.setBounds(119, 185, 116, 22);
        this.contentPane.add(this.fees);
        this.fees.setColumns(10);
        final JLabel lblFeesPaid_1 = new JLabel("Paid");
        lblFeesPaid_1.setIcon(new ImageIcon(AfterSalaryEID.class.getResource("/images/credit-card.png")));
        lblFeesPaid_1.setFont(new Font("Tahoma", 0, 15));
        lblFeesPaid_1.setBounds(12, 235, 82, 20);
        this.contentPane.add(lblFeesPaid_1);
        (this.paid = new JTextField()).setEditable(false);
        this.paid.setBounds(119, 233, 116, 22);
        this.contentPane.add(this.paid);
        this.paid.setColumns(10);
        this.paid.setText(paid1);
        final JLabel lblDue = new JLabel("Balance");
        lblDue.setIcon(new ImageIcon(AfterSalaryEID.class.getResource("/images/id-card.png")));
        lblDue.setFont(new Font("Tahoma", 0, 15));
        lblDue.setBounds(12, 293, 80, 20);
        this.contentPane.add(lblDue);
        (this.due = new JTextField()).setEditable(false);
        this.due.setBounds(119, 291, 116, 22);
        this.contentPane.add(this.due);
        this.due.setColumns(10);
        this.due.setText(due1);
        this.due.setEditable(false);
        final JLabel lblFeeStatus = new JLabel("SALARY");
        lblFeeStatus.setFont(new Font("Tahoma", 1, 18));
        lblFeeStatus.setBounds(102, 13, 85, 16);
        this.contentPane.add(lblFeeStatus);
        final JButton btnNewButton = new JButton("Ok");
        btnNewButton.setBounds(90, 345, 97, 25);
        this.contentPane.add(btnNewButton);
        final JLabel label = new JLabel("");
        label.setIcon(new ImageIcon(AfterSalaryEID.class.getResource("/images/ad.jpg")));
        label.setBounds(0, 0, 264, 402);
        this.contentPane.add(label);
    }
}
