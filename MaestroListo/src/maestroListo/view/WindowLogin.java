package maestroListo.view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import maestroListo.Controllers.Validaciones;
import javax.swing.*;
import javax.swing.text.JTextComponent;
import maestroListo.model.Constantes;

public class WindowLogin extends JFrame{
	private static final long serialVersionUID = 1L;
	//VARIABLES 	
	private final PanelContenedor panelContenedor = new PanelContenedor();
	private final JPanel panelLogin = new JPanel();
	//private JLabel lblFondo= new JLabel();
	private final JLabel lblUser= new JLabel();
	private final JLabel lblPassword= new JLabel();
	private final JLabel lblRegister= new JLabel();
	private final JTextField txtfUser= new JTextField("DNI AQUI...",20);
	private final JPasswordField passwordField = new JPasswordField("Password aqui...",20);
	private final JButton btnInicio = new JButton();
	private final JCheckBox jchbxShow = new JCheckBox();
	
	//************prueba
	
	public WindowLogin(){
		this.setSize(Constantes.SCREEM_SIZE);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setTitle("AGENDA DOCENTE");
		this.setVisible(true);
		this.initComponent();
		this.setIconImage(Constantes.ICON_AGDC);
		
	}
	
	private  void initComponent() {
		panelContenedor.setPreferredSize(this.getSize());
		FlowLayout flwLayout = new FlowLayout(FlowLayout.CENTER,150,250); 
		panelContenedor.setLayout(flwLayout);
		//Parametros gridLayout (cant filas, cant columnas, distancia hotizonta --, distancia Vertical |)
		//GridLayout grdLayout = new GridLayout(6, 3, 10, 20);
		Font font = new Font("Arial",0, 15);
		panelLogin.setOpaque(false);
		lblUser.setText("Usuario");
		lblUser.setFont(font);
		lblUser.setForeground(Color.white);
		lblPassword.setText("Password");
		lblPassword.setFont(font);
		lblPassword.setForeground(Color.white);
		lblRegister.setText(" Registrar");
		lblRegister.setForeground(Color.white);
		txtfUser.setForeground(Color.GRAY);
		passwordField.setForeground(Color.GRAY);
		btnInicio.setText("Inicio");
		btnInicio.setBackground(Color.LIGHT_GRAY);
		btnInicio.setForeground(Color.darkGray);
		jchbxShow.setText("Show");
		jchbxShow.setFont(font);
		jchbxShow.setForeground(Color.white);
		jchbxShow.setOpaque(false);
		jchbxShow.setIcon(new ImageIcon(this.getClass().getResource("/maestroListo/Images/not-visible.png")));
		BoxLayout bxLayout = new BoxLayout(panelLogin,BoxLayout.Y_AXIS);	
		panelLogin.setLayout(bxLayout);
		
		lblUser.setAlignmentY(CENTER_ALIGNMENT);
		txtfUser.setAlignmentY(RIGHT_ALIGNMENT);
		lblPassword.setAlignmentY(CENTER_ALIGNMENT);
		passwordField.setAlignmentY(RIGHT_ALIGNMENT);
		jchbxShow.setAlignmentY(LEFT_ALIGNMENT);
		btnInicio.setAlignmentY(CENTER_ALIGNMENT);
		lblRegister.setAlignmentY(LEFT_ALIGNMENT);
		
		panelLogin.add(lblUser);
		panelLogin.add(txtfUser);
		panelLogin.add(lblPassword);
		panelLogin.add(passwordField);
		panelLogin.add(jchbxShow);
		panelLogin.add(btnInicio);
		panelLogin.add(lblRegister);
		
		this.visibilizarPassword(jchbxShow); 
		this.accionDelClickJTextField(txtfUser);
		this.accionDelClickJTextField(passwordField);
		this.accionDelClickRegistrar(lblRegister);
		this.accionDelBotonInicio(btnInicio);	
		panelContenedor.add(panelLogin);
		this.getContentPane().add(panelContenedor);
		
		
		pack();
	}
	public void visibilizarPassword(JCheckBox jchbx) {
		jchbx.addActionListener((ActionEvent e) -> {
                    JCheckBox chBxAU = (JCheckBox) e.getSource();
                    passwordField.setEchoChar(chBxAU.isSelected() ? '\u0000': (Character) UIManager.get("PasswordField.echoChar"));
                });
		
	}
	public void accionDelClickJTextField(JTextComponent comp) {
		comp.addMouseListener(new MouseAdapter() {
                        @Override
			public void mouseClicked(MouseEvent e){
				if(!"".equals(comp.getText())) {
					comp.setText("");
					comp.setForeground(Color.black);
					
				}	
			}
		});
	}
	public void accionDelClickRegistrar(JLabel lblRegistrar) {
		lblRegistrar.addMouseListener(new MouseAdapter() {
                        @Override
			public void mouseClicked(MouseEvent e){
					
			}
                        @Override
			public void mouseEntered(MouseEvent e) {
				lblRegistrar.setForeground(Color.cyan);
			}
                        @Override
			public void mouseExited(MouseEvent e) {
				lblRegistrar.setForeground(Color.white);
			}
		});
	}
	public void accionDelBotonInicio(JButton btnInicio) {
		btnInicio.addMouseListener(new MouseAdapter() {
                        @Override
			public void mouseClicked(MouseEvent e){
				 new Validaciones().validacionLogin(txtfUser.getText(), passwordField.getPassword());
			}
		});
	}
}
