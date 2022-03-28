
import java.util.Arrays;

public class Kadai1 {

	public static void main(String[] args) {
		System.out.println("Hello World");
		// for文で繰り返す
		for (int i = 0; i < 5; i++) {
			if (i < 3) {
				System.out.println("Hello");
			} else {
				System.out.println("World");
			}
		}
		// 配列にした文字を1文字ずつ出力する
		String first[] = { "Hello", "★", "World" };
		for (int j = 0; j < first.length; j++) {
			System.out.println((j + 1) + "文字目は" + first[j] + "です。");
		}
		// 拡張for文で取り出す
		String second[] = { "Hello", "＆", "World" };

		for (String str : second) {
			System.out.println(str);
		}
		// for earch文で取り出す
		String[] third = { "Hello", "$", "World" };
		Arrays.stream(third).forEach(s -> System.out.println(s));

		// 文字列から取り出して1文字ずつ出力する
		String end = "bye";
		for (int k = 0; k < end.length(); k++) {
			System.out.println((k + 1) + "文字目は" + end.charAt(k) + "です。");
		}
		// 文字数を出力する
		System.out.println(end + "の文字列の長さは" + end.length() + "です。");
	}
}

