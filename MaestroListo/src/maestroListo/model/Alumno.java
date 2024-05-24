/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maestroListo.model;

import java.util.LinkedList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import maestroListo.model.Enum.TipoUsuario;
@Entity
@Table (name = "ALUMNOS")
public class Alumno extends User{
     @Column (name ="ASISTENCIAS")
    private LinkedList<Asistencia> asistencias;
     @Column (name ="NOTAS")
    private LinkedList<Nota> notasAlumno;
       
       public Alumno(){}
       public Alumno(Integer idDNI, String nombre, String apellido, Byte[] password,LinkedList<Asistencia> asistencias,LinkedList<Nota> notasAlumno){
           this.setIdDNI(idDNI);
           this.setNombre(nombre);
           this.setApellido(apellido);
           this.setTipoUsuario(TipoUsuario.ALUMNO);
           this.setPassword(password);
           this.asistencias = asistencias;
           this.notasAlumno = notasAlumno;
       }
       public  LinkedList<Asistencia> getAsistencias(){
           return asistencias;
       }
       public void setAsistencias( LinkedList<Asistencia> asistencias){
           this.asistencias = asistencias;
       }
       public LinkedList<Nota> getNotasAlumno(){
           return notasAlumno;
       }
       public void setNotasAlumnos(LinkedList<Nota> notasAlumnos){
           this.notasAlumno = notasAlumnos;
       }
}
