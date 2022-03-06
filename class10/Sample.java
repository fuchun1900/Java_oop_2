package class10;

public class Sample {
	public static void main(String args[]) {
		System.out.println("a = "+ Sub.a); //因为a在base类定义，所有只初始化类base类
		Sub.method();
	}

}
