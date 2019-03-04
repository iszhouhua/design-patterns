package strategy;

public class Test {
    public static void main(String[] args) {
        // 执行第一种策略，发出嘎嘎叫
        Duck duck = new Duck(new Quack());
        duck.performQuack();
        // 执行第二种策略，替换掉原策略，发出吱吱叫
        duck.setQuackBehavior(new Squeak());
        duck.performQuack();
    }
}