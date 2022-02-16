package class6;

public class Abs extends Base{
	public static void main(String args[]) {
		Abs a = new Abs();
		a.amethod();
	}
	public void myfunc() {
		System.out.println("My func");
	}
	public void amethod() {
		myfunc();
	}

}
