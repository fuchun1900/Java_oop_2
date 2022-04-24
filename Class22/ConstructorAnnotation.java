package Class22;
import java.lang.annotation.*;
@Target(ElementType.CONSTRUCTOR)  //适用于构造方法
@Retention(RetentionPolicy.RUNTIME)  //有效范围
public @interface ConstructorAnnotation {
	String value() default "默认构造方法";
}
