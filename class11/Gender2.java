package class11;
import java.io.Serializable;
import java.util.*;
public class Gender2 implements Serializable{
	private final Character sex;
	private final transient String description;
	
	public Character getSex() {
		return sex;
	}
	public String getDescription() {
		return description;
	}
	//实例缓存
	private static final Map<Character,Gender2>instanceBySex = new HashMap<Character,Gender2>();
	/**
	 * 把构造方法声明为private类型，以禁止外部程序创建Gender类都实例
	 */
	private Gender2(Character sex,String description) {
		this.sex = sex;
		this.description = description;
		instanceBySex.put(sex,this);
	}
	public static final Gender2 FEMALE = new Gender2(new Character('F'),"Female");
	public static final Gender2 MALE = new Gender2(new Character('M'),"Male");
	public static Collection getAllValues() {
		return Collections.unmodifiableCollection(instanceBySex.values());
	}
	/**
	 * 按照参数指定都性别缩写查找Gender实例
	 */
	public static Gender2 getInstance(Character sex) {
		Gender2 result = (Gender2)instanceBySex.get(sex);
		if(result == null) {
			throw new NoSuchElementException(sex.toString());
		}
		return result;
	}
	public String toString() {
		return description;
	}
	/**
	 * 保证反序列化时直接返回Gender类包含都静态实例
	 */
	private Object readResolve() {
		return getInstance(sex);
	}

}
