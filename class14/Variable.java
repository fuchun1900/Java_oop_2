package class14;

public class Variable {
	public static int max(int... dates) { //dates是可变参数
		if(dates.length == 0)
			return -1;
		
		int result = 0;
		for(int a : dates)
		{
			if(a > result)
				result = a;
		}
		return result;
	}
	public static void main(String args[]) {
		System.out.println(max(5) + ",");
		System.out.println(max(5,8,2,4,5) + ",");
		System.out.println(max(new int[] {4,10,6,5}) + ",");
		System.out.println(max());
	}

}
