package class13;

public class Sleeper extends Thread{
	public void run() {
		try {
			sleep(60000); //休眠一分钟
			System.out.println("Sleep Over");
		}catch(InterruptedException e) {
			System.out.println("Sleep interrupted");
		}
		System.out.println("and");
	}
	public static void main(String args[]) throws Exception{
		Sleeper sleeper = new Sleeper();
		sleeper.start();
		Thread.sleep(10);
		sleeper.interrupt(); 
	}

}
