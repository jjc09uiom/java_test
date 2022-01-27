public class Horse extends Animal {
    static double priceToVisit = 114;
//构造函数
    public Horse(String name, int age, String sex, double price) {
        super(name, age, sex, price);
    }

    @Override
    public String toString() {
        return null;
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
        if (name == "远野") {
            System.out.println("你是一个一个一个");
        }
    }
}
