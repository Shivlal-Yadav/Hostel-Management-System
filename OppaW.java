// 
// Decompiled by Procyon v0.5.36
// 

package proFinal;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class OppaW extends JFrame
{
    public static void main(final String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    final OppaW frame = new OppaW();
                    frame.setVisible(true);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public OppaW() {
        this.setDefaultCloseOperation(3);
        this.setBounds(100, 100, 450, 300);
    }
}
