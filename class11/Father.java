package class11;

public class Father extends Grandpa{
	protected Father() {
		System.out.println("Default Father");
	}
	public Father(String grandpaName,String fatherName) {
		super(grandpaName);
		System.out.println(fatherName);
	}
}
