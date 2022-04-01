package class14;

public class Test {
	public static void main(String args[]) {
		int arr[] = new int[]{1,2,3};
		for (int i = 0; i < 2; i++) {
			arr[i] = 0;
		}
		
		try {
			for(int ix :arr)
				System.out.print(ix);
			System.out.println(args[args.length-1]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Out of index");
		}
	}

}
