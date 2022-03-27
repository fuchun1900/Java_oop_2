package class13;

public class Machine10 implements Runnable{
	private int a = 1; //共享
	public void run() {
		for(int i = 0; i <1000 ; i++) {
			a += i;
			Thread.yield(); //等待其他线程
			a -= i;
			System.out.println(a);
		}
	}
	public static void main(String args[]) throws InterruptedException{
		Machine10 machine = new Machine10();
		Thread t1 = new Thread(machine);
		Thread t2 = new Thread(machine);
		t1.start();
		t2.start();
	}

}
