package class15;

public class Customer2 implements Comparable{
	private String name;
	private int age;
	
	public int compareTo(Object o) {
		Customer other = (Customer)o;
		//按照name属性排序
		if(this.name.compareTo(other.getName()) > 0)
			return 1;
		if(this.name.compareTo(other.getName()) < 0)
			return -1;
		
		//按照age属性排序
		if(this.age > other.getAge())
			return 1;
		if(this.age < other.getAge())
			return -1;
		return 0;
	}
	
	public boolean equals(Object o) {
		if(this == o)
			return true;
		if(!(o instanceof Customer))
			return false;
		final Customer other = (Customer) o;
		if(this.name.equals(other.getName()) && this.age == other.getAge())
			return true;
		else
			return false;
	}
	public int hashCode() {  //覆盖hashCode方法
		int result = (name==null ? 0 : name.hashCode());
		return 29*result+age;
	}

}
