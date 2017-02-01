/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.clases.clasecompleta;

/**
 *
 * @author Enrique
 */
public class Gato {
    
    //atributos
    private String color;
    private String sexo;
    private String raza;
    private String nombre;
    private int edad;
    
    //constructor

    public Gato() {
    }

    public Gato(String color, String sexo, String raza, String nombre, int edad) {
        this.color = color;
        this.sexo = sexo;
        this.raza = raza;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
