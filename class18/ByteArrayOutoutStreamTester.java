package class18;
import java.io.*;

public class ByteArrayOutoutStreamTester {
	public static void main(String args[]) throws IOException{
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		out.write("你好".getBytes("UTF-8")); //把你好的utf-8编码写到字节数组中
		byte[] buff = out.toByteArray(); //获得字节数组
		out.close();
		ByteArrayInputStream in = new ByteArrayInputStream(buff);
		int len = in.available();
		byte[] buffin = new byte[len];
		in.read(buffin); //把buff字节数组中的数据写入到buffin中
		in.close();
		
		System.out.println(new String(buffin,"UTF-8"));
	}

}
