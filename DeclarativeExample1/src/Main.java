import java.util.stream.IntStream;

public class Main {
    static void main() {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
           sum += i;
        }


        System.out.println(sum);


        System.out.println(IntStream.rangeClosed(0, 100).sum());
    }
}
