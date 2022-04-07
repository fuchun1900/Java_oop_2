package class16;
import java.util.*;

public class LimitBag<T extends Number> {
	private T content;
	
	public LimitBag(T content) {
		this.content = content;
	}
	public T get() {
		return this.content;
	}
	public void set(T content) {
		this.content = content;
	}
	public static void main(String args[]) {
		LimitBag<Integer> bag2 = new LimitBag<Integer>(12);
	}
	
}
