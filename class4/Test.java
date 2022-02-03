package class4;

public class Test {
	int i = 1;
	int j = 2;
	
	public void Judge(int a,int b) {
		if(a == 1 || b == 1)
			System.out.println("Ok");
	}
	void Bb() {
		int output = 10;
		boolean b1 = false;
		if((b1 = true) && ((output+=10)==20)) {
			System.out.println("We are equal" +" "+output);
		}else {
			System.out.println("Not equal!" +output);
		}
		
	}
	public int Move(int a,int b) {
		return a << b;
	}
	
	public static void main(String arg[]){
		Test t = new Test();
		//System.out.println(t.Move(1,1));
		long temp = (int)3.9;
		t.Bb();
	}
}
