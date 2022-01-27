public class Shark extends Animal {
    static double priceToVisit = 350;

    //构造函数
    public Shark(String name, int age, String sex, double price) {
        super(name, age, sex, price);
    }

    @Override
    public String toString() {
        return "A Shark/name:" + name +
                "/age:" + age +
                "/sex:" + sex + ".";
    }
}
