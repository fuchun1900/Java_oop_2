package class11;
import java.util.Set;
import java.util.HashSet;
import java.lang.ref.*;

public class Name {
	private final String firstname;
	private final String lastname;
	
	public Name(String firstname,String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}
	//实例缓存，存放Name对象的软应用
	private static final Set<SoftReference<Name>>names = new HashSet<SoftReference<Name>>();
	
	public static Name valueOf(String firstname,String lastname) { //静态工厂方法
		for(SoftReference<Name>ref:names) {
			Name name = ref.get(); //获得软引用所引用的Name对象
			if(name!=null && name.firstname.equals(firstname)
					&& name.lastname.equals(lastname))
				return name;
		}
		//如果在缓存中不存在Name对象，就创建该对象，并把它的软引用加入到实例缓存
		Name name = new Name(firstname,lastname);
		names.add(new SoftReference<Name>(name));
		return name;
	}
	public static void main(String args[]) {
		Name n1 = Name.valueOf("小红","王");
		Name n2 = Name.valueOf("小红","王");
		Name n3 = Name.valueOf("小懂","章");
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
	}

}
