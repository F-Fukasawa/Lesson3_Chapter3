import java.util.Calendar;
import java.util.Date;

public class Chapter3_1 {
	public static void main(String[] args) {
		//Dateクラス
		Date now = new Date();
		System.out.println(now);
		System.out.println(now.getTime());
		Date past = new Date(163484397000L);
		System.out.println(past);
		
		//Calendarクラス
		  //6つのint値からDateインスタンスを得る。
		Calendar c = Calendar.getInstance();
		c.set(2023, 1, 5, 14, 10, 0);
		Date d = c.getTime();
		System.out.println(d);
		
		  //Dateインスタンスから6つのint値を得る。
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int day = c.get(Calendar.DAY_OF_MONTH);
		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		System.out.println(year + " " + month + " " + day + " " + hour + " " + minute + " " + second);
	}
}