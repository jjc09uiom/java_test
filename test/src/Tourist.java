public class Tourist{
    protected String name;
    protected int money;
    protected int times;
//构造函数
    public Tourist() {
    }

    public Tourist(String name, int money, int times) {
        this.name = name;
        this.money = money;
        this.times = times;
    }

    @Override
    public String toString() {
        return "name of tourist is " +
                name + ',' + '\n' +
                "He wants to see " + times +
                " kinds of animals," + '\n' +
                "and has " + money + " dollars in cash."
                + '\n';
    }
}
