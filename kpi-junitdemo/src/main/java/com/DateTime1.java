package com;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateTime1 {

	
	public static void LocalDateTimeApi() {
		//the current date
		LocalDate date = LocalDate.now();
		System.out.println("current date is "+ date);
		
		//the current time
		
		LocalTime time = LocalTime.now();
		System.out.println("current date and time is "+ time);
		
		
		LocalDateTime current = LocalDateTime.now();
		System.out.println("current date is "+ current);
		
		//to print in a particular format
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		
		String formatedDateTime = current.format(format);
		
		System.out.println("formatted manner"+ formatedDateTime);
		
		
		//printing months days and seconds
		
		Month month = current.getMonth();
		int day = current.getDayOfMonth();
		int seconds = current.getSecond();
		int year = current.getYear();
		int hour = current.getYear();
		
		System.out.println("Month"+ month+" day"+ day+" seconds"+ seconds +" hour "+hour+"year"+ year);
		
		//printing some specific date
		
		LocalDate date2 = LocalDate.of(1998, 12, 27);
		System.out.println("birthday is"+date2);
		
		LocalDateTime specificDate = current.withDayOfMonth(7).withYear(2022);
		System.out.println("Specific date "+ "Current time"+ specificDate);
		
		
	}
	
	
	public static void main(String[] args) {
		LocalDateTimeApi();
	}
}
