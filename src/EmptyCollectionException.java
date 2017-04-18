// Mike Vealey
// CSIT 211

// this is based on the text book, page 510
public class EmptyCollectionException extends RuntimeException {
	public EmptyCollectionException(String message) {
		super ("The " + message + " is empty.");
	}
}
