package Class22;

public @interface MyAnnotation {
	String value() default "默认构造方法";
	Class type() default void.class;
}
