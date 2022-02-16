package class6;

public class Sub3 extends Base3 {
	String var = "Sub's varible"; //隐藏父类var变量
	void method() {
		System.out.println("Call Sub's method"); //覆盖父类的method
	}
	void test() {
		String var = "Local varible";  //局部变量
		System.out.println("Var is "+ var); //打印局部变量
		System.out.println("This var is " + this.var); //打印sub实例的实例变量
		System.out.println("Super.var is "+super.var); //打印父类中的实例变量
		
		method(); //调用Sub实例的method方法
		this.method(); //调用Sub实例的method方法
		super.method(); //调用父类中定义的mehtod方法
	}
	public static void main(String args[]) {
		Sub3 sub = new Sub3();
		sub.test();
	}

}
