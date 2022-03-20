package class12;

public class TestOuter2 {
	private int a;
	
	public static void main(String args[]) {}
	
	public void go(int w, final int z) {
		int p = w - z;
		final int q = w + z;
		class Inner{
			public void method() {
				System.out.println("w = " + w);
				System.out.println("z = " + z);
				System.out.println("p = " + p);
				System.out.println("q = " + q);
				System.out.println("a = " + a);
			}
		}
		Inner that = new Inner();
		that.method();
	}
}
