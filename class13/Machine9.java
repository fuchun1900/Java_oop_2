package class13;

public class Machine9 extends Thread{
	public void run() {
		for(int a = 0;a < 3; a++) {
			System.out.println(this.getName()+":"+a);
			Thread.yield();
		}
	}
	public static void main(String ars[]) throws Exception{
		Machine9 machine = new Machine9();
		machine.setName("m1");
		
		machine.start();
		machine.run();
		
	}
	

}
