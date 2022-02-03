package class3;

public class Doll {
	private static int number = 0; //静态变量，储存在方法区中
	private int id = 0; //实例变量
	private String name; //实例变量
	public Doll(String name) {//构造方法
		this.name = name;
		number++;
		id = number;
	}
	public void speak(String word) { //word是方法参数
		String showNumber = "目前共有" + number + "个娃娃！";//方法中定义的都是局部变量
		String showId = "我的ID是" + id;
		
		System.out.println(name + ":" + showNumber);
		System.out.println(name + ":" + showId);
		System.out.println(name + ":" + word);
	}
	public static void main(String args[]) {
		Doll doll1 = new Doll("贝贝");
		Doll doll2 = new Doll("晶晶");
		
		doll1.speak("大家好!");
		doll2.speak("大家好!");
	}
}
