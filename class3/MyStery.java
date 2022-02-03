package class3;

public class MyStery {
	public static void main(String[] args) {
		Changer c = new Changer();
		c.method(args);
		System.out.println(args[0] + " " + args[1]);
	}
	static class Changer{
		void method(String[] s) {
			String temp = s[0];
			s[0] = s[1];
			s[1] = temp;
		}
	}
}
