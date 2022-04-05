package class15;

public class Customer {
	private String name;
	private int age;
	
	public Customer(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
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
