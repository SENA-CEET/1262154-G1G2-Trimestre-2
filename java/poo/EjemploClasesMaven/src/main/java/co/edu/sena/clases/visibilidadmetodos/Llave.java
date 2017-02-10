/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.clases.visibilidadmetodos;

/**
 *
 * @author Enrique
 */
public class Llave {
    private String color;
    private String material;
    private String tamanio;

    public String getColor() {
        return color;
    }

    protected void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }
    
    
    
            
    
}
