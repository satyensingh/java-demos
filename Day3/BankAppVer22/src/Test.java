class A {
	public void display() {
		System.out.println("Class - A");
	}
}
class B extends A {
	@Override
	public void display() {
		System.out.println("Class - B");
	}
}
class C extends A {
	@Override
	public void display() {
		System.out.println("Class - C");
	}
}
class Xyz {
	void callDisplay(A a){
		a.display();
	}
}
public class Test {

	public static void main(String[] args) {
		//Polymorphism -> Invoking same method with diff argument executes diff logic
		//Polymorphism = Inheritance + Method Overriding + Upcasting
		Xyz xyz = new Xyz();
		xyz.callDisplay(new C());
		xyz.callDisplay(new B());
		
	}
}