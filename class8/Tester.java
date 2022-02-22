package class8;

public class Tester implements MyIFC {
	public void method3() {  //实现接口中的抽象方法
		System.out.println("method3");
	}
	public static void main(String args[]) {
		Tester t = new Tester();
		t.method1(); //访问接口中的默认方法
		//t.method2() //不能访问MyIFC接口中的静态方法
		MyIFC.method2();  //可以通过接口名字访问静态方法
		t.method3();
	}
}
