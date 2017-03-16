package co.edu.sena.clasesrelaciones.asociacion.ejemplo4;

/**
 * Created by Enrique on 16/03/2017.
 */
public class Canasta {
    private Balon[] balones;
    private int size;
    private int cantidadActual;

    public Canasta(int size) {
        this.balones = new Balon[size];
        this.size=size;
    }

    public Balon[] getBalones() {
        return balones;
    }

    public void aregarBalon(Balon balon){
        if(cantidadActual<size){
            this.balones[cantidadActual]=balon;
            cantidadActual++;
        }else{
            System.out.println("no caben mas balones");
        }
    }

    public int getCantidadActual() {
        return cantidadActual;
    }
}
