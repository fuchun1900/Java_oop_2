package class13;

public class Machie10 extends Thread{
	private int a;
	private static int count;
	
	public void start() {
		super.start();
	Thread deamon = new Thread() {
		public void run() {
			while(true) {
				//每隔一秒把实例变量a设为0
				reset();
				try {
					sleep(10);
				}catch(InterruptedException e) {
					throw new RuntimeException(e);
				}
			}
		}
	};
	deamon.setDaemon(true);
	deamon.start();
	}
	public void reset() {
		a = 0;
	}
	public void run() {
		while(true) {
			System.out.println(getName() + ":" + a++);
		if(count++ == 100)
			break;
		Thread.yield();
		}
	}
	public static void main(String args[]) throws Exception{
		Machie10 machine = new Machie10();
		machine.start();
	}
}
		

