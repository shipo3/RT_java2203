package dai2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Kadai2 {

	public static void main(String[] args) throws IOException {
		// 課題2－1
		System.out.println("「こんにちは　世界」を入力して下さい。");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String greeting = br.readLine();
		greeting = "Hello World";

		System.out.println("課題2-1：" + greeting);

		// 課題2-2
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("課題2-2：" + sum);

		// 課題2-3
		// 現在日時が設定されたインスタンスを生成
		LocalDateTime datetime = LocalDateTime.now();
		// 日付のみに分離
		LocalDate date = datetime.toLocalDate();
		// 3年プラスする
		date = date.plusYears(3);
		// その日の曜日を取得する
		DayOfWeek youbi = date.getDayOfWeek();
		System.out.println("課題2-3：" + youbi);

		// 課題2-4
		System.out.println("課題2-4：0または１を入力して下さい。");
		BufferedReader cr = new BufferedReader(new InputStreamReader(System.in));
		String str = cr.readLine();
		Integer i = Integer.valueOf(str);
		int num = i.intValue();

		Hantei hikisu = new Hantei();
		hikisu.singi(num);

		// 課題2-5
		System.out.println("課題2-5：好きな味覚を1位～5位まで入力して下さい。");
		BufferedReader er = new BufferedReader(new InputStreamReader(System.in));
		Map<Integer, String> map = new HashMap<Integer, String>();
		// mapに情報を入れる
		for (i = 1; i <= 5; i++) {
			String favor = er.readLine();
			map.put(i, favor);
		}
		// for文でmapから取り出しながらプリントする
		map.forEach((key, value) -> System.out.println(key + " 位は" + value));
	}

}
