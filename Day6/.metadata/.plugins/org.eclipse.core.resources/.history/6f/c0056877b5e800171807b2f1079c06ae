package com;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestWritingFileCB {

	public static void main(String[] args) {
		FileWriter writer = null;
		try {
			writer = new FileWriter(new File("Sample.txt"));
			writer.write("Some Data");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
