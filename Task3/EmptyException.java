package task3;

//オリジナル例外定義　
public class EmptyException extends Exception {
    // warningを回避するための宣言
    private static final long serialVersionUID = 1L;

    // コンストラクタ
    EmptyException(String msg) {
	super(msg);
    }
}
