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
public class Entradas {
    
    public String fechaEntrada;
    public String fechaCaducidad;
    public String nombreMediamento;
    public String cantidadEntrada;

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
    
    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getNombreMediamento() {
        return nombreMediamento;
    }

    public void setNombreMediamento(String nombreMediamento) {
        this.nombreMediamento = nombreMediamento;
    }

    public String getCantidadEntrada() {
        return cantidadEntrada;
    }

    public void setCantidadEntrada(String cantidadEntrada) {
        this.cantidadEntrada = cantidadEntrada;
    }
    
    
    
}
