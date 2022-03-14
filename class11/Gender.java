package class11;

public class Gender {
	private String description;
	private static final Gender female = new Gender("女");
	private static final Gender male = new Gender("男");
	
	private Gender(String description) {
		this.description = description;
	}
	public static Gender getFemale() { //静态工厂方法
		return female;
	}
	public static Gender getMale() { //静态工厂方法
		return male;
	}
	public String getDescription() {
		return description;
	}
}
