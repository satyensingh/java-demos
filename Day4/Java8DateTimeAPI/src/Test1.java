import java.sql.Date;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalQueries;

public class Test1 {

	public static void main(String[] args) {

		/***************************** Instant Class ******************************/
		Instant currentTime = Instant.now();// current time
		System.out.println("current time using Instant "+currentTime);
		
		
		Instant epochTime = Instant.EPOCH;// time beginning from first second of
											// January 1, 1970(in hindi we call
											// it as yuga/kaal)
											// time you get from Instant has
											// negative value if it is before
											// the epoch.
											// And positive if it is after the
											// epoch.
		System.out.println("Epoch time using Instant "+epochTime);

		
		
		
		Instant machineTimeMin = Instant.MIN;// Smallest possible instant(far
												// past date and time)
		System.out.println("Minute using Instant "+machineTimeMin);

		
			
		
		Instant machineTimeMax = Instant.MAX;// largest possible instant(far
												// future date and time)
		System.out.println("Largest possible Instant "+machineTimeMax);

		System.out.println("-------------------------------------------------------------");
		System.out.println("Converting to java.sql.Date");
		Date date14 = Date.valueOf(LocalDate.now());
		System.out.println(date14);
		
		System.out.println("-------------------------------------------------------------");
		
		Instant oneMinuteLater = Instant.now().plusSeconds(60);
		System.out.println("Now using Instant "+Instant.now());
		System.out.println("Add Minute to current time "+oneMinuteLater);

		System.out.println(ChronoUnit.SECONDS);

		long secondsFromEpoch = Instant.ofEpochSecond(0L).until(Instant.now(),
				ChronoUnit.SECONDS);
		System.out.println(secondsFromEpoch);

		/*
		 * NOTE : The Instant class does not work with human units of time, such
		 * as years, months and days. we have to convert the Instant to another
		 * class, such as LocalDateTime and ZonedDateTime. On binding the
		 * Instant with time zone we can then access the value of desired units.
		 */

		LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.now(),
				ZoneId.systemDefault());
		System.out.print(localDateTime + " --> ");
		System.out.println(localDateTime.getDayOfMonth() + "/"
				+ localDateTime.getMonth() + "/" + localDateTime.getYear());

		// LocalDateTime instance with current date and time can also be created
		// in the following way.

		LocalDateTime timeNow = LocalDateTime.now();
		System.out.println(timeNow);

		// LocalDateTime is a date and time class we also have LocalDate class
		// which is a date class.
		LocalDate today = LocalDate.now();
		System.out.println(today);// no time in this instance, only year, month
									// and date.
		
		
		/********************** Formatting and Parsing ************************************************************************/

		// Formatting (Date to String) using ZonedDateTime
		ZonedDateTime localDate = ZonedDateTime.now();
		System.out.println(localDate);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/mm/yyyy");
		String dateInString = localDate.format(formatter);
		System.out.println(dateInString);
		
		// Formatting (Date to String with time)
		DateTimeFormatter formatter2 = DateTimeFormatter
				.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime localDateTime2 = LocalDateTime.now();
		String dateString = localDateTime2.format(formatter2);
		System.out.println(dateString);

		// Formatting (Date to String) using LocalDate
		DateTimeFormatter formatter3 = DateTimeFormatter
				.ofPattern("dd/MM/yyyy");// specify the date format
		LocalDate localDate2 = LocalDate.now();
		String dateString1 = localDate2.format(formatter3);
		System.out.println(dateString1);

		// Parsing (String to Date)
		String stringDate = "04/10/1989";// time not required
		DateTimeFormatter formatter1 = DateTimeFormatter
				.ofPattern("dd/MM/yyyy");// must match the format of string
											// input
		LocalDate date = LocalDate.parse(stringDate, formatter1);
		System.out.println("Date Parse : "+date);

		// Parsing (String to Date with Time)
		String stringDate1 = "04/10/1989 21:30";// mandatory to give time with
												// date
		DateTimeFormatter formatter4 = DateTimeFormatter
				.ofPattern("dd/MM/yyyy HH:mm");// this format must match the
												// string input
		LocalDateTime date1 = LocalDateTime.parse(stringDate1, formatter4);
		System.out.println(date1);

		/********************************* Modifying dates **************************************************/

		LocalDate localDate3 = LocalDate.now();

		// Adding month in Date
		LocalDate threeMonthLater = localDate3.plusMonths(3);
		System.out.println(threeMonthLater);
		// Adding days in Date
		LocalDate threeDaysLater = localDate3.plusDays(3);
		System.out.println(threeDaysLater);
		// Adding year in Date
		LocalDate threeYearsLater = localDate3.plusYears(3);
		System.out.println(threeYearsLater);
		// Subtracting month in date
		LocalDate threeMonthsBefore = localDate3.minusMonths(3);
		System.out.println(threeMonthsBefore);

		// and so on...
		// same also applies to LocalDateTime

		/*
		 * NOTE: Any method which starts with plus and with are called as
		 * adjusters, WithAdjuster(used to set one or more fields) and
		 * PlusAdjuster(used to add or sub some feilds)
		 */
		// last date of the month
		LocalDate localDate6 = LocalDate.now().with(
				TemporalAdjusters.lastDayOfMonth());
		System.out.println("LocalDate6 = "+localDate6);

		// first day of the month
		LocalDate localDate7 = LocalDate.now().with(
				TemporalAdjusters.firstDayOfMonth());
		System.out.println("localDate7 = "+localDate7);

		// first wednesday in the month
		LocalDate localDate8 = LocalDate.now().with(
				TemporalAdjusters.firstInMonth(DayOfWeek.WEDNESDAY));
		System.out.println(localDate8);

		// first monday in next month
		LocalDate localDate9 = LocalDate.now().plusMonths(1)
				.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
		System.out.println(localDate9);

		/******************************* Comparing Dates *************************************/

		LocalDate localDate4 = LocalDate.now();
		LocalDate localDate5 = LocalDate.now();
		if (localDate4.equals(localDate5)) {
			System.out.println("Both are Same");
		} else {
			System.out.println("Both are not Same");
		}

		localDate5 = localDate5.plusMonths(4);
		if (localDate4.equals(localDate5)) {
			System.out.println("Both are Same");
		} else {
			System.out.println("Both are not Same");
		}

		if (localDate4.isBefore(localDate5)) {
			System.out.println(localDate5
					+ " is the latest date OR greater than " + localDate4);
		}

		if (localDate4.isLeapYear()) {
			System.out.println(localDate4 + " is a LeapYear");
		} else {
			System.out.println(localDate4 + " is not a LeapYear");
		}

		// negative if less, positive if greater
		System.out.println(localDate4.compareTo(localDate5));

		localDate5 = localDate5.plusYears(5);
		System.out.println(localDate4.compareTo(localDate5));

		/******************************************************************************/

		// creating date from another date
		// This will be usefull when you want to pass date as an argument to any
		// method, The argument type would be Temporal
		LocalDate localDate10 = LocalDate.now().withYear(2015);
		LocalDate localDate11 = LocalDate.from(localDate10);// create a new date
															// object from
															// another object
		System.out.println(localDate11);
		
		
		//Creating date from string 
		LocalDate date12 = LocalDate.parse("2015-03-04");
		System.out.println(date12);

	}
}