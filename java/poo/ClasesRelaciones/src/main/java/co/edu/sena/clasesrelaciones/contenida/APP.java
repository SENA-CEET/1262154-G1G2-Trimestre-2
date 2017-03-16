package co.edu.sena.clasesrelaciones.contenida;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Created by Enrique on 2/03/2017.
 */
public class APP {
    public static void main(String[] args) {
    // clases internas estaticas en ingles Static Nested Classes
        System.out.println(Celular.RanuraMemoria.TAMANIO_MAX);
        Celular.RanuraMemoria.almacenar();


        Celular.RanuraMemoria rm1 = new Celular.RanuraMemoria();
        System.out.println(rm1);

        // clases interna en ingles Inner Classes

        Celular.Mensaje ms = new Celular().new Mensaje();// se pierde el objeto celular
        Celular c1 = new Celular(); //celuar
        Celular.Mensaje ms2 = c1.new Mensaje(); // mensaje a partir del celular

        // una clase dentro de un metodo

        Celular c2 = new Celular();
        c2.marca();

        AnimalCuadrupedo a1 = new AnimalCuadrupedo() {
            @Override
            public void correr() {
                System.out.println("corro");
            }
        };
        a1.correr();
        System.out.println(a1);
        AnimalCuadrupedo a2 = new AnimalCuadrupedo() {
            @Override
            public void correr() {
                System.out.println("corro");
            }
        };

        System.out.println(a2);


        List<String> lista = Arrays.asList("a","b","c");

        lista.stream().forEach(System.out::println);
        
       
        
       

        













    }

}
