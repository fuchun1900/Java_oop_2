package class7;

public class StaticSample3 {
	static int i = 5;
	static { //第一个静态代码块
		System.out.println("First Static code 1 = "+ i++);
	}
	static { //第二个静态代码块
		System.out.println("Second Static code i = "+ i++);
	}
	public static void main(String args[]) {
		StaticSample3 s1 = new StaticSample3();
		StaticSample3 s2 = new StaticSample3();
		System.out.println("At last, i = " +i);
	}

}
