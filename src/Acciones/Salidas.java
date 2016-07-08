/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acciones;

/**
 *
 * @author l.arancibia
 */
public class Salidas {
    
    public String fechaSalida;
    public String nombreMediamento;
    public String cantidadSalida;
    public String comentarioSalida;

    public String getComentarioSalida() {
        return comentarioSalida;
    }

    public void setComentarioSalida(String comentarioSalida) {
        this.comentarioSalida = comentarioSalida;
    }
    

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getNombreMediamento() {
        return nombreMediamento;
    }

    public void setNombreMediamento(String nombreMediamento) {
        this.nombreMediamento = nombreMediamento;
    }

    public String getCantidadSalida() {
        return cantidadSalida;
    }

    public void setCantidadSalida(String cantidadSalida) {
        this.cantidadSalida = cantidadSalida;
    }
    
    
    
    
}
