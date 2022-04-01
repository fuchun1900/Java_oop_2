package class14;

public class Test2 {
	public static int sum(int...datas) {
		int result = 0;
		for(int a:datas)
			result+=a;
		
		return result;
	}
	public static void main(String args[]) {
		System.out.println(sum(1,2));
		System.out.println(sum(new int[] {4,5}));
		System.out.println(sum());
	}

}
