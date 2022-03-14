package class11;
import java.util.Map;
import java.util.HashMap;

public class Ghost {
	//实例缓存
	private static final Map<String,Ghost> ghosts = new HashMap<String,Ghost>();
	private final String name;
	
	public Ghost(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	/**
	 * 如果实例缓存中存在与name参数匹配的ghost对象，就将其返回，否则创建新的Ghost对象将其返回
	 */
	public static Ghost getInstatnce(String name) {
		Ghost ghost = ghosts.get(name);
		if(ghost == null) {
			ghost = new Ghost(name);
			ghosts.put(name,ghost);
		}
		return ghost;
	}
	public static void removeInstance(String name) {
		ghosts.remove(name); //从缓存中删除name参数指定的Ghost对象
	}
	protected void finalize() throws Throwable{
		ghosts.put(name,this);
		System.out.println("execute finalize");
	}
	public static void main(String args[]) throws Exception{
		Ghost ghost = Ghost.getInstatnce("IAmBack");
		System.out.println(ghost);
		String name = ghost.getName();
		ghost = null;
		Ghost.removeInstance(name);
		System.gc();
		//把cpu让给垃圾回收线程
		Thread.sleep(3000);
		ghost = Ghost.getInstatnce("IAmBack");
		System.out.println(ghost);
	}
}
