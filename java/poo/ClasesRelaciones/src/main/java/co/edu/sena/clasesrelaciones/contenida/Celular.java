package co.edu.sena.clasesrelaciones.contenida;

/**
 * Created by Enrique on 2/03/2017.
 */
public   class Celular {

    private String marca;
    private String color;

    public void marca(){
         class Contacto{
            private String nombre;

            public String getNombre() {
                return nombre;
            }

            public void setNombre(String nombre) {
                this.nombre = nombre;
            }
        }
        Contacto c1 = new Contacto();

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Mensaje getMensaje(){
        return new Mensaje();
    }

    public class Mensaje implements MensajeInterface{

        private String destinatario;
        private String texto;

        public String getDestinatario() {
            return destinatario;
        }

        public void setDestinatario(String destinatario) {
            this.destinatario = destinatario;
        }

        public String getTexto() {
            return texto;
        }

        public void setTexto(String texto) {
            this.texto = texto;
        }

        public class Emoticon implements EmoticonIntreface{

            private String imagen;
            private int tamanio;

            public String getImagen() {
                return imagen;
            }

            public void setImagen(String imagen) {
                this.imagen = imagen;
            }

            public int getTamanio() {
                return tamanio;
            }

            public void setTamanio(int tamanio) {
                this.tamanio = tamanio;
            }
        }


    }

    public static class RanuraMemoria{
        public final static int TAMANIO_MAX = 32;

        public static void almacenar(){
            System.out.println("estoy almacenando");
        }

        public void leer(){
            System.out.printf("estoy leyendo");
        }



    }







}
