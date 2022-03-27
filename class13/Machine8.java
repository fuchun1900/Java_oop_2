package class13;

public class Machine8 extends Thread{
	public void run() {
		for(int a = 0;a < 3; a++) {
			System.out.println(currentThread().getName()+":"+a);
			if(a == 1 && currentThread().getName().equals("m1"))
				throw new RuntimeException("Wrong from Machine");
			try {
				sleep(100);
			}catch(InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
	}
	public static void main(String args[]) throws Exception{
		Machine8 machine = new Machine8();
		machine.setName("m1");
		
		machine.start();
		machine.run();
		System.out.println("IS machine alive " + machine.isAlive());
		System.out.println("main:end");
	}

}
