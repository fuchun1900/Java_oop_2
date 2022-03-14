package class11;

public class Son extends Father{
	public Son() {
		System.out.println("Default Son");
	}
	public Son(String grandpaName,String fatherName,String sonName) {
		super(grandpaName,fatherName);
		System.out.println(sonName);
	}
	public static void main(String args[]) {
		Son s1 = new Son("My Grandpa","My father","My son");
		Son s2 = new Son();
	}

}
