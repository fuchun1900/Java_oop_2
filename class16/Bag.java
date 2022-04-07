package class16;

public class Bag<T> {
	private T content;
	public Bag(T content) {
		this.content = content;
	}
	public T get() {
		return this.content;
	}
	public void set(T content) {
		this.content = content;
	}
	public static void main(String args[]) {
		Bag<String> bag = new Bag<String>("mybook");
		//Integer content1 = bag.get(); //编译出错
		String content2 = bag.get();
	}

}
