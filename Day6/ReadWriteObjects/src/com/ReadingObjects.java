package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

//Deserialization -> Converting bits of stream back to object
public class ReadingObjects {

	public static void main(String[] args) {
		List<Employee> employees = null;
		try (FileInputStream fileInputStream = new FileInputStream(new File("employee"));
				ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
			
			employees = (List<Employee>) objectInputStream.readObject();
			
			for (Employee employee : employees) {
				System.out.println(employee);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
