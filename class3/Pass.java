package class3;

public class Pass {
	static int j = 20;
	
	public static void main(String args[]) {
		int i = 10;
		Pass p = new Pass();
		p.method(i);
		System.out.println(i);
		System.out.println(j);
	}
	public void method(int k) {
		k = k * 2;
		j *= 2;
	}
}
