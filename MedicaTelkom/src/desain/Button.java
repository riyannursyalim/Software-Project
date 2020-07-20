/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package desain;

import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author ZOMBIE
 */
public class Button extends usu.widget.ButtonGlass{
    public Button(){
        super();
        setFont(getFont().deriveFont(Font.BOLD));
        setForeground(Color.BLACK); 
        setRoundRect(true);
    }
}
