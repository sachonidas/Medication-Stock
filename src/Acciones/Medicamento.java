/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acciones;

/**
 *
 * @author Usuario
 */
public class Medicamento {
    
    private String nombreMedicamento;
    private String dosisMedicamento;
    private String cantidadMedicamento;
    private String maximoMedicamento;
    private String minimoMedicamento;
    private String fechaCaducidad;
    private String comentarioMedicamento;

    public String getComentarioMedicamento() {
        return comentarioMedicamento;
    }

    public void setComentarioMedicamento(String comentarioMedicamento) {
        this.comentarioMedicamento = comentarioMedicamento;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
    
    public String getDosisMedicamento() {
        return dosisMedicamento;
    }

    public void setDosisMedicamento(String dosisMedicamento) {
        this.dosisMedicamento = dosisMedicamento;
    }

    public String getNombreMedicamento() {
        return nombreMedicamento;
    }

    public void setNombreMedicamento(String nombreMedicamento) {
        this.nombreMedicamento = nombreMedicamento;
    }

    public String getCantidadMedicamento() {
        return cantidadMedicamento;
    }

    public void setCantidadMedicamento(String cantidadMedicamento) {
        this.cantidadMedicamento = cantidadMedicamento;
    }

    public String getMaximoMedicamento() {
        return maximoMedicamento;
    }

    public void setMaximoMedicamento(String maximoMedicamento) {
        this.maximoMedicamento = maximoMedicamento;
    }

    public String getMinimoMedicamento() {
        return minimoMedicamento;
    }

    public void setMinimoMedicamento(String minimoMedicamento) {
        this.minimoMedicamento = minimoMedicamento;
    }
    
    
}
