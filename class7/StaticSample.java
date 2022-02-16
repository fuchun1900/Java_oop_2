package class7;

public class StaticSample {
	public static int number; //定义一个静态变量
	
	public void method() {
		int x = number; //在类的内部直接访问number静态变量
	}
}
