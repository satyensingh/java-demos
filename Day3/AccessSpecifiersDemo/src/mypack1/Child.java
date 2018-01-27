package mypack1;

public class Child extends Parent {
	
	void display() {
		System.out.println(privateVariable);
		System.out.println(protectedVariable);
		System.out.println(defaultVariable);
		System.out.println(publicVariable);
	}
}
