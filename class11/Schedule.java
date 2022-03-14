package class11;
import java.util.Calendar;
import java.util.Date;

public final class Schedule {
	private final Date start; //开学时间，不允许改变
	private final Date end; //放假时间，不允许被改变
	
	public Schedule(Date start,Date end) {
		//不允许放假时间在开学时间前面
		if(start.compareTo(end) > 0)
			throw new IllegalArgumentException(start + " after " + end);
		//this.start = start;
		//this.end = end;
		this.start = new Date(start.getTime()); //采取保护性复制
		this.end = new Date(end.getTime()); //采取保护性复制
	}
	public Date getStart() {
		return (Date)start.clone(); //获得备份
	}
	public Date getEnd() {
		return (Date)end.clone();//获得备份
	}
	public static void main(String args[]) {
		Calendar c =Calendar.getInstance();
		c.set(2006,9,1);
		Date start = c.getTime();
		c.set(2007,1,25);
		Date end = c.getTime();
		Schedule s = new Schedule(start,end);
		end.setTime(System.currentTimeMillis());//修改放假时间
	}
}
