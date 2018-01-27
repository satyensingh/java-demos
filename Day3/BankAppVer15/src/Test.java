
//Ctor Chaining - It is a process of onvoking parent/base class ctor before invoking child/sub class ctor

/*
 * Class which is inherited is called as Base/Super/Parent Class
 * Class which is inheriting other class is called as Derived/Sub/Child class.
 * 
 * A class that does not inherit any other class is implicitly inheriting "Object" Class
 */
class A {//class A extends Object {
	public A() {
		super();//Calling the base class ctor.
		System.out.println("A Ctor....");
	}
	void display() {
		
	}
}
class B extends A {
	public B() {
		super();//Calling the base class ctor.
		System.out.println("B Ctor...");
	}
}

public class Test {

	public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
		
	}

}




