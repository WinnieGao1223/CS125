//UIUC CS125 SPRING 2016 MP. File: CipherBreaker.java, CS125 Project: Challenge3-TopSecret, Version: 2016-02-15T07:54:24-0600.667923822
/**
 * See CipherBreaker.txt for instructions.
 * TODO: add your netid to the line below
 * 
 * @author zgao22
 */
public class CipherBreaker {

	public static void main(String[] args) {
		TextIO.putln("Text?");
		String line = TextIO.getln();
		TextIO.putln(line);
		line = line.toUpperCase();
		int a = 0; int b = 0; int c = 0; int d = 0; int e = 0;
        int i = 0;
        int f = 0; int g = 0; int h = 0; int ii = 0; int j = 0; int k = 0; int l = 0;
        int m = 0; int n = 0; int o = 0; int p = 0; int q = 0; int r = 0; int s = 0;
        int t = 0; int u = 0; int v = 0; int w = 0; int x = 0; int y = 0; int z = 0;
        int digit = 0; int space = 0; int punc = 0; 

        for ( i=0; i<line.length();i++){
        	char character = line.charAt(i);
        	if(Character.isLetter(character)){
        		if(character == 'A') a++;
        		if(character == 'B') b++;
        		if(character == 'C') c++;
        		if(character == 'D') d++;
        		if(character == 'E') e++;
        		if(character == 'F') f++;
        		if(character == 'G') g++;
        		if(character == 'H') h++;
        		if(character == 'I') ii++;
        		if(character == 'J') j++;
        		if(character == 'K') k++;
        		if(character == 'L') l++;
        		if(character == 'M') m++;
        		if(character == 'N') n++;
        		if(character == 'O') o++;
        		if(character == 'P') p++;
        		if(character == 'Q') q++;
        		if(character == 'R') r++;
        		if(character == 'S') s++;
        		if(character == 'T') t++;
        		if(character == 'U') u++;
        		if(character == 'V') v++;
        		if(character == 'W') w++;
        		if(character == 'X') x++;
        		if(character == 'Y') y++;
        		if(character == 'Z') z++;
        	}
        	if ( character >='0'&&character<='9'){
        		digit = digit + 1;
        	}
        	if ( character == '\"'|| character == '-'|| character == '\''|| character == '.'|| character == '!' || character == ',' ){
        		punc = punc + 1;
        	}
        	if ( Character.isWhitespace(character)){
        		space = space + 1;
        	}
        }
        	if (a > 0){ TextIO.putln("A:"+a);}
        	if (b > 0){ TextIO.putln("B:"+b);}
        	if (c > 0){ TextIO.putln("C:"+c);}
        	if (d > 0){ TextIO.putln("D:"+d);}
        	if (e > 0){ TextIO.putln("E:"+e);}
        	if (f > 0){ TextIO.putln("F:"+f);}
        	if (g > 0){ TextIO.putln("G:"+g);}
        	if (h > 0){ TextIO.putln("H:"+h);}
        	if (ii > 0){ TextIO.putln("I:"+ii);}
        	if (j > 0){ TextIO.putln("J:"+j);}
        	if (k > 0){ TextIO.putln("K:"+k);}
        	if (l > 0){ TextIO.putln("L:"+l);}
        	if (m > 0){ TextIO.putln("M:"+m);}
        	if (n > 0){ TextIO.putln("N:"+n);}
        	if (o > 0){ TextIO.putln("O:"+o);}
        	if (p > 0){ TextIO.putln("P:"+p);}
        	if (q > 0){ TextIO.putln("Q:"+q);}
        	if (r > 0){ TextIO.putln("R:"+r);}
        	if (s > 0){ TextIO.putln("S:"+s);}
        	if (t > 0){ TextIO.putln("T:"+t);}
        	if (u > 0){ TextIO.putln("U:"+u);}
        	if (v > 0){ TextIO.putln("V:"+v);}
        	if (w > 0){ TextIO.putln("W:"+w);}
        	if (x > 0){ TextIO.putln("X:"+x);}
        	if (y > 0){ TextIO.putln("Y:"+y);}
        	if (z > 0){ TextIO.putln("Z:"+z);}
        	
        	if (digit > 0){ TextIO.putln("DIGITS:"+digit);}
        	if (space > 0){ TextIO.putln("SPACES:"+space);}
        	if (punc > 0){ TextIO.putln("PUNCTUATION:"+punc);}
        	

	}
}
        