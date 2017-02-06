package co.edu.sena.ejercicio2;

public class Bicicleta {

    private String marca;
    private String color;
    private short velocidad;
    private short cambioTrasero;
    private short cambioDelantero;
    private short cambioTraseroActual;
    private short cambioDelanteroActual;

    /**
     *
     * @param marca
     * @param color
     */
    public Bicicleta(String marca, String color) {
        this.marca = marca;
        this.color = color;

    }

    /**
     *
     * @param marca
     * @param color
     * @param cambioTrasero
     * @param cambioDelantero
     */
    public Bicicleta(String marca, String color, short cambioTrasero, short cambioDelantero) {
        this.marca = marca;
        this.color = color;
        this.cambioTrasero = cambioTrasero;
        this.cambioDelantero = cambioDelantero;

        this.cambioDelanteroActual = 1;

        this.cambioTraseroActual = 1;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getColor() {
        return this.color;
    }

    public short getVelocidad() {
        return this.velocidad;
    }

    public short getCambioTrasero() {
        return this.cambioTrasero;
    }

    public short getCambioDelantero() {
        return this.cambioDelantero;
    }

    public short getCambioTraseroActual() {
        return this.cambioTraseroActual;
    }

    public short getCambioDelanteroActual() {
        return this.cambioDelanteroActual;
    }

    public void aumentarCambioDelantero() {
        if (this.cambioDelanteroActual < this.cambioDelantero) {
            this.cambioDelanteroActual = (short) (this.cambioDelanteroActual + 1);

        } else {
            System.out.println("estoy en el cambio maximo");
        }

    }

    public void aumentarCambioTrasero() {
        if (this.cambioTraseroActual < this.cambioTrasero) {
            this.cambioTraseroActual = (short) (this.cambioTraseroActual + 1);
           
        } else {
            System.out.println("estoy en el cambio maximo");
        }
    }

    public void disminuirCambioDelantero() {
        if (this.cambioDelanteroActual > 1) {
            this.cambioDelanteroActual = (short) (this.cambioDelanteroActual - 1);

        } else {
            System.out.println("estoy en el cambio delantero minimo");
        }
    }

    public void disminuirCambioTrasero() {
        if (this.cambioTraseroActual > 1) {
            this.cambioTraseroActual = (short) (this.cambioTraseroActual - 1);

        } else {
            System.out.println("estoy en el cambio trasero minimo");
        }
    }

    public void aumentarVelocidad() {
        if (this.velocidad < 100) {
            this.velocidad += 10;
        } else {
            System.out.println("no puedo aumentar la velocidad estoy al maximo");
        }
    }

    public void disminuirVelocidad() {
        if (velocidad > 0) {
            this.velocidad -= 10;
        } else {
            System.out.println("no puedo disminuir la velocidad estoy quieta");
        }
    }

}
