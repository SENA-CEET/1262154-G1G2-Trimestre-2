package co.edu.sena.clasesrelaciones.asociacion.ejemplo2;

/**
 * Created by Enrique on 14/03/2017.
 */
public class APP {
    public static void main(String[] args) {
        Billetera b = new Billetera();
        System.out.println(b.getMoneda());
        System.out.println(b.getBilletes());
        Billete b3 = new Billete();
        b.getBilletes().add(b3);
        System.out.println(b.getBilletes().get(0));

        Billete bt = b.getBilletes().get(0);
        b.getBilletes().remove(0);

        System.out.println(bt);

        System.out.println(b.getBilletes().size());
        b.setNombre("totto");
        System.out.println(b.getNombre());


        String a= new String("Hola mundo");// es poco fiable gasta mas procesamiento
        String b2 = "hola como esta";


    }
}
