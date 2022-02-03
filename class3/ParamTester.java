package class3;

public class ParamTester {
	public int memberVariable = 0; //成员变量
	
	public static void main(String args[]) {
		//声明并初始化4个局部变量
		int param1 = 0; //基本数据类型
		ParamTester param2 = new ParamTester(); //对象引用类型
		ParamTester param3 = new ParamTester(); //对象引用类型
		int[] param4 = {0}; //数组引用类型
		
		//将四个局部变量作为参数传递给changeParameter方法
		changeParameter(param1,param2,param3,param4);
		//打印4个局部变量
		System.out.println("param1 = " + param1);
		System.out.println("param2 = " + param2.memberVariable);
		System.out.println("param3 = " + param3.memberVariable);
		System.out.println("Param4[0] = " + param4[0]);
	}
	
	public static void changeParameter(int param1,ParamTester param2,ParamTester param3,int[] param4) {
		param1 = 1; //改变基本数据类型参数的值
		param2.memberVariable = 1; //改变对象类型参数实例的实例变量
		param3 = new ParamTester(); //改变对象型参数的引用，使它引用新的对象
		param3.memberVariable = 1;//改变新的对象的实例变量
		param4[0] = 1; //改变数组类型参数的元素
	}
}
