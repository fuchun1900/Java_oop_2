package class5;

import java.util.List;
import java.util.ArrayList;


public class ForEachTest {
	public static void main(String args[]) {
		ForEachTest test = new ForEachTest();
		test.testArray1();
		test.testArray2();
		test.testList();
	}
	
	public void testArray1(){
		int array[] = {8,9,1};
		for(int i = 0;i < array.length;i++) {
			System.out.println(array[i]);
		}
	}
	
	public void testArray2(){
		int array[] = {8,9,1};
		for(int x : array)
			System.out.println(x);
	}
	public void testList() {
		List<String> list = new ArrayList<String>();
		list.add("8");
		list.add("9");
		list.add("1");
		
		for(String x : list)
			System.out.println(x);
	}
	

}
