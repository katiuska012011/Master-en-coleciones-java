package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodBonarySearch {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(3);
        numeros.add(6);
        numeros.add(8);
        numeros.add(8);
        numeros.add(1);
        numeros.add(9);
        numeros.add(11);

        Collections.sort(numeros);

        System.out.println("\n");
        System.out.println(numeros);

        int indice = Collections.binarySearch(numeros, 1);
        System.out.println("El indice del numero 1 es "+indice);
    }
}
