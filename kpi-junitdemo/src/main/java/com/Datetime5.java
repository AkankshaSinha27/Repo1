package com;

import java.time.LocalDate;

public class Datetime5 {

	public static void check() {

		LocalDate date1 = LocalDate.of(2030, 10, 7);

	
		int date2 = date1.getDayOfMonth();

		System.out.println(date2);
	}

	public static void main(String[] args) {
		check();
	}
}