//UIUC CS125 SPRING 2016 MP. File: CaesarCipher.java, CS125 Project: Challenge3-TopSecret, Version: 2016-02-15T07:54:24-0600.667923822
/**
 * A program to search for to encrypt and decrypt lines of text. See
 * CaesarCipher.txt
 * Hints: line.charAt( int ) is useful.
 * You'll need loops, and conditions and variables
 * You'll need to read the Test cases to understand how your program should work.
 * Good Programming Hints: "DRY: Don't Repeat Yourself"
 * Try to make your program as short as possible.
 * TODO: add your netid to the line below
 * @author zgao22
 */
public class CaesarCipher {

	public static void main(String[] strings) {
		TextIO.putln("Please enter the shift value (between -25..-1 and 1..25)");
		int shift = TextIO.getlnInt();
		if(shift == 999 || shift == -999)
			TextIO.putln("Using position shift");
		else
		{
			while((shift == 0) ||(shift > 25) || (shift < -25))
			{
				TextIO.putln(shift + " is not a valid shift value.");
				TextIO.putln("Please enter the shift value (between -25..-1 and 1..25)");
				shift = TextIO.getlnInt();
			}
		
			TextIO.putln("Using shift value of " + shift);
		}
		
		TextIO.putln("Please enter the source text (empty line to quit)");
		String input = TextIO.getln();
		String sourceText = input.toUpperCase();
		if(shift != 999 && shift != -999)
		{
			while(!sourceText.equals(""))
			{
				TextIO.putln("Source   :" + input);
				TextIO.put("Processed:");
				
				for(int i = 0; i < sourceText.length(); i++)
				{
					char c = sourceText.charAt(i);
					
					if(c >= 'A' && c <= 'Z')
					{
						int letter = c - 'A';
						int encrypted = (letter + shift) % 26;
						if(encrypted < 0)
							encrypted += 26;
						c = (char)(encrypted + 'A');
					}
					TextIO.put(c);
				}
				TextIO.putln();
				TextIO.putln("Please enter the source text (empty line to quit)");
				input = TextIO.getln();
				sourceText = input.toUpperCase();
			}
		}
		else
		{
			while(!sourceText.equals(""))
			{
				TextIO.putln("Source   :" + input);
				TextIO.put("Processed:");
				int index = 0;
				
				for(int i = 0; i < sourceText.length(); i++)
				{
					char c = sourceText.charAt(i);
					
					if(c >= 'A' && c <= 'Z')
					{
						int letter = c - 'A';
						int encrypted;
						if(shift == 999)
							encrypted = (letter + index) % 26;
						else
							encrypted = (letter - index) % 26;
						if(encrypted < 0)
							encrypted += 26;
						c = (char)(encrypted + 'A');
					}
					TextIO.put(c);
					index++;
				}
				TextIO.putln();
				TextIO.putln("Please enter the source text (empty line to quit)");
				input = TextIO.getln();
				sourceText = input.toUpperCase();
			}
		}
		TextIO.putln("Bye.");
	}

}