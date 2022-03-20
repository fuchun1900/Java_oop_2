package class12;

public class Sample extends Outer2.Inner2{
	//public Sample(); 编译错误
	public Sample(Outer2 o) {
		o.super();
	}
	public static void main(String args[]) {
		Outer2 outer1 = new Outer2(1);
		Outer2 outer2 = new Outer2(2);
		
		Outer2.Inner2 in = outer1.new Inner2();
		in.print(); //打印a=1
		
		Sample s1 = new Sample(outer1);
		Sample s2 = new Sample(outer2);
		s1.print(); //打印a=1
		s2.print(); //打印a=2
		
	}
}
