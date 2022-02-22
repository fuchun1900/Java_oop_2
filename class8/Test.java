package class8;

public interface Test {
	int x = 2;
	static void method(String s) {
		System.out.println(s);
	}
	default void method() {
		System.out.println("Hello");
	}
	int method3(int a);

}
