package com.naztech.conversion;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.YearMonth;
import java.util.Calendar;

import junit.framework.TestCase;

public class ConversionTest1 extends TestCase {

	  public ConversionTest1() {
	    }
	    
	    
	    public static void setUpClass() {
	    }
	    
	    
	    public static void tearDownClass() {
	    }
	    
	    
	    public void setUp() {
	    }
	    
	   
	    public void tearDown() {
	    }

	    /**
	     * Test of fromDateToLocalDate method, of class Converter.
	     */
	    @Test
	    public void testFromCalendatToLocalDate() {
	       // System.out.println("fromDateToLocalDate");
	        
	        
	         Calendar cal = Calendar.getInstance();
	         cal.set(2019, 01, 17);
	         
	         LocalDate currentTime = LocalDate.of(2019, 01, 17);
	        
	       
	         assertEquals(currentTime,Converter1.fromCalendarToLocalDate(cal));
	        

	    }
	    
	    
	    public void testFromCalendaTimeToLocalTime() {
	    	
	       // System.out.println("fromTimeToLocalTime");
	         Calendar cal = Calendar.getInstance();
	         cal.set(2019, 01, 17, 10, 15, 30);
	         
	         LocalTime localTime = LocalTime.of(10, 15, 30, 0);
	         
	         assertEquals(localTime,Converter1.fromTimeToLocalTime(cal));
	    }
	    
	    
	    
	    /**
	     * Test of fromDateTimeToLocalDateTime method, of class Converter.
	     */
	    
	  /*  public void testFromCalendarDateTimeToLocalDateTime() {
	        System.out.println("fromDateTimeToLocalDateTime");
	        Calendar cal = null;
	        Converter1.fromDateTimeToLocalDateTime(cal);
	        // TODO review the generated test code and remove the default call to fail.
	        fail("The test case is a prototype.");
	    }*/

	    public void testfromDateToMonthDay() {
	    	//System.out.println("fromDateToYearOfMonth");
	    	Calendar cal = Calendar.getInstance();
	    		         cal.set(2017, 01, 07);
	    		         
	    		         
	    	 YearMonth currentMonth = YearMonth.of(2017, 01);
	    	assertEquals(currentMonth,Converter1.fromDateToYearOfMonth(cal));  

	    
	    }

}