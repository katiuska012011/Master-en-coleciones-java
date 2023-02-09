package Listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ArrayList1 {
    public static void main(String[] args) {

//        Creacion de arrayList
        List<String> listaColores = new ArrayList<>();

//        Creación mediante la clase arrays
        String[] nombre = {"Paola", "Rossy", "Javier"};
        List<String> listaNombre = Arrays.asList(nombre);

//        Adición de elemento individuales
        listaColores.add("Blue");
        listaColores.add("Pink");
        listaColores.add("Yellow");

//        Contruir lista a partir de otra
        List<String> elementos = new ArrayList<>(listaColores);

//        Adición de elementos de otra colección.
        elementos.addAll(listaNombre);

//        Iteración a traves del ArrayList
        System.out.println("Lista de nombres: " );
        listaNombre.forEach( (x) -> System.out.println(x));

//        Iteracion a través del ArrayList
        ListIterator<String> listIterator = listaColores.listIterator();

        System.out.println("\n\nRecorrido con iterador");
        while(listIterator.hasNext()){
            System.out.println("Color: "+listIterator.next());
        }

        System.out.println("\n\nRecorrido inverso con iterador ");
        while(listIterator.hasPrevious()){
            System.out.println("Color: "+listIterator.previous());
        }

        System.out.println("\n\n Eliminar elementos cuando se esta iterando");
        while(listIterator.hasNext()){
            if(listIterator.next().equals("Pink")){
                listIterator.remove();
            }
        }

        for(ListIterator<String> lis =  listaColores.listIterator(); lis.hasNext();){
            System.out.println("Color:"+lis.next());
        }
    }
}
