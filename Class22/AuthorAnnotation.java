package Class22;
import java.lang.annotation.*;
@Documented
@Target({ElementType.TYPE}) //适用于java类型
@Retention(RetentionPolicy.RUNTIME) //有效范围为运行时
public @interface AuthorAnnotation {
	String name(); //作者姓名
	String company(); //作者所在单位
}
