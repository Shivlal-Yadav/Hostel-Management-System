// 
// Decompiled by Procyon v0.5.36
// 

package proFinal;

import java.awt.LayoutManager;
import net.miginfocom.swing.MigLayout;
import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Plwlf extends JFrame
{
    private final JButton button;
    
    public static void main(final String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    final Plwlf frame = new Plwlf();
                    frame.setVisible(true);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public Plwlf() {
        this.button = new JButton("New button");
        this.setDefaultCloseOperation(3);
        this.setBounds(100, 100, 450, 300);
        this.getContentPane().setLayout((LayoutManager)new MigLayout("", "[]", "[]"));
    }
}
