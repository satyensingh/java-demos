import java.util.HashSet;
import java.util.Set;

class Employee {
	int empId;
	double salary;
	public Employee(int empId, double salary) {
		this.empId = empId;
		this.salary = salary;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empId != other.empId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", salary=" + salary + "]";
	}
}
public class Test03 {

	public static void main(String[] args) {
		Employee employee1 = new Employee(101, 10000);
		Employee employee2 = new Employee(102, 30000);
		Employee employee3 = new Employee(101, 2000);
		
		Set<Employee> employees = new HashSet<>();
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}
}
