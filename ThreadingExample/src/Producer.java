/**
 * Created by stephaniechua on 5/16/17.
 */
public class Producer implements Runnable {

    private String food;
    private BoundedQueue<String> q;
    private int count;

    public Producer(String food, BoundedQueue<String> q, int count) {
        this.food = food;
        this.q = q;
        this.count = count;
    }

    @Override
    public void run() {
        try {
            int i = 1;
            while (i <= count) {
                if (!q.isFull()) {
                    q.add(food);
                    i++;
                }
                Thread.sleep(10);
            }
        } catch(InterruptedException e) {
            System.out.println("Producer was interrupted.");
        }
    }
}
