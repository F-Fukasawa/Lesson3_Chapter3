import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Chapter3_6 {
	public static void main(String[] args) {
		LocalDate d1 = LocalDate.of(2023, 1, 5);
		//曜日を取得
		DayOfWeek week = d1.getDayOfWeek();
		System.out.println(week);
		
		//曜日の文字列表現を取得
		String str = week.getDisplayName(TextStyle.FULL, Locale.getDefault());
		System.out.println(str);
	}
}
