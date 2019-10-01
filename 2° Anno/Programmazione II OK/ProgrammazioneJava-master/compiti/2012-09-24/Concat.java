import java.util.Iterator;

// i numeri interi da una costante in poi
public class Concat extends Numbers {

	private final Numbers first, second;

	public Concat(Numbers first, Numbers second) {
		this.first = first;
		this.second = second;
	}

	@Override
	public Iterator<Integer> iterator() {
		return new Iterator<Integer>() {

			private Iterator<Integer> firstIterator = first.iterator();
			private Iterator<Integer> secondIterator = second.iterator();

			@Override
			public boolean hasNext() {
				return firstIterator.hasNext() || secondIterator.hasNext();
			}

			@Override
			public Integer next() {
				return firstIterator.hasNext() ? firstIterator.next() : secondIterator.next();
			}

			@Override
			public void remove() {
				throw new UnsupportedOperationException();
			}
			
		};
	}

}
