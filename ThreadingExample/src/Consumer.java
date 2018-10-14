/**
 * Created by stephaniechua on 5/16/17.
 */
public class Consumer implements Runnable {

    private BoundedQueue<String> q;
    private int count;

    /***
     * Basically eats up strings from given bounded queue.
     * @param q
     * @param count
     */
    public Consumer(BoundedQueue<String> q, int count) {
        this.q = q;
        this.count = count;
    }

    @Override
    public void run() {
        try {
            int i = 0;
            while (i < count) {
                if (!q.isEmpty()) {
                    String toConsume = q.remove();
                    System.out.println(i+" Consuming " +toConsume);
                    i++;
                }
                Thread.sleep(10);
            }
        } catch(InterruptedException e) {
            System.out.println("Consumer interrupted.");
        }
    }
}
