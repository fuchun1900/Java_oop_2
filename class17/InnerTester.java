package class17;
import java.util.*;

public class InnerTester {
	public static void main(String[] args) {
		//方法一：使用匿名内部类
		new Thread(new Runnable() {
			public void run() {
				System.out.println("Hello world!");
			}
		}).start();
		//方法二 ： 使用lambda表达式
		new Thread(()-> System.out.println("Hello World!")).start();
		//方法三：  使用lambda表达式
		Runnable race = ()-> System.out.println("Hello World!");
		new Thread(race).start();
	}
	

}
