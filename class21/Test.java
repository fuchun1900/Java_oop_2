package class21;

public class Test {
	public static void main(String args[]) {
		StringBuffer s = new StringBuffer("abcdefgh");
		StringBuffer s1 = s.replace(0,2,"k");
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s == s1);
	}

}
