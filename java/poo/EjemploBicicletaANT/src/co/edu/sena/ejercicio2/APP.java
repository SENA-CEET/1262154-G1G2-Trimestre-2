package co.edu.sena.ejercicio2;

public class APP {

    /**
     *
     * @param arg
     */
    public static void main(String[] arg) {
        Bicicleta bicicleta1 = new Bicicleta("shimano", "azul", (short) 10, (short) 3);
        imprimirBicicleta(bicicleta1);
        bicicleta1.aumentarCambioDelantero();
        bicicleta1.aumentarVelocidad();
        bicicleta1.aumentarCambioDelantero();
        bicicleta1.aumentarVelocidad();
        
        bicicleta1.aumentarCambioDelantero();
        bicicleta1.aumentarVelocidad();
        
        bicicleta1.aumentarCambioDelantero();
        bicicleta1.aumentarVelocidad();
        
        bicicleta1.aumentarCambioDelantero();
        bicicleta1.aumentarVelocidad();
        
        bicicleta1.aumentarCambioDelantero();
        bicicleta1.aumentarVelocidad();
        
        bicicleta1.aumentarCambioDelantero();
        bicicleta1.aumentarVelocidad();
        
        imprimirBicicleta(bicicleta1);

    }

    public static void imprimirBicicleta(Bicicleta bicicleta) {
        System.out.println(bicicleta);
        System.out.println("MARCA: " +bicicleta.getMarca());
        System.out.println("COLOR: "+bicicleta.getColor());
        System.out.println("VELOCIDAD "+bicicleta.getVelocidad());
        System.out.println("MAX CAMBIO DEL:"+bicicleta.getCambioDelantero());
        System.out.println("CAMBIO DELANTERO ACTUAL: "+bicicleta.getCambioDelanteroActual());
        System.out.println("MAX CAMBIO TRASERO: "+bicicleta.getCambioTrasero());
        System.out.println("CAMBIO TRASERO ACTUAL: "+bicicleta.getCambioTraseroActual());

    }

}
