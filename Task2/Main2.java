package Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.stream.IntStream;

public class Main2 {

    public static void main(String[] args) throws IOException {

	helloWorld(); // 課題2－1
	sum(); // 課題2-2
	dayOfWeek(); // 課題2-3s
    }

    private static void helloWorld() {
	System.out.println("「こんにちは　世界」と入力して下さい。");
	String greeting;
//try-with-resources 文を用いて自動で閉じる	
	try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
	    greeting = br.readLine();
	} catch (IOException e) {
	    e.printStackTrace();
	}
	greeting = "Hello World";
	System.out.println("課題2-1：英語で　" + greeting);
    }

    private static void sum() {
	int sum = 0;
	for (int i = 1; i <= 10; i++) {
	    sum += i;
	}
	System.out.println("課題2-2：1～10まで足した結果は　" + sum);
//1行で
	System.out.println("1行で：" + IntStream.rangeClosed(1, 10).sum());
    }

    private static void dayOfWeek() {
//現在日時が設定されたインスタンスを生成
	LocalDateTime now = LocalDateTime.now();
//日付のみに分離
	LocalDate date = now.toLocalDate();
//3年プラスする
	date = date.plusYears(3);
//その日の曜日を取得する
	DayOfWeek dof = date.getDayOfWeek();
	System.out.println("課題2-3：3年後の今日の曜日は　" + dof);
    }

}
