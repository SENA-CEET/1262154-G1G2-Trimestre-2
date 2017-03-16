package co.edu.sena.clasesrelaciones.realizacion;

/**
 * Created by Enrique on 1/03/2017.
 */
public final class Mujer extends Humano implements CiegoMujer, AmputadoMujer, MudoMujer, SordoMudoMujer {

    public void darLuz(){
        System.out.println("doy a luz");
    }

    public void amamantar(){
        System.out.println("doy leche");
    }
}
