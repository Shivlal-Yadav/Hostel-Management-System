// 
// Decompiled by Procyon v0.5.36
// 

package proFinal;

import java.awt.LayoutManager;
import java.awt.EventQueue;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class P extends JFrame
{
    private final JPanel panel;
    
    public static void main(final String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    final P frame = new P();
                    frame.setVisible(true);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public P() {
        this.panel = new JPanel();
        this.getContentPane().setLayout(null);
        this.getContentPane().setLayout(null);
    }
}
