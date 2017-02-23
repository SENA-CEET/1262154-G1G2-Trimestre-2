package co.edu.sena.arreglos;

/**
 * Created by Enrique on 20/02/2017.
 */
public class Persona {
    private float peso;
    private float altura;
    private float indiceMasaCorporal;

    public Persona(float peso, float altura) {
        this.peso = peso;
        this.altura = altura;
        this.indiceMasaCorporal = this.peso/(float)Math.pow(this.altura,2);
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.indiceMasaCorporal = this.peso/(float)Math.pow(this.altura,2);
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
        this.indiceMasaCorporal = this.peso/(float)Math.pow(this.altura,2);
    }

    public float getIndiceMasaCorporal() {
        return indiceMasaCorporal;
    }

}
