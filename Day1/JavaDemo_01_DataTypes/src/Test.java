//Comment - They are not executed by the runtime
//Test is a class
//public - class is accessible from anywhere in the application
//Java is Case Sensitive - test and Test are different.
public class Test {

	public static void main(String[] args) {
		//To run the program - CMD+F11(macOS) or Ctrl+F11(win/linux) 
		//System.out.println("Hello World!");
		
		int num;//Naming Convention- camelCase
		num = 100;
		System.out.println(num);
		
		int interestRate;
		interestRate = (int)4.5;
		System.out.println(interestRate);
		
		//All numeric values are by default of type int
		//All decimal values are by default of type double
		
		float pi;
		pi = 3.14f;
		System.out.println(pi);
		
		char gender;
		gender = 'M';
		System.out.println(gender);
		
		String name;
		name = "Satyen";
		System.out.println(name);
		
		boolean married;
		married = true;
		System.out.println(married);
		
		int num1, num2;
		int ans;
		num1 = 100;
		num2 = 200;
		ans = num1 + num2;//operators: +, -, *, /, %
		System.out.println(ans);
		
		String firstName="Satyen";
		String lastName="Singh";
		String fullName;
		fullName = firstName+" "+lastName;
		System.out.println(fullName);
	}

}
