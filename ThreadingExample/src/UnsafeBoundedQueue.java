/**
 * Created by stephaniechua on 5/16/17.
 */
public class UnsafeBoundedQueue<E> implements BoundedQueue<E>{

    private E[] elems;
    private int head;
    private int tail;
    private int size;

    @SuppressWarnings("unchecked")
    public UnsafeBoundedQueue(int c) {
        this.elems = (E[]) new Object[c];
        this.head = 0;
        this.tail = 0;
        this.size = 0;
    }

    /***
     * @prec elems is not empty
     */
    public E remove() {
        System.out.print("Removing..");
        E e = elems[head];
        head++;
        size --;

        if (head == elems.length) {
            head = 0;
        }
        System.out.println("head: "+head+", tail: "+ tail+", size: "+size);
        return e;
    }

    /***
     * @prec elems is not full
     * @param n
     */
    public void add (E n) {
        System.out.print("Adding...");
        elems[tail] = n;
        tail ++;
        size ++;
        if (tail == elems.length) {
            tail = 0;
        }
        System.out.println("head: "+head+", tail: "+ tail+", size: "+size);
    }

    public boolean isFull()  {  return size == elems.length;    }
    public boolean isEmpty() {  return size == 0;   }
}
