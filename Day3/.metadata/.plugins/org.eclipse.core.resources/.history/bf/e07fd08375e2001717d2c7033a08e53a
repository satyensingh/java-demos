class A {
	int i;
	public A(int i) {
		this.i = i;
	}
}
class B extends A {
	int j;
	public B(int i, int j) {
		//super();//compiler written code gives error as it is trying to call default ctor of parent
		super(i);//Explicit Ctor chaining by calling the right ctor.
		this.j = j;
	}
}

public class Test {

	public static void main(String[] args) {
		
		B b = new B(100, 200);
		
		
	}

}




