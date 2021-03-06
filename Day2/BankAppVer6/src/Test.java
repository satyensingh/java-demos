class Circle {
	int radius;
//	Circle(){
//		System.out.println("invoked...");
//	}
	Circle(int radius){
		this.radius = radius;
	}
}
public class Test {

	public static void main(String[] args) {
//		Circle circle = new Circle();//Circle is created.
//		Circle circle2 = new Circle();//Circle is created.
//		Circle circle3 = new Circle();//Circle is created.
//		Circle circle4 = new Circle();//Circle is created.
		//What is the radius of a circle?
//		System.out.println(circle.radius);
		
		//In real life, We cannot create a Circle Object with radius Zero
		//When Circle is created it has some radius value but not Zero.
		
		//To create circle with some radius we must make use of Constructor.
	
		/*	Constructors are Special Member Functions
		 * 1) Ctor don't have returntype
		 * 2) Ctor's name are same as the class name
		 * 3) Ctor gets invoked implicitly when the object is created.
		 * 4) Their is always a default ctor in class, if developer don't write one.
		 * 5) A class can have one or more Ctors with different no. or type of parameters.
		 * 
		 */
		Circle circle5 = new Circle(10);
		System.out.println(circle5.radius);
	}

}




