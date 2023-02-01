
public class Review02 {

        public static void main(String[] args) {

            for (int i = 1; i <= 100; i++) {
                //0から100まで繰り返す
                if (i % 5 == 0 && i % 3 ==0) { //5で割れるプラス3で割れる
                    System.out.println("FizzBuzz");
                }
                else if (i % 5 == 0) { //5のみで割れる
                    System.out.println("Buzz");
                }
                else if (i % 3 == 0) { //3のみで割れる
                    System.out.println("Fizz");
                }
                else { //それ以外の数字はそのまま表示
                    System.out.println(i);

                }
            }
        }
}