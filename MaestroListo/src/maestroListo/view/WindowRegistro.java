package maestroListo.view;

import javax.swing.JFrame;
import maestroListo.model.Constantes;

public class WindowRegistro extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	//***********************COMPONENTES*****************************
	private final PanelContenedor panelContenedor = new PanelContenedor();
	
	public WindowRegistro(){
		this.setSize(Constantes.SCREEM_SIZE);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setTitle("AGENDA DOCENTE");
		this.setVisible(true);
		this.initComponent();
		this.setIconImage(Constantes.ICON_AGDC);
		
	}
	private void initComponent() {
		panelContenedor.setPreferredSize(this.getSize());
	}
}
