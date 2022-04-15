package class18;
import java.io.*;

public class FileInputStreamTester {
	public static void main(String args[]) throws IOException{
		FileInputStream in = new FileInputStream("/Users/fuchun/Document/java_project/Eclipse_workspace/Java_oop_2/src/test.txt");
		int data;
		while((data = in.read())!= -1)
			System.out.println(data + " ");
		in.close();
	}

}
