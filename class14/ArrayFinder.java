package class14;

public class ArrayFinder {
	public static void print(int[] array,int middle) {
		for(int i = 0;i < array.length; i++) {
			System.out.print(array[i] + " ");
			if(i==middle)
				System.out.print("*");
		}
		System.out.println();
	}
	/**采用二分查找方法*/
	public static int indexOf(int[] array,int value) {
		int low = 0;
		int high = array.length-1;
		int middle;
		
		while(low <= high) {
			middle = (low + high)/2; //计算中间元素的索引
			print(array,middle); //打印数组，用于跟踪查找过程
			if(array[middle] == value)
				return middle;
			if(value < array[middle])
				high = middle - 1;
			else
				low = middle + 1;
		}
		return -1; //未查到元素
	}
	public static void main(String args[]) {
		int[] array = {4,5,6,7,9,13,17};
		System.out.println("Location of 13 : "+indexOf(array,13)); //查找13在数组中的位置
	}

}
