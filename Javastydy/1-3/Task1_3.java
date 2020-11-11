public class Task1_3 {
    public static void main(String[] args) {

        // ① 5 と 10 を加算した値を代入する、変数 plus を作成しなさい。
        int plus;
        System.out.println(plus = 10 + 5);
        // ② 20 から 7 を減算した値を代入する、変数 minus を作成しなさい。
        int minus;
        System.out.println(minus = 20 - 7);
        // ③下記の処理について、何をしているのかコメントを記入してください。
        // [10と２を乗算した値を、変数 multiplyに代入している]
        int multiply = 10 * 2;
        System.out.println(multiply);
        // ④ 20 を 6 で割った余りを代入する、変数 remi を作成しなさい。
        int remi = 20;
        System.out.println(remi%= 6);
        // ⑤下記の処理について、何をしているのかコメントを記入してください
        // [Stringクラスを使用し、townに有楽町を、lineに線を代入している]
        String town = "有楽町";
        String line = "線";

        // ⑥ ⑤で作成した変数を連結させた値を代入する変数 train を作成しなさい。
        System.out.println(town + line);
        // ⑦ 変数plus, minus, multiply, remi, train をそれぞれ出力しなさい。

    }
}

