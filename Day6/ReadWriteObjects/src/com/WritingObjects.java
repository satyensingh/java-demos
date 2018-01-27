package com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

//Serialization -> Converting an object into bits of stream
public class WritingObjects {

	public static void main(String[] args) {
		Employee employee1 = new Employee(101, "Satyen");
		Employee employee2 = new Employee(102, "Satyen");
		Employee employee3 = new Employee(103, "Satyen");
		
		List<Employee> list = new ArrayList<>();
		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		
		try(FileOutputStream fileOutputStream = new FileOutputStream(new File("employee"));
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)){
			
			objectOutputStream.writeObject(list);
			System.out.println("Object Written...");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
