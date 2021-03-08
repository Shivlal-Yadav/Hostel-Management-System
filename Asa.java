// 
// Decompiled by Procyon v0.5.36
// 

package proFinal;

import javax.swing.JLabel;
import java.awt.Component;
import java.awt.Container;
import java.awt.LayoutManager;
import java.awt.BorderLayout;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.EventQueue;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class Asa extends JFrame
{
    private JPanel contentPane;
    
    public static void main(final String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    final Asa frame = new Asa();
                    frame.setVisible(true);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public Asa() {
        this.setDefaultCloseOperation(3);
        this.setBounds(100, 100, 450, 300);
        (this.contentPane = new JPanel()).setBorder(new EmptyBorder(5, 5, 5, 5));
        this.contentPane.setLayout(new BorderLayout(0, 0));
        this.setContentPane(this.contentPane);
        final JPanel panel = new JPanel();
        this.contentPane.add(panel, "Center");
        panel.setLayout(null);
        final JLabel lblFsdd = new JLabel("fsdd");
        lblFsdd.setBounds(178, 57, 56, 16);
        panel.add(lblFsdd);
    }
}
