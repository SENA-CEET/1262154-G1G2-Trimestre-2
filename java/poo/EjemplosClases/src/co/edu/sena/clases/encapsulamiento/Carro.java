/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.clases.encapsulamiento;

/**
 *
 * @author Enrique
 */
public class Carro {

    private String marca;
    private String color;
    private String placa;
    private float velocidad;
    private String modelo;

    public void acelerar() {
        this.velocidad = this.velocidad + 10;
    }

    public void frenar() {
        if (this.velocidad >= 10) {
            this.velocidad = this.velocidad - 10;
        }else{
            System.out.println("el carro esta quieto");
        }
    }

    //metodo accesor
    public String getMarca() {
        return marca;
    }

    //metodo mutador
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

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
