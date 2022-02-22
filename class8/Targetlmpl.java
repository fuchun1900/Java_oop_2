package class8;

public class Targetlmpl implements TargetIFC{
	private SourceIFC source;
	
	public Targetlmpl(SourceIFC source) {
		this.source = source;
	}
	public int add(int a,int b) {
		return source.add(a,b);
	}
	public int addOne(int a) {
		return source.add(a,1);
	}
	
	public static void main(String args[]) {
		SourceIFC source = new Soucelmpl();
		Targetlmpl tpl = new Targetlmpl(source);
		System.out.println(tpl.add(1,2));
	}

}
