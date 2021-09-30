package consoleFileDisplay;

import java.util.Scanner;
import java.io.*;

public class FileDisplay {

	public void FileDisplays(){
		
        Scanner s = new Scanner(System.in);
        
        /* enter filename with extension to open and read its content */ 
        System.out.println("Enter  This File Name to Open (append.txt) : ");
        String name;
        name = s.nextLine();
        
        /* references only one line at a time */
        String line = null;
        try
        {
            /* FileReader reads text files in the default encoding */
            FileReader fileReader = new FileReader(name);
            
            /* wrapping the FileReader in BufferedReader */
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            while((line = bufferedReader.readLine()) != null)
            {
                System.out.println(line);
            }
            
            /* closing the file so that the content to move from ram to file */
            bufferedReader.close();
        }
        catch(IOException ex)
        {
            System.out.println("Error reading file name " + name+" Please try again.");
        }
		
	}
}
