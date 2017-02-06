package co.edu.sena.ejercicio2;

public class APP {

    /**
     *
     * @param arg
     */
    public static void main(String[] arg) {
        Bicicleta bicicleta1 = new Bicicleta("shimano", "azul", (short) 10, (short) 3);
        imprimirBicicleta(bicicleta1);
        //1
        bicicleta1.aumentarCambioDelantero();
        bicicleta1.aumentarVelocidad();
        //2
        bicicleta1.aumentarCambioDelantero();
        bicicleta1.aumentarVelocidad();
        //3
        bicicleta1.aumentarCambioDelantero();
        bicicleta1.aumentarVelocidad();
        //4
        bicicleta1.aumentarCambioDelantero();
        bicicleta1.aumentarVelocidad();
        //5
        bicicleta1.aumentarCambioDelantero();
        bicicleta1.aumentarVelocidad();
        
        //1
        bicicleta1.disminuirCambioDelantero();
        bicicleta1.disminuirVelocidad();
        
        //2
        bicicleta1.disminuirCambioDelantero();
        bicicleta1.disminuirVelocidad();
        
        //3
        bicicleta1.disminuirCambioDelantero();
        bicicleta1.disminuirVelocidad();
        
        //4
        bicicleta1.disminuirCambioDelantero();
        bicicleta1.disminuirVelocidad();
        
        //5
        bicicleta1.disminuirCambioDelantero();
        bicicleta1.disminuirVelocidad();
        
        //6
        bicicleta1.disminuirCambioDelantero();
        bicicleta1.disminuirVelocidad();
        
        //7
        bicicleta1.disminuirCambioDelantero();
        bicicleta1.disminuirVelocidad();
        
        //8
        bicicleta1.disminuirCambioDelantero();
        bicicleta1.disminuirVelocidad();
        
        //9
        bicicleta1.disminuirCambioDelantero();
        bicicleta1.disminuirVelocidad();
        
        //10
        bicicleta1.disminuirCambioDelantero();
        bicicleta1.disminuirVelocidad();
        
        //1
        bicicleta1.aumentarCambioTrasero();
        bicicleta1.aumentarVelocidad();
        
        //2
        bicicleta1.aumentarCambioTrasero();
        bicicleta1.aumentarVelocidad();
        
        //3
        bicicleta1.aumentarCambioTrasero();
        bicicleta1.aumentarVelocidad();
        
        //4
        bicicleta1.aumentarCambioTrasero();
        bicicleta1.aumentarVelocidad();
        
        //5
        bicicleta1.aumentarCambioTrasero();
        bicicleta1.aumentarVelocidad();
        
        //6
        bicicleta1.aumentarCambioTrasero();
        bicicleta1.aumentarVelocidad();
        
        //7
        bicicleta1.aumentarCambioTrasero();
        bicicleta1.aumentarVelocidad();
        
        //8
        bicicleta1.aumentarCambioTrasero();
        bicicleta1.aumentarVelocidad();
        
        //9
        bicicleta1.aumentarCambioTrasero();
        bicicleta1.aumentarVelocidad();
        
        //10
        bicicleta1.aumentarCambioTrasero();
        bicicleta1.aumentarVelocidad();
        
        //11
        bicicleta1.aumentarCambioTrasero();
        bicicleta1.aumentarVelocidad();
        
        //12
        bicicleta1.aumentarCambioTrasero();
        bicicleta1.aumentarVelocidad();
        
        //13
        bicicleta1.aumentarCambioTrasero();
        bicicleta1.aumentarVelocidad();
        
        //14
        bicicleta1.aumentarCambioTrasero();
        bicicleta1.aumentarVelocidad();
        
        //15
        bicicleta1.aumentarCambioTrasero();
        bicicleta1.aumentarVelocidad();
       
        //1
        bicicleta1.disminuirCambioTrasero();
        bicicleta1.disminuirVelocidad();
        
        //2
        bicicleta1.disminuirCambioTrasero();
        bicicleta1.disminuirVelocidad();
        
        //3
        bicicleta1.disminuirCambioTrasero();
        bicicleta1.disminuirVelocidad();
        
        //4
        bicicleta1.disminuirCambioTrasero();
        bicicleta1.disminuirVelocidad();
        
        //5
        bicicleta1.disminuirCambioTrasero();
        bicicleta1.disminuirVelocidad();
        
        imprimirBicicleta(bicicleta1);
        
        
        Bicicleta bicicleta2 = new Bicicleta("shimano", "rosada");
        bicicleta2.aumentarVelocidad();
        bicicleta2.aumentarVelocidad();
        bicicleta2.aumentarVelocidad();
        bicicleta2.aumentarVelocidad();
        
        bicicleta2.disminuirVelocidad();
        bicicleta2.disminuirVelocidad();
        
        imprimirBicicleta(bicicleta2);

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
