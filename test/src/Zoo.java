public class Zoo implements Port {
    protected int cash;
    protected String[] animals = new String[100000];
    protected String[] tourists = new String[100000];
    protected int ani_rear;
    protected int tou_rear;
//构造函数
    public Zoo() {
    }

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
        if (this.ani_rear == 0)//抛出异常
        for (int i = 0; i < a.times; i++) {

        }

    }
//歇业
    @Override
    public void close() {
        for (int i = 0; i < ani_rear; i++) {

        }
    }
}
