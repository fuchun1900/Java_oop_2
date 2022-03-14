package class11;

public class Mystery {
	String s;
	int i;
	public static void main(String[] args) {
		Mystery m = new Mystery();
		m.go();
	}
	Mystery() {
		this.s = "Constructor";
		this.i = 3;
	}
	void go() {
		System.out.println(s);
	}

}
