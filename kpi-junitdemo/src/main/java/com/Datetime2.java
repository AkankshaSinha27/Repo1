package com;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Datetime2 {

	public static void checkingdate() {
		LocalDate date = LocalDate.now();
		System.out.println("current "+ date);
		
		//adding 2 year to current date
		
		LocalDate year = date.plus(2,ChronoUnit.YEARS);
		
		System.out.println("next to next year is "+ year);
		
		//adding 1 month to current data
		
		LocalDate nextMonth = date.plus(1,ChronoUnit.MONTHS);
		
		System.out.println("the next month is "+nextMonth);
		
		//adding 1 week to the current date 
		
		LocalDate nextweek = date.plus(1,ChronoUnit.WEEKS);
		
		System.out.println("next week is "+ nextweek);
		
		//adding 2 decades to the current date
		
		LocalDate Decade = date.plus(2,ChronoUnit.DECADES);
		
		System.out.println("2 decade is "+ Decade);
	}
	
	public static void main(String[] args) {
		checkingdate();
	}
}

