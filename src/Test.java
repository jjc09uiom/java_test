import java.util.Objects;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入动物园的初始余额：");
        int moneyZoo = scanner.nextInt();
        Zoo zoo = new Zoo(moneyZoo);
        System.out.println("买入动物：");
        String ani = null;
        while (!Objects.equals(ani, "买入结束")) {

            ani = scanner.next();
            zoo.adopt(ani);
        }
        System.out.println("招待顾客：");
        String cus = scanner.next();
        while (!cus.equals("歇业!")) {
            int moneyCus = scanner.nextInt();
            int timeCus = scanner.nextInt();
            Tourist tourist = new Tourist(cus, moneyCus, timeCus);
            zoo.serve(tourist);
            cus = scanner.next();
        }
        zoo.close();
        scanner.close();
    }
}
