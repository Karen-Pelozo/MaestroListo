/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maestroListo.model;

/**
 *
 * @author veronica
 */
public class Nota {
    private String descripcion ;
    private Double notaNumerica;
    public Nota(){}
    public Nota(String descripcion, Double notaNumerica){
        this.descripcion=descripcion;
        this.notaNumerica=notaNumerica;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public Double getNotaNumerica(){
        return notaNumerica;
    }
    public void setNotaNumerica(Double notaNumerica){
        this.notaNumerica = notaNumerica;
    }
}
