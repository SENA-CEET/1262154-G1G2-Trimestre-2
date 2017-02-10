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
public class Camion extends Automovil{

    private String colorCarpa;
    
    public Camion(String marca, String color, String placa, int silla, String colorCarpa){
    	super(marca, color, placa, silla);
    	this.colorCarpa =colorCarpa;
    }
    
   @Override //sobreescritura del metodo
    public void encender(){
    	System.out.println("enciendo a Diesel");
    }
   
   

    public String getColorCarpa() {
        return colorCarpa;
    }

    public void setColorCarpa(String colorCarpa) {
        this.colorCarpa = colorCarpa;
    }
    
    

   
    
    
    
}
