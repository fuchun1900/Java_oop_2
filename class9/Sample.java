package class9;

public class Sample {
	public void methodA(int money) throws SpecialExcpetion{
		if(--money <= 0) throw new SpecialExcpetion("Out of money");
		System.out.println("methodA");
	}
	public void methodB(int money) throws SpecialExcpetion {
		methodA(money);
		System.out.println("methodB");
	}
	public static void main(String args[]) throws SpecialExcpetion{
		new Sample().methodB(1);
	}

}
