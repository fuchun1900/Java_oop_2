package class12;

public class Outer5 {
	public String name = "Outer5";
	
	public static void main(String args[]) {
		Inner i = new Outer5().new Inner();
		i.showName();
		
	}
	protected class Inner{
		String name = new String("Inner5");
		
		void showName() {
			System.out.println(name);
		}
	}

}
