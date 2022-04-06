package task3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task3_3 {
    public static void main(String[] args) {
	System.out.println("番号または名前を入力して下さい。");
//try-with-resources 文を用いて自動で閉じる	
	try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

	    String word = br.readLine();

//前の空白をトリムする	   
	    String word2 = word.stripLeading();
	    if (word2.isEmpty()) {
// 文字列が空の場合、作成した例外を投げる
		throw new BrankCheckException("番号または名前を入力して下さい。");

	    } else {
//空出ない場合は出力する		
		System.out.println("入力されたワードは" + word2 + "です。");
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	}

    }
}
