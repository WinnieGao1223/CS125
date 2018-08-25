//UIUC CS125 SPRING 2016 MP. File: MovieSurvey.java, CS125 Project: Challenge2-Hollywood, Version: 2016-02-08T21:38:43-0600.405657210
/**
 * A program to run a simple survey and report the results. See MovieSurvey.txt
 * for more information. TODO: add your netid to the line below
 * 
 * @author zgao22
 */
public class MovieSurvey {
	public static void main(String[] arg) {
		System.out.println("Welcome. We're interested in how people are watching movies this year.");
		System.out.println("Thanks for your time. - The WRITERS GUILD OF AMERICA.");
		System.out.println("Please tell us about how you've watched movies in the last month.");
		System.out.println("How many movies have you seen at the cinema?");
		
		int a = TextIO.getlnInt();
		
		System.out.println("How many movies have you seen using a DVD or VHS player?");
		int b = TextIO.getlnInt();
		
		System.out.println("How many movies have you seen using a Computer?");
		int c = TextIO.getlnInt();
		
		int total = a + b + c;
		double percent = (double)a/(double)total*100;
		double otherPercent = 100 - percent;
		
		System.out.println("Summary: "+a+" Cinema movies, "+b+" DVD/VHS movies, "+c+" Computer movies");
		System.out.println("Total: "+total+" movies");
		System.out.print("Fraction of movies seen at a cinema: ");
		TextIO.putf("%.2f", percent);
		TextIO.putln("%");
		System.out.print("Fraction of movies seen outside of a cinema: ");
		TextIO.putf("%.2f", otherPercent);
		TextIO.putln("%");

	}
}
