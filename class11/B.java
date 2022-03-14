package class11;

public class B extends A{
	public static void main(String args[]) {
		B b = new B(2);
	}
	B(int i){
		super(3);
		System.out.println(i);
	}

}
