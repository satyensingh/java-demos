package com;

import java.io.File;
import java.io.IOException;

public class TestFile {

	public static void main(String[] args) {
		File file = new File("/Users/satyensingh/Desktop/Collab/untitled.txt");
		boolean fileExist = file.exists();
		if(fileExist)
			System.out.println("File Exist in the file system");
		else {
			System.out.println("File not found or does not exist");
			System.out.println("Creating file...");
			try { 
				file.createNewFile();
				System.out.println("File created succesfully...");
			} catch (IOException e) {
				System.out.println("File creation failed...");
				e.printStackTrace();
			}
		}
		
		System.out.println("Writable? : "+file.canWrite());
		System.out.println("Executable? : "+file.canExecute());
		System.out.println("Length : "+file.length());
		System.out.println("Path : "+file.getAbsolutePath());
		System.out.println("Separator : "+file.separator);
		System.out.println("Directory? : "+file.isDirectory());
		System.out.println("Last Modified : "+new java.util.Date(file.lastModified()));
//		System.out.println("Renaming file to Sample.txt");
//		file.renameTo(new File("Sample.txt"));
//		System.out.println("Name changed...");
//		System.out.println("New Name : "+file.getName());
		
		
	}

}
