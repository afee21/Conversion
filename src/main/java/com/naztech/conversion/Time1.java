package com.naztech.conversion;

import java.util.Calendar;

public class Time1 {
	  public static void main(String[] args) {

	        // create a calendar
	        Calendar cal = Calendar.getInstance();

	        // From date to local date
	        cal.set(2019, 01, 17);
	       

	        Converter1.fromCalendarToLocalDate(cal);

	        // From time to local Time
	        cal.set(Calendar.HOUR_OF_DAY, 10);
	        cal.set(Calendar.MINUTE, 15);
	        cal.set(Calendar.SECOND, 30);
	        cal.set(Calendar.MILLISECOND, 0);

	        Converter1.fromTimeToLocalTime(cal);

	        // From datetime to local DateTime
	        Converter1.fromDateTimeToLocalDateTime(cal);

	       // Month of day 
	        Converter1.fromDateToMonthDay(cal);
	      
	       // zoned time 
	        Converter1.fromTimeToZonedTime(cal);
	        
	       //zonedoffset time
	       
	        Converter1.fromTimeToZonedOffset(cal);
	        
	        // OffsetDateTime
	        
	        Converter1.fromTimeToOffsetDateTime(cal);
	       
	        
	    }
	  }


