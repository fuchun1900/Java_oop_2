package class9;

public class MainCatcher {
	public void methodA(int money) throws SpecialExcpetion{
		if (--money<=0) throw new SpecialExcpetion("Out of money");
		System.out.println("mehtodA");
	}
	public void methodB(int money) throws SpecialExcpetion{
		methodA(money);
		System.out.println("mehtodB");
	}
	public static void main(String args[]) {
		try {
			new MainCatcher().methodB(3);
			System.out.println("Main");
		}catch(SpecialExcpetion e) {
			System.out.println("Wrong");
		}finally {
			System.out.println("CLose"); //不管是否出现异常最终都会执行
		}
	}

}
