package class12;

public class Outer {
	public class innerTool{ //内部类
		public int add(int a,int b) {
			return a+b;
		}
	}
	private innerTool tool = new innerTool();
	
	public void add(int a,int b,int c) {
		tool.add(tool.add(a,b),c);
	}
}
