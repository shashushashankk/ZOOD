package com.zoodel.utility;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateAndTime {
	public String convertMIliSecondToDate(long miliSecond) {
		Date date = new Date(miliSecond);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss");
		return simpleDateFormat.format(date);
	}
	public String getCurrentDateAndTime(String formate) {
		LocalDateTime currentDateAndTime = LocalDateTime.now();
		DateTimeFormatter dateTimeFormatter =DateTimeFormatter.ofPattern(formate);
		return currentDateAndTime.format(dateTimeFormatter);
	}
}
