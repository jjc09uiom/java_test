public class Zoo implements Port {
    protected int cash;
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
    static void test02(int a, int b) throws InsufficientBalanceException {
        if (a > b) {
            throw new InsufficientBalanceException();
        }
    }

    //构造函数
//    public Zoo() {
//    }

    public Zoo(int cash) {
        this.cash = cash;
    }

    //收养动物
    @Override
    public void adopt(String name) {
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


        for (int i = 0; i < a.times; i++) {

        }

    }

    //歇业
    @Override
    public void close() {
        int buyAni = 0;
        for (int i = 0; i < ani_rear; i++) {

        }

        try {
            test02(buyAni, cash);
        } catch (InsufficientBalanceException e) {
            e.printStackTrace();
        }

    }
}
