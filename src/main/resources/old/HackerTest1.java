import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Data implements Comparable<Data> {
	private String str1;
	private String str2;

	public Data(String str1, String str2) {
		super();
		this.str1 = str1;
		this.str2 = str2;
	}

	public String getStr1() {
		return str1;
	}

	public void setStr1(String str1) {
		this.str1 = str1;
	}

	public String getStr2() {
		return str2;
	}

	public void setStr2(String str2) {
		this.str2 = str2;
	}

	@Override
	public String toString() {
		return "\nData [str1=" + str1 + ", str2=" + str2 + "]";
	}

	@Override
	public int hashCode() {
		int result = str1 != null ? str1.hashCode() : 0;
		result = 31 * (result + (str2 != null ? str2.hashCode() : 0));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Data))
			return false;
		Data newData = (Data) obj;
		return (str1.equals(newData.str1) && str2.equals(newData.str2))
				|| (newData.str1.equals(str2) && newData.str2.equals(str1));
	}

	@Override
	public int compareTo(Data o) {
		return str1.compareTo(o.getStr1());
	}

}

public class HackerTest1 {
	public static void main(String[] args) {
		List<String> list = new ArrayList();
		list.add("U1,U2");
		list.add("U1,U2");
		list.add("U3,U4");
		list.add("U2,U1");
		list.add("U1,U5");

		Set<Data> set = new HashSet<>();
		for (String string : list) {
			String values[] = string.split(",");
			Data data = new Data(values[0], values[1]);
			// if(data.hashCode() && data.equals(data) )
			// lilstData.add(data);
			set.add(data);
		}
		
		// System.out.println(lilstData);
		List<Data> treeset = new ArrayList<>(set);
		System.out.println(set);
		System.out.println("------------------");
		 Collections.sort(treeset);
		System.out.println(treeset);
	}

}
