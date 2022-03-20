package class12;

public class TestOuter1 {
	String a;
	int k ;
	public TestOuter1() {
		k++;
	}
	public class Inner{
		String b;
		public void InnerMethod() {
			System.out.println("Enclosing a is " + a);
			System.out.println("b is " + b);
		}
	}
	public void createInner() {
		
		Inner i = new Inner();
		i.InnerMethod();
	
		TestOuter1.Inner j = new TestOuter1.Inner();
		j.InnerMethod();
		System.out.println("This is the value of k"+k);
		Inner l = new TestOuter1.Inner();
		i.InnerMethod();
		System.out.println("This is the instance no "+k);
	}

}
