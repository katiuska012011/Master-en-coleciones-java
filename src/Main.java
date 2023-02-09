import java.util.*;

public class Main {
    public static void main (String[] args) {
        // keep this function call here
        Integer[] numbers = {1,2,3,4,5};
        System.out.println(simpleArraySum(Arrays.asList(numbers)));
    }

    public static String FirstReverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static int simpleArraySum(List<Integer> ar) {
        int sum = 0;
        for (int i = 0; i <=ar.size(); i++){
            sum += i;
        }
        return  sum;
    }
}