package ColasyPilas;

import java.util.ArrayDeque;
import java.util.Deque;

public class BufferActions {

    Deque<String> bufferActions = new ArrayDeque<>();
    Deque<String> redoActions = new ArrayDeque<>();

    public void doActions(String action){
        System.out.println(action);
        insertActionsInBuffer(action);
        System.out.println(bufferActions);
    }

    public void undo(){
        if(bufferActions.isEmpty())
            return;

        System.out.println("Undo");
        String action = bufferActions.pollLast();
        redoActions.push(action);
        System.out.println(bufferActions);
    }
    public void insertActionsInBuffer(String action){
        bufferActions.offerLast(action);
    }

    public void redo(){
        System.out.println("Redo");
        String action = redoActions.pop();
        insertActionsInBuffer(action);
        System.out.println("Redo Actions "+redoActions);
        System.out.println(bufferActions);
    }
    public static void main(String[] args) {
        BufferActions buffer = new BufferActions();
        buffer.doActions("Copiar");
        buffer.doActions("Pegar");
        buffer.doActions("Escribir Hola");
        buffer.doActions("Borrar");
        buffer.undo();
        buffer.undo();
        buffer.redo();
    }
}
