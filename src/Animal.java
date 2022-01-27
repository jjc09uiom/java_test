public abstract class Animal {
    protected String name;
    protected int age;
    protected String sex;
    protected double priceToBuy;

//    public Animal() {//构造函数
//    }

    public double getPriceToBuy() {//获取买动物的开销？
        return priceToBuy;
    }

    public Animal(String name, int age, String sex, double price) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.priceToBuy = price;
    }

    //抽象的toString方法
    public abstract String toString();

}
