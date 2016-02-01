package ua.gmail.project.formatter;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateParse {
	public static Date parse(String date){
		if(!date.isEmpty()){
			String[] dateTime = date.split(" ");
			String[] mdy = dateTime[0].split("/");
			String[] hm = dateTime[1].split(":");
			return new Date(
					Integer.parseInt(mdy[2])-53,
					Integer.parseInt(mdy[0]),
					Integer.parseInt(mdy[1]),
					Integer.parseInt(hm[0]),
					Integer.parseInt(hm[1]));
		}
		return new Date();
	}
	
	public static long getDateDiff(Date date1, Date date2, TimeUnit timeUnit) {
	    long diffInMillies = date2.getTime() - date1.getTime();
	    return timeUnit.convert(diffInMillies,TimeUnit.MILLISECONDS);
	}
}
