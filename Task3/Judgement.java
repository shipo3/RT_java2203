package task3;

//課題2-4で使う　真偽を判定するクラス
public class Judgement {
    public void authenticity(String p) {
	try {
	    Integer i = Integer.valueOf(p);
	    int num = i.intValue();

	    if (num == 0) {
		System.out.println("偽");
	    }
	    if (num == 1) {
		System.out.println("真");
	    } else if (num != 0 | num != 1) {
		System.out.println("0または１を入力して下さい。");
	    }
	} catch (NumberFormatException e) {
	    System.out.println("数値0または１を入力して下さい。");
	}
    }
}
