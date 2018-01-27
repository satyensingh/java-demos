import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test06 {

	public static void main(String[] args) {
		Map<Integer, String> students = new HashMap<>();
		students.put(101, "Satyen");
		students.put(106, "Vikram");
		students.put(107, "Satyen");
		students.put(102, "Vikram");
		students.put(103, "Pooja");
		students.put(104, "John");
		students.put(105, "Pooja");
		students.put(104, "John");
		
		System.out.println(students);
		
		String name = students.get(103);
		System.out.println(name);
		
		Set<Integer> rollnos = students.keySet();
		for (Integer rollno : rollnos) {
			System.out.println(rollno);
		}
		
		Set<Entry<Integer, String>> entries = students.entrySet();
		for (Entry<Integer, String> entry : entries) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println("Key : "+key);
			System.out.println("Value : "+value);
		}
	}
}
