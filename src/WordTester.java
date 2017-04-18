// Mike Vealey
// CSIT 211

import java.util.Scanner;


public class WordTester {

	public static void main(String[] args) {

		String wordToTest;
		char nextLetter, stackLetter, queueLetter;
		boolean palindrome;
		
		Scanner scan = new Scanner(System.in);
		
		// get the word from the console
		System.out.print("Enter a word: ");
		wordToTest = scan.nextLine();
		
		scan.close();
		
		//create the collections
		StackCollection wordStack = new StackCollection();
		QueueCollection wordQueue = new QueueCollection();
		
		//parse the word letter for letter and add to each of the collections
		if(wordToTest.length() == 0) {
			System.out.println("No word entered");
		} else {
			for(int i = 0;i < wordToTest.length();i++) {
				nextLetter = wordToTest.charAt(i);
				wordStack.add(nextLetter);
				wordQueue.add(nextLetter);
			}
		
			//get a letter from each collection and compare it
			//assume it's a palindrone until proven that it's not
			palindrome = true;
			for(int i = 0;i < wordToTest.length();i++ ) {
				stackLetter = wordStack.get();
				queueLetter = wordQueue.get();
				
				if(stackLetter != queueLetter) {
					palindrome = false;
				}
			}		
			
			//decide if it's a palindrome 
			if(palindrome) {
				System.out.println(wordToTest + " is a palindrome.");
			} else {
				System.out.println(wordToTest + " is NOT a palindrome.");
			}
		}
	}
}
