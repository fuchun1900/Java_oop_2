package class17;
import java.util.*;

public class SortTester {
	public static void main(String[] args) {
		String[] data = {"tom","mike","mary","linda","jack"};
		List<String>names = Arrays.asList(data);
		
		//方式1，通过创建匿名的comparator实例来排序
		Comparator<String>cp = new Comparator<String>() {
			public int compare(String s1,String s2) {
				return(s1.compareTo(s2));
			}
		};
		Collections.sort(names,cp);
		
		//方式2，用lambda表达式排序
		Comparator<String>sortByName = (String s1,String s2)->(s1.compareTo(s2));
		Collections.sort(names,sortByName);
		
		//方法3，直接用lambda表达式排序
		Collections.sort(names,(String s1,String s2)->(s1.compareTo(s2)));
		names.forEach(System.out::println);
	}

}
