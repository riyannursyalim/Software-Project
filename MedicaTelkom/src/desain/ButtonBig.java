/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package desain;

import java.awt.Color;
import java.awt.Font;
/**
 *
 * @author ZOMBIE
 */
public class ButtonBig extends usu.widget.glass.ButtonImageReflection {
    public ButtonBig(){
        super();
        setFont(getFont().deriveFont(Font.BOLD));
        setForeground(Color.BLACK); 
    }
}
