package class9;

public class AssertTester {
	public int divide(int a,int b) {
		assert b != 0:"除数不允许为零"; //使用断言
		return a/b;
	}
	public static void main(String args[]) {
		AssertTester t = new AssertTester();
		System.out.println(t.divide(3,0));
	}

}
