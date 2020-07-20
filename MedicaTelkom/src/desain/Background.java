/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package desain;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
/**
 *
 * @author ZOMBIE
 */
public class Background extends JPanel {
    private Image Image;
    public Background() {
        Image = new ImageIcon(getClass().getResource
        ("/desain/back1.png")).getImage();
    }
    @Override
    protected void paintComponent(Graphics grphcs) {
    super.paintComponent(grphcs);
        Graphics2D gd = (Graphics2D) grphcs.create();
        gd.drawImage(Image, 0, 0, getWidth(), getHeight(), null);
        gd.dispose();

    }
}
