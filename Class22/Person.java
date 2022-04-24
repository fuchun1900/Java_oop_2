package Class22;
@AuthorAnnotation(name = "TOM",company = "ABC Company")
public class Person {
	@CommonAnnotation(ctype = String.class,description = "姓名")
	private String name;
	
	@CommonAnnotation(ctype = int.class,description = "年龄")
	private int age;
	
	@ConstructorAnnotation  //默认构造方法
	public Person() {
		this("Unknow",0);
	}
	@ConstructorAnnotation("带参数构造方法")
	public Person(
			//注解构造方法参数
			@CommonAnnotation(ctype = String.class,description = "姓名") String name,
			@CommonAnnotation(ctype = int.class,description = "年龄") int age) {
		this.name = name;
		this.age = age;
	}
	@CommonAnnotation(ctype = String.class,description = "获得姓名")
	public String getName() {
		return name;
	}
	@CommonAnnotation(ctype = int.class,description = "获得年龄")
	public int getAge() {
		return age;
	}
	@CommonAnnotation(description = "设置姓名")
	public void setName(
			@CommonAnnotation(ctype = String.class,description = "姓名") String name) {
		this.name = name;
	}
	public void setAge(
			@CommonAnnotation(ctype = int.class,description = "年龄") int age) {
		this.age = age;
	}
	

}
