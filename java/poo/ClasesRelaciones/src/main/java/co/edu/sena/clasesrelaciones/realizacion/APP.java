package co.edu.sena.clasesrelaciones.realizacion;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Enrique on 1/03/2017.
 */
public class APP {
    public static void main(String[] args) {
        CiegoMujer c1 = new Mujer();

        System.out.println(c1);
        c1.comer();
        c1.caminar();
        c1.dormir();
        c1.correr();
        c1.amamantar();
        c1.darLuz();
        c1.escuchar();

        MudoMujer mj = (MudoMujer)c1; //cast
        System.out.println(mj);
        mj.escuchar();

        if(mj==c1){
            System.out.println("son igules");
        }else{
            System.out.println("son diferente");
        }


        //usted debe de programar para las interfaces mas no para implementaciones











    }
}
