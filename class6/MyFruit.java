package class6;

public class MyFruit {
	public static void main(String[] args) {
		Orange o = new Orange();
		Fruit f = o;
		Apple a = (Apple)f;
	}
}
