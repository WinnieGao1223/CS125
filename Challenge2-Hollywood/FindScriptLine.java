//UIUC CS125 SPRING 2016 MP. File: FindScriptLine.java, CS125 Project: Challenge2-Hollywood, Version: 2016-02-08T21:38:43-0600.405657210
/**
 * A program to search for specific lines and print their line number.
 * See FindScriptLine.txt for more details
 * TODO: add your netid to the line below
 * @author zgao22
 */
public class FindScriptLine {

	public static void main(String[] args) {
		System.out.println("Please enter the word(s) to search for");
		String searchWord = TextIO.getln();
		TextIO.putln("Searching for '"+searchWord+"'");
		
		boolean output = false;
		TextIO.readFile("thematrix.txt");
		
		output = false;
		int count = 0;
		
		while ( false == TextIO.eof() ) {
			String line = TextIO.getln();
			String original = line;
			String searchWords = searchWord.toLowerCase();
			line = line.toLowerCase();
			count = count + 1;
			if(line == ""){
				output = false;
			}
			if(line.indexOf(searchWords) >= 0) {
				output = true;
			}
			if(output == true){
				original = original.trim();
				TextIO.put(count+" - ");
				TextIO.putln(original);
			}
			output = false;
		}
		TextIO.putln("Done Searching for \'"+searchWord+"\'");
// TODO: Implement the functionality described in FindScriptLine.txt
// TODO: Test your code manually and using the automated unit tests in FindScriptLineTest		
	}
}
