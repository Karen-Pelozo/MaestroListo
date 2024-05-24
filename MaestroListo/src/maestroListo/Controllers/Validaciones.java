package maestroListo.Controllers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class Validaciones {

	public Validaciones() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void validacionLogin(String userDni,char[] password) {
		String p= String.copyValueOf(password);
		if(!this.dniValido(userDni))
			JOptionPane.showMessageDialog(null, "El USUARIO NO ES VALIDO\n *El dni debe estar sin puntuacion");	
		if(!this.passwordValido(p)) {
		JOptionPane.showMessageDialog(null, """
                                                    LA CONTRASE\u00d1A NO ES VALIDA
                                                     *Contrase\u00f1a de 4-20 caracteres 
                                                     *con al menos un d\u00edgito
                                                     *al menos uno letra min\u00fascula
                                                     *al menos una letra may\u00fascula,
                                                     *al menos una caracter especial '@#$%^&+='
                                                     *y sin espacios en blanco""");
		System.out.print(p);
		if(!this.existeUsuario(userDni, p)) {
			JOptionPane.showMessageDialog(null, "El USUARIO NO EXISTE\n *Debe registrarse");
			
			}
		}	
	}
//VALIDACIONES DEL PASSWORD
	/*No puede contener signos de interrogación, dos puntos ni espacios. No puede incluir solo números, ni dejarse en blanco.*/
	public boolean passwordValido(String pssword) {
		Pattern formatoPass = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{4,20}$");
		Matcher matcher = formatoPass.matcher(pssword); 
		boolean esValido = matcher.matches();
		return esValido;
	}
//VALIDACIONES DEL DNI
	public  boolean dniValido(String userDni) {
		//el dni deben ser todos numeros y igual a 8
		return this.esNumero(userDni) && this.tamanioOcho(userDni);
	}
	public boolean esNumero(String numero) {
		boolean esNum;
		try {
			Integer.valueOf(numero);
			esNum=true;
		}catch(NumberFormatException e){
			esNum =false;
		}
		return esNum;
	}
	public boolean tamanioOcho(String numero) {
		if(this.esNumero(numero)) {
			return numero.length() ==8;
		}
		return false;
	}
	public boolean existeUsuario(String dni,String password) {
		
		return true;
	}
	 
}
