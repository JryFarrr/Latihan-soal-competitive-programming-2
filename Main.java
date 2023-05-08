import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        Queue<Integer> inputs = new PriorityQueue<>(size, Comparator.comparing(a -> new StringBuilder(Integer.toString(a)).reverse()));

        for (int i = 0; i < size ; i++) {
            inputs.add(scanner.nextInt());
        }

        while (size > 0) {
            System.out.println(inputs.poll());
            size--;
        }
    }
}
