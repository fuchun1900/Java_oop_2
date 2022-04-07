package class16;

public class MethodTest {
	//范型方法
	public static <E> void printArray(E[] array) {
		for(E element : array)
			System.out.println(element);
	}
	//范型方法
	public static <T extends Comparable<T>> T max(T x,T y) {
		return x.compareTo(y) > 0? x:y;
	}
	public static void main(String args[]) {
		Integer[] intArray = {2,4,6,1,5};
		printArray(intArray); //传递整型数组
	}

}
