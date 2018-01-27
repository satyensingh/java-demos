package com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerailizationTest {

	public static void main(String[] args) {

		BankEmployee bankEmployee = new BankEmployee(101, "Satyen","Dev", 2000);

		try (FileOutputStream fileOutputStream = new FileOutputStream(new File("employee"));
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {

			objectOutputStream.writeObject(bankEmployee);
			System.out.println("Object Written...");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
