package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ChainingOfStreams {

	public static void main(String[] args) {

		try(FileReader reader = new FileReader(new File("untitled.txt"));
				BufferedReader bufferedReader = new BufferedReader(reader)
				) {
			
			String line = bufferedReader.readLine();
			System.out.println(line);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
