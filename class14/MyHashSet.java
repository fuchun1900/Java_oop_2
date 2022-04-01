package class14;

public class MyHashSet {
	private Node[] array;
	private int size = 0;   //表示集合中存放对象的数目
	public MyHashSet(int length) {
		array = new Node[length];	//新建NODE数组 
		}
	public int size() {
		return size;
	}
	
	/**获得一个对象的改善的哈希码，参考类java.util.HashMap类的hash（）方法*/
	private static int hash(Object o) {
		int h = o.hashCode();
		h += ~(h << 9);
		h ^= (h >>>14 );
		h += (h << 4);
		h ^= (h >>> 10);
		return h;
	}
	/**根据对象的哈希码获得索引位置,参考java.util.HashMap类的indexFor()方法*/
	private int indexFor(int hashCode) {
		return hashCode & (array.length-1);
	}
	/**把对象加入到集合中，不允许加入重复元素*/
	public void add(Object value) {
		int index = indexFor(hash(value));
		System.out.println("index: " + index + " value: " + value);
		Node newNode = new Node(value);
		
		Node node = array[index];
		if(node == null) { //如果该位置没被占用，则在该位置加入node节点
			array[index] = newNode;
			size++;
		}else {  //否则在链表末尾加入node节点
			Node nextNode;
			while(!node.getValue().equals(value) && (nextNode = node.getNext())!=null) {
				node = nextNode;
				//不允许加入重复元素
				if(!node.getValue().equals(value)) {
					node.setNext(newNode);
					size++;
				}
			}

		}
	}
	/**测试集合中是否存在参数指定的对象*/
	public boolean contains(Object value) {
		int index = indexFor(hash(value));
		Node node = array[index];
		while(node!=null && !node.getValue().equals(value)) {
			node = node.getNext();
		}
		if(node!=null && node.getValue().equals(value))
			return true;
		else
			return false;
	}
	/**删除集合中的一个对象*/
	public boolean remove(Object value) {
		int index = indexFor(hash(value));
		Node node = array[index];
		if(node!=null && node.getValue().equals(value)) {
			array[index] = node.getNext();
			size--;
			return true;
		}
		Node lastNode = null;
		while(node!=null && !node.getValue().equals(value)) {
			lastNode = node;
			node = node.getNext();
		}
		if(node!=null && node.getValue().equals(value)) {
			lastNode.setNext(node.getNext());
			size--;
			return true;
		}else {
			return false;
		}
	}
	/**返回集合中的所有对象*/
	public Object[] getAll() {
		Object[] values = new Object[size];
		int index = 0;
		for(Node node :array) {
			while(node!=null) {
				values[index++] = node.getValue();
				node = node.getNext();
			}
		}
		return values;
	}
	public static void main(String[] args) {
		MyHashSet set = new MyHashSet(6);
		Object[] values = {"tom","mike","mike","jack","mary","linda","rose","jone"};
		for(Object value:values)
			set.add(value);  //向集合加入对象
		set.remove("mary"); //删除一个对象
		System.out.println("size = "+set.size());
		values = set.getAll(); //获得集合中所有对象
		for(Object value:values)
			System.out.println(value);
		System.out.println(set.contains("jack"));
		System.out.println(set.contains("linda"));
		System.out.println(set.contains("jane"));
	}
}

