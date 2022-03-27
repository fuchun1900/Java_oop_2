package class13;

public class Machine4 extends Thread{
	private int a ;
	public void start() {
		run();
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
		Machine4 machine = new Machine4();
		machine.start();
	}

}
