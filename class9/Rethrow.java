package class9;

public class Rethrow {
	public static void g() throws Exception{
		System.out.println("Originates from g()");
		throw new Exception("Throw from g()");
	}
	public static void main(String [] args) {
		try {
			g();
		}catch(Exception e) {
			System.out.println("Caught in main");
			e.printStackTrace();
			throw new NullPointerException("From main");
		}
	}

}
