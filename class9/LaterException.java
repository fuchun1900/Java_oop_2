package class9;
import java.util.Date;

public class LaterException extends Exception{
	/**表示上班迟到的异常情况*/
	private Date arriveTime; //迟到的时间
	private String reason;  //迟到的原因
	
	public LaterException(Date arriveTime,String reason) {
		this.arriveTime = arriveTime;
		this.reason = reason;
	}
	public Date getArriveTime() {
		return arriveTime;
	}
	public String getReason() {
		return reason;
	}

}
