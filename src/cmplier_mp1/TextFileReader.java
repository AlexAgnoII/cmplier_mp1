package cmplier_mp1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Reads a textfile given its filename.
 * text file must be on the 'files' folder.
 * 
 * @author Alex Agno II
 *
 */
public class TextFileReader {
	
	private static final String DIRECTORY = "files/"; 
		
	public static List<String> readPerLine(String filename) {
		Scanner sc;
		List<String> expressionList = new ArrayList<String>();
		
		try {
			sc = new Scanner(new File(DIRECTORY + filename));
			
			while(sc.hasNextLine()) {
				expressionList.add(sc.nextLine());
			}

			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}

		
		return expressionList;
	}
}
