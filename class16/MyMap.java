package class16;
import java.util.*;

public class MyMap<K,V> {
	private Map<K,V> map = new HashMap<K,V>();
	
	public void put(K k, V v) {
		map.put(k,v);
	}
	public V get(K k) {
		return map.get(k);
	}
	public int size() {
		return map.size();
	}
	public static void main(String[] args) {
		MyMap<Integer,String> map = new MyMap<Integer,String>();
		map.put(1,"book1");
		map.put(2,"book2");
		System.out.println(map.get(2));
	}

}
