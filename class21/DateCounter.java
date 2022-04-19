package class21;
import java.util.*;
import java.text.*;

public class DateCounter {
	public static void main(String[] args) throws Exception{
		DateFormat dateforMat = new SimpleDateFormat("yyyy-MM-dd");
		Date d1 = dateforMat.parse("2016-03-11");
		Date d2 = dateforMat.parse("2022-04-17");
		System.out.println("相差的天数为：" + getPeriod(d2,d1));
	}
		
		public static long getPeriod(Date d1,Date d2) {
			long p = d1.getTime() - d2.getTime();
			//return p/(1000*60*60*24);
			return p;
	}	
}

