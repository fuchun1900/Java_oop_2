package class12;

public class Outer4 {
	public static interface Tool{
		public int add(int a,int b);  //静态内部接口
	}
	private Tool tool = new Tool() {  //匿名类
		public int add(int a, int b) {
			return a+b;
		}
	};
	public void add(int a,int b,int c) {
		tool.add(tool.add(a,b),c);
	}
	public void setTool(Tool tool) {
		this.tool = tool;
	}
		
}


