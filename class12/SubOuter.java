package class12;

public class SubOuter extends Outer3{
	class Inner3{
		public Inner3() {
			System.out.println("inner of SubOuter");
		}
	}
	public static void main(String args[]) {
		SubOuter.Inner3 in1 = new SubOuter().new Inner3();
		Outer3.Inner3 in2 = new Outer3().new Inner3();
	}

}
