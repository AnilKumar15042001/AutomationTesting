package testSuites;

import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class DateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate date=LocalDate.now();
		Month m=date.getMonth();
		System.out.println(m);
	}

}
