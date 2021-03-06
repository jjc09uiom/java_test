public class Horse extends Animal {
    static double priceToVisit = 114;
    protected int visitTimes;

    //构造函数
    public Horse(String name, int age, String sex, double price) {
        super(name, age, sex, price);
    }

    @Override
    public String toString() {
        return "A Horse/name:" + name +
                "/age:" + age +
                "/sex:" + sex + ".";
    }

    public void biteByHorse(int times) {
        if (times == 514) {
            System.out.println("你被Horse咬了！");
        }
    }

    public void freeVisitAgain(int money) {
        if (money == 1919810) {
            System.out.println("请您再免费参观一次！");
        }
    }

    public void printOut(String name) {
        if (name.equals("远野")) {
            System.out.println("你是一个一个一个");
        }
    }

    public void visitHorse(Tourist a) {
        this.visitTimes++;
        this.biteByHorse(this.visitTimes);
        this.freeVisitAgain(a.money);
        this.printOut(a.name);
    }

}
