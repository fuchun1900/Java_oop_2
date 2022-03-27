package class13;

public class Machine7 extends Thread{
	private static StringBuffer log = new StringBuffer();
	private static int count = 0;
	
	public void run() {
		for(int a = 0;a < 50; a++)
			System.out.println(currentThread().getName()+":"+a);
	}
	public static void main(String args[]) throws Exception{
		Machine7 machine = new Machine7();
		machine.start();
		//主线程进入阻塞状态，等待用户输入，直到获得用户输入的数据，才退出阻塞
		int data = System.in.read();
		machine.run();
	}

}
