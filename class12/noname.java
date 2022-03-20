package class12;

public class noname {
	noname(int v){
		System.out.println("another constructor");
	}
	noname(){
		System.out.println("default constructor");
	}
	void method() {
		System.out.println("From noname");
	}
	public static void main(String args[]) {
		new noname().method(); 
		noname a = new noname(){ //匿名类
			void method() {
				System.out.println("From anonymous");}
			};
			a.method();
	}
}
