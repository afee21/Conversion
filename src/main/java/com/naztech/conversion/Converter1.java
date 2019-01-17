package com.naztech.conversion;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Calendar;

public class Converter1 {



	    public static LocalDate  fromCalendarToLocalDate(Calendar cal22) {
	    	

	        LocalDate  fromCalendarToLocalDate = LocalDate.of(cal22.get(Calendar.YEAR), cal22.get(Calendar.MONTH), cal22.get(Calendar.DATE));

	       return fromCalendarToLocalDate;
	       // System.out.println("Calendar's Year: " + localDate);

	    }

	    public static LocalTime fromTimeToLocalTime(Calendar cal) {

	        LocalTime  fromTimeToLocalTime = LocalTime.of(cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE), cal.get(Calendar.SECOND));

	        return fromTimeToLocalTime;
	        
	       // System.out.println("Calendar's Time: " + localTime);

	    }

	    public static void fromDateTimeToLocalDateTime(Calendar cal) {

	        LocalDateTime localDateTime = LocalDateTime.of(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH), cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE), cal.get(Calendar.SECOND));

	        System.out.println("Calendar's DateTime: " + localDateTime);

	    }

	    public static void fromDateToMonthDay(Calendar cal) {

	        MonthDay monthDay = MonthDay.of(cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH));

	        System.out.println("Calendar's Month Day: " + monthDay);

	    }

	    public static void fromTimeToZonedTime(Calendar cal2) {


	        String zone = cal2.getTimeZone().getID();

	        ZoneId zoneId = ZoneId.of(zone);

	        ZonedDateTime zonedDateTime = ZonedDateTime.of(cal2.get(Calendar.YEAR), cal2.get(Calendar.MONTH), cal2.get(Calendar.DAY_OF_MONTH), cal2.get(Calendar.HOUR), cal2.get(Calendar.MINUTE), cal2.get(Calendar.SECOND), cal2.get(Calendar.MILLISECOND), zoneId);

	        System.out.println("Zoned Date Time "+zonedDateTime);
	    }
	    
	    public static void fromTimeToZonedOffset(Calendar cal2) {


	        String zone = cal2.getTimeZone().getID();

	        ZoneId zoneId = ZoneId.of(zone);
	        
	        ZoneOffset zonedOffset = ZoneOffset.ofHoursMinutesSeconds(cal2.get(Calendar.HOUR), cal2.get(Calendar.MINUTE), cal2.get(Calendar.SECOND));

	        System.out.println("Zoned Offset Time "+zonedOffset);
	    }
	    
	    public static void fromTimeToOffsetDateTime(Calendar cal2) {


	        String zone = cal2.getTimeZone().getID();

	        ZoneId zoneId = ZoneId.of(zone);
	        
	         ZonedDateTime zonedDateTime = ZonedDateTime.of(cal2.get(Calendar.YEAR), cal2.get(Calendar.MONTH), cal2.get(Calendar.DAY_OF_MONTH), cal2.get(Calendar.HOUR), cal2.get(Calendar.MINUTE), cal2.get(Calendar.SECOND), cal2.get(Calendar.MILLISECOND), zoneId);
	        
	         ZoneOffset offset = zonedDateTime.getOffset();
	         
	         OffsetDateTime offsetDateTime= OffsetDateTime.of(cal2.get(Calendar.YEAR), cal2.get(Calendar.MONTH), cal2.get(Calendar.DAY_OF_MONTH), cal2.get(Calendar.HOUR), cal2.get(Calendar.MINUTE), cal2.get(Calendar.SECOND), cal2.get(Calendar.MILLISECOND), offset);

	        System.out.println("Zoned Offset DateTime "+offsetDateTime);
	        
	        
	    }
	    
	     public static YearMonth fromDateToYearOfMonth(Calendar cal2) {

	        YearMonth yearMonth = YearMonth.of(cal2.get(Calendar.YEAR), cal2.get(Calendar.MONTH));

	       return yearMonth;
	       // System.out.println("YearMonth DateTime "+yearMonth);
	        
	        
	    }
	    
	    
	    
	    
	}

	
	