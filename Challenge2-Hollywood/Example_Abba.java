//UIUC CS125 SPRING 2016 MP. File: Example_Abba.java, CS125 Project: Challenge2-Hollywood, Version: 2016-02-08T21:38:43-0600.405657210
public class Example_Abba {

	// Lecture 7 example
	// Print 'You Win' if the first and last letter are the same
	public static void main(String[] args) {
		TextIO.put("Enter a string");
		String s = TextIO.getln();
		// ask the string to create a new string
		// change s to point to (hold the memory address of)
		// the newly created string
		s = s.toLowerCase();

		char first = s.charAt(0);
		char last = s.charAt(s.length() - 1);
		if (first == last)
			TextIO.putln("You win!");
	}

}
