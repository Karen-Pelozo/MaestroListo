package maestroListo.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import maestroListo.model.Enum.TipoUsuario;

@Entity
@Table (name ="USUARIOS")
public class User implements Serializable {
	@Id
        @Column (name="DNI_ID")
        private Integer idDNI=0;
        @Basic 
        @Column (name="NOMBRES")
	private	String nombre;
        @Column (name="APELLIDO")
	private String apellido;
        @Column (name="PASSWORD")
	private Byte[] password;
        @Column (name="TIPO")
	private TipoUsuario tipoUsuario;
      
	
	
	public User(Integer idDNI, String nombre, String apellido, Byte[] password, TipoUsuario tipoUsuario) {
		super();
		this.idDNI = idDNI;
		this.nombre = nombre;
		this.apellido = apellido;
		this.password = password;
		this.tipoUsuario = tipoUsuario;
		
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getIdDNI() {
		return idDNI;
	}
	public void setIdDNI(Integer idDNI) {
		this.idDNI = idDNI;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Byte[] getPassword() {
		return password;
	}
	public void setPassword(Byte[] password) {
		this.password = password;
	}
	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}
	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	
}
