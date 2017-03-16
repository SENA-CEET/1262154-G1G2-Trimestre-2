package co.edu.sena.ejemplocollections.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by Enrique on 3/03/2017.
 */
public class Ejemplo1 {
    public static void main(String[] args) {

        int [] arreglo = new int[10];
        arreglo[0]=1;
        arreglo[5]= 8;



        List<Integer> arreglo2 = new ArrayList<>();
        arreglo2.add(1);
        arreglo2.add(1);
        arreglo2.add(1);
        arreglo2.add(1);
        arreglo2.add(1);
        arreglo2.add(1);
        arreglo2.add(1);
        arreglo2.add(1);
        arreglo2.add(1);
        arreglo2.add(6);
        arreglo2.add(6);
        arreglo2.add(1);
        arreglo2.add(1);
        arreglo2.add(1);
        arreglo2.add(1);
        arreglo2.add(1);
        arreglo2.add(1);
        arreglo2.add(5);

        //imperativo structurado
        for (int i=0; i<arreglo2.size();i++){
            System.out.println(arreglo2.get(i));
        }
        //imperativo orientado a objetos
        for(Integer numero : arreglo2){
            
            System.out.println(numero);
        }
        
        // imperativo patron de diseño iterator
        Iterator<Integer> i = arreglo2.iterator();
        while(i.hasNext()){
            Integer o = i.next();
            System.out.println(o);
        }
        
        

        //declarativos funcional
        arreglo2.forEach((Integer integer) -> {
            System.out.println(integer);
        });
        
        
        
        
        System.out.println("el tamaño de mi coleccion es: "+arreglo2.size());
        
        
       
        
        
        

    }
}
