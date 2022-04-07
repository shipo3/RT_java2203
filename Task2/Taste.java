package Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Taste {
    public static void main(String[] args) {
	System.out.println("課題2-5：好きな味覚を1位～5位まで入力して下さい。");
	Map<Integer, String> map = new HashMap<Integer, String>();
//try-with-resources 文を用いて自動で閉じる	
	try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
//mapに情報を入れる
	    for (int i = 0; i < 5; i++) {
		String favor = "";
		favor = br.readLine();
		map.put(i, favor);
	    }
	} catch (IOException e) {
	    e.printStackTrace();
	}
//for文でmapから取り出しながらプリントする
	map.forEach((key, value) -> System.out.println((key + 1) + " 位は" + value));
    }
}
