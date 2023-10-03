
public class DogName implements Cloneable{
	private String dname;

	   public DogName(String dname) {
		this.dname = dname;
	   }

	   public String getName() {
		return dname;
	   }
//	   // Overriding clone() method of Object class
//	   public Object clone()throws CloneNotSupportedException{  
//		return (DogName)super.clone();  
//	   }
		
	   public static void main(String[] args) {
		DogName obj1 = new DogName("Tommy");
		try {
			DogName obj2 = (DogName) obj1.clone();
			if(obj2==obj1) {
				System.out.println("Equal");
			} else {
				System.out.println("Not Equal");
			}
			System.out.println(obj2.getName());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	   }

}
