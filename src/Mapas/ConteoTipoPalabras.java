package Mapas;

import java.util.*;

public class ConteoTipoPalabras {
    public static void main(String[] args) {

        Map<String, Integer> miMap = new HashMap<>();
        crearMap(miMap);
        mostrarMap(miMap);
    }

    private static void crearMap(Map<String, Integer> map) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe una cadena");
        String entrada = scanner.nextLine();

//        divide la cadena en tokens
        String[] tokens = entrada.split(" ");

        for (String token: tokens){
            String palabra = token.toLowerCase();

            if(map.containsKey(palabra)){
                int cuenta = map.get(palabra);
                map.put(palabra, cuenta+1);
            }else{
                map.put(palabra, 1);
            }
        }

    }

    private static void  mostrarMap(Map<String, Integer> map) {

        Set<String> llaves = map.keySet();
//        Ordena las claves
        TreeSet<String> clavesOrdenadas = new TreeSet<>(llaves);
        System.out.println("\nEl mapa contiene: \n Clave\t\tValor");

        for(String clave: clavesOrdenadas){
            System.out.printf(clave + " \t\t"+ map.get(clave) +" \n");
        }
        System.out.println("\n\nEl size del map es "+map.size());

        int total = 0;
        for (Integer values: map.values()){
            total +=values ;
        }
        System.out.println("\n Total de palabras: "+total);

    }
}
