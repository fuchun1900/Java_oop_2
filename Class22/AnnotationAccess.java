package Class22;
import java.lang.annotation.*;
import java.lang.reflect.*;

public class AnnotationAccess {
	/*打印类的注解*/
	public static void printClassAnnotations(Class c1) {
		if(c1.isAnnotationPresent(AuthorAnnotation.class)) {
			//获得AuthorAnnotation类型对注解
			AuthorAnnotation aa =(AuthorAnnotation)c1.getAnnotation(AuthorAnnotation.class);
			System.out.println("作者 " + aa.name() +"," +aa.company());
		}
	}
	/*打印类的构造方法对注解*/
	public static void printConstructorAnnotations(Class c1) {
		System.out.println("------构造方法对描述如下-------");
		
		//获得所有的构造方法
		Constructor[] declaredConstructors = c1.getDeclaredConstructors();
		for(int i = 0; i < declaredConstructors.length; i++) {
			Constructor constructor = declaredConstructors[i]; //遍历构造方法
			//查看是否具有特点类型的注解
			if(constructor.isAnnotationPresent(ConstructorAnnotation.class)) {
				//获得ConstructorAnnoation类型的注解
				ConstructorAnnotation ca =
						(ConstructorAnnotation) constructor.getAnnotation(ConstructorAnnotation.class);
				System.out.print(constructor.getName() +":" + ca.value());
			}
			
			Annotation[][] parameterAnnotations = constructor.getParameterAnnotations(); //获得参数的注解
			printParameterAnnotations(parameterAnnotations);  //打印参数的注解
		}
		System.out.println();
	}
	/*打印类的成员变量的注解*/
	public static void printFieldAnnotations(Class c1) {
		System.out.println("------成员变量描述如下-------");
		Field[] declaredFields = c1.getDeclaredFields(); //获得所有成员变量
		for(int i = 0; i < declaredFields.length; i++) {
			Field field = declaredFields[i];  //遍历成员变量
			//查看是否具有CommonAnnotation类型的注解
			if(field.isAnnotationPresent(CommonAnnotation.class)) {
				//获得CommonAnnotation类型注解
				CommonAnnotation fa = field.getAnnotation(CommonAnnotation.class);
				//获得成员变量的描述
				System.out.print("成员变量" + field.getName() + ":    " +fa.description());
				System.out.println("    " + fa.ctype());  //获得成员变量类型
			}
		}
		System.out.println();
	}
	/*打印类成员方法的注解*/
	public static void printMethodAnnotations(Class c1) {
		System.out.println("------方法描述如下-------");
		Method[] methods = c1.getDeclaredMethods(); //获得所有方法
		for(int i = 0; i < methods.length; i++) {
			Method method = methods[i]; //遍历方法
			//查看是否具有CommonAnnotation类型的注解
			if(method.isAnnotationPresent(CommonAnnotation.class)) {
				//获得commonAnnotation类型的注解
				CommonAnnotation ma = method.getAnnotation(CommonAnnotation.class);
				//获得方法的描述
				System.out.println("成员方法" + method.getName() +":  " +ma.description());
				System.out.println("返回类型" + ma.ctype());
			}
			Annotation[][] parameterAnnotations = method.getParameterAnnotations(); //获得参数的注解
			//打印参数的注解
			printParameterAnnotations(parameterAnnotations);
		}
	}
	/*打印方法参数的注解*/
	public static void printParameterAnnotations(Annotation[][] parameterAnnotations) {
		for(int i = 0; i < parameterAnnotations.length ; i++) {
			int length = parameterAnnotations[i].length;  //获得指定参数注解的长度
			if(length == 0) //如果长度为0表示没有为参数添加注解
				System.out.println("    未添加Annotation的参数");
			else
				for(int j = 0; j < length; j++) {
					//获得CommonAnnotation类型的注解
					CommonAnnotation pa = (CommonAnnotation) parameterAnnotations[i][j];
					//打印参数的描述
					System.out.print("第"+(i+1)+"个参数：   "+pa.description());
					System.out.println("    "+pa.ctype());
					
				}
		}
		System.out.println();
	}
	public static void main(String args[]) throws Exception{
		Class<?> personClass = Class.forName("Class22.Person"); //获得表示Person类的Class实例
		
		//打印类的注解
		printClassAnnotations(personClass);
		//打印类的构造方法的注解
		printConstructorAnnotations(personClass);
		//打印类的成员变量的注解
		printFieldAnnotations(personClass);
		//打印类的成员方法的注解
		printMethodAnnotations(personClass);
	}
}
