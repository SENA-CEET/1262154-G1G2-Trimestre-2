/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.clasesrelaciones.generalizacion.automoviles;

/**
 *
 * @author Enrique
 */
public class Taxi extends Automovil{
    
    private int taximetro;
    
    public Taxi(String marca, String color, String placa, int sillas, int taximetro){
    	super(marca, color, placa, sillas);
    	this.taximetro = taximetro;
    	
    }

    public int getTaximetro() {
        return taximetro;
    }

    public void setTaximetro(int taximetro) {
        this.taximetro = taximetro;
    }
    
    
    
}
