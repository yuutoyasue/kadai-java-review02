
public class ArithmeticOperations {

	public static void main(String[] args) {
		//変数の宣言・初期化
		int num1 = 100; //int型の変数num1を宣言し、100を代入
		int num2 = 10; //int型変数num2を宣言し、10を代入
		
		//int型変数をresult１を宣言し、num1とnum2の加算結果を代入
		int result = num1 + num2;
		//加算結果を出力
		System.out.println("num1 + num2 = " + result);
		
		//int型変数result2を宣言し、num1とnum2の減数結果を代入
		result = num1 - num2;
		//減数結果を出力
		System.out.println("num1 - num2 = " + result);
		
		//int型変数result3を宣言し、num1とnum2の乗算結果を代入
		result = num1 * num2;
		//乗果結果を出力
		System.out.println("num1 * num2 = " + result);
		
		//int型変数result4を宣言し、num1とnum2徐算結果を代入
		result = num1 / num2;
		//除算結果を出力
		System.out.println("num1 / num2 = " + result);
		
		//int型変数result5を宣言し、num1とnum2の剰余結果を代入
		result = num1 % num2;
		//剰余結果を出力
		System.out.println("num1 % num2 = " + result);
		
	}

}
