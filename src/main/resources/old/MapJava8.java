import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
	int id;
	String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class MapJava8 {
	public static void main(String[] args) {
		Collection<E>
		Map<String, String> map = new HashMap<String, String>();
		// map.stream // stream not supported in map
		List<Employee> list = new ArrayList<Employee>();
		Map<Integer, Employee> mapEmp = list.stream().collect(Collectors.toMap(k -> k.id, v -> v));
		mapEmp = list.stream().collect(Collectors.toMap(Employee::getId, v -> v));
		Map<Integer, String> mapkeyValue = list.stream().collect(Collectors.toMap(Employee::getId, Employee::getName));
	}

}
