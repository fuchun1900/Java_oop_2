package class13;

public class Machine2 extends Thread{
	public void run() {
		for(int a = 0; a < 50; a++) {
			System.out.println(currentThread().getName()+ ":" +a);
			try {
				sleep(100); //给其他线程运行的机会
			}catch(InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
	}
	public static void main(String args[]) {
		Machine2 machine1  = new Machine2(); // 创建第一个Machine2
		Machine2 machine2  = new Machine2(); // 创建第二个Machine2
		machine1.start(); //启动第一个线程
		machine2.start(); //启动第二个线程
		machine1.run(); //主线程执行第一个machine对象的run方法
		
	}

}
