/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maestroListo.model;

import java.util.LinkedList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import maestroListo.model.Enum.TipoUsuario;
@Entity
@Table(name ="PROFESOR")
public class Profesor extends User {
        @ManyToMany
        @Column (name ="CURSOS")
	private LinkedList<Curso> cursos;
        public Profesor(){}
        public Profesor(Integer idDNI, String nombre, String apellido, Byte[] password,LinkedList<Curso> cursos){
            this.setIdDNI(idDNI);
            this.setNombre(nombre);
            this.setApellido(apellido);
            this.setTipoUsuario(TipoUsuario.PROFESOR);
            this.setPassword(password);
            this.cursos = cursos;
        }
        public LinkedList<Curso> getCursos(){
            return cursos;
        }
        public void setCurso(LinkedList<Curso> cursos){
            this.cursos = cursos;
        }
}
