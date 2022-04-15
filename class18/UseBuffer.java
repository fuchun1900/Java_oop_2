package class18;
import java.io.*;

public class UseBuffer {
	public static void main(String args[]) throws IOException{
		final int SIZE = 102;
		FileInputStream in = new FileInputStream("/Users/fuchun/Document/java_project/Eclipse_workspace/Java_oop_2/src/test.txt");
		FileOutputStream out =  new FileOutputStream("/Users/fuchun/Document/java_project/Eclipse_workspace/Java_oop_2/src/out.txt");
		
		byte[] buff = new byte[SIZE]; //创建字节数组缓冲区
		int len = in.read(buff); //把test.txt文件中的数据读入到buff中
		while(len != -1) {
			out.write(buff,0,len); //把buff数据写入到out.txt文件中
			len = in.read(buff);
		}
		in.close();
		out.close();
	}

}
