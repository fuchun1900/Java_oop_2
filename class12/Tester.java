package class12;

public class Tester {
	public static void main(String args[]) {
		Outer o = new Outer();
		o.add(1,2,3);
		Outer.innerTool tool = new Outer().new innerTool();
	}

}
