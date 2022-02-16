package class7;

public class Base {
	int x = 5;
	static String s = "abcd";
	public static void method() {
		Base b = new Base();
		System.out.println(s + b.x);
	}

}
