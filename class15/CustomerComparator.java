package class15;
import java.util.*;

public class CustomerComparator implements Comparator<Customer>{
	public int compare(Customer c1,Customer c2) {
		if(c1.getName().compareTo(c2.getName()) > 0 )
			return -1;
		if(c1.getName().compareTo(c2.getName()) < 0 )
			return 1;
		
		return 0;
	}
	public static void main(String args[]) {
		//创建treeSet对象时，在构造方法中指定采用CustomerComparator来比较customer对象
		Set<Customer>set = new TreeSet<Customer>(new CustomerComparator());
		
		Customer customer1 = new Customer("Tom",15);
		Customer customer3 = new Customer("Jack",16);
		Customer customer2 = new Customer("Mike",26);
		set.add(customer1);
		set.add(customer2);
		set.add(customer3);
		
		for(Customer customer : set)
			System.out.println(customer.getName() + " " + customer.getAge());
	}

}
