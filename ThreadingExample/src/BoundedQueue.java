/**
 * Created by stephaniechua on 5/16/17.
 */
public interface BoundedQueue<E> {

    public E remove();
    public void add (E n);
    public boolean isFull();
    public boolean isEmpty();
    
}
