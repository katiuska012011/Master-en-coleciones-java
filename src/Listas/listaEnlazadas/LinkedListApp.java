package Listas.listaEnlazadas;

public class LinkedListApp {
    public static void main(String[] args) {
        SimpleLinkedList list = new SimpleLinkedList();
        list.push(1.23);
        list.push(5.60);
        list.push(30.00);

        list.printContent();
        Node nodo = list.insert(5.60, 50);
        if(nodo == null){
            System.out.println("No se puso insertar un nuevo nodo");
        }else{
            System.out.println("El nodo se ha insertado correctamente");
        }
        System.out.println("El nuevo contenido de la lista enlazada es:");
        list.printContent();
        nodo = list.contains(20);

        if(nodo == null){
            System.out.println("El nodo no se ha encontrado");
        }else{
            System.out.println("El nodo esta en la lista");
        }
    }
}
