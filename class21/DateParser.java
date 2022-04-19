package class21;

import java.util.*;
import java.text.*;

public class DateParser {
	public static Date parseDate(String text,String format) {
		try {
		return new SimpleDateFormat(format).parse(text);
		}catch(ParseException e) {
			throw new RuntimeException(e.getMessage());
		}
	}
	public static void main(String args[]) {
		Date d1 = parseDate("04-23-2016","MM-dd-yyyy");
		System.out.println(d1);
	}

}
