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
public class Buseta extends Automovil{
    private int registradora;
    private String tableroRuta;
    private boolean  timbre;

    public Buseta(String marca, String color, String placa, int sillas, int registradora, String tableroRuta, boolean timbre) {
        super(marca, color, placa, sillas);
        this.registradora =registradora;
        this.tableroRuta = tableroRuta;
        this.timbre = timbre;
    }
    
    public void abrePuerta(){
    	System.out.println("abro la puerta");
    }
    
    public void presionarTimbre(){
        this.timbre = true;
    }
    
    public void soltarTimbre(){
        this.timbre = false;
    }

    public int getRegistradora() {
        
        return registradora;
    }

    public void setRegistradora(int registradora) {
        this.registradora = registradora;
    }

    public String getTableroRuta() {
        return tableroRuta;
    }

    public void setTableroRuta(String tableroRuta) {
        this.tableroRuta = tableroRuta;
    }
 
    
}
