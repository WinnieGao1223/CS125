//UIUC CS125 SPRING 2016 MP. File: ExampleInputOutput.java, CS125 Project: Challenge2-Hollywood, Version: 2016-02-08T21:38:43-0600.405657210
public class ExampleInputOutput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Formatted output
		double third = 1.0 / 3;
		TextIO.put("One third is ");
		TextIO.put(third);
		TextIO.putf(", or %.2f",third);
		TextIO.putln(" OK?");
		
		// A program that prints out if a number is odd or even
		// However it lies for some values...
		boolean oops = false;
		int a = 0;
		while (a <= 10) {
			oops = a >= 4 && a<=8;
			TextIO.put(a + " is ");
			if ((a % 2 == 1) || oops)
				TextIO.putln("Odd");
			else
				TextIO.putln("Even");
			a++;
		}

	}

}
