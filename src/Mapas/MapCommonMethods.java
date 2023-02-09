package Mapas;

import java.util.HashMap;
import java.util.Map;

public class MapCommonMethods {
    public static void main(String[] args) {
        //Ejemplo de un mapa que almacena un nombre de jugador
        //En relación con su equipo. Tanto el nombre del jugador como el nombre del equipo, serán String
        Map<String, String> players = new HashMap<>();

//        Inserción de elementos en el mapa
        players.put("Leo Messi", "Barcelona");
        players.put("Luis Suarez", "Barcelona");
        players.put("Arturo Vidal", "Barcelona");
        players.put("Rakitik", "Barcelona");
        players.put("Sergio Ramos", "Real Madrid");
        players.put("Toni Kroos", "Real Madrid");
        players.put("Luka Modric", "Real Madrid");
        players.put("Ansu Fati", null);

//        Utilizando el constructor de la clase

        Map<String, String> players2 = new HashMap<>(players);

//        Utilizando el metodo putAll (Map <? extends k, ? extends v> m)
//        Map<String, String> players3 = new HashMap<>();
//        players3.putAll(players);

//        Insertar si hay un valor que esta ausente
        players.putIfAbsent("Ansu Fati", "Barcelona");

        System.out.println("El equipo de Ansu Fati es "+players.get("Ansu Fati"));

    }
}
