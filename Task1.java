import java.util.stream.Stream;

public class Task1 {

    public static void main(String[] args) {
	System.out.println("Hello World");

	standard(); // for文で繰り返す
	firstTask(); // 配列にした文字を1文字ずつ出力する
	secondTask(); // 拡張for文で取り出す
	thirdTask(); // for earch文で取り出す
	endTask(); // 文字列から取り出して1文字ずつ出力する 文字数を出力する
    }

    private static void standard() {

	for (int i = 0; i < 5; i++) {
	    if (i < 3) {
		System.out.println("Hello");
	    } else {
		System.out.println("World");
	    }
	}
    }

    private static void firstTask() {

	String first[] = { "Hello", "★", "World" };
	for (int i = 0; i < first.length; i++) {
	    System.out.println((i + 1) + "文字目は" + first[i] + "です。");
	}
    }

    public static void secondTask() {

	String second[] = { "Hello", "＆", "World" };

	for (String str : second) {
	    System.out.println(str);
	}
    }

    public static void thirdTask() {

	Stream<String> third = Stream.of("Bye", "Hello", "Good", "Hi", "World");
//  lengthでfilter
	third.filter(s -> s.length() == 5).forEach((s) -> System.out.println(s));
    }

    public static void endTask() {

	String end = "bye";
	for (int i = 0; i < end.length(); i++) {
	    System.out.println((i + 1) + "文字目は" + end.charAt(i) + "です。");
	}
	System.out.println(end + "の文字列の長さは" + end.length() + "です。");
    }
}
