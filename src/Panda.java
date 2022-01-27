public class Panda extends Animal {
    public boolean isFat;
    static double priceToVisit = 200;
//构造函数

    public Panda(String name, int age, String sex, double price, String Fat) {
        super(name, age, sex, price);
        if (Fat.equals("Fat")) this.isFat = true;
        else if (Fat.equals("NotFat")) this.isFat = false;
    }

    @Override
    public String toString() {
        return null;
    }
}
