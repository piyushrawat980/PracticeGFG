package interviewPrep;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BuferedReader {

	public static void main(String[] args) throws IOException 
	{
	
	File file = new
	File("C:\\Users\\piyus\\Desktop\\Abstract Class vs Interface.docx");
	BufferedReader br = new BufferedReader(new FileReader(file));	  
	String str ;		  
	while((str = br.readLine())!=null) 
	{ 
		System.out.println(str);
	}
	}

	}
