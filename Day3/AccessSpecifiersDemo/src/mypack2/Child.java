package mypack2;

import mypack1.Parent;

public class Child extends Parent {
	void display() {
		System.out.println(privateVariable);
		System.out.println(protectedVariable);
		System.out.println(defaultVariable);
		System.out.println(publicVariable);
	}
}
