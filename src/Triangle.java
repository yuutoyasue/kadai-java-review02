
public class Triangle {

    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        int c = 5;

        if (a == b && b == c && a == c ) {
            System.out.println("正三角形です");
        } else if (a == b || b == c || c == a ) {
            System.out.println("この二等辺三角形です");
        } else {
            System.out.println("この三角形は不等辺三角形です");
        }
    }
}
