package class8;

public interface MyIFC {
	default void method1() {  //声明一个默认方法
		System.out.println("Default method1");
	}
	static void method2() { //声明一个静态方法
		System.out.println("Static method2"); 
	}
	void method3(); //声明一个抽象方法
}
