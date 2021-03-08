// 
// Decompiled by Procyon v0.5.36
// 

package proFinal;

import java.awt.Component;
import net.miginfocom.swing.MigLayout;
import java.awt.LayoutManager;
import java.awt.EventQueue;
import javax.swing.JTextField;
import javax.swing.JFrame;

public class dsada extends JFrame
{
    private JTextField textField;
    
    public static void main(final String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    final dsada frame = new dsada();
                    frame.setVisible(true);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public dsada() {
        this.setDefaultCloseOperation(3);
        final JFrame jframe = new JFrame("Testing Null Layout");
        jframe.getContentPane().setLayout(null);
        this.setBounds(100, 100, 450, 300);
        this.getContentPane().setLayout((LayoutManager)new MigLayout("", "[][][][][][][][][grow]", "[][][][][]"));
        this.textField = new JTextField();
        this.getContentPane().add(this.textField, "cell 5 4,growx");
        this.textField.setColumns(10);
    }
}
