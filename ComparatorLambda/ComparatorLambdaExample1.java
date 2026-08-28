import java.util.Comparator;

public class ComparatorLambdaExample1 {
    public static void main() {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override 
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        Comparator<Integer> comparatorLambda = (Integer a, Integer b) -> a.compareTo(b);
        Comparator<Integer> comparatorLambda1 = (a, b) -> a.compareTo(b);

        System.out.println("The result of comparator is " + comparator.compare(1, 3));
        System.out.println("The result of comparatorLambda is " + comparatorLambda.compare(3, 1));
        System.out.println("The result of comparatorLambda1 is " + comparatorLambda1.compare(2, 2));
    }
}
