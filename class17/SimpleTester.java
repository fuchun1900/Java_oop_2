package class17;
import java.util.*;

public class SimpleTester {
	public static void main(String args[]) {
		String[] data = {"tom","mike","mary","linda","jack"};
		List<String>names = Arrays.asList(data);
		
	
	//传统遍历方式
	for(String name:names) {
		System.out.println(name);
	}
	
	//lambda遍历
	names.forEach(System.out::println);
	
	}
}
