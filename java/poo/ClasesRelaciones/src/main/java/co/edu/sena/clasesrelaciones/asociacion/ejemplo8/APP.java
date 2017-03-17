package co.edu.sena.clasesrelaciones.asociacion.ejemplo8;

import java.util.Arrays;

/**
 * Created by Enrique on 17/03/2017.
 */
public class APP {
    public static void main(String[] args) {
        Casa c1 = new Casa();

        Persona p1 = new Persona();
        p1.setTipoDocumento("CC");
        p1.setNumeroDocumento("12345");
        Persona p2 = new Persona();
        p2.setTipoDocumento("CC");
        p2.setNumeroDocumento("123");

        agregarPropietarioCasa(c1, p1);
        agregarPropietarioCasa(c1, p2);
        agregarPropietarioCasa(c1, p1);
        agregarPropietarioCasa(c1, p1);

        System.out.println(c1.getCantidadPropietarios());



        for (Persona p:c1.getPropietarios()
             ) {
            System.out.println(p);
        }

        quitarPropietarioCasa(c1, p1);

        System.out.println(c1.getCantidadPropietarios());



        for (Persona p:c1.getPropietarios()
                ) {
            System.out.println(p);
        }





    }

    public static void agregarPropietarioCasa(Casa casa, Persona propietario){

        if(casa.getPropietarios()== null){
            casa.setPropietarios(new Persona[1]);
            casa.getPropietarios()[0]=propietario;
           // casa.setCantidadPropietarios(casa.getCantidadPropietarios()+1);
        }else{
            Persona [] nuevosPropietario = new Persona[(casa.getPropietarios().length+1)];


            for(int i = 0; i<(casa.getPropietarios().length);i++){

                        nuevosPropietario[i] = casa.getPropietarios()[i];

            }
            nuevosPropietario[casa.getPropietarios().length]=propietario;
            casa.setPropietarios(nuevosPropietario);
            casa.setCantidadPropietarios(nuevosPropietario.length);

        }



    }

    public static void quitarPropietarioCasa(Casa casa, Persona propietario){
        int contIguales =0, cont2 =0;
        if(casa.getPropietarios()!= null){
            for(int i=0; i<casa.getPropietarios().length;i++){
                if(casa.getPropietarios()[i].equals(propietario) ){
                    contIguales++;
                }
            }
            Persona [] nuevosPropietarios= new Persona[casa.getPropietarios().length-contIguales];
            for(int i=0; i<casa.getPropietarios().length;i++){
                if(!casa.getPropietarios()[i].equals(propietario) ){
                    nuevosPropietarios[cont2]= casa.getPropietarios()[i];
                    cont2++;
                }
            }
            casa.setPropietarios(nuevosPropietarios);
            casa.setCantidadPropietarios(nuevosPropietarios.length);
        }else{
            System.out.println("esta casa no tiene propietarios");
        }
    }
}
