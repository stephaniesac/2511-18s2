/**
 * Created by stephaniechua on 5/21/17.
 */
public class SyncBoundedQueue<E> implements BoundedQueue<E>{
    private E[] elems;
    private int head;
    private int tail;
    private int size;

    @SuppressWarnings("unchecked")
    public SyncBoundedQueue(int c) {
        this.elems = (E[])new Object[c];
        this.head = 0;
        this.tail = 0;
        this.size = 0;
    }

    /***
     * @prec elems is not empty
     */
    public synchronized E remove() {
        E e = null;
        try {
            while (size == 0) wait();     //Wait until something to remove
            System.out.print("Removing...");
            e = elems[head];
            head++;
            size--;
            if (head == elems.length) {
                head = 0;
            }
            notifyAll(); //Let others know that there is now space
            System.out.println("head: "+head+", tail: "+tail+", size: "+size);

        } catch (InterruptedException excp) {
            System.out.println("Remove interrupted");
        }
        return e;
    }


    /***
     * @prec elems is not full
     * @param n
     */
    public void add (E n) {
        synchronized (this) {
            try {
                while (size == elems.length) wait();
                System.out.print("Adding...");
                elems[tail] = n;
                tail++;
                size++;
                if (tail == elems.length) {
                    tail = 0;
                }
                notifyAll();
                System.out.println("head: "+head+", tail: "+tail+", size: "+size);
            } catch (InterruptedException excp) {
                System.out.println("Interrupted");
            }
        }
    }

    @Override
    public boolean isFull()  {  return size == elems.length;    }
    @Override
    public boolean isEmpty() {  return size == 0;   }
}
