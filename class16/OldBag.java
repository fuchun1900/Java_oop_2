package class16;

public class OldBag {
	private Object content;
	public OldBag(Object content) {
		this.content = content;
	}
	public Object get() {
		return this.content;
	}
	public void set(Object content) {
		this.content = content;
	}
	public static void main(String[] args) {
		OldBag bag = new OldBag("mybook");
		//运行时抛出ClassCastException
		Object content = (Integer)bag.get();
	}

}
