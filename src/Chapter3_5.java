import java.time.LocalDate;
import java.time.Period;

public class Chapter3_5 {
	public static void main(String[] args) {
		LocalDate d1 = LocalDate.of(2021, 10, 10);
		LocalDate d2 = LocalDate.of(2021, 10, 13);
		
		Period p1 = Period.between(d1, d2);
		//ISO-8601の期間フォーマットで出力される
		System.out.println(p1);
		//d2のさらに3日後を計算する
		LocalDate d3 = d2.plus(p1);
		System.out.println(d3);
	}
}
