/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.ejemplocollections.sets;

import java.util.Objects;

/**
 *
 * @author Enrique
 */
public class Persona {

    private String nombre;
    private String telefono;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", telefono=" + telefono + '}';
    }

    @Override
    public boolean equals(Object obj) {
        Persona ot = (Persona) obj;
        return ot.nombre.equals(this.nombre);

    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.telefono);
        return hash;
    }

}
