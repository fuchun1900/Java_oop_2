package Class22;
import java.lang.annotation.*;
//适用于成员变量，成员方法和参数
@Target({ElementType.FIELD,ElementType.METHOD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)  //有效范围是运行时
public @interface CommonAnnotation {
	Class ctype() default void.class;
	String description();
}
