package class13;

public class Machine11 extends Thread{
	public static StringBuffer log = new StringBuffer();
	private static int count = 0;
	
	public void run() {
		for(int a = 0;a < 20; a++) {
			log.append(currentThread().getName() + ":" + a +" ");
			if(++count % 10 == 0)
				log.append("\n");
		}
	}
	public static void main(String args[]) throws Exception{
		Machine11 machine1 = new Machine11();
		Machine11 machine2= new Machine11();
		machine1.setName("m1");
		machine2.setName("m2");
		machine1.start();
		machine2.start();
		while(machine1.isAlive()||machine2.isAlive())
			Thread.sleep(500);
		System.out.println(log);
	}

}
