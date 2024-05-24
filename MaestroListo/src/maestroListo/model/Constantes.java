/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maestroListo.model;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import maestroListo.view.WindowLogin;

/**
 *
 * @author veronica
 */
public class Constantes {
    public static final Dimension SCREEM_SIZE = Toolkit.getDefaultToolkit().getScreenSize();
    public static final Image ICON_AGDC =Toolkit.getDefaultToolkit().getImage(WindowLogin.class.getResource("/maestroListo/Images/bookIcon.png"));
}