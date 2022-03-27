package class13;

public class Machine12 extends Thread{
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
		Machine12 m1 = new Machine12();
		Machine12 m2= new Machine12();
		Thread main = Thread.currentThread(); //获得祝线程
		m1.setName("m1");
		m2.setName("m2");
		/*查看和设置线程的优先级*/
		System.out.println("Default priority of main :"+main.getPriority());
		System.out.println("Default priority of m1 :"+m1.getPriority());
		System.out.println("Default priority of m2 :"+m2.getPriority());
		
		m2.setPriority(Thread.MAX_PRIORITY);
		m1.setPriority(Thread.MIN_PRIORITY);
		
		m1.start();
		m2.start();
		m1.run();
		
		//Thread.sleep(1000);
		System.out.println(log);
	}

}
