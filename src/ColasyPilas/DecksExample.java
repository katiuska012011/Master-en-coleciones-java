package ColasyPilas;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class DecksExample {
    public static void main(String[] args) {
        Deque<String> numbers = new ArrayDeque<>();
        Stack<String> numbers2 = new Stack<>();

        numbers.offer("1");
        numbers.offer("2");
        numbers.offer("3");
        numbers.offer("4");
        numbers.offer("5");
        numbers.offer("6");
        numbers.offer("7");
        numbers.offer("8");
        numbers.offer("9");

        numbers2.push("1");
        numbers2.push("2");
        numbers2.push("3");
        numbers2.push("4");
        numbers2.push("5");
        numbers2.push("6");
        numbers2.push("7");
        numbers2.push("8");
        numbers2.push("9");

        System.out.println("Deque: " +numbers);
        System.out.println("Stack: " +numbers2);

        System.out.println("head: " + numbers.poll());
    }
}
