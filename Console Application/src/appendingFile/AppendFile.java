package appendingFile;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class AppendFile {
	
	public void AppendFiles(){
	     // File Location
	     String filePath ="append.txt";
	    // Content To Be Appended To The Existing File
	    String contentToAppend = "\n4:Hello there this line was added.";
	    
		try {
	        String fileName="append.txt";
			PrintWriter outputStream=new PrintWriter(fileName);
			
			outputStream.println("1:Hello there am a Developer.");
			outputStream.println("2:.work hard play hard sleep well");
			outputStream.println("3:who loves apples Ryuk?.");
			outputStream.close();//data sent to file	
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	    // Checking If The File Exists At The Specified Location
        Path Obj = Paths.get(filePath);
        boolean fileExists = Files.exists(Obj);
        if(fileExists) {
            try {
                // Appending The Data To The Existing File
                Files.write(Obj, contentToAppend.getBytes(), StandardOpenOption.APPEND);
                System.out.println("! Data Successfully Appended !");
            } catch (IOException ioExceptionObj) {
                System.out.println("Problem Occured While Writing To The File " + ioExceptionObj.getMessage());
            }
        } else {
            System.out.println("File Not Present! Please Check Again!");
        }		
	}
}
