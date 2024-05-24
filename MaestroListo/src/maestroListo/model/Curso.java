package maestroListo.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table (name ="Curso")
public class Curso implements Serializable {
       @Id     
       @Column (name ="ID")
        private Integer id;
       @Column (name ="TURNO")
	private String turno;
       @Column (name = "HORARIO")
	private String horario;
       @Column (name = "DIAS HABILES")
	private ArrayList<String> dias;
       @OneToMany       
	private LinkedList<Alumno> alumnos;
	
	public Curso() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Curso(Integer id,String turno, String horario, ArrayList<String> dias, LinkedList<Alumno> alumnos) {
		super();
                this.id = id;
		this.turno = turno;
		this.horario = horario;
		this.dias = dias;
		this.alumnos = alumnos;
	}
        public Integer getId(){
        return id;
        }
        public void setId(Integer id){
            this.id =id;
        }
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public ArrayList<String> getDias() {
		return dias;
	}
	public void setDias(ArrayList<String> dias) {
		this.dias = dias;
	}
	public LinkedList<Alumno> getAlumnos() {
		return alumnos;
	}
	public void setAlumnos(LinkedList<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
		
}
