package ColasyPilas;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class StringPriorityQueue {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();

//        a;adir items

        queue.add("C");
        queue.add("C++");
        queue.add("Java");
        queue.add("Python");

        System.out.println("El valor del hea de este Priority es " + queue.peek());
        queue.poll();
        System.out.println("Despues de remover el elemento de mayor pripridad, la cola queda de la siguiente manera ");

        Iterator<String> it = queue.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        queue.remove("Java");
        System.out.println("Despues de remover java");

        Iterator<String> it2 = queue.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }
    }
}
