import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PlantillaP
{
    private static boolean found = false;
    // Complete the crosswordPuzzle function below.
    static String[] crosswordPuzzle(String[] crossword, String words)
    {
	char[][] resultArray = new char[crossword.length][crossword[0].length()];

	for (int i = 0; i < crossword.length; i++)
	    {
		for (int j = 0; j < crossword[0].length(); j++)
		    {
			resultArray[i][j] = crossword[i].charAt(j);
		    }
	    }
	char[][] result = recur(resultArray, words.split(";"), 0);
	String[] resInString = new String[crossword.length];
	
	for(int i = 0; i< result.length; i++)
	    {
		resInString[i] = new String(result[i]);
	    }
	
	return resInString;
	
    }

    private static char[][] recur(char[][] crossword, String[] words, int i)
    {
	
	if(i == words.length)
	    {
		
		found = true;
		return crossword;
	    }

	for (int j = 0; j < crossword.length; j++)
	    {
		
		for (int k = 0; k < crossword[j].length; k++)
		    {
		    
			if (crossword[j][k] == '+')
			    {
				continue;
			    }
			
			// add in row j

			boolean addToRow = canBeAddedToRow(words[i], crossword[j], k);

			if (addToRow)
			    {
				char newCross[][] = addToRow(words[i], crossword,j, k);
				char ifAddedToRow[][] = recur(newCross, words, i+1);
				
				if(found)
				    {
					return ifAddedToRow;
				    }
			    }

			boolean addToColumn = canBeAddedToCol(words[i], crossword, j, k);

			if (addToColumn)
			    {
				char newCross[][] = addToCol(words[i], crossword,j, k);
                        
				char ifAddedToCol[][] =  recur(newCross, words, i+1);
				if(found)
				    {
					return ifAddedToCol;
				    }
			    }
		    }
	    }
	return crossword;
    }

    private static char[][] addToCol(String string, char[][] crossword, int j, int k)
    {
	char[][] nv = deepCopy(crossword);    
	for(int i = 0; i< string.length(); i++ )
	    {
		nv[j+i][k] = string.charAt(i);
	    }
	return nv;
    }

    private static char[][] addToRow(String string, char[][] crossword, int j, int k)
    {
	
	char[][] nv = deepCopy(crossword);
	
	for(int i = 0; i< string.length(); i++ )
	    {
		nv[j][k + i] = string.charAt(i);
	    }
	return nv;
    }

    private static char[][] deepCopy(char[][] crossword)
    {
	char[][] nv = new char[crossword.length][crossword[0].length];
	for (int i = 0; i < nv.length; i++)
	    nv[i] = Arrays.copyOf(crossword[i], crossword[i].length);
	return nv;
    }
    
    private static boolean canBeAddedToCol(String string, char[][] crossword, int j, int k)
    {
	int wordCounter = 0;
	for (int i = j; i < crossword.length; i++)
	    {
		if (wordCounter == string.length() || string.charAt(wordCounter) != crossword[i][k] && crossword[i][k] != '-')
		    {
			break;
		    }
		wordCounter++;
	    }
	return (wordCounter == string.length());
    }
    
    private static boolean canBeAddedToRow(String string, char[] cs, int k)
    {
	int wordCounter = 0;
	for (int i = k; i < cs.length; i++)
	    {
		if (wordCounter == string.length() || string.charAt(wordCounter) != cs[i] && cs[i] != '-')
		    {
			break;
		    }
		wordCounter++;
	    }
	return (wordCounter == string.length());
	
    }
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
	BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	String[] crossword = new String[10];

	for (int i = 0; i < 10; i++) {
	    String crosswordItem = scanner.nextLine();
	    crossword[i] = crosswordItem;
	}

	String words = scanner.nextLine();

	String[] result = crosswordPuzzle(crossword, words);

	for (int i = 0; i < result.length; i++) {
	    bufferedWriter.write(result[i]);

	    if (i != result.length - 1) {
		bufferedWriter.write("\n");
	    }
	}

	bufferedWriter.newLine();

	bufferedWriter.close();

	scanner.close();
    }
}
