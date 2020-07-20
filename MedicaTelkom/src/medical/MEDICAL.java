/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package medical;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;


/**
 *
 * @author ZOMBIE
 */
public class MEDICAL {

    public static void main(String[] args) {
        try {
        UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
        SwingUtilities.updateComponentTreeUI(new frmUtama());
    } catch (Exception e){
 
    }
        frmUtama utama=new frmUtama();
        utama.setVisible(true);
    }
}
