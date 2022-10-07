package com;

import java.time.LocalDate;
import java.time.Month;

public class Datetime4 {
	public static void check() {

		LocalDate date2 = LocalDate.of(1922, 1, 26);

		Month month = date2.getMonth();
		int date = date2.getDayOfMonth();
		int year = date2.getYear();

		System.out.println("Month " + month + " date " + date + " year " + year);
	}

	public static void main(String[] args) {
		check();
	}

}
