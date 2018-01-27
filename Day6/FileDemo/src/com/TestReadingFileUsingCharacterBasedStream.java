package com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestReadingFileUsingCharacterBasedStream {

	public static void main(String[] args) {
		FileReader reader = null;
		try {
			reader = new FileReader(new File("untitled1.txt"));
			int bytes = reader.read();
			while(bytes!=-1) {
				System.out.print((char)bytes);
				bytes = reader.read();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
