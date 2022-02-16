package class6;

public class Sub2 extends Basa2{
	void method() { //覆盖父类的实例方法method（）
		System.out.println("Method of sub");
	}
	static void staticMethod() { //隐藏父类的静态方法staticMethod()
		System.out.println("Static method of sub");
	}
	public static void main(String args[]) {
		Basa2 sub1= new Sub2(); //sub1变量被声明为Base类型，引用Sub2实例
		sub1.method(); //打印method of sub
		sub1.staticMethod(); //打印static method of Base2
		
		Sub2 sub2 = new Sub2(); //sub2变量被声明为Sub2类型，引用Sub2实例
		sub2.method(); //打印method of Sub
		sub2.staticMethod(); //打印static method of sub
	}

}
