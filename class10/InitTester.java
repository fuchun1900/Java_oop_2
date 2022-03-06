package class10;

public class InitTester {
	static {
		System.out.println("Init InitEster");
	}
	public static void main(String args[]) {
		System.out.println("b = "+ Sub.b); //执行这行代码时，会依次初始化Base和Sub
	}

}
