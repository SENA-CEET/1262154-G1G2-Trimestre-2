package co.edu.sena.arreglos;

/**
 * Created by Enrique on 20/02/2017.
 */
public class Ejemplo3 {
    public static void main(String[] args) {
        Persona [] personas = new Persona[5];
        personas[0] = new Persona(80f,1.80f);
        personas[1] = new Persona(70f,1.70f);
        personas[2] = new Persona(60f,1.55f);
        personas[3] = new Persona(30f,1.20f);
        personas[4] = new Persona(60f,1.60f);


        for(int i=0;i<personas.length;i++){
            System.out.println(personas[i].getPeso());
            System.out.println(personas[i].getAltura());
            System.out.println(personas[i].getIndiceMasaCorporal());
        }

        for(Persona persona : personas){
            System.out.println(persona.getPeso());
            System.out.println(persona.getAltura());
            System.out.println(persona.getIndiceMasaCorporal());

        }


    }
}
