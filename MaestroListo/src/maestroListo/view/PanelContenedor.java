package maestroListo.view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class PanelContenedor extends JPanel{

	private static final long serialVersionUID = 1L;
	private BufferedImage fondo = null;
		
	PanelContenedor(){
		try {
			fondo = ImageIO.read(WindowLogin.class.getResourceAsStream("/maestroListo/Images/libreriaModernaMediano.jpg"));
					
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	protected  void paintComponent(Graphics g) {
		if (g instanceof Graphics2D) {
	            Graphics2D g2 = ((Graphics2D) g);
	            g2.drawImage(fondo, 0,0, null);
	        }
	}
	
}
