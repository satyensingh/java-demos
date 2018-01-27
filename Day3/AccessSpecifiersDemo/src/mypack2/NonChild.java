package mypack2;

import mypack1.Parent;

public class NonChild {
	void display() {
		Parent parent = new Parent();
		System.out.println(parent.privateVariable);
		System.out.println(parent.protectedVariable);
		System.out.println(parent.defaultVariable);
		System.out.println(parent.publicVariable);
	}
}
