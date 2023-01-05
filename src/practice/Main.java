package practice;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		// 当日のインスタンスを取得したあと、その月の1日のインスタンスを得る
		LocalDate d = LocalDate.now().withDayOfMonth(1);
		
		// その月の最後の日を取得
		int lastday = d.lengthOfMonth();
		
		//当日の年と月を取得
		int year = d.getYear();
		int month = d.getMonth().getValue();
		
		//カレンダー表示
		for (int i=1; i<=lastday; i++) {
			//i日のインスタンスを取得
			LocalDate date = LocalDate.of(year, month, i);
			//曜日を取得
			DayOfWeek week = date.getDayOfWeek();
			//曜日の文字列表現を取得
			String str = week.getDisplayName(TextStyle.SHORT, Locale.getDefault());
			System.out.print(i + "(" + str + ")" + " ");
			//土曜日の場合、改行
			if (str.equals("土")) {
				System.out.println();
			}
		}
	}
	
	//解答
	/*
	public static void main(String[] args) throws Exception {
		// 当日のインスタンスからwithDayOfMonthでその月の1日のインスタンスを得る
		LocalDate d = LocalDate.now().withDayOfMonth(1);

		// lengthOfMonthでその月の最後の日が取得できる
		final int lastDay = d.lengthOfMonth();
		for (int i = 1; i <= lastDay; i++) {
			// 曜日を取得
			DayOfWeek w = d.getDayOfWeek();
			// 曜日の文字列表現を取得
			String wstr = w.getDisplayName(TextStyle.SHORT, Locale.getDefault());
			System.out.print(d.getDayOfMonth() + "(" + wstr + ") ");
			// 土曜日かどうかを判定
			if (w == DayOfWeek.SATURDAY) {
				System.out.println();
			}
			
			//plusDays で翌日の日付を取得しているから、forのiから日付を取得しなくてもいい！
			d = d.plusDays(1);
		}
	}
	*/
}
