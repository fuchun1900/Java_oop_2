package class6;

public class Test {
	public static void main(String[] args) {
		Object o = new String("abcd");
		String s = (String)o;
		System.out.println(s);
		System.out.println(o);
	}

}
