package class7;

public class Sample {
	public int var;
	
	public Sample(int var) {
		this.var = var;
	}
	public static void main(String args[]) {
		final Sample s = new Sample(1); //合法，定义并初始化final类型引用变量s
		s.var = 2; //合法，可以修改引用变量的内容
		// s = new sample(2); 错误，不能改变引用变量所引用的sample对象
	}

}
