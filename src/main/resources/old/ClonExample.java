
public class ClonExample implements Cloneable{
	private String str;
	

	public static void main(String[] args) {
		ClonExample clonExample = new ClonExample();
		clonExample.str="hj";
			try {
				ClonExample c2 =(ClonExample) clonExample.clone();
				System.out.println("clone" +c2.str);
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
