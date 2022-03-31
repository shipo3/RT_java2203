package Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Judge {
    public static void main(String[] args) throws IOException {
	System.out.println("課題2-4：0または１を入力して下さい。");
// finally句にて閉じる
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String str = "";
	try {
	    str = br.readLine();
	} catch (IOException e) {
	    e.printStackTrace();
	} finally {
	    if (br != null)
		br.close();
	}
	Integer i = Integer.valueOf(str);
	int num = i.intValue();
	Judgement arg = new Judgement();
	arg.authenticity(num);
    }

}
