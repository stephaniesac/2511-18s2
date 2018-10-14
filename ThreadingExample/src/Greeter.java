/**
 * Created by stephaniechua on 5/16/17.
 */
public class Greeter implements Runnable {

    private String greeting;
    public Greeter(String greeting) {
        this.greeting = greeting;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + ": " + greeting);
                Thread.sleep(5);
            }
        } catch(InterruptedException e) {
            System.out.println("Exception!");
        }
    }
}
