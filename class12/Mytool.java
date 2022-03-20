package class12;

public class Mytool implements Outer4.Tool{
	public int add(int a,int b) {
		int result = a + b;
		System.out.println(result);
		return result;
	}

}
