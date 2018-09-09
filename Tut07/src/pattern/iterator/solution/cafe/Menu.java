package pattern.iterator.solution.cafe;

import java.util.Iterator;

public interface Menu {
	public Iterator<MenuItem> createIterator();
}
