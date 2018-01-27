import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

class PayDayAdjuster implements TemporalAdjuster {

	public Temporal adjustInto(Temporal arg0) {

		LocalDate date = LocalDate.from(arg0);
		LocalDate date2 = date.with(TemporalAdjusters.lastDayOfMonth());
		DayOfWeek dayOfWeek = date2.getDayOfWeek();
		if(dayOfWeek.equals(DayOfWeek.SATURDAY) || dayOfWeek.equals(DayOfWeek.SUNDAY)){
			date = date2.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY));	
		}else{
			date = date2;	
		}
		return date;
	}
}

public class CustomAdjustersTest2 {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.parse("2015-04-27");
		PayDayAdjuster payDayAdjuster = new PayDayAdjuster();
		LocalDate payDay = (LocalDate) payDayAdjuster.adjustInto(date);
		System.out.println(payDay);
		
	}
}