package class13;

public class Machine5 extends Thread{
	private int a ;
	private static int count = 0;  //统计被启动的Machine线程的数目
	public void start() {
		super.start();
		System.out.println(currentThread().getName() + ":第 " +(++count)+"个Machine线程启动");
	}
	public void run() {
		for(a = 0;a < 50; a++) { 
			System.out.println(currentThread().getName()+" : "+a);
			try {
				sleep(100);
			}catch(InterruptedException e){
				throw new RuntimeException(e);
			}
		}
	}
	public static void main(String args[]) {
		Machine5 machine1 = new Machine5();
		Machine5 machine2 = new Machine5();
		machine1.start();
		machine2.start();
		machine2.start(); //线程只能启动一次，抛出异常
	}

}