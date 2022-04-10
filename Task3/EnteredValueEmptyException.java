package task3;

//オリジナル例外定義　
public class EnteredValueEmptyException extends Exception {
    // warningを回避するための宣言
    private static final long serialVersionUID = 1L;

    // コンストラクタ
    EnteredValueEmptyException(String msg) {
	super(msg);
    }
}
