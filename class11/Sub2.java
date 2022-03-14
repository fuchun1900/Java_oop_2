package class11;

public class Sub2 extends Base2{
	Sub2(){
		this(0);
		System.out.println("call Sub()");
	}
	Sub2(int i){
		super(i);
		System.out.println("call Sub(int i)");
	}
	public static void main(String args[]) {
		Sub2 s = new Sub2();
	}

}
