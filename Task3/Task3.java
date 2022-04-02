package Task3;

//最初のメソッド内でBufferedReaderをcloseすると後の方に「Stream closed」のIOExceptionが発生する

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import Task2.Judgement;

public class Task3 {

    public static void main(String[] args) throws IOException {

	judge();
	taste();

    }

    private static void judge() {
	System.out.println("課題2-4：0または１を入力して下さい。");
	String str = "";
//	     try-with-resources 文を用いて閉じる	
	try (BufferedReader cr = new BufferedReader(new InputStreamReader(System.in))) {
	    str = cr.readLine();
	} catch (IOException e) {
	    e.printStackTrace();
	}
	Judgement arg = new Judgement();
	arg.authenticity(str);
    }

    private static void taste() throws IOException {
	System.out.println("課題2-5：好きな味覚を1位～5位まで入力して下さい。");

	BufferedReader er = new BufferedReader(new InputStreamReader(System.in));
	Map<Integer, String> map = new HashMap<Integer, String>();
	// mapに情報を入れる
	try {
	    for (int i = 0; i < 5; i++) {
		String favor = "";
		favor = er.readLine();
		map.put(i, favor); // mapに情報を入れる
	    }
	} catch (IOException e) {
	    e.printStackTrace();
	} finally { // finaiiy句にて閉じる
	    er.close();
	} // for文でmapから取り出しながらプリントする
	map.forEach((key, value) -> System.out.println((key + 1) + " 位は" + value));
    }

}