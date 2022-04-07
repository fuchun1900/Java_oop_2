package class16;

package class16;
import java.util.*;

public class LimitBag2<T extends Set> {
	private T content;
	public LimitBag2(T content) {
		this.content = content;
	}


	public static void main(String args[]) {
		LimitBag2<TreeSet<String>> bag2 = new LimitBag2<TreeSet<String>>(new TreeSet<String>());
	}
	
}