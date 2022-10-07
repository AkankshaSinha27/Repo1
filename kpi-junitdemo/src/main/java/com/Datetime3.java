package com;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Datetime3 {

	public static void CheckingAdjusters() {
		LocalDate date= LocalDate.now();
		System.out.println("current date"+ date);
		
		//to get the first day of next month
		
		LocalDate dayOfNextMonth = date.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println("first day of month"+ dayOfNextMonth);
	}
	
	public static void main(String[] args) {
		CheckingAdjusters();
	}
}
