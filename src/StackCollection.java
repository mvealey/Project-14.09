// Mike Vealey
// CSIT 211

import java.util.Stack;

public class StackCollection {

	private static Stack<Character> wordStack;
	
	public StackCollection() {
		wordStack = new Stack<Character>();
	}
	
	public void add(char nextChar) {
		wordStack.push(nextChar);
	}
	
	public char get() throws EmptyCollectionException {
		char letter = ' ';
		if (!wordStack.empty()) {
			letter = wordStack.pop().charValue();
		} else {
			throw new EmptyCollectionException("stack");
		}
		return letter;
	}
}
