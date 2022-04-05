package class15;
import java.util.*;

public class PerformanceTester {
	private static final int TIMES = 100000;
	
	public static abstract class Tester{
		private String operation;
		public Tester(String operation) {
			this.operation = operation;
		}
		public abstract void test(List<String>list);
		public String getOperation() {
			return operation;
		}
		
		Tester iterateTester = new Tester("iterate") { //执行遍历操作的匿名类
			public void test(List<String>list) {
				for(int i = 0; i < 10 ; i++) {
					Iterator<String>it = list.iterator();
				while(it.hasNext()) {
					it.next();
					}
				}
			}
		};
	}

}
