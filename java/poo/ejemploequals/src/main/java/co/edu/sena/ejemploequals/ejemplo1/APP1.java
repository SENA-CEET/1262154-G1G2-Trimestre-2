package co.edu.sena.ejemploequals.ejemplo1;

/**
 * Created by Enrique on 16/03/2017.
 */
public class APP1 {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.setTipoDocumento("CC");
        p1.setNumeroDocumento("12345");
        p1.setEdad(25);
        Persona p2 = new Persona();
        p2.setTipoDocumento("CC");
        p2.setNumeroDocumento("12345");
        p2.setEdad(25);
        Persona p3 = new Persona();
        Persona p4 = new Persona();
        Persona p5 = new Persona();
        Persona p6 = new Persona();

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        System.out.println(p1.getTipoDocumento().equals(p2.getTipoDocumento()));
        System.out.println(p1.getEdad() == p2.getEdad());

        System.out.println(p1.equals("hola mundo"));


        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode() == p2.hashCode());


    }
}
