package class6;

public class Sub4 extends Base4 {
	String var = "SubVar" ; //实例变量
	static String staticVar = "StaticSubVar"; //静态变量
	String SubVar = "Var only belonging to Sub";
	
	void method() { //覆盖父类的method方法
		System.out.println("Sub method");
	}
	static void staticMehtod() { //隐藏父类的staticMehtod方法
		System.out.println("Static Sub method");
	}
	void SubMehtod() {
		System.out.println("Mehtod only belonging to Sub");
	}
	public static void main(String args[]) {
		Base4 who = new Sub4();
		System.out.println("who.var = "+who.var);
		System.out.println("who.staticvar = "+who.staticVar);
		who.method();
		who.staticMethod();
	}
	
}
