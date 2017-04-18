// Mike Vealey
// CSIT 211

import java.util.*;

public class QueueCollection {

	private static Queue<Character> wordQueue;
	
	public QueueCollection() {
		wordQueue = new LinkedList<Character>();
	}

	public void add(char nextChar) {
		wordQueue.add(nextChar);
	}

	public char get() throws EmptyCollectionException {
		char nextLetter = ' ';
		if(!wordQueue.isEmpty()) {
			nextLetter = wordQueue.remove();
		} else {
			throw new EmptyCollectionException("queue");
		}
		return nextLetter;
	}
}
