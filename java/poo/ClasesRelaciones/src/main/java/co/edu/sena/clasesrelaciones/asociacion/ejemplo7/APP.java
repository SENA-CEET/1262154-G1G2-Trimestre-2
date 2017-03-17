package co.edu.sena.clasesrelaciones.asociacion.ejemplo7;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Enrique on 17/03/2017.
 */
public class APP {
    public static void main(String[] args) {
        Casa c1 = new Casa();

        List<Persona> lista = new ArrayList<>();

        Persona p1 = new Persona();
        p1.setTipoDocumento("CC");
        p1.setNumeroDocumento("12345");
        Persona p2 = new Persona();
        p2.setTipoDocumento("CC");
        p2.setNumeroDocumento("4523");
        Persona p3 = new Persona();
        p3.setTipoDocumento("CC");
        p3.setNumeroDocumento("435234");
        Persona p4 = new Persona();
        p4.setTipoDocumento("CC");
        p4.setNumeroDocumento("4523");




        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);

        c1.setPropietarios(lista);

        for (Persona p: c1.getPropietarios()
             ) {
            System.out.println(p);
        }

        System.out.println("---------------");
        int con =0;
        for (Persona p :c1.getPropietarios()
             ) {
            if(p.equals(p2)){
                con++;
            }
        }
        System.out.println(con);
        for (int i=0;i<=con;i++) {
            quitarPropietarioCasa(c1, p2);
        }
        for (Persona p: c1.getPropietarios()
                ) {
            System.out.println(p);
        }

        System.out.println(c1);

    }

    public static void quitarPropietarioCasa(Casa casa, Persona persona){
        casa.getPropietarios().remove(persona);

    }

}
