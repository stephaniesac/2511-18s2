import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by stephaniechua on 5/16/17.
 */
public class SafeBoundedQueue<E> implements BoundedQueue<E> {

    private E[] elems;
    private int head;
    private int tail;
    private int size;

    private Lock qLock;
    private Condition availSpace;
    private Condition availItem;

    @SuppressWarnings("unchecked")
    public SafeBoundedQueue(int c) {
        this.elems = (E[]) new Object[c];
        this.head = 0;
        this.tail = 0;
        this.size = 0;
        this.qLock = new ReentrantLock();
        this.availSpace = qLock.newCondition();
        this.availItem = qLock.newCondition();
    }

    /***
     * @prec elems is not empty
     */
    public E remove() {
        qLock.lock();
        E e = null;
        try {
            while (size == 0) {     //Wait until there is something to remove
                availItem.await();
            }
            System.out.print("Removing...");
            e = elems[head];
            head++;
            size--;
            if (head == elems.length) {
                head = 0;
            }
            availSpace.signalAll(); //Let others know that there is now space
        } catch (InterruptedException excp) {
        } finally {
            qLock.unlock();
        }
        System.out.println("head: "+head+", tail: "+ tail+", size: "+size);
        return e;
    }


    /***
     * @prec elems is not full
     * @param n
     */
    public void add (E n) {
        qLock.lock();
        try {
            while (size == elems.length) {
                availSpace.await();
            }
            System.out.print("Adding...");
            elems[tail] = n;
            tail ++;
            size ++;
            if (tail == elems.length) {
                tail = 0;
            }
            availItem.signalAll();
        } catch(InterruptedException e) {
        } finally {
            qLock.unlock();
        }
        System.out.println("head: "+head+", tail: "+ tail+", size: "+size);
    }

    @Override
    public boolean isFull()  {  return size == elems.length;    }
    @Override
    public boolean isEmpty() {  return size == 0;   }

}
