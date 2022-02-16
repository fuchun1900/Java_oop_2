package class6;

public class Sub extends Base {
	public int publicVarOfBase = 5;
	public void methodOfSub() {
		publicVarOfBase = 2; //合法，可以访问base类的public类型变量
		defaultVarOfBase = 6; //合法，可以访问base类的默认访问级别类型变量
		// privateVarOfBase = 2; //非法，不能访问base类的private别类型变量
		
		methodOfBase(); //合法，可以访问base类的protected类型的方法
	}
	public static void main(String args[]) {
		Sub sub = new Sub();
		sub.publicVarOfBase = 3; //合法，sub类继承base类的public类型变量
		//sub.privateVarOfBase = 3; //非法，sub类不能继承private类的类型变量
		sub.defaultVarOfBase = 3; //合法，sub类继承base类的默认类型变量
		
		sub.methodOfBase(); //合法，sub类继承Base类的protected类型的方法
		sub.methodOfSub(); //合法，这是sub类本身的实例方法
		System.out.println("Num = "+ sub.defaultVarOfBase);
		
	}

}
