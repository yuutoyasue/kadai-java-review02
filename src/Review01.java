public class Review01 {

    public static void main(String[] args) {
        int result;
        result = tax(1500,10);//taxのメソッド
        int goukei = 1500 + result;//合計の計算
        System.out.println("1500円の商品の税込金額は" + goukei + "円(消費税は" + result + "円）です。" );

    }
    public static int tax(int a, int b) {
        double result = (double) b / (double)100 * a ;
          return (int)result;
        }

    }