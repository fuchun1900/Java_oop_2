package class11;

public class Employee {
	private String name;
	private int age;
	
	/**当雇员当姓名和年龄都已知时，调用此构造方法*/
	public Employee(String name,int age) {
		this.name = name;
		this.age = age;
	}
	/**当雇员当姓名已知而年龄未知时，就调用此构造方法*/
	public Employee(String name) {
		this(name,-1);//调用上一个构造方法
	}
	/**当雇员当名字和年龄都未知时，调用此构造方法*/
	public Employee() {
		this("无名氏");//调用上一个构造方法
	}
	public void steName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public static void main(String args[]) {
		Employee zhangsan = new Employee("张三",25);
		Employee lisi = new Employee("李四");
		Employee someone = new Employee();
		System.out.println(zhangsan.name+zhangsan.age+" "+lisi.name+lisi.age+'\n'
				+someone.name+someone.age);
	}

}
