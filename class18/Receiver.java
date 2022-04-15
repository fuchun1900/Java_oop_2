package class18;
import java.io.*;
import java.util.*;

/**向管道输出流写数据到线程*/
public class Receiver extends Thread{
	private PipedInputStream in;
	public Receiver(Sender sender) throws IOException{
		in = new PipedInputStream(sender.getPipedOutputStream());
	}
	public void run() {
		try {
			int data;
			while((data = in.read())!= -1)
				System.out.println(data);
			in.close();
		}catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
	public static void main(String args[]) throws Exception{
		Sender sender = new Sender();
		Receiver receiver = new Receiver(sender);
		sender.start();
		receiver.start();
	}

}
