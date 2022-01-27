public class Zoo implements Port {
    protected double cash;
    protected String[] animals = new String[100000];
    protected String[] tourists = new String[100000];
    protected int ani_rear;
    protected int tou_rear;

    //看动物的异常测试
    static void test01(int a) throws AnimalNotFoundException {
        if (a == 0) {
            throw new AnimalNotFoundException();
        }
    }

    //资金结算的异常测试
    static void test02(double a, double b) throws InsufficientBalanceException {
        if (a > b) {
            throw new InsufficientBalanceException();
        }
    }

    //随机返回字符串数组中的字符串
    public static String RandomStr(String[] animals) {
        int random_index = (int) (Math.random() * animals.length);
        return animals[random_index];
    }

    //构造函数
//    public Zoo() {
//    }

    public Zoo(int cash) {
        this.cash = cash;
    }

    //收养动物
    @Override
    public void adopt(String name) {//如何使用读入的字符串创建各种动物类的实例？
        animals[this.ani_rear] = name;
        this.ani_rear++;
    }

    //招待顾客
    @Override
    public void serve(Tourist a) {
        tourists[this.tou_rear] = a.name;
        this.tou_rear++;


        try {//抛出异常
            test01(ani_rear);
        } catch (AnimalNotFoundException e) {
            e.printStackTrace();
        }


        for (int i = 0; i < a.times; i++) {//根据游客期望的次数进行参观，并且计费
            String x = RandomStr(animals);
        }

    }

    //歇业
    @Override
    public void close() {
        double buyAni = 0;
        for (int i = 0; i < ani_rear; i++) {//计算买动物的开销
            buyAni += 0;
        }

        try {
            test02(buyAni, cash);
        } catch (InsufficientBalanceException e) {
            e.printStackTrace();
        }
        System.out.println("游客列表：");
        for (int i = 1; i <= tou_rear; i++) {//打印游客列表
            System.out.println(i + "." + tourists[i]);
        }
        System.out.println("动物园剩余现金：" + (cash - buyAni));//打印剩余的现金
    }
}
