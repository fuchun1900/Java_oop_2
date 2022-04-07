package class16;

public class ArrayBag<T> {
	private T[] content;
	
	public ArrayBag(T[] content) {
		this.content = content;
	}
	public T[] get() {
		return this.content;
	}
	public void set(T[] content) {
		this.content = content;
	}
	public static void main(String[] args) {
		String[] content = {"book1","book2","book3"};
		ArrayBag<String> bag = new ArrayBag<String>(content);
		
		for(String c:bag.get())
			System.out.print(c);
	}
	

}
