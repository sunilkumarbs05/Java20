import java.util.HashSet;

class StudentClass {
	private int id;
	private String name;
	public StudentClass(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		StudentClass other = (StudentClass) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "StudentClass [id=" + id + ", name=" + name + "]";
	}
	
	
}


public class HashsetWithEmployee {
	
	public static void main(String[] args) {
		HashSet<StudentClass> set = new HashSet<>();
		
		StudentClass class1 = new StudentClass(1, "Sunil");
		StudentClass class2 = new StudentClass(1, "Sunil");
		StudentClass class3 = new StudentClass(10, "Sunil");
		StudentClass class4 = new StudentClass(1, "Sunil");
		
		set.add(class1);
		set.add(class2);
		set.add(class3);
		set.add(class4);
		for (StudentClass studentClass : set) {
			System.out.println(studentClass);
		}
	}

}
