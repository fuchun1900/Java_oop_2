package class12;

public class Outer3 {
	Inner3 in;
	Outer3(){
		in = new Inner3();
	}
	public class Inner3{
		public Inner3() {
			System.out.println("inner of Outer");
		}
	}
}
