import java.util.Scanner;

/**
 * Created by stephaniechua on 5/16/17.
 */
public class ThreadTester {

    public static void main(String[] args) {
        ThreadTester t = new ThreadTester();

        // Shows that there is no ordering in multithreaded functions.
        //t.testGreeter();

        // Consumer is meant to consume 200 foods, but race conditions cause an
        // infinite loop. Might need to try a few times.
        //t.testUnsafeQ();

        // Fixed BoundedQueue, will not infinite loop :)
         t.testSafeQ();     // Condition variables and locks.
        // t.testSyncQ();        // Synchronized queue.

    }

    /***
     * Greeter running on multiple threads
     * Sometimes it does not alternate properly with multiple threads
     */
    private void testGreeter() {
        Thread t = new Thread(new Greeter("Hello"));
        Thread t2 = new Thread(new Greeter("Another thread..."));
        Thread t3 = new Thread(new Greeter("Another..."));
        t.start();
        t2.start();
        t3.start();
    }

    /***
     * Notice how it infinite loops. Consumer is meant to consume 200 food,
     * but everything is screwed because of race conditions.
     */
    private void testUnsafeQ() {
        BoundedQueue<String> q = new UnsafeBoundedQueue<String>(10);
        Thread t1 = new Thread(new Producer("Soft Serve!", q, 1000));
        Thread t2 = new Thread(new Producer("Fries!", q, 1000));
        Thread t3 = new Thread(new Consumer(q, 1000));
        Thread t4 = new Thread(new Consumer(q, 1000));
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

    /***
     * Consumer is meant to consume 200 strings of food.
     */
    private void testSafeQ() {
        BoundedQueue<String> q = new SafeBoundedQueue<String>(10);
        Thread t1 = new Thread(new Producer("Soft Serve!", q, 100));
        Thread t2 = new Thread(new Producer("Fries!", q, 100));
        Thread t3 = new Thread(new Consumer(q, 200));
        t1.start();
        t2.start();
        t3.start();
    }

    /***
     * Notice how the indexing is wrong. Consumer is meant to consume 200 food,
     * but everything is screwed because of race conditions.
     */
    private void testSyncQ() {
        BoundedQueue<String> q = new SyncBoundedQueue<String>(10);
        Thread t1 = new Thread(new Producer("Soft Serve!", q, 100));
        Thread t2 = new Thread(new Producer("Fries!", q, 100));
        Thread t3 = new Thread(new Consumer(q, 200));
        t1.start();
        t2.start();
        t3.start();
    }
}
