package task3;

//オリジナル例外定義　
public class BrankCheckException extends Exception {
    // warningを回避するための宣言
    private static final long serialVersionUID = 1L;

    // コンストラクタ
    BrankCheckException(String msg) {
	super(msg);
    }
}
