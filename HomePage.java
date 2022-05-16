package com.lockedme.homepage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileManager{
	
	System.out.println("Welcome to LockedMe");
	System.out.println("Developer: Winnette " + "Copyright(c)2022");
	
	//user registration
	
	Scanner keyboardScanner = new Scanner(System.in);
	System.out.println("Enter your email");
	String email = keyboardScanner.next();
	
	String regex = "^[a-zA-Z0-9+_.-]+@+[a-z]+\\.[a-z]{2,3}";
	
//	boolean result = email.matches(regex);
	
	Pattern pattern = Pattern.compile(regex);
	
	Matcher matcher = pattern.matcher(email);
	if ( matcher.matches() ) {
		System.out.println("Given email-id is valid");
	}else {
		System.out.println("Given email-id is not valid");
	}
	
	//file manager
	private static String fileName;
		
		File myDir = new File("MyDocs"); {
			
		if (myDir.mkdir()) {
			System.out.println("the directory is created");
			
		}else {
			System.out.println("the directory is already exist");
		}
		
		File subDir = new File(myDir,"subdDir");
		subDir.mkdir();
		
		//create new file
		File myFile = new File(myDir, "");
		try {
			myFile.  
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	    try {
	    	try {
	    		File myObj = new File("CreateNewFile.txt");
	    		if (myObj.createNewFile()) {
	          System.out.println("File created: " + myObj.getName());
	        } else {
	          System.out.println("File already exists.");
	        }
	      } catch (IOException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	      } 
	    

		
		//rename files
		myFile.renameTo(new File(myDir, ""));
	    try {
	        FileWriter myWriter = new FileWriter("filename.txt");
	        myWriter.write("Rename File");
	        myWriter.close();
	        System.out.println("Successfully renamed file.");
	      } catch (IOException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	      }
		
		//delete files
		File d = new File (myDir,"");
		
	    File myObj = new File("filename.txt"); 
	    if (myObj.delete()) { 
	      System.out.println("Deleted the file: " + myObj.getName());
	    } else {
	      System.out.println("Failed to delete the file.");
	    } 
	  } finally {
		    if (System.in != null) { 
		        System.out.println("Redirecting to home page");
		        System.out.close(); 
		    } else { 
		        System.out.println("Operation failed");
		    }
	  }
	  ///
	  		try {
	  			String fileName = null;
				File myObj = new File(fileName);
	  		      Scanner myReader = new Scanner(myObj);
	  		      while (myReader.hasNextLine()) {
	  		        String data = myReader.nextLine();
	  		        System.out.println(data);
	  		      }
	  		      myReader.close();
	  		    } catch (FileNotFoundException e) {
	  		      System.out.println("An error occurred.");
	  		      e.printStackTrace();
	  		    }
	  		
	  		///Sorting
			String myObj = fileName;
	        int minInd,
	        min,
	        currChar;
	        char temp;
	        char str1arr[] = myObj.toCharArray();

	        for (int i = 0; i < str1arr.length; i++) {
	            minInd = i;
	            min = str1arr[i];    
	            for (int j = i; j < str1arr.length; j++) {
	                currChar = str1arr[j];   
	                if (currChar < min) {
	                    minInd = j;
	                    min = currChar; 
	                }
	            }
	            temp = str1arr[minInd];
	            str1arr[minInd] = str1arr[i];
	            str1arr[i] = temp;
	        }

	        for (char e : str1arr)
	            System.out.print(e);
	        System.out.println();
	    }
		
		 System.out.println("Exit");
	     System.exit(0);
	        
	     System.out.println("Return");
	     history.back(1);
	     
	    }
	}

	}
	  		

	
