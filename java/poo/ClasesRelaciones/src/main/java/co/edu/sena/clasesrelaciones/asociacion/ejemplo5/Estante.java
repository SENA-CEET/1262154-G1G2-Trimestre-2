package co.edu.sena.clasesrelaciones.asociacion.ejemplo5;

/**
 * Created by Enrique on 16/03/2017.
 */
public class Estante {
    private Balon[] balones;
    private int size;
    private int cantidadActual;

    public Estante(int size) {
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

    public void quitarBalon(Balon balon){
        Balon [] balt = new Balon[this.size];
        int cont=0;
        for(int i =0; i<this.cantidadActual;i++){
            if(!this.getBalones()[i].equals(balon)){
                balt[cont]=this.getBalones()[i];
                cont++;
            }
        }
        this.setBalones(balt);
        this.cantidadActual=cont;

    }

    public void setBalones(Balon[] balones) {
        this.balones = balones;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }
}
