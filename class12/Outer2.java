package class12;

public class Outer2 {
	private int a;
	public Outer2(int a) {
		this.a = a;
	}
	public class Inner2 {
		//public Inner2() {}
		public void print() {
			System.out.println("a = "+a); //访问外部类的实例变量a
		}
	}

}
