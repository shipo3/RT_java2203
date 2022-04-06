package task3;

//代表的なIOException

public class Task3_2 {

    public static void main(String[] args) {
	System.out.println("Start");
	try {
	    int i, j = 100;
	    i = Integer.valueOf(args[0]);
	    System.out.println("j/i：" + j / i);
	} catch (

	ArrayIndexOutOfBoundsException e) {
	    System.out.println("例外：" + e);
	    System.out.println("引数を1つ入力してください。");
	} catch (NumberFormatException e) {
	    System.out.println("例外：" + e);
	    System.out.println("引数を整数で入力してください。");
	} catch (ArithmeticException e) {
	    System.out.println("例外：" + e);
	    System.out.println("引数を0以外の整数で入力してください。");
	} catch (Exception e) {
	    System.out.println("何らかの障害が発生しました。");
	    e.printStackTrace();
	}
	System.out.println("End");
    }
}
