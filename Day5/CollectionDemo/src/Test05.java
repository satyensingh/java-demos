import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
//Comparable is used for natural/default ordering
class Customer implements Comparable<Customer> {
	int custId;
	String custName;
	public Customer(int custId, String custName) {
		this.custId = custId;
		this.custName = custName;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + "]";
	}
	@Override
	public int compareTo(Customer o) {
		return this.custId - o.custId;
	}
}
class SortCustomerByName implements Comparator<Customer>{
	@Override
	public int compare(Customer o1, Customer o2) {
		return o1.custName.compareTo(o2.custName);
	}
}
public class Test05 {
	public static void main(String[] args) {
		SortCustomerByName byName = new SortCustomerByName();
		Set<Customer> customers = new TreeSet<>(byName);
		customers.add(new Customer(103, "Vikram"));
		customers.add(new Customer(101, "Vinay"));
		customers.add(new Customer(102, "Ahuja"));
		customers.add(new Customer(101, "Vinay"));
		
		for (Customer customer : customers) {
			System.out.println(customer);
		}

	}

}
