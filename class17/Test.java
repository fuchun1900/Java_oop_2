package class17;

public class Test {
	public static void main(String args[]) {
		new Thread(()-> {
					for(int i = 0;i<10;i++) { 
						System.out.println(i);
					}
		}).start();
	}
}
