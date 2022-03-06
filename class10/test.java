package class10;

public class test {
	
    public static void main(String[] args) throws ClassNotFoundException {
	        System.out.println("inside main");
	        Class c1 = Cat.class;
	        Class c2= Class.forName("class10.Cat"); //初始化
	        Class c3=new Cat().getClass();
	        Class c4 =new Cat().getClass();
	        System.out.println(c1==c2);
	        System.out.println(c2==c3);
	        System.out.println("finish main");
    }
}
	        
			 
