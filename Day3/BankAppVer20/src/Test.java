//Method Overriding 
/*
 * Rules of Method overriding
 * 1) MethodName and Parameters must match
 * 2) return type must be same of sub type.
 * 3) 
 * 4)
 * 5) 
 * 6) 
 */
class A {
	//Overridden method
	void display() {
		System.out.println("Class - A");
	}
}
class B extends A {
	//Overriding Method
	@Override//This will help dev to override right method
	void display() {
		System.out.println("Class - B");
	}
}
public class Test {

	public static void main(String[] args) {
		B b = new B();
		b.display();//No Error. coz, Class B(Which is a ref type) does have method display()
		
		A a = new B();//Upcasting
		a.display();//Error. Coz, Class A (which is a ref type) does not have method display()
		
	}

}




