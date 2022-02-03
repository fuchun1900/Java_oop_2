package class3;

public class Sample2 {
	int var1 = 0; //成员变量
	
	void method1(int var2) { //方法参数
		int var3 = 0; //局部变量
		if(var3 == 0) { //代码块
			int var4 = 0; //代码块中定义的局部变量
			var1++;
			var2++;
			var3++;
			var4++;
		}
		var1++;
		var2++;
		var3++;
		//var4++; //代码块中定义的局部变量只在代码块中有意义
	}
	
	void method2() {
		var1++;
		//var2++; 
		//var3++; //var2和var3只在method1方法中被引用
	}
}
