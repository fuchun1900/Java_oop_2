package class10;

class Cat {
    static {
        System.out.println("Loading Cat");
    }
    public static void main(String[] args) throws ClassNotFoundException { //调用类静态方法所以先初始化
        System.out.println("inside main");
        Class c1 = Cat.class;
        Class c2= Class.forName("class10.Cat");
        Class c3=new Cat().getClass();
        Class c4 =new Cat().getClass();
        System.out.println(c1==c2);
        System.out.println(c2==c3);
        System.out.println("finish main");
    }
}
