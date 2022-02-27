package class9;
import java.io.*;

public class BaseExcpetion extends Exception{
	protected Throwable cause = null;
	
	public BaseExcpetion() {}
	
	public BaseExcpetion(String msg) {
		super(msg);
	}
	
	public BaseExcpetion(Throwable cause) { //参数cause指定原始的异常
		this.cause = cause;
	}
	public BaseExcpetion(String msg,Throwable cause) { //参数cause指定原始的异常
		super(msg);
		this.cause = cause;
	}
	public Throwable initCause(Throwable cause) {
		this.cause = cause;
		return cause;
	}
	public Throwable getCause() {
		return cause;
	}
	public void printStackTrace() {
		printStackTrace(System.err);
	}
	public void printStackTrace(PrintStream outStream) {
		printStackTrace(new PrintWriter(outStream));
	}
	public void printStackTrace(PrintWriter writer) {
		super.printStackTrace(writer);
		if(getCause() != null) {
			getCause().printStackTrace(writer);
		}
		writer.flush();

	}
}
