package Mapas;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapIterationWays {
    public static void main(String[] args) {
        Map<String, String> players = new HashMap<>();

        players.put("Leo Messi", "Barcelona");
        players.put("Luis Suarez", "Barcelona");
        players.put("Arturo Vidal", "Barcelona");
        players.put("Rakitik", "Barcelona");
        players.put("Sergio Ramos", "Real Madrid");
        players.put("Toni Kroos", "Real Madrid");
        players.put("Luka Modric", "Real Madrid");
        players.put("Ansu Fati", null);

//        Interación usando entrySet

//        Set<Entry<String, String>> entries =  players.entrySet();
//        for(Entry<String, String> entry : entries){
//            System.out.println("Llave: "+entry.getKey() + "Equipo: "+entry.getValue());
//        }

        for (Entry<String, String> entry : players.entrySet()) {
            System.out.println("Jugador: " + entry.getKey() + " Equipo: " + entry.getValue());

        }

        System.out.println("Impresion de jugadores:");
        for (String arg : players.keySet()) {
            System.out.println(arg);
        }

        System.out.println("Impresión de equipos");
        for (String team : players.values()) {
            System.out.println("Equipo: " + team);
        }
        System.out.println("");

        System.out.println("Impresión con iteradores: ");
        for (Iterator<Entry<String, String>> iter = players.entrySet().iterator(); iter.hasNext(); ) {
            Map.Entry<String, String> entry = iter.next();
            String player = entry.getKey();
            String team = entry.getValue();

            System.out.println("Jugador: " + player + " Equipo: " + team);
        }
        System.out.println("");

        System.out.println("Impresión de jugadores y equipos utilizando forEach");
        players.forEach((player, team) -> System.out.println("Jugador: " + player + " Equipo: " + team));
    }
}
