package class11;
import java.util.EmptyStackException;

public class Stack {
	private Object[] elements; //存放对象
	private int size = 0;
	private int capacityIncrement = 10; //堆栈的容量增长步长
	
	public Stack(int initialCapacity,int capacityIncrement) {
		this(initialCapacity);
		this.capacityIncrement = capacityIncrement;
	}
	public Stack(int initialCapacity) { //参数initialCapacity为堆栈的初始容量
		elements = new Object[initialCapacity];
	}
	public void push(Object object) { //向堆栈中加入一个对象
		ensureCapacity();
		elements[size++] = object;
	}
	public Object pop() { //从堆栈中取出一个对象
		if(size == 0)
			throw new EmptyStackException();
		//Object object = elements[--size];
		//elements[size] = null; //清除数组中已经出栈的对象引用
		//return object;
		return elements[--size];
		
	}
	private void ensureCapacity() { //增加堆栈的容量
		if(elements.length == size) {
			Object[] oldElements = elements;
			elements = new Object[elements.length + capacityIncrement];
			//把原数组中的内容复制到新数组中
			System.arraycopy(oldElements,0,elements,0,size);
		}
	}
	public static void main(String args[]) {
		Stack stack = new Stack(1000);
		for(int a = 0;a < 1000; a++)
			stack.push(Integer.valueOf(a));
		for(int a = 0;a < 1000; a++)
			System.out.println(stack.pop());
		
	}

}
