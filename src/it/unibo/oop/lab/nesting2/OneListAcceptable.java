package it.unibo.oop.lab.nesting2;

import java.util.Iterator;
import java.util.List;

public class OneListAcceptable<T> implements Acceptable<T> {
	
	private final List<T> list;
	
	public OneListAcceptable(List<T> list) {
		this.list = list;
	}

	public Acceptor<T> acceptor() {
		return new Acceptor<T>() {
			Iterator<T> listIterator = OneListAcceptable.this.list.iterator();

			public void accept(T newElement) throws ElementNotAcceptedException {
				if (!listIterator.hasNext() || !newElement.equals(listIterator.next())) {
					throw new ElementNotAcceptedException(newElement);
				}
			}

			public void end() throws EndNotAcceptedException {
				if (listIterator.hasNext()) {
					throw new EndNotAcceptedException();
				}
			}
		};
	}
}
