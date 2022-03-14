package class11;

public class Sub extends Base{
	private int b;
	//在Base父类都构造方法中初始化实例变量a，在Sub子类都构造方法中初始化实例变量b
	public Sub(int a,int b) {
		super(a);
		this.b = b;
	}
	public int getB(){
		return b;
	}
	public static void main(String args[]) {
		Sub sub =new Sub(1,2);
		System.out.println("a = "+sub.getA()+" b = "+sub.getB()); //打印a=1 b=2
	}

}
