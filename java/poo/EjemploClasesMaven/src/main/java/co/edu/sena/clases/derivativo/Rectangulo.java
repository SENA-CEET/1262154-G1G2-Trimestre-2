/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.clases.derivativo;

/**
 *
 * @author Enrique
 */
public class Rectangulo {
    private float area;
    private float ladoA;
    private float ladoB;

    public float getArea() {
        return area;
    }

    public float getLadoA() {
        return ladoA;
    }

    public float getLadoB() {
        return ladoB;
    }

    public void setLadoA(float ladoA) {
        this.ladoA = ladoA;
        this.area = this.ladoA * this.ladoB;
    }

    public void setLadoB(float ladoB) {
        this.ladoB = ladoB;
        this.area = this.ladoA * this.ladoB;
    }
    
    
    
}
