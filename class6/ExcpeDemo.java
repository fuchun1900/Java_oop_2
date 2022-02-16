package class6;

public class ExcpeDemo extends Base6{
	public static void main(String args[]) {
		ExcpeDemo e = new ExcpeDemo();
	}
	public static void amethod() {}
	protected ExcpeDemo() {
		System.out.println("Pause");
		amethod();
		System.out.println("contine");
	}

}
