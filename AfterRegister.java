// 
// Decompiled by Procyon v0.5.36
// 

package proFinal;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import java.awt.Component;
import java.awt.Font;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.LayoutManager;
import java.awt.Container;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class AfterRegister extends JFrame
{
    private JPanel pane1;
    private JTextField fname;
    private JTextField usn;
    private JTextField lname;
    private JTextField contact;
    private JLabel lblName_1;
    private JTextField pname;
    private JTextField plname;
    private JLabel lblContact;
    private JTextField pcontact;
    private JLabel lblRegister;
    private JLabel lblEmail;
    private JTextField email;
    private JButton btnSubmit;
    final JFrame frame;
    private JTextField rno;
    private JLabel lblNewLabel_5;
    
    public static void main(final String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    final AfterRegister frame = new AfterRegister();
                    frame.setVisible(true);
                    frame.setDefaultCloseOperation(3);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public AfterRegister() {
        this.frame = new JFrame("Close Window");
        this.setEnabled(true);
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 744, 715);
        (this.pane1 = new JPanel()).setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.pane1);
        this.pane1.setLayout(null);
        final JLabel lblName = new JLabel("Name");
        lblName.setIcon(new ImageIcon(AfterRegister.class.getResource("/images/sas.png")));
        lblName.setFont(new Font("Sitka Small", 1, 16));
        lblName.setBounds(14, 83, 97, 32);
        this.pane1.add(lblName);
        (this.fname = new JTextField()).setBounds(178, 126, 160, 22);
        this.pane1.add(this.fname);
        this.fname.setColumns(10);
        final JLabel lblUsn = new JLabel("USN");
        lblUsn.setIcon(new ImageIcon(AfterRegister.class.getResource("/images/id-card(1).png")));
        lblUsn.setFont(new Font("Sitka Small", 1, 16));
        lblUsn.setBounds(472, 83, 97, 32);
        this.pane1.add(lblUsn);
        (this.usn = new JTextField()).setBounds(470, 125, 152, 22);
        this.pane1.add(this.usn);
        this.usn.setColumns(10);
        final JLabel lblNewLabel = new JLabel("Course Id");
        lblNewLabel.setIcon(new ImageIcon(AfterRegister.class.getResource("/images/edit.png")));
        lblNewLabel.setFont(new Font("Sitka Small", 1, 16));
        lblNewLabel.setBounds(468, 168, 122, 32);
        this.pane1.add(lblNewLabel);
        (this.lname = new JTextField()).setBounds(10, 126, 160, 22);
        this.pane1.add(this.lname);
        this.lname.setColumns(10);
        final String[] cids = { "B.Tech", "MBA" };
        final JComboBox<String> cid = new JComboBox<String>(cids);
        cid.setBounds(471, 224, 98, 22);
        this.pane1.add(cid);
        final JLabel lblPhoneNumber = new JLabel("Contact ");
        lblPhoneNumber.setIcon(new ImageIcon(AfterRegister.class.getResource("/images/asa.png")));
        lblPhoneNumber.setFont(new Font("Sitka Small", 1, 16));
        lblPhoneNumber.setBounds(3, 275, 105, 32);
        this.pane1.add(lblPhoneNumber);
        (this.contact = new JTextField()).setBounds(7, 320, 160, 22);
        this.pane1.add(this.contact);
        this.contact.setColumns(10);
        final JLabel lblDateOfBirth = new JLabel("D.O.B");
        lblDateOfBirth.setIcon(new ImageIcon(AfterRegister.class.getResource("/images/calendar.png")));
        lblDateOfBirth.setFont(new Font("Sitka Small", 1, 16));
        lblDateOfBirth.setBounds(14, 179, 97, 32);
        this.pane1.add(lblDateOfBirth);
        final JLabel lblParentsContact = new JLabel("Parents/Guardian Info :");
        lblParentsContact.setFont(new Font("Tahoma", 1, 16));
        lblParentsContact.setBounds(14, 438, 200, 16);
        this.pane1.add(lblParentsContact);
        final JDateChooser dob = new JDateChooser();
        dob.getCalendarButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent arg0) {
            }
        });
        dob.setBounds(9, 224, 143, 22);
        this.pane1.add((Component)dob);
        (this.lblName_1 = new JLabel("Name")).setIcon(new ImageIcon(AfterRegister.class.getResource("/images/sas.png")));
        this.lblName_1.setFont(new Font("Sitka Small", 1, 16));
        this.lblName_1.setBounds(15, 488, 96, 32);
        this.pane1.add(this.lblName_1);
        (this.pname = new JTextField()).setBounds(11, 533, 160, 22);
        this.pane1.add(this.pname);
        this.pname.setColumns(10);
        (this.plname = new JTextField()).setBounds(190, 533, 160, 22);
        this.pane1.add(this.plname);
        this.plname.setColumns(10);
        (this.lblContact = new JLabel("Contact")).setIcon(new ImageIcon(AfterRegister.class.getResource("/images/asa.png")));
        this.lblContact.setFont(new Font("Sitka Small", 1, 16));
        this.lblContact.setBounds(481, 490, 112, 32);
        this.pane1.add(this.lblContact);
        (this.pcontact = new JTextField()).setBounds(487, 534, 143, 22);
        this.pane1.add(this.pcontact);
        this.pcontact.setColumns(10);
        (this.lblRegister = new JLabel("Register")).setFont(new Font("Tahoma", 1, 32));
        this.lblRegister.setBounds(313, 9, 211, 47);
        this.pane1.add(this.lblRegister);
        (this.lblEmail = new JLabel("Email")).setIcon(new ImageIcon(AfterRegister.class.getResource("/images/qw.png")));
        this.lblEmail.setFont(new Font("Sitka Small", 1, 16));
        this.lblEmail.setBounds(484, 283, 105, 34);
        this.pane1.add(this.lblEmail);
        (this.email = new JTextField()).setBounds(481, 326, 160, 22);
        this.pane1.add(this.email);
        this.email.setColumns(10);
        (this.btnSubmit = new JButton("Submit")).addActionListener(new ActionListener() {
            private Object frame;
            
            @Override
            public void actionPerformed(final ActionEvent arg0) {
                final String a = AfterRegister.this.email.getText();
                if (AfterRegister.this.usn.getText().isEmpty() || AfterRegister.this.fname.getText().isEmpty() || dob.getDateFormatString().isEmpty() || AfterRegister.this.contact.getText().isEmpty() || AfterRegister.this.email.getText().isEmpty() || AfterRegister.this.pname.getText().isEmpty() || AfterRegister.this.plname.getText().isEmpty() || AfterRegister.this.rno.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "One or more fields are empty");
                }
                else if (a.indexOf("@saividya.ac.in") == -1) {
                    JOptionPane.showMessageDialog(null, "Invalid email,works only for saividya email ids");
                }
                else {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        final Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "");
                        final PreparedStatement ps1 = con.prepareStatement("INSERT INTO `register`(FirstName,LastName,USN,DOB,CourseId,Contact,Email,PName,PLName,PContact,RoomNo) VALUES (?, ?, ?, ?,?,?,?,?,?,?,?)");
                        final String d1 = ((JTextField)dob.getDateEditor().getUiComponent()).getText();
                        ps1.setString(1, AfterRegister.this.fname.getText());
                        ps1.setString(2, AfterRegister.this.lname.getText());
                        ps1.setString(3, AfterRegister.this.usn.getText());
                        ps1.setString(4, d1);
                        ps1.setString(5, (String)cid.getSelectedItem());
                        ps1.setString(6, AfterRegister.this.contact.getText());
                        ps1.setString(7, AfterRegister.this.email.getText());
                        ps1.setString(8, AfterRegister.this.pname.getText());
                        ps1.setString(9, AfterRegister.this.plname.getText());
                        ps1.setString(10, AfterRegister.this.pcontact.getText());
                        ps1.setString(11, AfterRegister.this.rno.getText());
                        ps1.executeUpdate();
                        System.out.println(d1);
                        final PreparedStatement ps2 = con.prepareStatement("INSERT INTO `fees`(USN,Name,Fees,Paid,Balance) VALUES (?, ?, ?, ?,?)");
                        ps2.setString(1, AfterRegister.this.usn.getText());
                        ps2.setString(2, String.valueOf(AfterRegister.this.fname.getText()) + AfterRegister.this.lname.getText());
                        ps2.setString(3, "60000");
                        ps2.setString(4, "0");
                        ps2.setString(5, "0");
                        ps2.executeUpdate();
                        final AfterRegister ar = new AfterRegister();
                        AfterRegister.this.setVisible(false);
                    }
                    catch (Exception e) {
                        System.out.println(e);
                    }
                }
            }
        });
        this.btnSubmit.setFont(new Font("SansSerif", 0, 13));
        this.btnSubmit.setBounds(287, 612, 97, 25);
        this.pane1.add(this.btnSubmit);
        final JLabel lblRoomNumber = new JLabel("Room No.");
        lblRoomNumber.setIcon(new ImageIcon(AfterRegister.class.getResource("/images/room-key.png")));
        lblRoomNumber.setFont(new Font("Sitka Small", 1, 16));
        lblRoomNumber.setBounds(11, 358, 112, 30);
        this.pane1.add(lblRoomNumber);
        (this.rno = new JTextField()).setBounds(11, 398, 116, 22);
        this.pane1.add(this.rno);
        this.rno.setColumns(10);
        final JLabel label = new JLabel("");
        label.setIcon(new ImageIcon(AfterRegister.class.getResource("/images/checked.png")));
        label.setBounds(391, 608, 32, 32);
        this.pane1.add(label);
        final JButton button = new JButton("");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent arg0) {
                AfterRegister.this.setVisible(false);
            }
        });
        button.setIcon(new ImageIcon(AfterRegister.class.getResource("/images/back.png")));
        button.setBounds(2, 627, 44, 38);
        this.pane1.add(button);
        final JButton button_1 = new JButton("");
        button_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                AfterRegister.this.setVisible(false);
            }
        });
        button_1.setIcon(new ImageIcon(AfterRegister.class.getResource("/images/house.png")));
        button_1.setBounds(1, 2, 44, 38);
        this.pane1.add(button_1);
        final JLabel label_1 = new JLabel("");
        label_1.setIcon(new ImageIcon(AfterRegister.class.getResource("/images/ad.jpg")));
        label_1.setBounds(-3, 0, 728, 672);
        this.pane1.add(label_1);
    }
}
