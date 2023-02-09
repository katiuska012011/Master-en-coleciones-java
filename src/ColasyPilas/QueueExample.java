package ColasyPilas;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        // Añade los elmentos {0, 1, 2, 3, 4} a la queue
        for (int i = 0; i<5; i++) {
            queue.add(i);
//            queue .offer(i);
        }

//        Imprimir queue
        System.out.println("Elementos de la cola: "+queue);

//        Elimina el head de la queue
        int head = queue.remove();
//        int head = queue.poll();
        System.out.println("El head de esta cola es:"+head);

        System.out.println("Los elementos d ela cola despues del método remove :"+queue);
        int size = queue.size();
        System.out.println("la cabeza de la cola es:"+queue.peek());
        System.out.println("El tama;o de la cola es: "+size);
    }

}
