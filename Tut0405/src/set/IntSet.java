
/**
 * Basic interface for a set containing integers.
 */
public interface IntSet {

  public static final int CAPACITY = 5;

  public void add(Integer x);
  public void remove(Integer x);
  public boolean contains(Integer x);

}
