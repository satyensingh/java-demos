import java.util.Set;
import java.util.TreeSet;

public class Test04 {

	public static void main(String[] args) {
		Set<String> names = new TreeSet<>();
		names.add("Satyen");
		names.add("Vikram");
		names.add("vikram");
		names.add("Satyen");
		names.add("satyen");
		names.add("John");
		names.add("Pooja");

		for (String name : names) {
			System.out.println(name);
		}
	}

}