package class3;

public class Sample3 {
	int val1 = 1; //val1是实例变量
	static int val2 = 2; //val2是静态变量
	
	public int add() { //类方法
		int val3 = val1 + val2; //val3是局部变量
		return val3;
	}
	public int sub() { //类方法
		int val4 = val1 + val2; //val4是局部变量
		return val4;
	}
	public static void main(String args[]) {
		new Sample3().add();
	}
}
