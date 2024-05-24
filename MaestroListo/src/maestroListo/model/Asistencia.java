/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maestroListo.model;

import java.util.Date;
import maestroListo.model.Enum.EnumAsistencia;

/**
 *
 * @author veronica
 */
public class Asistencia {
    private Date fecha;
    private EnumAsistencia asistencia;
    
    public Asistencia(){}
    public Asistencia(Date fecha, EnumAsistencia asistencia){
        this.fecha= fecha;
        this.asistencia= asistencia;
    }
    
    public Date getFecha(){
        return fecha;
    }
    public void setFecha(Date fecha){
        this.fecha= fecha;
    }
    public EnumAsistencia getAsistencia(){
        return asistencia;
    }
    public void setAsistencia(EnumAsistencia asistencia){
        this.asistencia = asistencia;
    }
    
}
