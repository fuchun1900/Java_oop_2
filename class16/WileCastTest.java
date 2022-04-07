package class16;
import java.util.*;

public class WileCastTest {
	public static void main(String args[]) throws Exception{
		List<Integer> listInteger = new ArrayList<Integer>();
		listInteger.add(11);
		printNew(listInteger);
		
	}
	public static void print(Collection<Object> collection) {
		for(Object obj :collection)
			System.out.println(obj);
	}
	public static void printNew(Collection<?> collection) {  //使用通配符
		for(Object obj : collection)
			System.out.println(obj);
	}

}
