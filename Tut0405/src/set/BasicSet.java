
import java.util.ArrayList;

public class BasicSet implements IntSet {
  private ArrayList<Integer> set;

  public static void main(String[] args) {
    System.out.println("Testing Set Interface:");
    System.out.println("Checking set capacity is 5: " + IntSet.CAPACITY);

    IntSet s = new BasicSet();
    s.add(2);
    s.add(19);

    System.out.println("Testing set contains 19: " + s.contains(19));
    System.out.println("Testing set does not contain 10: " + s.contains(10));

    s.remove(19);
    System.out.println("Testing set does not contain 19 after removal: " + s.contains(19));
  }

  public BasicSet() {
    this.set = new ArrayList<Integer>();
  }

  @Override
  public void add(Integer x) {
    this.set.add(x);
  }

  @Override
  public void remove(Integer x) {
    this.set.remove(x);
  }

  @Override
  public boolean contains(Integer x) {
    return this.set.contains(x);
  }
}
