import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetTime;
import java.time.temporal.*;
class LocalDateTimeExample{
public static void main(String args[]){
LocalDate date = LocalDate.now();
LocalDate parsed = LocalDate.parse("2010-12-22");
System.out.println(date);
System.out.println(date.minusDays(1));
System.out.println(date.plusDays(1));
System.out.println(date.plusMonths(1));
System.out.println(date.minusMonths(1));
System.out.println(parsed.plusMonths(1));
System.out.println(parsed);
System.out.println(date.getDayOfMonth());
System.out.println(date.getDayOfWeek());
LocalTime time = LocalTime.now();
for(int i =0;i<100000;i++){
System.out.print("_");
}
LocalTime time1 = LocalTime.now();
System.out.println(time);
System.out.println(time1);
long duration = time.until(time1,ChronoUnit.SECONDS);
System.out.println("Duration : " + duration);
OffsetTime offset = OffsetTime.now();
System.out.println(offset.getHour()+" " +offset.getMinute()+ " "+offset.getSecond());
}
}