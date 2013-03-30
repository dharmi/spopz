package com.stylepopz.app.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

//import org.apache.tomcat.util.http.fileupload.IOUtils;

public class CopyUtil {
	
	 public static void copyFile(InputStream source, File destFile) throws IOException {

	    	FileOutputStream destination1 = new FileOutputStream(destFile);
	    	//IOUtils.copy(source, destination1);
	    	//FileUtils.writeStringToFile(source, "String to append", true);
	 }
	 
     public static void copyFile(FileInputStream sourceFile, File destFile) throws IOException {
		
		 
		 FileChannel source = null;
		 FileChannel destination = null;
		 try {
		  source = sourceFile.getChannel();
		  destination = new FileOutputStream(destFile).getChannel();
		  destination.transferFrom(source, 0, source.size());
		 }
		 finally {
		  if(source != null) {
		   source.close();
		  }
		  if(destination != null) {
		   destination.close();
		  }
		}
	}
	    
	    public static String readFile(File source) throws FileNotFoundException,IOException {
	    	
	    	BufferedReader br = new BufferedReader(new FileReader(source));
			StringBuilder sb = new StringBuilder();
			String line;
			while ((line = br.readLine()) != null) {
				sb.append(line+"\n");
			}
			br.close();
			return sb.toString();
	    }


}
