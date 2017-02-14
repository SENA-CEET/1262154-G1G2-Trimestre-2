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
public abstract class Automovil {
    
    private String marca;
    private String color;
    private String placa;
    private int sillas;

    
    public Automovil(String marca, String color, String placa, int sillas) {
        this.marca = marca;
        this.color = color;
        this.placa = placa;
        this.sillas = sillas;
    }

    
    
    public void encender(){
        System.out.println("estoy prendido y use gasolina");
    }
    
    public void apagar(){
        System.out.println("estoy apagado");
    }
    
    public void frenar(){
        System.out.println("estoy frenando");
    }
    
    private void acelerar(){
        System.out.println("estoy acelerando");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getSillas() {
        return sillas;
    }

    public void setSillas(int sillas) {
        this.sillas = sillas;
    }

    public abstract void correr();
}
