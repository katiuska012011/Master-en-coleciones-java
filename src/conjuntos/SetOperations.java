package conjuntos;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static void main(String[] args) {

        Set<Integer> a =
                new HashSet<>(Arrays.asList(1, 3, 2, 4, 8, 9, 0));

        Set<Integer> b =
                new HashSet<>(Arrays.asList(1, 3, 7, 5, 4, 0, 7, 5));


        /*
        Union de conjuntos
        En esta operación realizamos un tercer elemento donde contiene
        ambos valores pero sin duplicados
         */

        Set<Integer> union = new HashSet<>(a);
        union.addAll(b);
        System.out.println("Union de dos conjuntos: \n" + union);


        /*
        Intersección de conjuntos
        En esta operación realizamos un tercer elemento donde solo contiene los valores
        que tienen similitud en ambos conjuntos.
         */

        Set<Integer> intersection = new HashSet<>(a);
        intersection.retainAll(b);
        System.out.println("Intersección de dos conjuntos: \n" + intersection);

        /*
        Diferencia de conjuntos
        Esta operación es una especie de resta entre los dos conjuntos.
         */
        Set<Integer> difference = new HashSet<>(a);
        difference.removeAll(b);
        System.out.println("Diferencia de dos conjuntos");
        System.out.println(a);
        System.out.println(b);
        System.out.println(difference);
    }
}
