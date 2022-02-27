package class9;

public class CarWrongException extends Exception{
	/**表示车子出故障的异常情况*/
	public CarWrongException() {}
	public CarWrongException(String msg) {
		super(msg);
	}

}
