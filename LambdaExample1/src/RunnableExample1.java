public class RunnableExample1 implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable Example 1");
    }
    static void main() {
        Thread t1 = new Thread(new RunnableExample1());
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable Example 2");
            }
        });
        Runnable r1 = () -> System.out.println("Runnable Example 3.2");
        Runnable r2 = () -> { System.out.println("Runnable Example 3.3"); };
        Thread t3 = new Thread(() -> { System.out.println("Runnable Example 3"); });
        Thread t4 = new Thread(r1);
        Thread t5 = new Thread(r2);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        new Thread(() -> System.out.println("Runnable Example 3.1")).start();
    }
}
