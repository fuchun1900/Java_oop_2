package class8;

public class TestB {
	public void bmethod() {
		TestA a = new TestA();
		TestA.amethod();
		a.amethod();
	}
	
	public static void main(String args[]) {
		TestB b = new TestB();
		b.bmethod();
	}

}
