
public class ArithmeticExceptionSample {

	public static void main(String[] args) {
	// int型10をint型０で徐算
		double a = 10.0 / 0.0;//ここで、例外が発生！
		
		// この下の出力は実行されない！
		System.out.println(a);

	}

}
