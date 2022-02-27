package class9;

public class WithReturn {
	public int methodA(int money) throws SpecialExcpetion{
		if(--money <= 0) throw new SpecialExcpetion("Out of money");
		return money;
	}
	
	public int methodB(int money) {
		try {
			System.out.println("Begin");
			int result = methodA(money); //可能抛出异常
			return result;
		}catch(SpecialExcpetion e){
			System.out.println(e.getMessage());
			return -100; //最后执行
		}finally {
			System.out.println("Finally");
		}
	}
	public static void main(String args[]) {
		System.out.println(new WithReturn().methodB(1));
	}

}
