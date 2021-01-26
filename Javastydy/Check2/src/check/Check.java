package check;
import check.Pet.RobotPet;
import constants.Constants;
//課題①
//【Check.java】にてフィールド変数firstNameとlastNameを宣言し、
//firstName →　自分の名字　lastName →　自分の名前で初期化しなさい。
//なお、変数のアクセス修飾子は「private」とする。
public class Check {
    private String fistName;  // = "茂木";
    private String lastName;  // = "遼太";
    
    private Check(String fistName, String lastName) {
        this.fistName = "茂木";
        this.lastName = "遼太";
    }
//課題②
//【Check.java】にてfirstNameとlastNameを引数で受け取って、
//連結して表示させるメソッド「printName」を作成しなさい。
//作成した関数のアクセス修飾子は「private」とする。
    private void printName() {
        System.out.println("printNameメソッド→"+this.fistName+" "+this.lastName);
    }
//課題③
//【Check.java】にてPetクラスとRobotPetクラスをインスタンス化して、下記の完成イメージを出力させなさい。
//printNameメソッド→名前
//■僕の名前はjava吉です
//■ご主人様はhogeです
//◇私はロボット。名前はR2D2。
//◇ご主人様はルーク。
   
    public static void main(String[] args) {
        Check a = new Check(null,null);
        a.printName();
        Pet ab = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
        ab.introduce();
        RobotPet abc = ab.new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
        abc.introduce();
    }
}
    
    

    
   

