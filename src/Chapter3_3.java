import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Chapter3_3 {
	public static void main(String[] args) {
		//現在日時の取得
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		
		//文字列への変換
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		System.out.println(dateTimeFormatter.format(localDateTime));
	}
}
