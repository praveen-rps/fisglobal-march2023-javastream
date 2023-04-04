package dateapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		System.out.println(date);
		System.out.println(time);
		
		int dd = date.getDayOfMonth(); 
		int mm = date.getMonthValue(); 
		int yy = date.getYear();
		System.out.println(dd+"..."+mm+"..."+yy);
		System.out.printf("\n%d-%d-%d",dd,mm,yy);
		
		
		int h = time.getHour();
		int m = time.getMinute(); 
		int s = time.getSecond();
		int n = time.getNano();
		System.out.printf("\n%d--%d--%d--%d",h,m,s,n); 
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(" ");
		System.out.println(dt);
		System.out.println(dt.plusDays(1));
		System.out.println(dt.plusWeeks(1));
		System.out.println(dt.plusMonths(1));
		System.out.println(dt.plusYears(1));
		System.out.println(dt.minusYears(5));
		
		ZoneId zone = ZoneId.systemDefault(); 
		System.out.println(zone);
		ZoneId la = ZoneId.of("America/Los_Angeles");
		ZonedDateTime zt = ZonedDateTime.now(la);
		System.out.println(zt);
		
		 LocalDate today = LocalDate.now();
		 LocalDate birthday = LocalDate.of(1979,01,19);
		 Period p = Period.between(birthday,today);
		 System.out.printf("age is %d year %d months %d days",p.getYears(),p.getMonths(),p.getDays());

	}

}
