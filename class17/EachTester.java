package class17;
import java.util.*;

public class EachTester {
	public static void main(String args[]) {
		List<Person>persons = new ArrayList<Person>() {
			{
			//匿名初始化
			add(new Person("Tom",21));
			add(new Person("Mike",32));
			add(new Person("Linda",19));
			}
			
		};
		persons.forEach((Person p)->{ //lambda表达式,相当于consumer类型的匿名对象
			p.setAge(p.getAge()+1);
			System.out.println(p.getName() + ":" + p.getAge());
		}
	);
}

}
