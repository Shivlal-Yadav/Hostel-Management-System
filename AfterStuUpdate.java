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
import javax.swing.JButton;
import javax.swing.JComboBox;
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

public class AfterStuUpdate extends JFrame
{
    private JPanel contentPane;
    private JTextField fname;
    private JTextField lname;
    private JTextField usn;
    private JTextField contact;
    private JTextField email;
    private JTextField pcontact;
    private JTextField rno;
    
    public static void main(final String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    final AfterStuUpdate frame = new AfterStuUpdate("a", "as", "", "", "", "", "", "");
                    frame.setVisible(true);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public AfterStuUpdate(final String FirstName, final String LastName, final String USN, final String CourseId, final String Contact, final String Email, final String PContact, final String RoomNo) {
        this.setResizable(false);
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 460, 734);
        (this.contentPane = new JPanel()).setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout(null);
        final JLabel lblName = new JLabel("First Name");
        lblName.setIcon(new ImageIcon(AfterStuUpdate.class.getResource("/images/sas.png")));
        lblName.setFont(new Font("Tahoma", 1, 16));
        lblName.setBounds(41, 113, 138, 32);
        this.contentPane.add(lblName);
        (this.fname = new JTextField()).setBounds(255, 119, 179, 22);
        this.contentPane.add(this.fname);
        this.fname.setColumns(10);
        this.fname.setText(FirstName);
        this.fname.setEditable(false);
        final JLabel lblLastName = new JLabel("Last Name");
        lblLastName.setFont(new Font("Tahoma", 1, 16));
        lblLastName.setBounds(80, 164, 88, 16);
        this.contentPane.add(lblLastName);
        (this.lname = new JTextField()).setBounds(255, 162, 179, 22);
        this.contentPane.add(this.lname);
        this.lname.setColumns(10);
        this.lname.setText(LastName);
        this.lname.setEditable(false);
        final JLabel lblUsn = new JLabel("USN");
        lblUsn.setIcon(new ImageIcon(AfterStuUpdate.class.getResource("/images/id-card(1).png")));
        lblUsn.setFont(new Font("Tahoma", 1, 16));
        lblUsn.setBounds(41, 217, 78, 24);
        this.contentPane.add(lblUsn);
        (this.usn = new JTextField()).setBounds(255, 219, 116, 22);
        this.contentPane.add(this.usn);
        this.usn.setColumns(10);
        this.usn.setText(USN);
        this.usn.setEditable(false);
        final JLabel lblCourseId = new JLabel("Course Id");
        lblCourseId.setIcon(new ImageIcon(AfterStuUpdate.class.getResource("/images/scholarship.png")));
        lblCourseId.setFont(new Font("Tahoma", 1, 16));
        lblCourseId.setBounds(41, 271, 138, 32);
        this.contentPane.add(lblCourseId);
        final String[] cids = { "B.Tech", "MBA" };
        final JComboBox<String> cid = new JComboBox<String>(cids);
        cid.setBounds(255, 281, 116, 22);
        this.contentPane.add(cid);
        cid.setSelectedItem(CourseId);
        final JLabel lblContact = new JLabel("Contact");
        lblContact.setIcon(new ImageIcon(AfterStuUpdate.class.getResource("/images/asa.png")));
        lblContact.setFont(new Font("Tahoma", 1, 16));
        lblContact.setBounds(41, 333, 107, 32);
        this.contentPane.add(lblContact);
        (this.contact = new JTextField()).setBounds(255, 339, 116, 22);
        this.contentPane.add(this.contact);
        this.contact.setColumns(10);
        this.contact.setText(Contact);
        final JLabel lblEmail = new JLabel("E-Mail");
        lblEmail.setIcon(new ImageIcon(AfterStuUpdate.class.getResource("/images/qw.png")));
        lblEmail.setFont(new Font("Tahoma", 1, 16));
        lblEmail.setBounds(41, 396, 107, 24);
        this.contentPane.add(lblEmail);
        (this.email = new JTextField()).setBounds(255, 398, 116, 22);
        this.contentPane.add(this.email);
        this.email.setColumns(10);
        this.email.setText(Email);
        final JLabel lblParentsContact = new JLabel("Parent's Contact");
        lblParentsContact.setIcon(new ImageIcon(AfterStuUpdate.class.getResource("/images/asa.png")));
        lblParentsContact.setFont(new Font("Tahoma", 1, 16));
        lblParentsContact.setBounds(41, 465, 179, 24);
        this.contentPane.add(lblParentsContact);
        (this.pcontact = new JTextField()).setBounds(255, 467, 116, 22);
        this.contentPane.add(this.pcontact);
        this.pcontact.setColumns(10);
        this.pcontact.setText(PContact);
        final JLabel lblUpdate = new JLabel("UPDATE");
        lblUpdate.setBounds(138, 13, 186, 64);
        this.contentPane.add(lblUpdate);
        lblUpdate.setIcon(new ImageIcon(AfterStuUpdate.class.getResource("/images/change(1).png")));
        lblUpdate.setFont(new Font("Tahoma", 1, 24));
        final JButton btnSubmit = new JButton("Submit");
        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent arg0) {
                final String a = AfterStuUpdate.this.email.getText();
                if (a.indexOf("@saividya.ac.in") == -1) {
                    JOptionPane.showMessageDialog(null, "Invalid email,works only for saividya email ids");
                }
                else {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        final String u = AfterStuUpdate.this.usn.getText();
                        final Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "");
                        final String sql = "Update`register`SET FirstName=?,LastName=?,CourseId=?,Contact=?,Email=?,PContact=?,RoomNo=? Where USN=?";
                        final PreparedStatement ps4 = con.prepareStatement(sql);
                        ps4.setString(1, AfterStuUpdate.this.fname.getText());
                        ps4.setString(2, AfterStuUpdate.this.lname.getText());
                        ps4.setString(3, (String)cid.getSelectedItem());
                        ps4.setString(4, AfterStuUpdate.this.contact.getText());
                        ps4.setString(5, AfterStuUpdate.this.email.getText());
                        ps4.setString(6, AfterStuUpdate.this.pcontact.getText());
                        ps4.setString(7, AfterStuUpdate.this.rno.getText());
                        ps4.setString(8, u);
                        ps4.executeUpdate();
                        con.close();
                        AfterStuUpdate.this.setVisible(false);
                        JOptionPane.showMessageDialog(null, "Updated");
                    }
                    catch (Exception e) {
                        System.out.println(e);
                    }
                }
            }
        });
        btnSubmit.setFont(new Font("Tahoma", 1, 15));
        btnSubmit.setBounds(138, 593, 131, 37);
        this.contentPane.add(btnSubmit);
        final JLabel lblRoomNo = new JLabel("Room No.");
        lblRoomNo.setIcon(new ImageIcon(AfterStuUpdate.class.getResource("/images/room-key.png")));
        lblRoomNo.setFont(new Font("Tahoma", 1, 16));
        lblRoomNo.setBounds(41, 528, 120, 24);
        this.contentPane.add(lblRoomNo);
        (this.rno = new JTextField()).setBounds(255, 530, 116, 22);
        this.contentPane.add(this.rno);
        this.rno.setColumns(10);
        this.rno.setText(RoomNo);
        final JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon(AfterStuUpdate.class.getResource("/images/checked.png")));
        lblNewLabel_1.setBounds(295, 593, 41, 37);
        this.contentPane.add(lblNewLabel_1);
        final JButton btnNewButton = new JButton("");
        btnNewButton.setIcon(new ImageIcon(AfterStuUpdate.class.getResource("/images/house.png")));
        btnNewButton.setBounds(12, 13, 54, 51);
        this.contentPane.add(btnNewButton);
        final JButton btnNewButton_1 = new JButton("");
        btnNewButton_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
            }
        });
        btnNewButton_1.setIcon(new ImageIcon(AfterStuUpdate.class.getResource("/images/back.png")));
        btnNewButton_1.setBounds(12, 601, 54, 51);
        this.contentPane.add(btnNewButton_1);
        final JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon(AfterStuUpdate.class.getResource("/images/ad.jpg")));
        lblNewLabel.setBounds(0, 0, 442, 687);
        this.contentPane.add(lblNewLabel);
    }
}
