package com.bridgelabz.fileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StringReplaceFromFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	FileReader file = new FileReader("/home/bridgeit/eclipse-workspace/BridgelabzProgram/poem.txt");
	BufferedReader reader = new BufferedReader(file);
		
		String textFile = ",";
		String line = reader.readLine();
		while(line != null) {
			textFile += line;
			line = reader.readLine();
		}
		System.out.println("\n"+textFile);
		
		/*File file = new File("/home/bridgeit/eclipse-workspace/BridgelabzProgram/poem.txt");
		
		BufferedReader br =new BufferedReader(new FileReader(file));
		//String str = br.readLine();
		
		//String[] text= str.split(",");
		String str;
		
	  while((str =br.readLine()) != null) {
		System.out.println(str);*/
		

	//	BufferedReader reader = new BufferedReader(new FileReader(file));
        String line = "", oldtext = "";
        while((line = reader.readLine()) != null)
            {
            oldtext += line + "\r\n";
        }
        reader.close();
        // replace a word in a file
        String newtext = oldtext.replaceAll("%ANIMAl", "animal");

        //To replace a line in a file
        //String newtext = oldtext.replaceAll("This is test string 20000", "blah blah blah");

        FileWriter writer = new FileWriter("/home/bridgeit/eclipse-workspace/BridgelabzProgram/poem.txt");
        writer.write(newtext);writer.close();
        System.out.println(newtext);
    }
   catch (IOException ioe)
        {
        ioe.printStackTrace();
    }
		
		//String regex = "/home/bridgeit/eclipse-workspace/BridgelabzProgram/poem.txt";
		
	      //String store = regex.replaceAll(line, textFile);  
	
			
	}

		

	


