package class9;
import java.io.*;

public class ExceptSub extends ExcpetDemo{
	public static void main(String argv[]) {
		ExceptSub e = new ExceptSub();
	}
	public static void amethod() {
		
	}
	protected void ExcpetDemo() throws IOException{
		DataInputStream din = new DataInputStream(System.in);
		System.out.println("Pasusing");
		din.readChar();
		System.out.println("Continuing");
		this.amethod();
		
	}
}
