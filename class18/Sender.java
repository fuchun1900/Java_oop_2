package class18;
import java.io.*;
import java.util.*;

public class Sender extends Thread{
	private PipedOutputStream out = new PipedOutputStream();
	public PipedOutputStream getPipedOutputStream() {
		return out;
	}
	
	public void run() {
		try {
			for(int i = -127;i <= 128;i++) {
				out.write(i);
				Thread.yield();
			}
			out.close();
		}catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
	

}
